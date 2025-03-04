/**
 */
package simplepdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Need#getWorkdefinition <em>Workdefinition</em>}</li>
 *   <li>{@link simplepdl.Need#getRessource <em>Ressource</em>}</li>
 *   <li>{@link simplepdl.Need#getQuantityNeeded <em>Quantity Needed</em>}</li>
 *   <li>{@link simplepdl.Need#isUsed <em>Used</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getNeed()
 * @model
 * @generated
 */
public interface Need extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Workdefinition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workdefinition</em>' reference.
	 * @see #setWorkdefinition(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getNeed_Workdefinition()
	 * @see simplepdl.WorkDefinition#getNeeds
	 * @model opposite="needs" required="true"
	 * @generated
	 */
	WorkDefinition getWorkdefinition();

	/**
	 * Sets the value of the '{@link simplepdl.Need#getWorkdefinition <em>Workdefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workdefinition</em>' reference.
	 * @see #getWorkdefinition()
	 * @generated
	 */
	void setWorkdefinition(WorkDefinition value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.Ressource#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' reference.
	 * @see #setRessource(Ressource)
	 * @see simplepdl.SimplepdlPackage#getNeed_Ressource()
	 * @see simplepdl.Ressource#getNeeds
	 * @model opposite="needs" required="true"
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link simplepdl.Need#getRessource <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' reference.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(Ressource value);

	/**
	 * Returns the value of the '<em><b>Quantity Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Needed</em>' attribute.
	 * @see #setQuantityNeeded(int)
	 * @see simplepdl.SimplepdlPackage#getNeed_QuantityNeeded()
	 * @model required="true"
	 * @generated
	 */
	int getQuantityNeeded();

	/**
	 * Sets the value of the '{@link simplepdl.Need#getQuantityNeeded <em>Quantity Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Needed</em>' attribute.
	 * @see #getQuantityNeeded()
	 * @generated
	 */
	void setQuantityNeeded(int value);

	/**
	 * Returns the value of the '<em><b>Used</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used</em>' attribute.
	 * @see #setUsed(boolean)
	 * @see simplepdl.SimplepdlPackage#getNeed_Used()
	 * @model default="False" required="true"
	 * @generated
	 */
	boolean isUsed();

	/**
	 * Sets the value of the '{@link simplepdl.Need#isUsed <em>Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used</em>' attribute.
	 * @see #isUsed()
	 * @generated
	 */
	void setUsed(boolean value);

} // Need
