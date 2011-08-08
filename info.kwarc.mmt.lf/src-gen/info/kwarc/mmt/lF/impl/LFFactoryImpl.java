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
      case LFPackage.MODEL_CONSTRUCT_NOSP: return createmodelConstructNOSP();
      case LFPackage.TERM: return createterm();
      case LFPackage.TERM_PI: return createtermPi();
      case LFPackage.TERM_LAMBDA: return createtermLambda();
      case LFPackage.MORPHISM: return createmorphism();
      case LFPackage.TERM_DECLARATION: return createtermDeclaration();
      case LFPackage.ABBREV_TERM_DECLARATION: return createabbrevTermDeclaration();
      case LFPackage.NAME_DECLARATION: return createnameDeclaration();
      case LFPackage.FIXITY_DECLARATION: return createfixityDeclaration();
      case LFPackage.SIG_META_DECLARATION: return createsigMetaDeclaration();
      case LFPackage.SIG_INCLUDE_DECLARATION: return createsigIncludeDeclaration();
      case LFPackage.STRUCT_DECLARATION: return createstructDeclaration();
      case LFPackage.INCLUDE_OPS: return createincludeOps();
      case LFPackage.ALIAS_DECLARATION: return createaliasDeclaration();
      case LFPackage.CONSTANT_ASSIGNMENT: return createconstantAssignment();
      case LFPackage.STRUCT_ASSIGNMENT: return createstructAssignment();
      case LFPackage.VIEW_META_DECLARATION: return createviewMetaDeclaration();
      case LFPackage.VIEW_INCLUDE_DECLARATION: return createviewIncludeDeclaration();
      case LFPackage.UNKNOWN_BRACKETS: return createunknownBrackets();
      case LFPackage.ANY_CONSTRUCT: return createanyConstruct();
      case LFPackage.UNKNOWN_BODY: return createunknownBody();
      case LFPackage.UNKNOWN_CONSTRUCT: return createunknownConstruct();
      case LFPackage.NAMESPACE_DECLARATION: return createnamespaceDeclaration();
      case LFPackage.READ_DECLARATION: return createreadDeclaration();
      case LFPackage.SIG_CONSTRUCT_NOSP: return createsigConstructNOSP();
      case LFPackage.SIG_CONSTRUCT: return createsigConstruct();
      case LFPackage.SIG_BODY: return createsigBody();
      case LFPackage.SIG_DECLARATION: return createsigDeclaration();
      case LFPackage.LINK_CONSTRUCT_NOSP: return createlinkConstructNOSP();
      case LFPackage.LINK_CONSTRUCT: return createlinkConstruct();
      case LFPackage.LINK_BODY: return createlinkBody();
      case LFPackage.VIEW_DECLARATION: return createviewDeclaration();
      case LFPackage.INTERNAL_VIEW_DECLARATION: return createinternalViewDeclaration();
      case LFPackage.LINK_DECLARATION: return createlinkDeclaration();
      case LFPackage.TEMP_TYPE: return createTempType();
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
  public modelConstructNOSP createmodelConstructNOSP()
  {
    modelConstructNOSPImpl modelConstructNOSP = new modelConstructNOSPImpl();
    return modelConstructNOSP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public term createterm()
  {
    termImpl term = new termImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public termPi createtermPi()
  {
    termPiImpl termPi = new termPiImpl();
    return termPi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public termLambda createtermLambda()
  {
    termLambdaImpl termLambda = new termLambdaImpl();
    return termLambda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public morphism createmorphism()
  {
    morphismImpl morphism = new morphismImpl();
    return morphism;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public termDeclaration createtermDeclaration()
  {
    termDeclarationImpl termDeclaration = new termDeclarationImpl();
    return termDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public abbrevTermDeclaration createabbrevTermDeclaration()
  {
    abbrevTermDeclarationImpl abbrevTermDeclaration = new abbrevTermDeclarationImpl();
    return abbrevTermDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nameDeclaration createnameDeclaration()
  {
    nameDeclarationImpl nameDeclaration = new nameDeclarationImpl();
    return nameDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fixityDeclaration createfixityDeclaration()
  {
    fixityDeclarationImpl fixityDeclaration = new fixityDeclarationImpl();
    return fixityDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sigMetaDeclaration createsigMetaDeclaration()
  {
    sigMetaDeclarationImpl sigMetaDeclaration = new sigMetaDeclarationImpl();
    return sigMetaDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sigIncludeDeclaration createsigIncludeDeclaration()
  {
    sigIncludeDeclarationImpl sigIncludeDeclaration = new sigIncludeDeclarationImpl();
    return sigIncludeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structDeclaration createstructDeclaration()
  {
    structDeclarationImpl structDeclaration = new structDeclarationImpl();
    return structDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public includeOps createincludeOps()
  {
    includeOpsImpl includeOps = new includeOpsImpl();
    return includeOps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public aliasDeclaration createaliasDeclaration()
  {
    aliasDeclarationImpl aliasDeclaration = new aliasDeclarationImpl();
    return aliasDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constantAssignment createconstantAssignment()
  {
    constantAssignmentImpl constantAssignment = new constantAssignmentImpl();
    return constantAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structAssignment createstructAssignment()
  {
    structAssignmentImpl structAssignment = new structAssignmentImpl();
    return structAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public viewMetaDeclaration createviewMetaDeclaration()
  {
    viewMetaDeclarationImpl viewMetaDeclaration = new viewMetaDeclarationImpl();
    return viewMetaDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public viewIncludeDeclaration createviewIncludeDeclaration()
  {
    viewIncludeDeclarationImpl viewIncludeDeclaration = new viewIncludeDeclarationImpl();
    return viewIncludeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unknownBrackets createunknownBrackets()
  {
    unknownBracketsImpl unknownBrackets = new unknownBracketsImpl();
    return unknownBrackets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public anyConstruct createanyConstruct()
  {
    anyConstructImpl anyConstruct = new anyConstructImpl();
    return anyConstruct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unknownBody createunknownBody()
  {
    unknownBodyImpl unknownBody = new unknownBodyImpl();
    return unknownBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unknownConstruct createunknownConstruct()
  {
    unknownConstructImpl unknownConstruct = new unknownConstructImpl();
    return unknownConstruct;
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
  public sigConstructNOSP createsigConstructNOSP()
  {
    sigConstructNOSPImpl sigConstructNOSP = new sigConstructNOSPImpl();
    return sigConstructNOSP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sigConstruct createsigConstruct()
  {
    sigConstructImpl sigConstruct = new sigConstructImpl();
    return sigConstruct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sigBody createsigBody()
  {
    sigBodyImpl sigBody = new sigBodyImpl();
    return sigBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sigDeclaration createsigDeclaration()
  {
    sigDeclarationImpl sigDeclaration = new sigDeclarationImpl();
    return sigDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public linkConstructNOSP createlinkConstructNOSP()
  {
    linkConstructNOSPImpl linkConstructNOSP = new linkConstructNOSPImpl();
    return linkConstructNOSP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public linkConstruct createlinkConstruct()
  {
    linkConstructImpl linkConstruct = new linkConstructImpl();
    return linkConstruct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public linkBody createlinkBody()
  {
    linkBodyImpl linkBody = new linkBodyImpl();
    return linkBody;
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
  public internalViewDeclaration createinternalViewDeclaration()
  {
    internalViewDeclarationImpl internalViewDeclaration = new internalViewDeclarationImpl();
    return internalViewDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public linkDeclaration createlinkDeclaration()
  {
    linkDeclarationImpl linkDeclaration = new linkDeclarationImpl();
    return linkDeclaration;
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
