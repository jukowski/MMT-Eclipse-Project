/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;

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
 * @see info.kwarc.mmt.lF.LFFactory
 * @model kind="package"
 * @generated
 */
public interface LFPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lF";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.kwarc.info/mmt/LF";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lF";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LFPackage eINSTANCE = info.kwarc.mmt.lF.impl.LFPackageImpl.init();

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.ModelImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getModel()
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
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.JUSTSPACEImpl <em>JUSTSPACE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.JUSTSPACEImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getJUSTSPACE()
   * @generated
   */
  int JUSTSPACE = 1;

  /**
   * The feature id for the '<em><b>J</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUSTSPACE__J = 0;

  /**
   * The number of structural features of the '<em>JUSTSPACE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUSTSPACE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.TempTypeImpl <em>Temp Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.TempTypeImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getTempType()
   * @generated
   */
  int TEMP_TYPE = 10;

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
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.namespaceDeclarationImpl <em>namespace Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.namespaceDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getnamespaceDeclaration()
   * @generated
   */
  int NAMESPACE_DECLARATION = 2;

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
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.readDeclarationImpl <em>read Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.readDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getreadDeclaration()
   * @generated
   */
  int READ_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_DECLARATION__FILE = 0;

  /**
   * The number of structural features of the '<em>read Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.signatureDeclarationImpl <em>signature Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.signatureDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsignatureDeclaration()
   * @generated
   */
  int SIGNATURE_DECLARATION = 4;

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
   * The feature id for the '<em><b>Defs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_DECLARATION__DEFS = TEMP_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>signature Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_DECLARATION_FEATURE_COUNT = TEMP_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.sigDefinitionsImpl <em>sig Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.sigDefinitionsImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsigDefinitions()
   * @generated
   */
  int SIG_DEFINITIONS = 5;

  /**
   * The feature id for the '<em><b>Constucts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_DEFINITIONS__CONSTUCTS = 0;

  /**
   * The number of structural features of the '<em>sig Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_DEFINITIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.sigConstructImpl <em>sig Construct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.sigConstructImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsigConstruct()
   * @generated
   */
  int SIG_CONSTRUCT = 6;

  /**
   * The feature id for the '<em><b>Tmp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_CONSTRUCT__TMP = 0;

  /**
   * The number of structural features of the '<em>sig Construct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_CONSTRUCT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.classicSymbolConstructImpl <em>classic Symbol Construct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.classicSymbolConstructImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getclassicSymbolConstruct()
   * @generated
   */
  int CLASSIC_SYMBOL_CONSTRUCT = 7;

  /**
   * The feature id for the '<em><b>Tmp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIC_SYMBOL_CONSTRUCT__TMP = SIG_CONSTRUCT__TMP;

  /**
   * The feature id for the '<em><b>Symb Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIC_SYMBOL_CONSTRUCT__SYMB_NAME = SIG_CONSTRUCT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>classic Symbol Construct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIC_SYMBOL_CONSTRUCT_FEATURE_COUNT = SIG_CONSTRUCT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.includeConstructImpl <em>include Construct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.includeConstructImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getincludeConstruct()
   * @generated
   */
  int INCLUDE_CONSTRUCT = 8;

  /**
   * The feature id for the '<em><b>Tmp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_CONSTRUCT__TMP = SIG_CONSTRUCT__TMP;

  /**
   * The feature id for the '<em><b>Full URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_CONSTRUCT__FULL_URI = SIG_CONSTRUCT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_CONSTRUCT__NAMESPACE = SIG_CONSTRUCT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>include Construct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_CONSTRUCT_FEATURE_COUNT = SIG_CONSTRUCT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.structConstructImpl <em>struct Construct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.structConstructImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getstructConstruct()
   * @generated
   */
  int STRUCT_CONSTRUCT = 9;

  /**
   * The feature id for the '<em><b>Tmp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_CONSTRUCT__TMP = SIG_CONSTRUCT__TMP;

  /**
   * The feature id for the '<em><b>Struct Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_CONSTRUCT__STRUCT_NAME = SIG_CONSTRUCT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_CONSTRUCT__NAMESPACE = SIG_CONSTRUCT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Inc Opt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_CONSTRUCT__INC_OPT = SIG_CONSTRUCT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>struct Construct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_CONSTRUCT_FEATURE_COUNT = SIG_CONSTRUCT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.viewDeclarationImpl <em>view Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.viewDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getviewDeclaration()
   * @generated
   */
  int VIEW_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Full URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DECLARATION__FULL_URI = TEMP_TYPE__FULL_URI;

  /**
   * The feature id for the '<em><b>View ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DECLARATION__VIEW_ID = TEMP_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DECLARATION__FROM = TEMP_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DECLARATION__TO = TEMP_TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>View Defs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DECLARATION__VIEW_DEFS = TEMP_TYPE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>view Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DECLARATION_FEATURE_COUNT = TEMP_TYPE_FEATURE_COUNT + 4;


  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see info.kwarc.mmt.lF.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link info.kwarc.mmt.lF.Model#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see info.kwarc.mmt.lF.Model#getDeclarations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Declarations();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.JUSTSPACE <em>JUSTSPACE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JUSTSPACE</em>'.
   * @see info.kwarc.mmt.lF.JUSTSPACE
   * @generated
   */
  EClass getJUSTSPACE();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.JUSTSPACE#getJ <em>J</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>J</em>'.
   * @see info.kwarc.mmt.lF.JUSTSPACE#getJ()
   * @see #getJUSTSPACE()
   * @generated
   */
  EAttribute getJUSTSPACE_J();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.namespaceDeclaration <em>namespace Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>namespace Declaration</em>'.
   * @see info.kwarc.mmt.lF.namespaceDeclaration
   * @generated
   */
  EClass getnamespaceDeclaration();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.namespaceDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see info.kwarc.mmt.lF.namespaceDeclaration#getName()
   * @see #getnamespaceDeclaration()
   * @generated
   */
  EAttribute getnamespaceDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.namespaceDeclaration#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see info.kwarc.mmt.lF.namespaceDeclaration#getUri()
   * @see #getnamespaceDeclaration()
   * @generated
   */
  EAttribute getnamespaceDeclaration_Uri();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.readDeclaration <em>read Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>read Declaration</em>'.
   * @see info.kwarc.mmt.lF.readDeclaration
   * @generated
   */
  EClass getreadDeclaration();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.readDeclaration#getFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File</em>'.
   * @see info.kwarc.mmt.lF.readDeclaration#getFile()
   * @see #getreadDeclaration()
   * @generated
   */
  EAttribute getreadDeclaration_File();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.signatureDeclaration <em>signature Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>signature Declaration</em>'.
   * @see info.kwarc.mmt.lF.signatureDeclaration
   * @generated
   */
  EClass getsignatureDeclaration();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.signatureDeclaration#getSigName <em>Sig Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sig Name</em>'.
   * @see info.kwarc.mmt.lF.signatureDeclaration#getSigName()
   * @see #getsignatureDeclaration()
   * @generated
   */
  EAttribute getsignatureDeclaration_SigName();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.signatureDeclaration#getDefs <em>Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Defs</em>'.
   * @see info.kwarc.mmt.lF.signatureDeclaration#getDefs()
   * @see #getsignatureDeclaration()
   * @generated
   */
  EReference getsignatureDeclaration_Defs();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.sigDefinitions <em>sig Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sig Definitions</em>'.
   * @see info.kwarc.mmt.lF.sigDefinitions
   * @generated
   */
  EClass getsigDefinitions();

  /**
   * Returns the meta object for the containment reference list '{@link info.kwarc.mmt.lF.sigDefinitions#getConstucts <em>Constucts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constucts</em>'.
   * @see info.kwarc.mmt.lF.sigDefinitions#getConstucts()
   * @see #getsigDefinitions()
   * @generated
   */
  EReference getsigDefinitions_Constucts();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.sigConstruct <em>sig Construct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sig Construct</em>'.
   * @see info.kwarc.mmt.lF.sigConstruct
   * @generated
   */
  EClass getsigConstruct();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.sigConstruct#getTmp <em>Tmp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tmp</em>'.
   * @see info.kwarc.mmt.lF.sigConstruct#getTmp()
   * @see #getsigConstruct()
   * @generated
   */
  EAttribute getsigConstruct_Tmp();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.classicSymbolConstruct <em>classic Symbol Construct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>classic Symbol Construct</em>'.
   * @see info.kwarc.mmt.lF.classicSymbolConstruct
   * @generated
   */
  EClass getclassicSymbolConstruct();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.classicSymbolConstruct#getSymbName <em>Symb Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symb Name</em>'.
   * @see info.kwarc.mmt.lF.classicSymbolConstruct#getSymbName()
   * @see #getclassicSymbolConstruct()
   * @generated
   */
  EAttribute getclassicSymbolConstruct_SymbName();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.includeConstruct <em>include Construct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>include Construct</em>'.
   * @see info.kwarc.mmt.lF.includeConstruct
   * @generated
   */
  EClass getincludeConstruct();

  /**
   * Returns the meta object for the reference '{@link info.kwarc.mmt.lF.includeConstruct#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Namespace</em>'.
   * @see info.kwarc.mmt.lF.includeConstruct#getNamespace()
   * @see #getincludeConstruct()
   * @generated
   */
  EReference getincludeConstruct_Namespace();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.structConstruct <em>struct Construct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>struct Construct</em>'.
   * @see info.kwarc.mmt.lF.structConstruct
   * @generated
   */
  EClass getstructConstruct();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.structConstruct#getStructName <em>Struct Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Struct Name</em>'.
   * @see info.kwarc.mmt.lF.structConstruct#getStructName()
   * @see #getstructConstruct()
   * @generated
   */
  EAttribute getstructConstruct_StructName();

  /**
   * Returns the meta object for the reference '{@link info.kwarc.mmt.lF.structConstruct#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Namespace</em>'.
   * @see info.kwarc.mmt.lF.structConstruct#getNamespace()
   * @see #getstructConstruct()
   * @generated
   */
  EReference getstructConstruct_Namespace();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.structConstruct#getIncOpt <em>Inc Opt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inc Opt</em>'.
   * @see info.kwarc.mmt.lF.structConstruct#getIncOpt()
   * @see #getstructConstruct()
   * @generated
   */
  EAttribute getstructConstruct_IncOpt();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.TempType <em>Temp Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Temp Type</em>'.
   * @see info.kwarc.mmt.lF.TempType
   * @generated
   */
  EClass getTempType();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.TempType#getFullURI <em>Full URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Full URI</em>'.
   * @see info.kwarc.mmt.lF.TempType#getFullURI()
   * @see #getTempType()
   * @generated
   */
  EAttribute getTempType_FullURI();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.viewDeclaration <em>view Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>view Declaration</em>'.
   * @see info.kwarc.mmt.lF.viewDeclaration
   * @generated
   */
  EClass getviewDeclaration();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.viewDeclaration#getViewID <em>View ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>View ID</em>'.
   * @see info.kwarc.mmt.lF.viewDeclaration#getViewID()
   * @see #getviewDeclaration()
   * @generated
   */
  EAttribute getviewDeclaration_ViewID();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.viewDeclaration#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see info.kwarc.mmt.lF.viewDeclaration#getFrom()
   * @see #getviewDeclaration()
   * @generated
   */
  EAttribute getviewDeclaration_From();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.viewDeclaration#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see info.kwarc.mmt.lF.viewDeclaration#getTo()
   * @see #getviewDeclaration()
   * @generated
   */
  EAttribute getviewDeclaration_To();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.viewDeclaration#getViewDefs <em>View Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>View Defs</em>'.
   * @see info.kwarc.mmt.lF.viewDeclaration#getViewDefs()
   * @see #getviewDeclaration()
   * @generated
   */
  EReference getviewDeclaration_ViewDefs();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LFFactory getLFFactory();

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
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.ModelImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getModel()
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
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.JUSTSPACEImpl <em>JUSTSPACE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.JUSTSPACEImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getJUSTSPACE()
     * @generated
     */
    EClass JUSTSPACE = eINSTANCE.getJUSTSPACE();

    /**
     * The meta object literal for the '<em><b>J</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JUSTSPACE__J = eINSTANCE.getJUSTSPACE_J();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.namespaceDeclarationImpl <em>namespace Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.namespaceDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getnamespaceDeclaration()
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
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.readDeclarationImpl <em>read Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.readDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getreadDeclaration()
     * @generated
     */
    EClass READ_DECLARATION = eINSTANCE.getreadDeclaration();

    /**
     * The meta object literal for the '<em><b>File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READ_DECLARATION__FILE = eINSTANCE.getreadDeclaration_File();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.signatureDeclarationImpl <em>signature Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.signatureDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsignatureDeclaration()
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
     * The meta object literal for the '<em><b>Defs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE_DECLARATION__DEFS = eINSTANCE.getsignatureDeclaration_Defs();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.sigDefinitionsImpl <em>sig Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.sigDefinitionsImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsigDefinitions()
     * @generated
     */
    EClass SIG_DEFINITIONS = eINSTANCE.getsigDefinitions();

    /**
     * The meta object literal for the '<em><b>Constucts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_DEFINITIONS__CONSTUCTS = eINSTANCE.getsigDefinitions_Constucts();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.sigConstructImpl <em>sig Construct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.sigConstructImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsigConstruct()
     * @generated
     */
    EClass SIG_CONSTRUCT = eINSTANCE.getsigConstruct();

    /**
     * The meta object literal for the '<em><b>Tmp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIG_CONSTRUCT__TMP = eINSTANCE.getsigConstruct_Tmp();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.classicSymbolConstructImpl <em>classic Symbol Construct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.classicSymbolConstructImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getclassicSymbolConstruct()
     * @generated
     */
    EClass CLASSIC_SYMBOL_CONSTRUCT = eINSTANCE.getclassicSymbolConstruct();

    /**
     * The meta object literal for the '<em><b>Symb Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIC_SYMBOL_CONSTRUCT__SYMB_NAME = eINSTANCE.getclassicSymbolConstruct_SymbName();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.includeConstructImpl <em>include Construct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.includeConstructImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getincludeConstruct()
     * @generated
     */
    EClass INCLUDE_CONSTRUCT = eINSTANCE.getincludeConstruct();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUDE_CONSTRUCT__NAMESPACE = eINSTANCE.getincludeConstruct_Namespace();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.structConstructImpl <em>struct Construct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.structConstructImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getstructConstruct()
     * @generated
     */
    EClass STRUCT_CONSTRUCT = eINSTANCE.getstructConstruct();

    /**
     * The meta object literal for the '<em><b>Struct Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_CONSTRUCT__STRUCT_NAME = eINSTANCE.getstructConstruct_StructName();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_CONSTRUCT__NAMESPACE = eINSTANCE.getstructConstruct_Namespace();

    /**
     * The meta object literal for the '<em><b>Inc Opt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_CONSTRUCT__INC_OPT = eINSTANCE.getstructConstruct_IncOpt();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.TempTypeImpl <em>Temp Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.TempTypeImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getTempType()
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

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.viewDeclarationImpl <em>view Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.viewDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getviewDeclaration()
     * @generated
     */
    EClass VIEW_DECLARATION = eINSTANCE.getviewDeclaration();

    /**
     * The meta object literal for the '<em><b>View ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_DECLARATION__VIEW_ID = eINSTANCE.getviewDeclaration_ViewID();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_DECLARATION__FROM = eINSTANCE.getviewDeclaration_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_DECLARATION__TO = eINSTANCE.getviewDeclaration_To();

    /**
     * The meta object literal for the '<em><b>View Defs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_DECLARATION__VIEW_DEFS = eINSTANCE.getviewDeclaration_ViewDefs();

  }

} //LFPackage
