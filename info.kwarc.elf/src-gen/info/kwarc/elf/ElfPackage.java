/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.elf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see info.kwarc.elf.ElfFactory
 * @model kind="package"
 * @generated
 */
public interface ElfPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "elf";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.kwarc.info/Elf";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "elf";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ElfPackage eINSTANCE = info.kwarc.elf.impl.ElfPackageImpl.init();

  /**
   * The meta object id for the '{@link info.kwarc.elf.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.elf.impl.ModelImpl
   * @see info.kwarc.elf.impl.ElfPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link info.kwarc.elf.impl.TempTypeImpl <em>Temp Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.elf.impl.TempTypeImpl
   * @see info.kwarc.elf.impl.ElfPackageImpl#getTempType()
   * @generated
   */
  int TEMP_TYPE = 4;

  /**
   * The feature id for the '<em><b>Full URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMP_TYPE__FULL_URI = 0;

  /**
   * The number of structural features of the '<em>Temp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMP_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link info.kwarc.elf.impl.namespaceDeclarationImpl <em>namespace Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.elf.impl.namespaceDeclarationImpl
   * @see info.kwarc.elf.impl.ElfPackageImpl#getnamespaceDeclaration()
   * @generated
   */
  int NAMESPACE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Full URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION__FULL_URI = TEMP_TYPE__FULL_URI;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION__NAME = TEMP_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION__URI = TEMP_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>namespace Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION_FEATURE_COUNT = TEMP_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link info.kwarc.elf.impl.signatureDeclarationImpl <em>signature Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.elf.impl.signatureDeclarationImpl
   * @see info.kwarc.elf.impl.ElfPackageImpl#getsignatureDeclaration()
   * @generated
   */
  int SIGNATURE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Full URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_DECLARATION__FULL_URI = TEMP_TYPE__FULL_URI;

  /**
   * The feature id for the '<em><b>Sig Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_DECLARATION__SIG_NAME = TEMP_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sig Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_DECLARATION__SIG_DEFINITIONS = TEMP_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>signature Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_DECLARATION_FEATURE_COUNT = TEMP_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link info.kwarc.elf.impl.sigDefinitionsImpl <em>sig Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.elf.impl.sigDefinitionsImpl
   * @see info.kwarc.elf.impl.ElfPackageImpl#getsigDefinitions()
   * @generated
   */
  int SIG_DEFINITIONS = 3;

  /**
   * The feature id for the '<em><b>Symb Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_DEFINITIONS__SYMB_NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_DEFINITIONS__TYPE = 1;

  /**
   * The number of structural features of the '<em>sig Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_DEFINITIONS_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link info.kwarc.elf.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see info.kwarc.elf.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link info.kwarc.elf.Model#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see info.kwarc.elf.Model#getDeclarations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Declarations();

  /**
   * Returns the meta object for class '{@link info.kwarc.elf.namespaceDeclaration <em>namespace Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>namespace Declaration</em>'.
   * @see info.kwarc.elf.namespaceDeclaration
   * @generated
   */
  EClass getnamespaceDeclaration();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.elf.namespaceDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see info.kwarc.elf.namespaceDeclaration#getName()
   * @see #getnamespaceDeclaration()
   * @generated
   */
  EAttribute getnamespaceDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.elf.namespaceDeclaration#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see info.kwarc.elf.namespaceDeclaration#getUri()
   * @see #getnamespaceDeclaration()
   * @generated
   */
  EAttribute getnamespaceDeclaration_Uri();

  /**
   * Returns the meta object for class '{@link info.kwarc.elf.signatureDeclaration <em>signature Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>signature Declaration</em>'.
   * @see info.kwarc.elf.signatureDeclaration
   * @generated
   */
  EClass getsignatureDeclaration();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.elf.signatureDeclaration#getSigName <em>Sig Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sig Name</em>'.
   * @see info.kwarc.elf.signatureDeclaration#getSigName()
   * @see #getsignatureDeclaration()
   * @generated
   */
  EAttribute getsignatureDeclaration_SigName();

  /**
   * Returns the meta object for the containment reference list '{@link info.kwarc.elf.signatureDeclaration#getSigDefinitions <em>Sig Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sig Definitions</em>'.
   * @see info.kwarc.elf.signatureDeclaration#getSigDefinitions()
   * @see #getsignatureDeclaration()
   * @generated
   */
  EReference getsignatureDeclaration_SigDefinitions();

  /**
   * Returns the meta object for class '{@link info.kwarc.elf.sigDefinitions <em>sig Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sig Definitions</em>'.
   * @see info.kwarc.elf.sigDefinitions
   * @generated
   */
  EClass getsigDefinitions();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.elf.sigDefinitions#getSymbName <em>Symb Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symb Name</em>'.
   * @see info.kwarc.elf.sigDefinitions#getSymbName()
   * @see #getsigDefinitions()
   * @generated
   */
  EAttribute getsigDefinitions_SymbName();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.elf.sigDefinitions#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see info.kwarc.elf.sigDefinitions#getType()
   * @see #getsigDefinitions()
   * @generated
   */
  EAttribute getsigDefinitions_Type();

  /**
   * Returns the meta object for class '{@link info.kwarc.elf.TempType <em>Temp Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Temp Type</em>'.
   * @see info.kwarc.elf.TempType
   * @generated
   */
  EClass getTempType();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.elf.TempType#getFullURI <em>Full URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Full URI</em>'.
   * @see info.kwarc.elf.TempType#getFullURI()
   * @see #getTempType()
   * @generated
   */
  EAttribute getTempType_FullURI();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ElfFactory getElfFactory();

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
     * The meta object literal for the '{@link info.kwarc.elf.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.elf.impl.ModelImpl
     * @see info.kwarc.elf.impl.ElfPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DECLARATIONS = eINSTANCE.getModel_Declarations();

    /**
     * The meta object literal for the '{@link info.kwarc.elf.impl.namespaceDeclarationImpl <em>namespace Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.elf.impl.namespaceDeclarationImpl
     * @see info.kwarc.elf.impl.ElfPackageImpl#getnamespaceDeclaration()
     * @generated
     */
    EClass NAMESPACE_DECLARATION = eINSTANCE.getnamespaceDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE_DECLARATION__NAME = eINSTANCE.getnamespaceDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE_DECLARATION__URI = eINSTANCE.getnamespaceDeclaration_Uri();

    /**
     * The meta object literal for the '{@link info.kwarc.elf.impl.signatureDeclarationImpl <em>signature Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.elf.impl.signatureDeclarationImpl
     * @see info.kwarc.elf.impl.ElfPackageImpl#getsignatureDeclaration()
     * @generated
     */
    EClass SIGNATURE_DECLARATION = eINSTANCE.getsignatureDeclaration();

    /**
     * The meta object literal for the '<em><b>Sig Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNATURE_DECLARATION__SIG_NAME = eINSTANCE.getsignatureDeclaration_SigName();

    /**
     * The meta object literal for the '<em><b>Sig Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE_DECLARATION__SIG_DEFINITIONS = eINSTANCE.getsignatureDeclaration_SigDefinitions();

    /**
     * The meta object literal for the '{@link info.kwarc.elf.impl.sigDefinitionsImpl <em>sig Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.elf.impl.sigDefinitionsImpl
     * @see info.kwarc.elf.impl.ElfPackageImpl#getsigDefinitions()
     * @generated
     */
    EClass SIG_DEFINITIONS = eINSTANCE.getsigDefinitions();

    /**
     * The meta object literal for the '<em><b>Symb Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIG_DEFINITIONS__SYMB_NAME = eINSTANCE.getsigDefinitions_SymbName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIG_DEFINITIONS__TYPE = eINSTANCE.getsigDefinitions_Type();

    /**
     * The meta object literal for the '{@link info.kwarc.elf.impl.TempTypeImpl <em>Temp Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.elf.impl.TempTypeImpl
     * @see info.kwarc.elf.impl.ElfPackageImpl#getTempType()
     * @generated
     */
    EClass TEMP_TYPE = eINSTANCE.getTempType();

    /**
     * The meta object literal for the '<em><b>Full URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMP_TYPE__FULL_URI = eINSTANCE.getTempType_FullURI();

  }

} //ElfPackage
