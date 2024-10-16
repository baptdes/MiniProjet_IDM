/**
 */
package petriNet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reseau Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.ReseauElement#getReseau <em>Reseau</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getReseauElement()
 * @model abstract="true"
 * @generated
 */
public interface ReseauElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Reseau</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petriNet.Reseau#getReseauElements <em>Reseau Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reseau</em>' container reference.
	 * @see #setReseau(Reseau)
	 * @see petriNet.PetriNetPackage#getReseauElement_Reseau()
	 * @see petriNet.Reseau#getReseauElements
	 * @model opposite="reseauElements" required="true" transient="false"
	 * @generated
	 */
	Reseau getReseau();

	/**
	 * Sets the value of the '{@link petriNet.ReseauElement#getReseau <em>Reseau</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reseau</em>' container reference.
	 * @see #getReseau()
	 * @generated
	 */
	void setReseau(Reseau value);

} // ReseauElement
