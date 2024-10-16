/**
 */
package petriNet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reseau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Reseau#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.Reseau#getReseauElements <em>Reseau Elements</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getReseau()
 * @model
 * @generated
 */
public interface Reseau extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petriNet.PetriNetPackage#getReseau_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petriNet.Reseau#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reseau Elements</b></em>' containment reference list.
	 * The list contents are of type {@link petriNet.ReseauElement}.
	 * It is bidirectional and its opposite is '{@link petriNet.ReseauElement#getReseau <em>Reseau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reseau Elements</em>' containment reference list.
	 * @see petriNet.PetriNetPackage#getReseau_ReseauElements()
	 * @see petriNet.ReseauElement#getReseau
	 * @model opposite="reseau" containment="true"
	 * @generated
	 */
	EList<ReseauElement> getReseauElements();

} // Reseau
