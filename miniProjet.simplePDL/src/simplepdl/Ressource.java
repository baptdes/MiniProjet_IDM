/**
 */
package simplepdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Ressource#getNeed <em>Need</em>}</li>
 *   <li>{@link simplepdl.Ressource#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link simplepdl.Ressource#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getRessource()
 * @model
 * @generated
 */
public interface Ressource extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Need</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.Need}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getRessource_Need()
	 * @model
	 * @generated
	 */
	EList<Need> getNeed();

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see simplepdl.SimplepdlPackage#getRessource_Quantity()
	 * @model required="true"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link simplepdl.Ressource#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplepdl.SimplepdlPackage#getRessource_Name()
	 * @model default="" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplepdl.Ressource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Ressource
