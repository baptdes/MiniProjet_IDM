package petriNet.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import petriNet.Arc;
import petriNet.PetriNetPackage;
import petriNet.Place;
import petriNet.ReseauElement;
import petriNet.Transition;
import petriNet.util.PetriNetSwitch;

public class PetriNetValidator extends PetriNetSwitch<Boolean> {
	
	/**
	 * Expression rÃ©guliÃ¨re qui correspond Ã  un identifiant bien formÃ©.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * RÃ©sultat de la validation (Ã©tat interne rÃ©initialisÃ© Ã  chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public PetriNetValidator() {}

	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}
	

	/**
	 * Méthode appelée lorsque l'objet visité est un Reseau.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseReseau(petriNet.Reseau object) {
		
		// 1 - Nom pas vide et correctement écrit
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom du process ne respecte pas les conventions Java");
		
		// 2 - Marquage initial non vide
		this.result.recordIfFailed(
				!object.getReseauElements().stream()
				.filter(p -> p.eClass().getClassifierID() == PetriNetPackage.PLACE)
				.allMatch(pl -> ((Place) pl).getNbJetons() == 0), 
				object,	
				"Obligation d'avoir un jeton pour faire avancer le modèle");
		
		// Visite
		for (ReseauElement pe : object.getReseauElements()) {
					this.doSwitch(pe);
		}
			
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une place.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	public Boolean casePlace(Place object) {
		// 1 - Nom pas vide et correctement écrit
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de la place ne respecte pas les conventions Java");
		
		// 2 - Le nombre de jetons doit être positif ou nul
		this.result.recordIfFailed(
				object.getNbJetons() >= 0, 
				object, 
				"Le nombre de jetons dans la place [" + object.getName() + "] est strictement négatif");
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une transition.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	public Boolean caseTransition(Transition object) {
		// 1 - Nom pas vide et correctement écrit
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de la transition ne respecte pas les conventions Java");
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un arc.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	public Boolean caseArc(Arc object) {
		// 1 - Le nombre de jetons transféré doit être strictement positif
		this.result.recordIfFailed(
				object.getNbTransfered()>0,
				object, 
				"Le nombre de jeton transféré est négatif ou nul (Il doit être strictement positif)");
		return null;
	}

	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}

}
