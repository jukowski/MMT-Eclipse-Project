/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.util;

import info.kwarc.mmt.lF.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see info.kwarc.mmt.lF.LFPackage
 * @generated
 */
public class LFAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LFPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LFAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LFPackage.eINSTANCE;
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
  protected LFSwitch<Adapter> modelSwitch =
    new LFSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseJUSTSPACE(JUSTSPACE object)
      {
        return createJUSTSPACEAdapter();
      }
      @Override
      public Adapter casenamespaceDeclaration(namespaceDeclaration object)
      {
        return createnamespaceDeclarationAdapter();
      }
      @Override
      public Adapter casereadDeclaration(readDeclaration object)
      {
        return createreadDeclarationAdapter();
      }
      @Override
      public Adapter casesignatureDeclaration(signatureDeclaration object)
      {
        return createsignatureDeclarationAdapter();
      }
      @Override
      public Adapter casesigDefinitions(sigDefinitions object)
      {
        return createsigDefinitionsAdapter();
      }
      @Override
      public Adapter caseTempType(TempType object)
      {
        return createTempTypeAdapter();
      }
      @Override
      public Adapter caseviewDeclaration(viewDeclaration object)
      {
        return createviewDeclarationAdapter();
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
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.JUSTSPACE <em>JUSTSPACE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.JUSTSPACE
   * @generated
   */
  public Adapter createJUSTSPACEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.namespaceDeclaration <em>namespace Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.namespaceDeclaration
   * @generated
   */
  public Adapter createnamespaceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.readDeclaration <em>read Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.readDeclaration
   * @generated
   */
  public Adapter createreadDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.signatureDeclaration <em>signature Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.signatureDeclaration
   * @generated
   */
  public Adapter createsignatureDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.sigDefinitions <em>sig Definitions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.sigDefinitions
   * @generated
   */
  public Adapter createsigDefinitionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.TempType <em>Temp Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.TempType
   * @generated
   */
  public Adapter createTempTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.viewDeclaration <em>view Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.viewDeclaration
   * @generated
   */
  public Adapter createviewDeclarationAdapter()
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

} //LFAdapterFactory
