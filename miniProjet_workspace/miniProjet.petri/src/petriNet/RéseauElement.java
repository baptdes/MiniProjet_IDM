/**
 */
package petriNet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Réseau Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.RéseauElement#getReseau <em>Reseau</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getRéseauElement()
 * @model abstract="true"
 * @generated
 */
public interface RéseauElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Reseau</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petriNet.Réseau#getReseauElements <em>Reseau Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reseau</em>' container reference.
	 * @see #setReseau(Réseau)
	 * @see petriNet.PetriNetPackage#getRéseauElement_Reseau()
	 * @see petriNet.Réseau#getReseauElements
	 * @model opposite="reseauElements" required="true" transient="false"
	 * @generated
	 */
	Réseau getReseau();

	/**
	 * Sets the value of the '{@link petriNet.RéseauElement#getReseau <em>Reseau</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reseau</em>' container reference.
	 * @see #getReseau()
	 * @generated
	 */
	void setReseau(Réseau value);

} // RéseauElement
