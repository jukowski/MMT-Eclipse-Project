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
   * The feature id for the '<em><b>Constructs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONSTRUCTS = 0;

  /**
   * The feature id for the '<em><b>Not In Document</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NOT_IN_DOCUMENT = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.modelConstructNOSPImpl <em>model Construct NOSP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.modelConstructNOSPImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getmodelConstructNOSP()
   * @generated
   */
  int MODEL_CONSTRUCT_NOSP = 1;

  /**
   * The feature id for the '<em><b>Namespace Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_CONSTRUCT_NOSP__NAMESPACE_DECLARATIONS = 0;

  /**
   * The feature id for the '<em><b>Read Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_CONSTRUCT_NOSP__READ_DECLARATIONS = 1;

  /**
   * The feature id for the '<em><b>Sig Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_CONSTRUCT_NOSP__SIG_DECLARATIONS = 2;

  /**
   * The feature id for the '<em><b>View Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_CONSTRUCT_NOSP__VIEW_DECLARATIONS = 3;

  /**
   * The feature id for the '<em><b>Raw Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_CONSTRUCT_NOSP__RAW_DECLARATIONS = 4;

  /**
   * The number of structural features of the '<em>model Construct NOSP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_CONSTRUCT_NOSP_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.termImpl <em>term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.termImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getterm()
   * @generated
   */
  int TERM = 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__RIGHT = 1;

  /**
   * The feature id for the '<em><b>Quantifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__QUANTIFIERS = 2;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__TERM = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__TYPE = 4;

  /**
   * The feature id for the '<em><b>Atom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__ATOM = 5;

  /**
   * The number of structural features of the '<em>term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.termPiImpl <em>term Pi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.termPiImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#gettermPi()
   * @generated
   */
  int TERM_PI = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_PI__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_PI__TYPE = 1;

  /**
   * The number of structural features of the '<em>term Pi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_PI_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.termLambdaImpl <em>term Lambda</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.termLambdaImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#gettermLambda()
   * @generated
   */
  int TERM_LAMBDA = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_LAMBDA__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_LAMBDA__TYPE = 1;

  /**
   * The number of structural features of the '<em>term Lambda</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_LAMBDA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.morphismImpl <em>morphism</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.morphismImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getmorphism()
   * @generated
   */
  int MORPHISM = 5;

  /**
   * The feature id for the '<em><b>Link Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORPHISM__LINK_REFS = 0;

  /**
   * The number of structural features of the '<em>morphism</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORPHISM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.sigConstructImpl <em>sig Construct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.sigConstructImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsigConstruct()
   * @generated
   */
  int SIG_CONSTRUCT = 26;

  /**
   * The number of structural features of the '<em>sig Construct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_CONSTRUCT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.sigConstructNOSPImpl <em>sig Construct NOSP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.sigConstructNOSPImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsigConstructNOSP()
   * @generated
   */
  int SIG_CONSTRUCT_NOSP = 25;

  /**
   * The number of structural features of the '<em>sig Construct NOSP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_CONSTRUCT_NOSP_FEATURE_COUNT = SIG_CONSTRUCT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.abbrevTermDeclarationImpl <em>abbrev Term Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.abbrevTermDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getabbrevTermDeclaration()
   * @generated
   */
  int ABBREV_TERM_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Full URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREV_TERM_DECLARATION__FULL_URI = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>abbrev Term Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREV_TERM_DECLARATION_FEATURE_COUNT = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.termDeclarationImpl <em>term Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.termDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#gettermDeclaration()
   * @generated
   */
  int TERM_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Full URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_DECLARATION__FULL_URI = ABBREV_TERM_DECLARATION__FULL_URI;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_DECLARATION__NAME = ABBREV_TERM_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_DECLARATION__TYPE = ABBREV_TERM_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_DECLARATION__DEF = ABBREV_TERM_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>term Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_DECLARATION_FEATURE_COUNT = ABBREV_TERM_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.nameDeclarationImpl <em>name Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.nameDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getnameDeclaration()
   * @generated
   */
  int NAME_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_DECLARATION__NAME = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_DECLARATION__ALIAS = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>name Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_DECLARATION_FEATURE_COUNT = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.fixityDeclarationImpl <em>fixity Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.fixityDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getfixityDeclaration()
   * @generated
   */
  int FIXITY_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Fixity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXITY_DECLARATION__FIXITY = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fixity Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXITY_DECLARATION__FIXITY_LEVEL = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXITY_DECLARATION__NAME = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>fixity Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXITY_DECLARATION_FEATURE_COUNT = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.sigMetaDeclarationImpl <em>sig Meta Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.sigMetaDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsigMetaDeclaration()
   * @generated
   */
  int SIG_META_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_META_DECLARATION__REF = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>sig Meta Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_META_DECLARATION_FEATURE_COUNT = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.sigIncludeDeclarationImpl <em>sig Include Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.sigIncludeDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsigIncludeDeclaration()
   * @generated
   */
  int SIG_INCLUDE_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Full URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_INCLUDE_DECLARATION__FULL_URI = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_INCLUDE_DECLARATION__REF = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Inc Opt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_INCLUDE_DECLARATION__INC_OPT = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>sig Include Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_INCLUDE_DECLARATION_FEATURE_COUNT = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.structDeclarationImpl <em>struct Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.structDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getstructDeclaration()
   * @generated
   */
  int STRUCT_DECLARATION = 12;

  /**
   * The feature id for the '<em><b>Full URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECLARATION__FULL_URI = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECLARATION__NAME = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECLARATION__DEF = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECLARATION__FROM = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Inc Opt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECLARATION__INC_OPT = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>struct Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_DECLARATION_FEATURE_COUNT = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.includeOpsImpl <em>include Ops</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.includeOpsImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getincludeOps()
   * @generated
   */
  int INCLUDE_OPS = 13;

  /**
   * The feature id for the '<em><b>Aliases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_OPS__ALIASES = 0;

  /**
   * The number of structural features of the '<em>include Ops</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_OPS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.aliasDeclarationImpl <em>alias Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.aliasDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getaliasDeclaration()
   * @generated
   */
  int ALIAS_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Old</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_DECLARATION__OLD = 0;

  /**
   * The feature id for the '<em><b>New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_DECLARATION__NEW = 1;

  /**
   * The number of structural features of the '<em>alias Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.linkConstructImpl <em>link Construct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.linkConstructImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getlinkConstruct()
   * @generated
   */
  int LINK_CONSTRUCT = 30;

  /**
   * The number of structural features of the '<em>link Construct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_CONSTRUCT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.constantAssignmentImpl <em>constant Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.constantAssignmentImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getconstantAssignment()
   * @generated
   */
  int CONSTANT_ASSIGNMENT = 15;

  /**
   * The feature id for the '<em><b>Full URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_ASSIGNMENT__FULL_URI = LINK_CONSTRUCT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_ASSIGNMENT__NAME = LINK_CONSTRUCT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_ASSIGNMENT__DEF = LINK_CONSTRUCT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>constant Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_ASSIGNMENT_FEATURE_COUNT = LINK_CONSTRUCT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.linkConstructNOSPImpl <em>link Construct NOSP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.linkConstructNOSPImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getlinkConstructNOSP()
   * @generated
   */
  int LINK_CONSTRUCT_NOSP = 29;

  /**
   * The number of structural features of the '<em>link Construct NOSP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_CONSTRUCT_NOSP_FEATURE_COUNT = LINK_CONSTRUCT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.structAssignmentImpl <em>struct Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.structAssignmentImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getstructAssignment()
   * @generated
   */
  int STRUCT_ASSIGNMENT = 16;

  /**
   * The feature id for the '<em><b>Full URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ASSIGNMENT__FULL_URI = LINK_CONSTRUCT_NOSP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ASSIGNMENT__NAME = LINK_CONSTRUCT_NOSP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ASSIGNMENT__DEF = LINK_CONSTRUCT_NOSP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>struct Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ASSIGNMENT_FEATURE_COUNT = LINK_CONSTRUCT_NOSP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.viewMetaDeclarationImpl <em>view Meta Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.viewMetaDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getviewMetaDeclaration()
   * @generated
   */
  int VIEW_META_DECLARATION = 17;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_META_DECLARATION__DEF = LINK_CONSTRUCT_NOSP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>view Meta Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_META_DECLARATION_FEATURE_COUNT = LINK_CONSTRUCT_NOSP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.viewIncludeDeclarationImpl <em>view Include Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.viewIncludeDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getviewIncludeDeclaration()
   * @generated
   */
  int VIEW_INCLUDE_DECLARATION = 18;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_INCLUDE_DECLARATION__DEF = LINK_CONSTRUCT_NOSP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>view Include Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_INCLUDE_DECLARATION_FEATURE_COUNT = LINK_CONSTRUCT_NOSP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.unknownBracketsImpl <em>unknown Brackets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.unknownBracketsImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getunknownBrackets()
   * @generated
   */
  int UNKNOWN_BRACKETS = 19;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_BRACKETS__T = 0;

  /**
   * The number of structural features of the '<em>unknown Brackets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_BRACKETS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.anyConstructImpl <em>any Construct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.anyConstructImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getanyConstruct()
   * @generated
   */
  int ANY_CONSTRUCT = 20;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_CONSTRUCT__T = 0;

  /**
   * The feature id for the '<em><b>Directive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_CONSTRUCT__DIRECTIVE = 1;

  /**
   * The number of structural features of the '<em>any Construct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_CONSTRUCT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.unknownBodyImpl <em>unknown Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.unknownBodyImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getunknownBody()
   * @generated
   */
  int UNKNOWN_BODY = 21;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_BODY__T = 0;

  /**
   * The number of structural features of the '<em>unknown Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.unknownConstructImpl <em>unknown Construct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.unknownConstructImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getunknownConstruct()
   * @generated
   */
  int UNKNOWN_CONSTRUCT = 22;

  /**
   * The feature id for the '<em><b>Directive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_CONSTRUCT__DIRECTIVE = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_CONSTRUCT__T = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>unknown Construct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_CONSTRUCT_FEATURE_COUNT = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.TempTypeImpl <em>Temp Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.TempTypeImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getTempType()
   * @generated
   */
  int TEMP_TYPE = 35;

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
  int NAMESPACE_DECLARATION = 23;

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
  int READ_DECLARATION = 24;

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
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.sigBodyImpl <em>sig Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.sigBodyImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsigBody()
   * @generated
   */
  int SIG_BODY = 27;

  /**
   * The feature id for the '<em><b>Constructs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_BODY__CONSTRUCTS = 0;

  /**
   * The number of structural features of the '<em>sig Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.sigDeclarationImpl <em>sig Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.sigDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsigDeclaration()
   * @generated
   */
  int SIG_DECLARATION = 28;

  /**
   * The feature id for the '<em><b>Full URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_DECLARATION__FULL_URI = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_DECLARATION__NAME = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_DECLARATION__DEF = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>sig Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIG_DECLARATION_FEATURE_COUNT = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.linkBodyImpl <em>link Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.linkBodyImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getlinkBody()
   * @generated
   */
  int LINK_BODY = 31;

  /**
   * The feature id for the '<em><b>Constructs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_BODY__CONSTRUCTS = 0;

  /**
   * The number of structural features of the '<em>link Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.linkDeclarationImpl <em>link Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.linkDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getlinkDeclaration()
   * @generated
   */
  int LINK_DECLARATION = 34;

  /**
   * The number of structural features of the '<em>link Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.viewDeclarationImpl <em>view Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.viewDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getviewDeclaration()
   * @generated
   */
  int VIEW_DECLARATION = 32;

  /**
   * The feature id for the '<em><b>Full URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DECLARATION__FULL_URI = LINK_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DECLARATION__NAME = LINK_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DECLARATION__FROM = LINK_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DECLARATION__TO = LINK_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DECLARATION__DEF = LINK_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>view Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_DECLARATION_FEATURE_COUNT = LINK_DECLARATION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link info.kwarc.mmt.lF.impl.internalViewDeclarationImpl <em>internal View Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see info.kwarc.mmt.lF.impl.internalViewDeclarationImpl
   * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getinternalViewDeclaration()
   * @generated
   */
  int INTERNAL_VIEW_DECLARATION = 33;

  /**
   * The feature id for the '<em><b>Full URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_VIEW_DECLARATION__FULL_URI = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_VIEW_DECLARATION__NAME = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_VIEW_DECLARATION__FROM = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_VIEW_DECLARATION__TO = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_VIEW_DECLARATION__DEF = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>internal View Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_VIEW_DECLARATION_FEATURE_COUNT = SIG_CONSTRUCT_NOSP_FEATURE_COUNT + 5;


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
   * Returns the meta object for the containment reference list '{@link info.kwarc.mmt.lF.Model#getConstructs <em>Constructs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructs</em>'.
   * @see info.kwarc.mmt.lF.Model#getConstructs()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Constructs();

  /**
   * Returns the meta object for the attribute list '{@link info.kwarc.mmt.lF.Model#getNotInDocument <em>Not In Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Not In Document</em>'.
   * @see info.kwarc.mmt.lF.Model#getNotInDocument()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_NotInDocument();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.modelConstructNOSP <em>model Construct NOSP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>model Construct NOSP</em>'.
   * @see info.kwarc.mmt.lF.modelConstructNOSP
   * @generated
   */
  EClass getmodelConstructNOSP();

  /**
   * Returns the meta object for the containment reference list '{@link info.kwarc.mmt.lF.modelConstructNOSP#getNamespaceDeclarations <em>Namespace Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Namespace Declarations</em>'.
   * @see info.kwarc.mmt.lF.modelConstructNOSP#getNamespaceDeclarations()
   * @see #getmodelConstructNOSP()
   * @generated
   */
  EReference getmodelConstructNOSP_NamespaceDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link info.kwarc.mmt.lF.modelConstructNOSP#getReadDeclarations <em>Read Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Read Declarations</em>'.
   * @see info.kwarc.mmt.lF.modelConstructNOSP#getReadDeclarations()
   * @see #getmodelConstructNOSP()
   * @generated
   */
  EReference getmodelConstructNOSP_ReadDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link info.kwarc.mmt.lF.modelConstructNOSP#getSigDeclarations <em>Sig Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sig Declarations</em>'.
   * @see info.kwarc.mmt.lF.modelConstructNOSP#getSigDeclarations()
   * @see #getmodelConstructNOSP()
   * @generated
   */
  EReference getmodelConstructNOSP_SigDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link info.kwarc.mmt.lF.modelConstructNOSP#getViewDeclarations <em>View Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>View Declarations</em>'.
   * @see info.kwarc.mmt.lF.modelConstructNOSP#getViewDeclarations()
   * @see #getmodelConstructNOSP()
   * @generated
   */
  EReference getmodelConstructNOSP_ViewDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link info.kwarc.mmt.lF.modelConstructNOSP#getRawDeclarations <em>Raw Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Raw Declarations</em>'.
   * @see info.kwarc.mmt.lF.modelConstructNOSP#getRawDeclarations()
   * @see #getmodelConstructNOSP()
   * @generated
   */
  EReference getmodelConstructNOSP_RawDeclarations();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.term <em>term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>term</em>'.
   * @see info.kwarc.mmt.lF.term
   * @generated
   */
  EClass getterm();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.term#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see info.kwarc.mmt.lF.term#getLeft()
   * @see #getterm()
   * @generated
   */
  EReference getterm_Left();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.term#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see info.kwarc.mmt.lF.term#getRight()
   * @see #getterm()
   * @generated
   */
  EReference getterm_Right();

  /**
   * Returns the meta object for the containment reference list '{@link info.kwarc.mmt.lF.term#getQuantifiers <em>Quantifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantifiers</em>'.
   * @see info.kwarc.mmt.lF.term#getQuantifiers()
   * @see #getterm()
   * @generated
   */
  EReference getterm_Quantifiers();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.term#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see info.kwarc.mmt.lF.term#getTerm()
   * @see #getterm()
   * @generated
   */
  EReference getterm_Term();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.term#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see info.kwarc.mmt.lF.term#getType()
   * @see #getterm()
   * @generated
   */
  EReference getterm_Type();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.term#getAtom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Atom</em>'.
   * @see info.kwarc.mmt.lF.term#getAtom()
   * @see #getterm()
   * @generated
   */
  EAttribute getterm_Atom();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.termPi <em>term Pi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>term Pi</em>'.
   * @see info.kwarc.mmt.lF.termPi
   * @generated
   */
  EClass gettermPi();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.termPi#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see info.kwarc.mmt.lF.termPi#getName()
   * @see #gettermPi()
   * @generated
   */
  EAttribute gettermPi_Name();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.termPi#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see info.kwarc.mmt.lF.termPi#getType()
   * @see #gettermPi()
   * @generated
   */
  EReference gettermPi_Type();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.termLambda <em>term Lambda</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>term Lambda</em>'.
   * @see info.kwarc.mmt.lF.termLambda
   * @generated
   */
  EClass gettermLambda();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.termLambda#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see info.kwarc.mmt.lF.termLambda#getName()
   * @see #gettermLambda()
   * @generated
   */
  EAttribute gettermLambda_Name();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.termLambda#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see info.kwarc.mmt.lF.termLambda#getType()
   * @see #gettermLambda()
   * @generated
   */
  EReference gettermLambda_Type();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.morphism <em>morphism</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>morphism</em>'.
   * @see info.kwarc.mmt.lF.morphism
   * @generated
   */
  EClass getmorphism();

  /**
   * Returns the meta object for the reference list '{@link info.kwarc.mmt.lF.morphism#getLinkRefs <em>Link Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Link Refs</em>'.
   * @see info.kwarc.mmt.lF.morphism#getLinkRefs()
   * @see #getmorphism()
   * @generated
   */
  EReference getmorphism_LinkRefs();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.termDeclaration <em>term Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>term Declaration</em>'.
   * @see info.kwarc.mmt.lF.termDeclaration
   * @generated
   */
  EClass gettermDeclaration();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.termDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see info.kwarc.mmt.lF.termDeclaration#getName()
   * @see #gettermDeclaration()
   * @generated
   */
  EAttribute gettermDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.termDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see info.kwarc.mmt.lF.termDeclaration#getType()
   * @see #gettermDeclaration()
   * @generated
   */
  EReference gettermDeclaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.termDeclaration#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see info.kwarc.mmt.lF.termDeclaration#getDef()
   * @see #gettermDeclaration()
   * @generated
   */
  EReference gettermDeclaration_Def();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.abbrevTermDeclaration <em>abbrev Term Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>abbrev Term Declaration</em>'.
   * @see info.kwarc.mmt.lF.abbrevTermDeclaration
   * @generated
   */
  EClass getabbrevTermDeclaration();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.nameDeclaration <em>name Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>name Declaration</em>'.
   * @see info.kwarc.mmt.lF.nameDeclaration
   * @generated
   */
  EClass getnameDeclaration();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.nameDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see info.kwarc.mmt.lF.nameDeclaration#getName()
   * @see #getnameDeclaration()
   * @generated
   */
  EAttribute getnameDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.nameDeclaration#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see info.kwarc.mmt.lF.nameDeclaration#getAlias()
   * @see #getnameDeclaration()
   * @generated
   */
  EAttribute getnameDeclaration_Alias();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.fixityDeclaration <em>fixity Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fixity Declaration</em>'.
   * @see info.kwarc.mmt.lF.fixityDeclaration
   * @generated
   */
  EClass getfixityDeclaration();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.fixityDeclaration#getFixity <em>Fixity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fixity</em>'.
   * @see info.kwarc.mmt.lF.fixityDeclaration#getFixity()
   * @see #getfixityDeclaration()
   * @generated
   */
  EAttribute getfixityDeclaration_Fixity();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.fixityDeclaration#getFixityLevel <em>Fixity Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fixity Level</em>'.
   * @see info.kwarc.mmt.lF.fixityDeclaration#getFixityLevel()
   * @see #getfixityDeclaration()
   * @generated
   */
  EAttribute getfixityDeclaration_FixityLevel();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.fixityDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see info.kwarc.mmt.lF.fixityDeclaration#getName()
   * @see #getfixityDeclaration()
   * @generated
   */
  EAttribute getfixityDeclaration_Name();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.sigMetaDeclaration <em>sig Meta Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sig Meta Declaration</em>'.
   * @see info.kwarc.mmt.lF.sigMetaDeclaration
   * @generated
   */
  EClass getsigMetaDeclaration();

  /**
   * Returns the meta object for the reference '{@link info.kwarc.mmt.lF.sigMetaDeclaration#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see info.kwarc.mmt.lF.sigMetaDeclaration#getRef()
   * @see #getsigMetaDeclaration()
   * @generated
   */
  EReference getsigMetaDeclaration_Ref();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.sigIncludeDeclaration <em>sig Include Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sig Include Declaration</em>'.
   * @see info.kwarc.mmt.lF.sigIncludeDeclaration
   * @generated
   */
  EClass getsigIncludeDeclaration();

  /**
   * Returns the meta object for the reference '{@link info.kwarc.mmt.lF.sigIncludeDeclaration#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see info.kwarc.mmt.lF.sigIncludeDeclaration#getRef()
   * @see #getsigIncludeDeclaration()
   * @generated
   */
  EReference getsigIncludeDeclaration_Ref();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.sigIncludeDeclaration#getIncOpt <em>Inc Opt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inc Opt</em>'.
   * @see info.kwarc.mmt.lF.sigIncludeDeclaration#getIncOpt()
   * @see #getsigIncludeDeclaration()
   * @generated
   */
  EReference getsigIncludeDeclaration_IncOpt();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.structDeclaration <em>struct Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>struct Declaration</em>'.
   * @see info.kwarc.mmt.lF.structDeclaration
   * @generated
   */
  EClass getstructDeclaration();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.structDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see info.kwarc.mmt.lF.structDeclaration#getName()
   * @see #getstructDeclaration()
   * @generated
   */
  EAttribute getstructDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.structDeclaration#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see info.kwarc.mmt.lF.structDeclaration#getDef()
   * @see #getstructDeclaration()
   * @generated
   */
  EReference getstructDeclaration_Def();

  /**
   * Returns the meta object for the reference '{@link info.kwarc.mmt.lF.structDeclaration#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see info.kwarc.mmt.lF.structDeclaration#getFrom()
   * @see #getstructDeclaration()
   * @generated
   */
  EReference getstructDeclaration_From();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.structDeclaration#getIncOpt <em>Inc Opt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inc Opt</em>'.
   * @see info.kwarc.mmt.lF.structDeclaration#getIncOpt()
   * @see #getstructDeclaration()
   * @generated
   */
  EReference getstructDeclaration_IncOpt();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.includeOps <em>include Ops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>include Ops</em>'.
   * @see info.kwarc.mmt.lF.includeOps
   * @generated
   */
  EClass getincludeOps();

  /**
   * Returns the meta object for the containment reference list '{@link info.kwarc.mmt.lF.includeOps#getAliases <em>Aliases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aliases</em>'.
   * @see info.kwarc.mmt.lF.includeOps#getAliases()
   * @see #getincludeOps()
   * @generated
   */
  EReference getincludeOps_Aliases();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.aliasDeclaration <em>alias Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>alias Declaration</em>'.
   * @see info.kwarc.mmt.lF.aliasDeclaration
   * @generated
   */
  EClass getaliasDeclaration();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.aliasDeclaration#getOld <em>Old</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Old</em>'.
   * @see info.kwarc.mmt.lF.aliasDeclaration#getOld()
   * @see #getaliasDeclaration()
   * @generated
   */
  EAttribute getaliasDeclaration_Old();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.aliasDeclaration#getNew <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New</em>'.
   * @see info.kwarc.mmt.lF.aliasDeclaration#getNew()
   * @see #getaliasDeclaration()
   * @generated
   */
  EAttribute getaliasDeclaration_New();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.constantAssignment <em>constant Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant Assignment</em>'.
   * @see info.kwarc.mmt.lF.constantAssignment
   * @generated
   */
  EClass getconstantAssignment();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.constantAssignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see info.kwarc.mmt.lF.constantAssignment#getName()
   * @see #getconstantAssignment()
   * @generated
   */
  EAttribute getconstantAssignment_Name();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.constantAssignment#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see info.kwarc.mmt.lF.constantAssignment#getDef()
   * @see #getconstantAssignment()
   * @generated
   */
  EReference getconstantAssignment_Def();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.structAssignment <em>struct Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>struct Assignment</em>'.
   * @see info.kwarc.mmt.lF.structAssignment
   * @generated
   */
  EClass getstructAssignment();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.structAssignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see info.kwarc.mmt.lF.structAssignment#getName()
   * @see #getstructAssignment()
   * @generated
   */
  EAttribute getstructAssignment_Name();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.structAssignment#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see info.kwarc.mmt.lF.structAssignment#getDef()
   * @see #getstructAssignment()
   * @generated
   */
  EReference getstructAssignment_Def();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.viewMetaDeclaration <em>view Meta Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>view Meta Declaration</em>'.
   * @see info.kwarc.mmt.lF.viewMetaDeclaration
   * @generated
   */
  EClass getviewMetaDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.viewMetaDeclaration#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see info.kwarc.mmt.lF.viewMetaDeclaration#getDef()
   * @see #getviewMetaDeclaration()
   * @generated
   */
  EReference getviewMetaDeclaration_Def();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.viewIncludeDeclaration <em>view Include Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>view Include Declaration</em>'.
   * @see info.kwarc.mmt.lF.viewIncludeDeclaration
   * @generated
   */
  EClass getviewIncludeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.viewIncludeDeclaration#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see info.kwarc.mmt.lF.viewIncludeDeclaration#getDef()
   * @see #getviewIncludeDeclaration()
   * @generated
   */
  EReference getviewIncludeDeclaration_Def();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.unknownBrackets <em>unknown Brackets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>unknown Brackets</em>'.
   * @see info.kwarc.mmt.lF.unknownBrackets
   * @generated
   */
  EClass getunknownBrackets();

  /**
   * Returns the meta object for the containment reference list '{@link info.kwarc.mmt.lF.unknownBrackets#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T</em>'.
   * @see info.kwarc.mmt.lF.unknownBrackets#getT()
   * @see #getunknownBrackets()
   * @generated
   */
  EReference getunknownBrackets_T();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.anyConstruct <em>any Construct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>any Construct</em>'.
   * @see info.kwarc.mmt.lF.anyConstruct
   * @generated
   */
  EClass getanyConstruct();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.anyConstruct#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see info.kwarc.mmt.lF.anyConstruct#getT()
   * @see #getanyConstruct()
   * @generated
   */
  EReference getanyConstruct_T();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.anyConstruct#getDirective <em>Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Directive</em>'.
   * @see info.kwarc.mmt.lF.anyConstruct#getDirective()
   * @see #getanyConstruct()
   * @generated
   */
  EAttribute getanyConstruct_Directive();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.unknownBody <em>unknown Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>unknown Body</em>'.
   * @see info.kwarc.mmt.lF.unknownBody
   * @generated
   */
  EClass getunknownBody();

  /**
   * Returns the meta object for the containment reference list '{@link info.kwarc.mmt.lF.unknownBody#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>T</em>'.
   * @see info.kwarc.mmt.lF.unknownBody#getT()
   * @see #getunknownBody()
   * @generated
   */
  EReference getunknownBody_T();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.unknownConstruct <em>unknown Construct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>unknown Construct</em>'.
   * @see info.kwarc.mmt.lF.unknownConstruct
   * @generated
   */
  EClass getunknownConstruct();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.unknownConstruct#getDirective <em>Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Directive</em>'.
   * @see info.kwarc.mmt.lF.unknownConstruct#getDirective()
   * @see #getunknownConstruct()
   * @generated
   */
  EAttribute getunknownConstruct_Directive();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.unknownConstruct#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see info.kwarc.mmt.lF.unknownConstruct#getT()
   * @see #getunknownConstruct()
   * @generated
   */
  EReference getunknownConstruct_T();

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
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.sigConstructNOSP <em>sig Construct NOSP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sig Construct NOSP</em>'.
   * @see info.kwarc.mmt.lF.sigConstructNOSP
   * @generated
   */
  EClass getsigConstructNOSP();

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
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.sigBody <em>sig Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sig Body</em>'.
   * @see info.kwarc.mmt.lF.sigBody
   * @generated
   */
  EClass getsigBody();

  /**
   * Returns the meta object for the containment reference list '{@link info.kwarc.mmt.lF.sigBody#getConstructs <em>Constructs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructs</em>'.
   * @see info.kwarc.mmt.lF.sigBody#getConstructs()
   * @see #getsigBody()
   * @generated
   */
  EReference getsigBody_Constructs();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.sigDeclaration <em>sig Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sig Declaration</em>'.
   * @see info.kwarc.mmt.lF.sigDeclaration
   * @generated
   */
  EClass getsigDeclaration();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.sigDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see info.kwarc.mmt.lF.sigDeclaration#getName()
   * @see #getsigDeclaration()
   * @generated
   */
  EAttribute getsigDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.sigDeclaration#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see info.kwarc.mmt.lF.sigDeclaration#getDef()
   * @see #getsigDeclaration()
   * @generated
   */
  EReference getsigDeclaration_Def();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.linkConstructNOSP <em>link Construct NOSP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>link Construct NOSP</em>'.
   * @see info.kwarc.mmt.lF.linkConstructNOSP
   * @generated
   */
  EClass getlinkConstructNOSP();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.linkConstruct <em>link Construct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>link Construct</em>'.
   * @see info.kwarc.mmt.lF.linkConstruct
   * @generated
   */
  EClass getlinkConstruct();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.linkBody <em>link Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>link Body</em>'.
   * @see info.kwarc.mmt.lF.linkBody
   * @generated
   */
  EClass getlinkBody();

  /**
   * Returns the meta object for the containment reference list '{@link info.kwarc.mmt.lF.linkBody#getConstructs <em>Constructs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructs</em>'.
   * @see info.kwarc.mmt.lF.linkBody#getConstructs()
   * @see #getlinkBody()
   * @generated
   */
  EReference getlinkBody_Constructs();

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
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.viewDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see info.kwarc.mmt.lF.viewDeclaration#getName()
   * @see #getviewDeclaration()
   * @generated
   */
  EAttribute getviewDeclaration_Name();

  /**
   * Returns the meta object for the reference '{@link info.kwarc.mmt.lF.viewDeclaration#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see info.kwarc.mmt.lF.viewDeclaration#getFrom()
   * @see #getviewDeclaration()
   * @generated
   */
  EReference getviewDeclaration_From();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.viewDeclaration#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see info.kwarc.mmt.lF.viewDeclaration#getTo()
   * @see #getviewDeclaration()
   * @generated
   */
  EReference getviewDeclaration_To();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.viewDeclaration#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see info.kwarc.mmt.lF.viewDeclaration#getDef()
   * @see #getviewDeclaration()
   * @generated
   */
  EReference getviewDeclaration_Def();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.internalViewDeclaration <em>internal View Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>internal View Declaration</em>'.
   * @see info.kwarc.mmt.lF.internalViewDeclaration
   * @generated
   */
  EClass getinternalViewDeclaration();

  /**
   * Returns the meta object for the attribute '{@link info.kwarc.mmt.lF.internalViewDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see info.kwarc.mmt.lF.internalViewDeclaration#getName()
   * @see #getinternalViewDeclaration()
   * @generated
   */
  EAttribute getinternalViewDeclaration_Name();

  /**
   * Returns the meta object for the reference '{@link info.kwarc.mmt.lF.internalViewDeclaration#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see info.kwarc.mmt.lF.internalViewDeclaration#getFrom()
   * @see #getinternalViewDeclaration()
   * @generated
   */
  EReference getinternalViewDeclaration_From();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.internalViewDeclaration#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see info.kwarc.mmt.lF.internalViewDeclaration#getTo()
   * @see #getinternalViewDeclaration()
   * @generated
   */
  EReference getinternalViewDeclaration_To();

  /**
   * Returns the meta object for the containment reference '{@link info.kwarc.mmt.lF.internalViewDeclaration#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see info.kwarc.mmt.lF.internalViewDeclaration#getDef()
   * @see #getinternalViewDeclaration()
   * @generated
   */
  EReference getinternalViewDeclaration_Def();

  /**
   * Returns the meta object for class '{@link info.kwarc.mmt.lF.linkDeclaration <em>link Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>link Declaration</em>'.
   * @see info.kwarc.mmt.lF.linkDeclaration
   * @generated
   */
  EClass getlinkDeclaration();

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
     * The meta object literal for the '<em><b>Constructs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONSTRUCTS = eINSTANCE.getModel_Constructs();

    /**
     * The meta object literal for the '<em><b>Not In Document</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NOT_IN_DOCUMENT = eINSTANCE.getModel_NotInDocument();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.modelConstructNOSPImpl <em>model Construct NOSP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.modelConstructNOSPImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getmodelConstructNOSP()
     * @generated
     */
    EClass MODEL_CONSTRUCT_NOSP = eINSTANCE.getmodelConstructNOSP();

    /**
     * The meta object literal for the '<em><b>Namespace Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_CONSTRUCT_NOSP__NAMESPACE_DECLARATIONS = eINSTANCE.getmodelConstructNOSP_NamespaceDeclarations();

    /**
     * The meta object literal for the '<em><b>Read Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_CONSTRUCT_NOSP__READ_DECLARATIONS = eINSTANCE.getmodelConstructNOSP_ReadDeclarations();

    /**
     * The meta object literal for the '<em><b>Sig Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_CONSTRUCT_NOSP__SIG_DECLARATIONS = eINSTANCE.getmodelConstructNOSP_SigDeclarations();

    /**
     * The meta object literal for the '<em><b>View Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_CONSTRUCT_NOSP__VIEW_DECLARATIONS = eINSTANCE.getmodelConstructNOSP_ViewDeclarations();

    /**
     * The meta object literal for the '<em><b>Raw Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_CONSTRUCT_NOSP__RAW_DECLARATIONS = eINSTANCE.getmodelConstructNOSP_RawDeclarations();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.termImpl <em>term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.termImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getterm()
     * @generated
     */
    EClass TERM = eINSTANCE.getterm();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__LEFT = eINSTANCE.getterm_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__RIGHT = eINSTANCE.getterm_Right();

    /**
     * The meta object literal for the '<em><b>Quantifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__QUANTIFIERS = eINSTANCE.getterm_Quantifiers();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__TERM = eINSTANCE.getterm_Term();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__TYPE = eINSTANCE.getterm_Type();

    /**
     * The meta object literal for the '<em><b>Atom</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__ATOM = eINSTANCE.getterm_Atom();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.termPiImpl <em>term Pi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.termPiImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#gettermPi()
     * @generated
     */
    EClass TERM_PI = eINSTANCE.gettermPi();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM_PI__NAME = eINSTANCE.gettermPi_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_PI__TYPE = eINSTANCE.gettermPi_Type();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.termLambdaImpl <em>term Lambda</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.termLambdaImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#gettermLambda()
     * @generated
     */
    EClass TERM_LAMBDA = eINSTANCE.gettermLambda();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM_LAMBDA__NAME = eINSTANCE.gettermLambda_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_LAMBDA__TYPE = eINSTANCE.gettermLambda_Type();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.morphismImpl <em>morphism</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.morphismImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getmorphism()
     * @generated
     */
    EClass MORPHISM = eINSTANCE.getmorphism();

    /**
     * The meta object literal for the '<em><b>Link Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MORPHISM__LINK_REFS = eINSTANCE.getmorphism_LinkRefs();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.termDeclarationImpl <em>term Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.termDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#gettermDeclaration()
     * @generated
     */
    EClass TERM_DECLARATION = eINSTANCE.gettermDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM_DECLARATION__NAME = eINSTANCE.gettermDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_DECLARATION__TYPE = eINSTANCE.gettermDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_DECLARATION__DEF = eINSTANCE.gettermDeclaration_Def();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.abbrevTermDeclarationImpl <em>abbrev Term Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.abbrevTermDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getabbrevTermDeclaration()
     * @generated
     */
    EClass ABBREV_TERM_DECLARATION = eINSTANCE.getabbrevTermDeclaration();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.nameDeclarationImpl <em>name Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.nameDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getnameDeclaration()
     * @generated
     */
    EClass NAME_DECLARATION = eINSTANCE.getnameDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_DECLARATION__NAME = eINSTANCE.getnameDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_DECLARATION__ALIAS = eINSTANCE.getnameDeclaration_Alias();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.fixityDeclarationImpl <em>fixity Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.fixityDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getfixityDeclaration()
     * @generated
     */
    EClass FIXITY_DECLARATION = eINSTANCE.getfixityDeclaration();

    /**
     * The meta object literal for the '<em><b>Fixity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIXITY_DECLARATION__FIXITY = eINSTANCE.getfixityDeclaration_Fixity();

    /**
     * The meta object literal for the '<em><b>Fixity Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIXITY_DECLARATION__FIXITY_LEVEL = eINSTANCE.getfixityDeclaration_FixityLevel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIXITY_DECLARATION__NAME = eINSTANCE.getfixityDeclaration_Name();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.sigMetaDeclarationImpl <em>sig Meta Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.sigMetaDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsigMetaDeclaration()
     * @generated
     */
    EClass SIG_META_DECLARATION = eINSTANCE.getsigMetaDeclaration();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_META_DECLARATION__REF = eINSTANCE.getsigMetaDeclaration_Ref();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.sigIncludeDeclarationImpl <em>sig Include Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.sigIncludeDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsigIncludeDeclaration()
     * @generated
     */
    EClass SIG_INCLUDE_DECLARATION = eINSTANCE.getsigIncludeDeclaration();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_INCLUDE_DECLARATION__REF = eINSTANCE.getsigIncludeDeclaration_Ref();

    /**
     * The meta object literal for the '<em><b>Inc Opt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_INCLUDE_DECLARATION__INC_OPT = eINSTANCE.getsigIncludeDeclaration_IncOpt();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.structDeclarationImpl <em>struct Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.structDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getstructDeclaration()
     * @generated
     */
    EClass STRUCT_DECLARATION = eINSTANCE.getstructDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_DECLARATION__NAME = eINSTANCE.getstructDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_DECLARATION__DEF = eINSTANCE.getstructDeclaration_Def();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_DECLARATION__FROM = eINSTANCE.getstructDeclaration_From();

    /**
     * The meta object literal for the '<em><b>Inc Opt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_DECLARATION__INC_OPT = eINSTANCE.getstructDeclaration_IncOpt();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.includeOpsImpl <em>include Ops</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.includeOpsImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getincludeOps()
     * @generated
     */
    EClass INCLUDE_OPS = eINSTANCE.getincludeOps();

    /**
     * The meta object literal for the '<em><b>Aliases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUDE_OPS__ALIASES = eINSTANCE.getincludeOps_Aliases();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.aliasDeclarationImpl <em>alias Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.aliasDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getaliasDeclaration()
     * @generated
     */
    EClass ALIAS_DECLARATION = eINSTANCE.getaliasDeclaration();

    /**
     * The meta object literal for the '<em><b>Old</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS_DECLARATION__OLD = eINSTANCE.getaliasDeclaration_Old();

    /**
     * The meta object literal for the '<em><b>New</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS_DECLARATION__NEW = eINSTANCE.getaliasDeclaration_New();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.constantAssignmentImpl <em>constant Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.constantAssignmentImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getconstantAssignment()
     * @generated
     */
    EClass CONSTANT_ASSIGNMENT = eINSTANCE.getconstantAssignment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_ASSIGNMENT__NAME = eINSTANCE.getconstantAssignment_Name();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_ASSIGNMENT__DEF = eINSTANCE.getconstantAssignment_Def();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.structAssignmentImpl <em>struct Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.structAssignmentImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getstructAssignment()
     * @generated
     */
    EClass STRUCT_ASSIGNMENT = eINSTANCE.getstructAssignment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_ASSIGNMENT__NAME = eINSTANCE.getstructAssignment_Name();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_ASSIGNMENT__DEF = eINSTANCE.getstructAssignment_Def();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.viewMetaDeclarationImpl <em>view Meta Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.viewMetaDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getviewMetaDeclaration()
     * @generated
     */
    EClass VIEW_META_DECLARATION = eINSTANCE.getviewMetaDeclaration();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_META_DECLARATION__DEF = eINSTANCE.getviewMetaDeclaration_Def();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.viewIncludeDeclarationImpl <em>view Include Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.viewIncludeDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getviewIncludeDeclaration()
     * @generated
     */
    EClass VIEW_INCLUDE_DECLARATION = eINSTANCE.getviewIncludeDeclaration();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_INCLUDE_DECLARATION__DEF = eINSTANCE.getviewIncludeDeclaration_Def();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.unknownBracketsImpl <em>unknown Brackets</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.unknownBracketsImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getunknownBrackets()
     * @generated
     */
    EClass UNKNOWN_BRACKETS = eINSTANCE.getunknownBrackets();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNKNOWN_BRACKETS__T = eINSTANCE.getunknownBrackets_T();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.anyConstructImpl <em>any Construct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.anyConstructImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getanyConstruct()
     * @generated
     */
    EClass ANY_CONSTRUCT = eINSTANCE.getanyConstruct();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANY_CONSTRUCT__T = eINSTANCE.getanyConstruct_T();

    /**
     * The meta object literal for the '<em><b>Directive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANY_CONSTRUCT__DIRECTIVE = eINSTANCE.getanyConstruct_Directive();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.unknownBodyImpl <em>unknown Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.unknownBodyImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getunknownBody()
     * @generated
     */
    EClass UNKNOWN_BODY = eINSTANCE.getunknownBody();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNKNOWN_BODY__T = eINSTANCE.getunknownBody_T();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.unknownConstructImpl <em>unknown Construct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.unknownConstructImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getunknownConstruct()
     * @generated
     */
    EClass UNKNOWN_CONSTRUCT = eINSTANCE.getunknownConstruct();

    /**
     * The meta object literal for the '<em><b>Directive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNKNOWN_CONSTRUCT__DIRECTIVE = eINSTANCE.getunknownConstruct_Directive();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNKNOWN_CONSTRUCT__T = eINSTANCE.getunknownConstruct_T();

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
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.sigConstructNOSPImpl <em>sig Construct NOSP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.sigConstructNOSPImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsigConstructNOSP()
     * @generated
     */
    EClass SIG_CONSTRUCT_NOSP = eINSTANCE.getsigConstructNOSP();

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
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.sigBodyImpl <em>sig Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.sigBodyImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsigBody()
     * @generated
     */
    EClass SIG_BODY = eINSTANCE.getsigBody();

    /**
     * The meta object literal for the '<em><b>Constructs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_BODY__CONSTRUCTS = eINSTANCE.getsigBody_Constructs();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.sigDeclarationImpl <em>sig Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.sigDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getsigDeclaration()
     * @generated
     */
    EClass SIG_DECLARATION = eINSTANCE.getsigDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIG_DECLARATION__NAME = eINSTANCE.getsigDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIG_DECLARATION__DEF = eINSTANCE.getsigDeclaration_Def();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.linkConstructNOSPImpl <em>link Construct NOSP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.linkConstructNOSPImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getlinkConstructNOSP()
     * @generated
     */
    EClass LINK_CONSTRUCT_NOSP = eINSTANCE.getlinkConstructNOSP();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.linkConstructImpl <em>link Construct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.linkConstructImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getlinkConstruct()
     * @generated
     */
    EClass LINK_CONSTRUCT = eINSTANCE.getlinkConstruct();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.linkBodyImpl <em>link Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.linkBodyImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getlinkBody()
     * @generated
     */
    EClass LINK_BODY = eINSTANCE.getlinkBody();

    /**
     * The meta object literal for the '<em><b>Constructs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_BODY__CONSTRUCTS = eINSTANCE.getlinkBody_Constructs();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_DECLARATION__NAME = eINSTANCE.getviewDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_DECLARATION__FROM = eINSTANCE.getviewDeclaration_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_DECLARATION__TO = eINSTANCE.getviewDeclaration_To();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_DECLARATION__DEF = eINSTANCE.getviewDeclaration_Def();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.internalViewDeclarationImpl <em>internal View Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.internalViewDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getinternalViewDeclaration()
     * @generated
     */
    EClass INTERNAL_VIEW_DECLARATION = eINSTANCE.getinternalViewDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERNAL_VIEW_DECLARATION__NAME = eINSTANCE.getinternalViewDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERNAL_VIEW_DECLARATION__FROM = eINSTANCE.getinternalViewDeclaration_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERNAL_VIEW_DECLARATION__TO = eINSTANCE.getinternalViewDeclaration_To();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERNAL_VIEW_DECLARATION__DEF = eINSTANCE.getinternalViewDeclaration_Def();

    /**
     * The meta object literal for the '{@link info.kwarc.mmt.lF.impl.linkDeclarationImpl <em>link Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see info.kwarc.mmt.lF.impl.linkDeclarationImpl
     * @see info.kwarc.mmt.lF.impl.LFPackageImpl#getlinkDeclaration()
     * @generated
     */
    EClass LINK_DECLARATION = eINSTANCE.getlinkDeclaration();

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

  }

} //LFPackage
