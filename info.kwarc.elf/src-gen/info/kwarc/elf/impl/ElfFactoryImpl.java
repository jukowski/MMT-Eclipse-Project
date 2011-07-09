/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.elf.impl;

import info.kwarc.elf.*;

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
public class ElfFactoryImpl extends EFactoryImpl implements ElfFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ElfFactory init()
  {
    try
    {
      ElfFactory theElfFactory = (ElfFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kwarc.info/Elf"); 
      if (theElfFactory != null)
      {
        return theElfFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ElfFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElfFactoryImpl()
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
      case ElfPackage.MODEL: return createModel();
      case ElfPackage.NAMESPACE_DECLARATION: return createnamespaceDeclaration();
      case ElfPackage.SIGNATURE_DECLARATION: return createsignatureDeclaration();
      case ElfPackage.SIG_DEFINITIONS: return createsigDefinitions();
      case ElfPackage.TEMP_TYPE: return createTempType();
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
  public ElfPackage getElfPackage()
  {
    return (ElfPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ElfPackage getPackage()
  {
    return ElfPackage.eINSTANCE;
  }

} //ElfFactoryImpl
