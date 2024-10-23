package simplepdl.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import simplepdl.Guidance;
import simplepdl.Need;
import simplepdl.ProcessElement;
import simplepdl.Ressource;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.util.SimplepdlSwitch;

/**
 * Réalise la validation d'un EObject issu de SimplePDL (en théorie, d'un process).
 * Cet classe visite le modèle et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 * Attention, lorsqu'une classe est un parent il faut aller faire la visite des enfants
 * manuellement (cf. caseProcess typiquement).
 * 
 * La classe Switch exige un paramètre de généricité (et gère une partie de la visite à
 * base de comparaison à null). Ici le paramètre est un booléen mais en réalité on ne
 * s'en sert pas...
 * 
 * @author Guillaume Dupont
 * @version 0.1
 */
public class SimplePDLValidator extends SimplepdlSwitch<Boolean> {
	/**
	 * Expression régulière qui correspond à un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public SimplePDLValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les process présents dans la ressource.
	 * @param resource resource à valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}


	/**
	 * Méthode appelée lorsque l'objet visité est un Process.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseProcess(simplepdl.Process object) {
		// 1 - Nom pas vide et correctement écrit
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom du process ne respecte pas les conventions Java");
		
		// Visite
		for (ProcessElement pe : object.getProcessElements()) {
			this.doSwitch(pe);
		}
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un ProcessElement (ou un sous type).
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseProcessElement(ProcessElement object) {
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une WorkDefinition.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseWorkDefinition(WorkDefinition object) {
		// 1 - Nom pas vide et correctement écrit
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de l'activité ne respecte pas les conventions Java");
		
		//2 - Le nom d'une activité doit être unique
		this.result.recordIfFailed(
				object.getProcess().getProcessElements().stream()
					.filter(p -> p.eClass().getClassifierID() == SimplepdlPackage.WORK_DEFINITION)
					.allMatch(pe -> (pe.equals(object) || !((WorkDefinition) pe).getName().contains(object.getName()))),
				object, 
				"Le nom de l'activité (" + object.getName() + ") n'est pas unique");
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une Ressource.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseRessource(Ressource object) {
		// 1 - Nom pas vide et correctement écrit
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Un nom de la ressource ne respecte pas les conventions Java");
		
		// 2 - Le nom d'une ressource doit être unique
		this.result.recordIfFailed(
				object.getProcess().getProcessElements().stream()
					.filter(p -> p.eClass().getClassifierID() == SimplepdlPackage.RESSOURCE)
					.allMatch(pe -> (pe.equals(object) || !((Ressource) pe).getName().contains(object.getName()))),
				object, 
				"Le nom de la ressource (" + object.getName() + ") n'est pas unique");
		
		// 3 - Le nombre de ressource doit être strictement positif
		this.result.recordIfFailed(
				object.getQuantity() > 0, 
				object, 
				"La quantité de la ressource (" + object.getName() + ") est négatif ou nul");
		
		// 4 - Les besoins en cours ne doivent pas dépassé la quantité disponible
		this.result.recordIfFailed(
			    object.getNeeds().stream()
			    	.filter(n -> n.isUsed())
			        .mapToInt(n -> n.getQuantityNeeded()).sum() <= object.getQuantity(), 
			    object, 
			    "Les besoins en cours de la ressource (" + object.getName() + ") dépassent la quantité disponible"
		);
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un Need.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseNeed(Need object) {
		// 1 - Un besoin doit être positif
		this.result.recordIfFailed(
				object.getQuantityNeeded() > 0, 
				object, 
				"Le besoin est négatif ou nul");
		
		// 2 - Il ne peut  avoir qu'un seul besoin par ressource pour une activité donné
		this.result.recordIfFailed(
				object.getProcess().getProcessElements().stream()
					.filter(p -> p.eClass().getClassifierID() == SimplepdlPackage.NEED)
					.filter(p -> ((Need) p).getWorkdefinition().equals(object.getWorkdefinition()))
					.allMatch(pe -> (pe.equals(object) || !(((Need) pe).getRessource().equals(object.getRessource())))),
				object, 
				"Il y a deux besoins de la même ressources sur une activité");
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une WorkSequence.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseWorkSequence(WorkSequence object) {
		// 1 - Une dépendance ne peut pas relié une activité à elle-même (Réflexive)
		this.result.recordIfFailed(
				!object.getPredecessor().equals(object.getSuccessor()), 
				object,
				"La dépendance relie l'activité " + object.getPredecessor().getName() + " à elle-même");
		
		// 2 - Deux WorkSequence ne peuvent pas avoir le même prédécesseur et le même successeur ainsi que le même type 
		this.result.recordIfFailed(
				object.getProcess().getProcessElements().stream()
					.filter(p -> p.eClass().getClassifierID() == SimplepdlPackage.WORK_SEQUENCE)
					.filter(p -> ((WorkSequence) p).getPredecessor().equals(object.getPredecessor()) && ((WorkSequence) p).getSuccessor().equals(object.getSuccessor()))
					.allMatch(pe -> (pe.equals(object) || !(((WorkSequence) pe).getLinkType().equals(object.getLinkType())))),
				object, 
				"Il y a deux dépendances différentes de même type entre deux activités");
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une Guidance.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseGuidance(Guidance object) {
		// 1 - Texte pas vide
		this.result.recordIfFailed(
				(object.getText() != null) && (object.getText() != ""), 
				object, 
				"La guidance a un texte vide");
		
		return null;
	}

	/**
	 * Cas par défaut, lorsque l'objet visité ne correspond pas à un des autres cas.
	 * Cette méthode est aussi appelée lorsqu'une méthode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implémenter le switch différemment, en ne renvoyant null dans les autres
	 * méthodes que si la contrainte ne sert à rien, et se servir de cette méthode pour
	 * identifier les éléments étrangers (qui de toute façon ne doivent pas exister).
	 * C'est aussi la méthode appelée si on ne redéfini pas un des caseXXX.
	 * @param object objet visité
	 * @return résultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
}
