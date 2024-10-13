/**
 * generated by Xtext 2.36.0
 */
package miniProjet.pDLXText.util;

import miniProjet.pDLXText.Guidance;
import miniProjet.pDLXText.Need;
import miniProjet.pDLXText.PDLXTextPackage;
import miniProjet.pDLXText.ProcessElement;
import miniProjet.pDLXText.Ressource;
import miniProjet.pDLXText.WorkDefinition;
import miniProjet.pDLXText.WorkSequence;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see miniProjet.pDLXText.PDLXTextPackage
 * @generated
 */
public class PDLXTextAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PDLXTextPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDLXTextAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PDLXTextPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PDLXTextSwitch<Adapter> modelSwitch =
    new PDLXTextSwitch<Adapter>()
    {
      @Override
      public Adapter caseProcess(miniProjet.pDLXText.Process object)
      {
        return createProcessAdapter();
      }
      @Override
      public Adapter caseProcessElement(ProcessElement object)
      {
        return createProcessElementAdapter();
      }
      @Override
      public Adapter caseWorkDefinition(WorkDefinition object)
      {
        return createWorkDefinitionAdapter();
      }
      @Override
      public Adapter caseWorkSequence(WorkSequence object)
      {
        return createWorkSequenceAdapter();
      }
      @Override
      public Adapter caseGuidance(Guidance object)
      {
        return createGuidanceAdapter();
      }
      @Override
      public Adapter caseRessource(Ressource object)
      {
        return createRessourceAdapter();
      }
      @Override
      public Adapter caseNeed(Need object)
      {
        return createNeedAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link miniProjet.pDLXText.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see miniProjet.pDLXText.Process
   * @generated
   */
  public Adapter createProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link miniProjet.pDLXText.ProcessElement <em>Process Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see miniProjet.pDLXText.ProcessElement
   * @generated
   */
  public Adapter createProcessElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link miniProjet.pDLXText.WorkDefinition <em>Work Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see miniProjet.pDLXText.WorkDefinition
   * @generated
   */
  public Adapter createWorkDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link miniProjet.pDLXText.WorkSequence <em>Work Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see miniProjet.pDLXText.WorkSequence
   * @generated
   */
  public Adapter createWorkSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link miniProjet.pDLXText.Guidance <em>Guidance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see miniProjet.pDLXText.Guidance
   * @generated
   */
  public Adapter createGuidanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link miniProjet.pDLXText.Ressource <em>Ressource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see miniProjet.pDLXText.Ressource
   * @generated
   */
  public Adapter createRessourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link miniProjet.pDLXText.Need <em>Need</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see miniProjet.pDLXText.Need
   * @generated
   */
  public Adapter createNeedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PDLXTextAdapterFactory
