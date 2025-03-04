/**
 * generated by Xtext 2.36.0
 */
package miniProjet.pDLXText;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see miniProjet.pDLXText.PDLXTextFactory
 * @model kind="package"
 * @generated
 */
public interface PDLXTextPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pDLXText";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.PDLXText.miniProjet";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pDLXText";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PDLXTextPackage eINSTANCE = miniProjet.pDLXText.impl.PDLXTextPackageImpl.init();

  /**
   * The meta object id for the '{@link miniProjet.pDLXText.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see miniProjet.pDLXText.impl.ProcessImpl
   * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__NAME = 0;

  /**
   * The feature id for the '<em><b>Process Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__PROCESS_ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link miniProjet.pDLXText.impl.ProcessElementImpl <em>Process Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see miniProjet.pDLXText.impl.ProcessElementImpl
   * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getProcessElement()
   * @generated
   */
  int PROCESS_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Process Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link miniProjet.pDLXText.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see miniProjet.pDLXText.impl.WorkDefinitionImpl
   * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getWorkDefinition()
   * @generated
   */
  int WORK_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DEFINITION__NAME = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Work Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DEFINITION_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link miniProjet.pDLXText.impl.WorkSequenceImpl <em>Work Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see miniProjet.pDLXText.impl.WorkSequenceImpl
   * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getWorkSequence()
   * @generated
   */
  int WORK_SEQUENCE = 3;

  /**
   * The feature id for the '<em><b>Link Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE__LINK_TYPE = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Predecessor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE__PREDECESSOR = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Successor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE__SUCCESSOR = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Work Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link miniProjet.pDLXText.impl.GuidanceImpl <em>Guidance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see miniProjet.pDLXText.impl.GuidanceImpl
   * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getGuidance()
   * @generated
   */
  int GUIDANCE = 4;

  /**
   * The feature id for the '<em><b>Texte</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE__TEXTE = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE__ELEMENTS = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Guidance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link miniProjet.pDLXText.impl.RessourceImpl <em>Ressource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see miniProjet.pDLXText.impl.RessourceImpl
   * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getRessource()
   * @generated
   */
  int RESSOURCE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE__NAME = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Quantity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE__QUANTITY = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ressource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESSOURCE_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link miniProjet.pDLXText.impl.NeedImpl <em>Need</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see miniProjet.pDLXText.impl.NeedImpl
   * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getNeed()
   * @generated
   */
  int NEED = 6;

  /**
   * The feature id for the '<em><b>Workdefinition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEED__WORKDEFINITION = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Quantity Needed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEED__QUANTITY_NEEDED = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ressource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEED__RESSOURCE = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Need</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEED_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link miniProjet.pDLXText.WorkSequenceType <em>Work Sequence Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see miniProjet.pDLXText.WorkSequenceType
   * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getWorkSequenceType()
   * @generated
   */
  int WORK_SEQUENCE_TYPE = 7;


  /**
   * Returns the meta object for class '{@link miniProjet.pDLXText.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see miniProjet.pDLXText.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the attribute '{@link miniProjet.pDLXText.Process#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see miniProjet.pDLXText.Process#getName()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_Name();

  /**
   * Returns the meta object for the containment reference list '{@link miniProjet.pDLXText.Process#getProcessElements <em>Process Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Process Elements</em>'.
   * @see miniProjet.pDLXText.Process#getProcessElements()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_ProcessElements();

  /**
   * Returns the meta object for class '{@link miniProjet.pDLXText.ProcessElement <em>Process Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Element</em>'.
   * @see miniProjet.pDLXText.ProcessElement
   * @generated
   */
  EClass getProcessElement();

  /**
   * Returns the meta object for class '{@link miniProjet.pDLXText.WorkDefinition <em>Work Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Definition</em>'.
   * @see miniProjet.pDLXText.WorkDefinition
   * @generated
   */
  EClass getWorkDefinition();

  /**
   * Returns the meta object for the attribute '{@link miniProjet.pDLXText.WorkDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see miniProjet.pDLXText.WorkDefinition#getName()
   * @see #getWorkDefinition()
   * @generated
   */
  EAttribute getWorkDefinition_Name();

  /**
   * Returns the meta object for class '{@link miniProjet.pDLXText.WorkSequence <em>Work Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Sequence</em>'.
   * @see miniProjet.pDLXText.WorkSequence
   * @generated
   */
  EClass getWorkSequence();

  /**
   * Returns the meta object for the attribute '{@link miniProjet.pDLXText.WorkSequence#getLinkType <em>Link Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Link Type</em>'.
   * @see miniProjet.pDLXText.WorkSequence#getLinkType()
   * @see #getWorkSequence()
   * @generated
   */
  EAttribute getWorkSequence_LinkType();

  /**
   * Returns the meta object for the reference '{@link miniProjet.pDLXText.WorkSequence#getPredecessor <em>Predecessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Predecessor</em>'.
   * @see miniProjet.pDLXText.WorkSequence#getPredecessor()
   * @see #getWorkSequence()
   * @generated
   */
  EReference getWorkSequence_Predecessor();

  /**
   * Returns the meta object for the reference '{@link miniProjet.pDLXText.WorkSequence#getSuccessor <em>Successor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Successor</em>'.
   * @see miniProjet.pDLXText.WorkSequence#getSuccessor()
   * @see #getWorkSequence()
   * @generated
   */
  EReference getWorkSequence_Successor();

  /**
   * Returns the meta object for class '{@link miniProjet.pDLXText.Guidance <em>Guidance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guidance</em>'.
   * @see miniProjet.pDLXText.Guidance
   * @generated
   */
  EClass getGuidance();

  /**
   * Returns the meta object for the attribute '{@link miniProjet.pDLXText.Guidance#getTexte <em>Texte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Texte</em>'.
   * @see miniProjet.pDLXText.Guidance#getTexte()
   * @see #getGuidance()
   * @generated
   */
  EAttribute getGuidance_Texte();

  /**
   * Returns the meta object for the reference list '{@link miniProjet.pDLXText.Guidance#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Elements</em>'.
   * @see miniProjet.pDLXText.Guidance#getElements()
   * @see #getGuidance()
   * @generated
   */
  EReference getGuidance_Elements();

  /**
   * Returns the meta object for class '{@link miniProjet.pDLXText.Ressource <em>Ressource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ressource</em>'.
   * @see miniProjet.pDLXText.Ressource
   * @generated
   */
  EClass getRessource();

  /**
   * Returns the meta object for the attribute '{@link miniProjet.pDLXText.Ressource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see miniProjet.pDLXText.Ressource#getName()
   * @see #getRessource()
   * @generated
   */
  EAttribute getRessource_Name();

  /**
   * Returns the meta object for the attribute '{@link miniProjet.pDLXText.Ressource#getQuantity <em>Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quantity</em>'.
   * @see miniProjet.pDLXText.Ressource#getQuantity()
   * @see #getRessource()
   * @generated
   */
  EAttribute getRessource_Quantity();

  /**
   * Returns the meta object for class '{@link miniProjet.pDLXText.Need <em>Need</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Need</em>'.
   * @see miniProjet.pDLXText.Need
   * @generated
   */
  EClass getNeed();

  /**
   * Returns the meta object for the reference '{@link miniProjet.pDLXText.Need#getWorkdefinition <em>Workdefinition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Workdefinition</em>'.
   * @see miniProjet.pDLXText.Need#getWorkdefinition()
   * @see #getNeed()
   * @generated
   */
  EReference getNeed_Workdefinition();

  /**
   * Returns the meta object for the attribute '{@link miniProjet.pDLXText.Need#getQuantityNeeded <em>Quantity Needed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quantity Needed</em>'.
   * @see miniProjet.pDLXText.Need#getQuantityNeeded()
   * @see #getNeed()
   * @generated
   */
  EAttribute getNeed_QuantityNeeded();

  /**
   * Returns the meta object for the reference '{@link miniProjet.pDLXText.Need#getRessource <em>Ressource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ressource</em>'.
   * @see miniProjet.pDLXText.Need#getRessource()
   * @see #getNeed()
   * @generated
   */
  EReference getNeed_Ressource();

  /**
   * Returns the meta object for enum '{@link miniProjet.pDLXText.WorkSequenceType <em>Work Sequence Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Work Sequence Type</em>'.
   * @see miniProjet.pDLXText.WorkSequenceType
   * @generated
   */
  EEnum getWorkSequenceType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PDLXTextFactory getPDLXTextFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link miniProjet.pDLXText.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see miniProjet.pDLXText.impl.ProcessImpl
     * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

    /**
     * The meta object literal for the '<em><b>Process Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__PROCESS_ELEMENTS = eINSTANCE.getProcess_ProcessElements();

    /**
     * The meta object literal for the '{@link miniProjet.pDLXText.impl.ProcessElementImpl <em>Process Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see miniProjet.pDLXText.impl.ProcessElementImpl
     * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getProcessElement()
     * @generated
     */
    EClass PROCESS_ELEMENT = eINSTANCE.getProcessElement();

    /**
     * The meta object literal for the '{@link miniProjet.pDLXText.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see miniProjet.pDLXText.impl.WorkDefinitionImpl
     * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getWorkDefinition()
     * @generated
     */
    EClass WORK_DEFINITION = eINSTANCE.getWorkDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_DEFINITION__NAME = eINSTANCE.getWorkDefinition_Name();

    /**
     * The meta object literal for the '{@link miniProjet.pDLXText.impl.WorkSequenceImpl <em>Work Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see miniProjet.pDLXText.impl.WorkSequenceImpl
     * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getWorkSequence()
     * @generated
     */
    EClass WORK_SEQUENCE = eINSTANCE.getWorkSequence();

    /**
     * The meta object literal for the '<em><b>Link Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_SEQUENCE__LINK_TYPE = eINSTANCE.getWorkSequence_LinkType();

    /**
     * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_SEQUENCE__PREDECESSOR = eINSTANCE.getWorkSequence_Predecessor();

    /**
     * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_SEQUENCE__SUCCESSOR = eINSTANCE.getWorkSequence_Successor();

    /**
     * The meta object literal for the '{@link miniProjet.pDLXText.impl.GuidanceImpl <em>Guidance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see miniProjet.pDLXText.impl.GuidanceImpl
     * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getGuidance()
     * @generated
     */
    EClass GUIDANCE = eINSTANCE.getGuidance();

    /**
     * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUIDANCE__TEXTE = eINSTANCE.getGuidance_Texte();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUIDANCE__ELEMENTS = eINSTANCE.getGuidance_Elements();

    /**
     * The meta object literal for the '{@link miniProjet.pDLXText.impl.RessourceImpl <em>Ressource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see miniProjet.pDLXText.impl.RessourceImpl
     * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getRessource()
     * @generated
     */
    EClass RESSOURCE = eINSTANCE.getRessource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESSOURCE__NAME = eINSTANCE.getRessource_Name();

    /**
     * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESSOURCE__QUANTITY = eINSTANCE.getRessource_Quantity();

    /**
     * The meta object literal for the '{@link miniProjet.pDLXText.impl.NeedImpl <em>Need</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see miniProjet.pDLXText.impl.NeedImpl
     * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getNeed()
     * @generated
     */
    EClass NEED = eINSTANCE.getNeed();

    /**
     * The meta object literal for the '<em><b>Workdefinition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEED__WORKDEFINITION = eINSTANCE.getNeed_Workdefinition();

    /**
     * The meta object literal for the '<em><b>Quantity Needed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEED__QUANTITY_NEEDED = eINSTANCE.getNeed_QuantityNeeded();

    /**
     * The meta object literal for the '<em><b>Ressource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEED__RESSOURCE = eINSTANCE.getNeed_Ressource();

    /**
     * The meta object literal for the '{@link miniProjet.pDLXText.WorkSequenceType <em>Work Sequence Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see miniProjet.pDLXText.WorkSequenceType
     * @see miniProjet.pDLXText.impl.PDLXTextPackageImpl#getWorkSequenceType()
     * @generated
     */
    EEnum WORK_SEQUENCE_TYPE = eINSTANCE.getWorkSequenceType();

  }

} //PDLXTextPackage
