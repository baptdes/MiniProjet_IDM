/**
 */
package petriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Arc#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.Arc#isIsReadArc <em>Is Read Arc</em>}</li>
 *   <li>{@link petriNet.Arc#isPlaceToTransition <em>Place To Transition</em>}</li>
 *   <li>{@link petriNet.Arc#getPlace <em>Place</em>}</li>
 *   <li>{@link petriNet.Arc#getTransition <em>Transition</em>}</li>
 *   <li>{@link petriNet.Arc#getNbTransfered <em>Nb Transfered</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends RéseauElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petriNet.PetriNetPackage#getArc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Read Arc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Arc</em>' attribute.
	 * @see #setIsReadArc(boolean)
	 * @see petriNet.PetriNetPackage#getArc_IsReadArc()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsReadArc();

	/**
	 * Sets the value of the '{@link petriNet.Arc#isIsReadArc <em>Is Read Arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Arc</em>' attribute.
	 * @see #isIsReadArc()
	 * @generated
	 */
	void setIsReadArc(boolean value);

	/**
	 * Returns the value of the '<em><b>Place To Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place To Transition</em>' attribute.
	 * @see #setPlaceToTransition(boolean)
	 * @see petriNet.PetriNetPackage#getArc_PlaceToTransition()
	 * @model required="true"
	 * @generated
	 */
	boolean isPlaceToTransition();

	/**
	 * Sets the value of the '{@link petriNet.Arc#isPlaceToTransition <em>Place To Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place To Transition</em>' attribute.
	 * @see #isPlaceToTransition()
	 * @generated
	 */
	void setPlaceToTransition(boolean value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petriNet.Place#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see petriNet.PetriNetPackage#getArc_Place()
	 * @see petriNet.Place#getArcs
	 * @model opposite="arcs" required="true"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petriNet.Transition#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see petriNet.PetriNetPackage#getArc_Transition()
	 * @see petriNet.Transition#getArcs
	 * @model opposite="arcs" required="true"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Nb Transfered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Transfered</em>' attribute.
	 * @see #setNbTransfered(int)
	 * @see petriNet.PetriNetPackage#getArc_NbTransfered()
	 * @model required="true"
	 * @generated
	 */
	int getNbTransfered();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getNbTransfered <em>Nb Transfered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Transfered</em>' attribute.
	 * @see #getNbTransfered()
	 * @generated
	 */
	void setNbTransfered(int value);

} // Arc
