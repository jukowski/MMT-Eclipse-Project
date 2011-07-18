/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LFFactoryImpl extends EFactoryImpl implements LFFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LFFactory init()
  {
    try
    {
      LFFactory theLFFactory = (LFFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kwarc.info/mmt/LF"); 
      if (theLFFactory != null)
      {
        return theLFFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LFFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LFFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LFPackage.MODEL: return createModel();
      case LFPackage.JUSTSPACE: return createJUSTSPACE();
      case LFPackage.NAMESPACE_DECLARATION: return createnamespaceDeclaration();
      case LFPackage.READ_DECLARATION: return createreadDeclaration();
      case LFPackage.SIGNATURE_DECLARATION: return createsignatureDeclaration();
      case LFPackage.SIG_DEFINITIONS: return createsigDefinitions();
      case LFPackage.TEMP_TYPE: return createTempType();
      case LFPackage.VIEW_DECLARATION: return createviewDeclaration();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JUSTSPACE createJUSTSPACE()
  {
    JUSTSPACEImpl justspace = new JUSTSPACEImpl();
    return justspace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public namespaceDeclaration createnamespaceDeclaration()
  {
    namespaceDeclarationImpl namespaceDeclaration = new namespaceDeclarationImpl();
    return namespaceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public readDeclaration createreadDeclaration()
  {
    readDeclarationImpl readDeclaration = new readDeclarationImpl();
    return readDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public signatureDeclaration createsignatureDeclaration()
  {
    signatureDeclarationImpl signatureDeclaration = new signatureDeclarationImpl();
    return signatureDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sigDefinitions createsigDefinitions()
  {
    sigDefinitionsImpl sigDefinitions = new sigDefinitionsImpl();
    return sigDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TempType createTempType()
  {
    TempTypeImpl tempType = new TempTypeImpl();
    return tempType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public viewDeclaration createviewDeclaration()
  {
    viewDeclarationImpl viewDeclaration = new viewDeclarationImpl();
    return viewDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LFPackage getLFPackage()
  {
    return (LFPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LFPackage getPackage()
  {
    return LFPackage.eINSTANCE;
  }

} //LFFactoryImpl
