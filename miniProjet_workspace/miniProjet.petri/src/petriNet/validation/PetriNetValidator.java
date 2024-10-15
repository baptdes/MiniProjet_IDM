package petriNet.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import petriNet.Arc;
import petriNet.PetriNetPackage;
import petriNet.Place;
import petriNet.Réseau;
import petriNet.RéseauElement;
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
	 * MÃ©thode appelÃ©e lorsque l'objet visitÃ© est un Process.
	 * Cet mÃ©thode amorce aussi la visite des Ã©lÃ©ments enfants.
	 * @param object Ã©lÃ©ment visitÃ©
	 * @return rÃ©sultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas Ã©chÃ©ant)
	 */
	@Override
	public Boolean caseRéseau(petriNet.Réseau object) {
		this.result.recordIfFailed(
				!object.getReseauElements().stream()
				.filter(p -> p.eClass().getClassifierID() == PetriNetPackage.PLACE)
				.allMatch(pl -> ((Place) pl).getNbJetons() == 0), 
				object,	
				"Obligation d'avoir un jeton pour faire avancer le modèle");
		
		// Visite
		for (RéseauElement pe : object.getReseauElements()) {
					this.doSwitch(pe);
		}
			
		return null;
	}

	
	public Boolean caseArc(petriNet.Arc object) {
		// Contraintes sur process
		this.result.recordIfFailed(
				true /** object.getNbjetonTransition()>0*/,
				object, 
				"Le nombre de jeton transféré doit rester positif");
		return null;
	}




	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}

}
