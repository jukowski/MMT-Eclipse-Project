/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.LFFactory;
import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.Model;
import info.kwarc.mmt.lF.TempType;
import info.kwarc.mmt.lF.abbrevTermDeclaration;
import info.kwarc.mmt.lF.aliasDeclaration;
import info.kwarc.mmt.lF.anyConstruct;
import info.kwarc.mmt.lF.constantAssignment;
import info.kwarc.mmt.lF.fixityDeclaration;
import info.kwarc.mmt.lF.includeOps;
import info.kwarc.mmt.lF.internalViewDeclaration;
import info.kwarc.mmt.lF.linkBody;
import info.kwarc.mmt.lF.linkConstruct;
import info.kwarc.mmt.lF.linkConstructNOSP;
import info.kwarc.mmt.lF.linkDeclaration;
import info.kwarc.mmt.lF.modelConstructNOSP;
import info.kwarc.mmt.lF.morphism;
import info.kwarc.mmt.lF.nameDeclaration;
import info.kwarc.mmt.lF.namespaceDeclaration;
import info.kwarc.mmt.lF.readDeclaration;
import info.kwarc.mmt.lF.sigBody;
import info.kwarc.mmt.lF.sigConstruct;
import info.kwarc.mmt.lF.sigConstructNOSP;
import info.kwarc.mmt.lF.sigDeclaration;
import info.kwarc.mmt.lF.sigIncludeDeclaration;
import info.kwarc.mmt.lF.sigMetaDeclaration;
import info.kwarc.mmt.lF.structAssignment;
import info.kwarc.mmt.lF.structDeclaration;
import info.kwarc.mmt.lF.term;
import info.kwarc.mmt.lF.termDeclaration;
import info.kwarc.mmt.lF.termLambda;
import info.kwarc.mmt.lF.termPi;
import info.kwarc.mmt.lF.unknownBody;
import info.kwarc.mmt.lF.unknownBrackets;
import info.kwarc.mmt.lF.unknownConstruct;
import info.kwarc.mmt.lF.viewDeclaration;
import info.kwarc.mmt.lF.viewIncludeDeclaration;
import info.kwarc.mmt.lF.viewMetaDeclaration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LFPackageImpl extends EPackageImpl implements LFPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelConstructNOSPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termPiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termLambdaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass morphismEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abbrevTermDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fixityDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sigMetaDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sigIncludeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeOpsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aliasDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewMetaDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewIncludeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unknownBracketsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyConstructEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unknownBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unknownConstructEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespaceDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass readDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sigConstructNOSPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sigConstructEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sigBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sigDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkConstructNOSPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkConstructEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass internalViewDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tempTypeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see info.kwarc.mmt.lF.LFPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LFPackageImpl()
  {
    super(eNS_URI, LFFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link LFPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LFPackage init()
  {
    if (isInited) return (LFPackage)EPackage.Registry.INSTANCE.getEPackage(LFPackage.eNS_URI);

    // Obtain or create and register package
    LFPackageImpl theLFPackage = (LFPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LFPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LFPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLFPackage.createPackageContents();

    // Initialize created meta-data
    theLFPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLFPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LFPackage.eNS_URI, theLFPackage);
    return theLFPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Constructs()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_NotInDocument()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmodelConstructNOSP()
  {
    return modelConstructNOSPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmodelConstructNOSP_NamespaceDeclarations()
  {
    return (EReference)modelConstructNOSPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmodelConstructNOSP_ReadDeclarations()
  {
    return (EReference)modelConstructNOSPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmodelConstructNOSP_SigDeclarations()
  {
    return (EReference)modelConstructNOSPEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmodelConstructNOSP_ViewDeclarations()
  {
    return (EReference)modelConstructNOSPEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmodelConstructNOSP_RawDeclarations()
  {
    return (EReference)modelConstructNOSPEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getterm()
  {
    return termEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getterm_Left()
  {
    return (EReference)termEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getterm_Right()
  {
    return (EReference)termEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getterm_Quantifiers()
  {
    return (EReference)termEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getterm_Term()
  {
    return (EReference)termEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getterm_Type()
  {
    return (EReference)termEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getterm_Atom()
  {
    return (EAttribute)termEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettermPi()
  {
    return termPiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettermPi_Name()
  {
    return (EAttribute)termPiEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettermPi_Type()
  {
    return (EReference)termPiEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettermLambda()
  {
    return termLambdaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettermLambda_Name()
  {
    return (EAttribute)termLambdaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettermLambda_Type()
  {
    return (EReference)termLambdaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmorphism()
  {
    return morphismEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmorphism_LinkRefs()
  {
    return (EReference)morphismEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettermDeclaration()
  {
    return termDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettermDeclaration_Name()
  {
    return (EAttribute)termDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettermDeclaration_Type()
  {
    return (EReference)termDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettermDeclaration_Def()
  {
    return (EReference)termDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getabbrevTermDeclaration()
  {
    return abbrevTermDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnameDeclaration()
  {
    return nameDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnameDeclaration_Name()
  {
    return (EAttribute)nameDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnameDeclaration_Alias()
  {
    return (EAttribute)nameDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfixityDeclaration()
  {
    return fixityDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfixityDeclaration_Fixity()
  {
    return (EAttribute)fixityDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfixityDeclaration_FixityLevel()
  {
    return (EAttribute)fixityDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfixityDeclaration_Name()
  {
    return (EAttribute)fixityDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsigMetaDeclaration()
  {
    return sigMetaDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsigMetaDeclaration_Ref()
  {
    return (EReference)sigMetaDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsigIncludeDeclaration()
  {
    return sigIncludeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsigIncludeDeclaration_Ref()
  {
    return (EReference)sigIncludeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsigIncludeDeclaration_IncOpt()
  {
    return (EReference)sigIncludeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstructDeclaration()
  {
    return structDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstructDeclaration_Name()
  {
    return (EAttribute)structDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstructDeclaration_Def()
  {
    return (EReference)structDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstructDeclaration_From()
  {
    return (EReference)structDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstructDeclaration_IncOpt()
  {
    return (EReference)structDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getincludeOps()
  {
    return includeOpsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getincludeOps_Aliases()
  {
    return (EReference)includeOpsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaliasDeclaration()
  {
    return aliasDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaliasDeclaration_Old()
  {
    return (EAttribute)aliasDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getaliasDeclaration_New()
  {
    return (EAttribute)aliasDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstantAssignment()
  {
    return constantAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstantAssignment_Name()
  {
    return (EAttribute)constantAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getconstantAssignment_Def()
  {
    return (EReference)constantAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstructAssignment()
  {
    return structAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstructAssignment_Name()
  {
    return (EAttribute)structAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstructAssignment_Def()
  {
    return (EReference)structAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getviewMetaDeclaration()
  {
    return viewMetaDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getviewMetaDeclaration_Def()
  {
    return (EReference)viewMetaDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getviewIncludeDeclaration()
  {
    return viewIncludeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getviewIncludeDeclaration_Def()
  {
    return (EReference)viewIncludeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getunknownBrackets()
  {
    return unknownBracketsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunknownBrackets_T()
  {
    return (EReference)unknownBracketsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getanyConstruct()
  {
    return anyConstructEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getanyConstruct_T()
  {
    return (EReference)anyConstructEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getanyConstruct_Directive()
  {
    return (EAttribute)anyConstructEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getunknownBody()
  {
    return unknownBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunknownBody_T()
  {
    return (EReference)unknownBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getunknownConstruct()
  {
    return unknownConstructEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getunknownConstruct_Directive()
  {
    return (EAttribute)unknownConstructEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunknownConstruct_T()
  {
    return (EReference)unknownConstructEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnamespaceDeclaration()
  {
    return namespaceDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnamespaceDeclaration_Name()
  {
    return (EAttribute)namespaceDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnamespaceDeclaration_Uri()
  {
    return (EAttribute)namespaceDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getreadDeclaration()
  {
    return readDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getreadDeclaration_File()
  {
    return (EAttribute)readDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsigConstructNOSP()
  {
    return sigConstructNOSPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsigConstruct()
  {
    return sigConstructEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsigBody()
  {
    return sigBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsigBody_Constructs()
  {
    return (EReference)sigBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsigDeclaration()
  {
    return sigDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsigDeclaration_Name()
  {
    return (EAttribute)sigDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsigDeclaration_Def()
  {
    return (EReference)sigDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlinkConstructNOSP()
  {
    return linkConstructNOSPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlinkConstruct()
  {
    return linkConstructEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlinkBody()
  {
    return linkBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlinkBody_Constructs()
  {
    return (EReference)linkBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getviewDeclaration()
  {
    return viewDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getviewDeclaration_Name()
  {
    return (EAttribute)viewDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getviewDeclaration_From()
  {
    return (EReference)viewDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getviewDeclaration_To()
  {
    return (EReference)viewDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getviewDeclaration_Def()
  {
    return (EReference)viewDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinternalViewDeclaration()
  {
    return internalViewDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinternalViewDeclaration_Name()
  {
    return (EAttribute)internalViewDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinternalViewDeclaration_From()
  {
    return (EReference)internalViewDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinternalViewDeclaration_To()
  {
    return (EReference)internalViewDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinternalViewDeclaration_Def()
  {
    return (EReference)internalViewDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlinkDeclaration()
  {
    return linkDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTempType()
  {
    return tempTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTempType_FullURI()
  {
    return (EAttribute)tempTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LFFactory getLFFactory()
  {
    return (LFFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__CONSTRUCTS);
    createEAttribute(modelEClass, MODEL__NOT_IN_DOCUMENT);

    modelConstructNOSPEClass = createEClass(MODEL_CONSTRUCT_NOSP);
    createEReference(modelConstructNOSPEClass, MODEL_CONSTRUCT_NOSP__NAMESPACE_DECLARATIONS);
    createEReference(modelConstructNOSPEClass, MODEL_CONSTRUCT_NOSP__READ_DECLARATIONS);
    createEReference(modelConstructNOSPEClass, MODEL_CONSTRUCT_NOSP__SIG_DECLARATIONS);
    createEReference(modelConstructNOSPEClass, MODEL_CONSTRUCT_NOSP__VIEW_DECLARATIONS);
    createEReference(modelConstructNOSPEClass, MODEL_CONSTRUCT_NOSP__RAW_DECLARATIONS);

    termEClass = createEClass(TERM);
    createEReference(termEClass, TERM__LEFT);
    createEReference(termEClass, TERM__RIGHT);
    createEReference(termEClass, TERM__QUANTIFIERS);
    createEReference(termEClass, TERM__TERM);
    createEReference(termEClass, TERM__TYPE);
    createEAttribute(termEClass, TERM__ATOM);

    termPiEClass = createEClass(TERM_PI);
    createEAttribute(termPiEClass, TERM_PI__NAME);
    createEReference(termPiEClass, TERM_PI__TYPE);

    termLambdaEClass = createEClass(TERM_LAMBDA);
    createEAttribute(termLambdaEClass, TERM_LAMBDA__NAME);
    createEReference(termLambdaEClass, TERM_LAMBDA__TYPE);

    morphismEClass = createEClass(MORPHISM);
    createEReference(morphismEClass, MORPHISM__LINK_REFS);

    termDeclarationEClass = createEClass(TERM_DECLARATION);
    createEAttribute(termDeclarationEClass, TERM_DECLARATION__NAME);
    createEReference(termDeclarationEClass, TERM_DECLARATION__TYPE);
    createEReference(termDeclarationEClass, TERM_DECLARATION__DEF);

    abbrevTermDeclarationEClass = createEClass(ABBREV_TERM_DECLARATION);

    nameDeclarationEClass = createEClass(NAME_DECLARATION);
    createEAttribute(nameDeclarationEClass, NAME_DECLARATION__NAME);
    createEAttribute(nameDeclarationEClass, NAME_DECLARATION__ALIAS);

    fixityDeclarationEClass = createEClass(FIXITY_DECLARATION);
    createEAttribute(fixityDeclarationEClass, FIXITY_DECLARATION__FIXITY);
    createEAttribute(fixityDeclarationEClass, FIXITY_DECLARATION__FIXITY_LEVEL);
    createEAttribute(fixityDeclarationEClass, FIXITY_DECLARATION__NAME);

    sigMetaDeclarationEClass = createEClass(SIG_META_DECLARATION);
    createEReference(sigMetaDeclarationEClass, SIG_META_DECLARATION__REF);

    sigIncludeDeclarationEClass = createEClass(SIG_INCLUDE_DECLARATION);
    createEReference(sigIncludeDeclarationEClass, SIG_INCLUDE_DECLARATION__REF);
    createEReference(sigIncludeDeclarationEClass, SIG_INCLUDE_DECLARATION__INC_OPT);

    structDeclarationEClass = createEClass(STRUCT_DECLARATION);
    createEAttribute(structDeclarationEClass, STRUCT_DECLARATION__NAME);
    createEReference(structDeclarationEClass, STRUCT_DECLARATION__DEF);
    createEReference(structDeclarationEClass, STRUCT_DECLARATION__FROM);
    createEReference(structDeclarationEClass, STRUCT_DECLARATION__INC_OPT);

    includeOpsEClass = createEClass(INCLUDE_OPS);
    createEReference(includeOpsEClass, INCLUDE_OPS__ALIASES);

    aliasDeclarationEClass = createEClass(ALIAS_DECLARATION);
    createEAttribute(aliasDeclarationEClass, ALIAS_DECLARATION__OLD);
    createEAttribute(aliasDeclarationEClass, ALIAS_DECLARATION__NEW);

    constantAssignmentEClass = createEClass(CONSTANT_ASSIGNMENT);
    createEAttribute(constantAssignmentEClass, CONSTANT_ASSIGNMENT__NAME);
    createEReference(constantAssignmentEClass, CONSTANT_ASSIGNMENT__DEF);

    structAssignmentEClass = createEClass(STRUCT_ASSIGNMENT);
    createEAttribute(structAssignmentEClass, STRUCT_ASSIGNMENT__NAME);
    createEReference(structAssignmentEClass, STRUCT_ASSIGNMENT__DEF);

    viewMetaDeclarationEClass = createEClass(VIEW_META_DECLARATION);
    createEReference(viewMetaDeclarationEClass, VIEW_META_DECLARATION__DEF);

    viewIncludeDeclarationEClass = createEClass(VIEW_INCLUDE_DECLARATION);
    createEReference(viewIncludeDeclarationEClass, VIEW_INCLUDE_DECLARATION__DEF);

    unknownBracketsEClass = createEClass(UNKNOWN_BRACKETS);
    createEReference(unknownBracketsEClass, UNKNOWN_BRACKETS__T);

    anyConstructEClass = createEClass(ANY_CONSTRUCT);
    createEReference(anyConstructEClass, ANY_CONSTRUCT__T);
    createEAttribute(anyConstructEClass, ANY_CONSTRUCT__DIRECTIVE);

    unknownBodyEClass = createEClass(UNKNOWN_BODY);
    createEReference(unknownBodyEClass, UNKNOWN_BODY__T);

    unknownConstructEClass = createEClass(UNKNOWN_CONSTRUCT);
    createEAttribute(unknownConstructEClass, UNKNOWN_CONSTRUCT__DIRECTIVE);
    createEReference(unknownConstructEClass, UNKNOWN_CONSTRUCT__T);

    namespaceDeclarationEClass = createEClass(NAMESPACE_DECLARATION);
    createEAttribute(namespaceDeclarationEClass, NAMESPACE_DECLARATION__NAME);
    createEAttribute(namespaceDeclarationEClass, NAMESPACE_DECLARATION__URI);

    readDeclarationEClass = createEClass(READ_DECLARATION);
    createEAttribute(readDeclarationEClass, READ_DECLARATION__FILE);

    sigConstructNOSPEClass = createEClass(SIG_CONSTRUCT_NOSP);

    sigConstructEClass = createEClass(SIG_CONSTRUCT);

    sigBodyEClass = createEClass(SIG_BODY);
    createEReference(sigBodyEClass, SIG_BODY__CONSTRUCTS);

    sigDeclarationEClass = createEClass(SIG_DECLARATION);
    createEAttribute(sigDeclarationEClass, SIG_DECLARATION__NAME);
    createEReference(sigDeclarationEClass, SIG_DECLARATION__DEF);

    linkConstructNOSPEClass = createEClass(LINK_CONSTRUCT_NOSP);

    linkConstructEClass = createEClass(LINK_CONSTRUCT);

    linkBodyEClass = createEClass(LINK_BODY);
    createEReference(linkBodyEClass, LINK_BODY__CONSTRUCTS);

    viewDeclarationEClass = createEClass(VIEW_DECLARATION);
    createEAttribute(viewDeclarationEClass, VIEW_DECLARATION__NAME);
    createEReference(viewDeclarationEClass, VIEW_DECLARATION__FROM);
    createEReference(viewDeclarationEClass, VIEW_DECLARATION__TO);
    createEReference(viewDeclarationEClass, VIEW_DECLARATION__DEF);

    internalViewDeclarationEClass = createEClass(INTERNAL_VIEW_DECLARATION);
    createEAttribute(internalViewDeclarationEClass, INTERNAL_VIEW_DECLARATION__NAME);
    createEReference(internalViewDeclarationEClass, INTERNAL_VIEW_DECLARATION__FROM);
    createEReference(internalViewDeclarationEClass, INTERNAL_VIEW_DECLARATION__TO);
    createEReference(internalViewDeclarationEClass, INTERNAL_VIEW_DECLARATION__DEF);

    linkDeclarationEClass = createEClass(LINK_DECLARATION);

    tempTypeEClass = createEClass(TEMP_TYPE);
    createEAttribute(tempTypeEClass, TEMP_TYPE__FULL_URI);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    termDeclarationEClass.getESuperTypes().add(this.getabbrevTermDeclaration());
    termDeclarationEClass.getESuperTypes().add(this.getTempType());
    abbrevTermDeclarationEClass.getESuperTypes().add(this.getsigConstructNOSP());
    abbrevTermDeclarationEClass.getESuperTypes().add(this.getTempType());
    nameDeclarationEClass.getESuperTypes().add(this.getsigConstructNOSP());
    fixityDeclarationEClass.getESuperTypes().add(this.getsigConstructNOSP());
    sigMetaDeclarationEClass.getESuperTypes().add(this.getsigConstructNOSP());
    sigMetaDeclarationEClass.getESuperTypes().add(this.getlinkDeclaration());
    sigIncludeDeclarationEClass.getESuperTypes().add(this.getsigConstructNOSP());
    sigIncludeDeclarationEClass.getESuperTypes().add(this.getlinkDeclaration());
    sigIncludeDeclarationEClass.getESuperTypes().add(this.getTempType());
    structDeclarationEClass.getESuperTypes().add(this.getsigConstructNOSP());
    structDeclarationEClass.getESuperTypes().add(this.getlinkDeclaration());
    structDeclarationEClass.getESuperTypes().add(this.getTempType());
    constantAssignmentEClass.getESuperTypes().add(this.getlinkConstruct());
    constantAssignmentEClass.getESuperTypes().add(this.getTempType());
    structAssignmentEClass.getESuperTypes().add(this.getlinkConstructNOSP());
    structAssignmentEClass.getESuperTypes().add(this.getTempType());
    viewMetaDeclarationEClass.getESuperTypes().add(this.getlinkConstructNOSP());
    viewIncludeDeclarationEClass.getESuperTypes().add(this.getlinkConstructNOSP());
    unknownConstructEClass.getESuperTypes().add(this.getsigConstructNOSP());
    unknownConstructEClass.getESuperTypes().add(this.getlinkConstructNOSP());
    namespaceDeclarationEClass.getESuperTypes().add(this.getTempType());
    sigConstructNOSPEClass.getESuperTypes().add(this.getsigConstruct());
    sigDeclarationEClass.getESuperTypes().add(this.getsigConstructNOSP());
    sigDeclarationEClass.getESuperTypes().add(this.getTempType());
    linkConstructNOSPEClass.getESuperTypes().add(this.getlinkConstruct());
    viewDeclarationEClass.getESuperTypes().add(this.getlinkDeclaration());
    viewDeclarationEClass.getESuperTypes().add(this.getTempType());
    internalViewDeclarationEClass.getESuperTypes().add(this.getsigConstructNOSP());
    internalViewDeclarationEClass.getESuperTypes().add(this.getlinkDeclaration());
    internalViewDeclarationEClass.getESuperTypes().add(this.getTempType());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Constructs(), ecorePackage.getEObject(), null, "constructs", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_NotInDocument(), ecorePackage.getEString(), "notInDocument", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelConstructNOSPEClass, modelConstructNOSP.class, "modelConstructNOSP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmodelConstructNOSP_NamespaceDeclarations(), this.getnamespaceDeclaration(), null, "namespaceDeclarations", null, 0, -1, modelConstructNOSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmodelConstructNOSP_ReadDeclarations(), this.getreadDeclaration(), null, "readDeclarations", null, 0, -1, modelConstructNOSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmodelConstructNOSP_SigDeclarations(), this.getsigDeclaration(), null, "sigDeclarations", null, 0, -1, modelConstructNOSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmodelConstructNOSP_ViewDeclarations(), this.getviewDeclaration(), null, "viewDeclarations", null, 0, -1, modelConstructNOSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmodelConstructNOSP_RawDeclarations(), this.getsigConstructNOSP(), null, "rawDeclarations", null, 0, -1, modelConstructNOSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termEClass, term.class, "term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getterm_Left(), this.getterm(), null, "left", null, 0, 1, term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getterm_Right(), this.getterm(), null, "right", null, 0, 1, term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getterm_Quantifiers(), ecorePackage.getEObject(), null, "quantifiers", null, 0, -1, term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getterm_Term(), this.getterm(), null, "term", null, 0, 1, term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getterm_Type(), this.getterm(), null, "type", null, 0, 1, term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getterm_Atom(), ecorePackage.getEString(), "atom", null, 0, 1, term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termPiEClass, termPi.class, "termPi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettermPi_Name(), ecorePackage.getEString(), "name", null, 0, 1, termPi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettermPi_Type(), this.getterm(), null, "type", null, 0, 1, termPi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termLambdaEClass, termLambda.class, "termLambda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettermLambda_Name(), ecorePackage.getEString(), "name", null, 0, 1, termLambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettermLambda_Type(), this.getterm(), null, "type", null, 0, 1, termLambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(morphismEClass, morphism.class, "morphism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmorphism_LinkRefs(), this.getlinkDeclaration(), null, "linkRefs", null, 0, -1, morphism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termDeclarationEClass, termDeclaration.class, "termDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettermDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, termDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettermDeclaration_Type(), this.getterm(), null, "type", null, 0, 1, termDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettermDeclaration_Def(), this.getterm(), null, "def", null, 0, 1, termDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abbrevTermDeclarationEClass, abbrevTermDeclaration.class, "abbrevTermDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nameDeclarationEClass, nameDeclaration.class, "nameDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnameDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, nameDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnameDeclaration_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, nameDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fixityDeclarationEClass, fixityDeclaration.class, "fixityDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfixityDeclaration_Fixity(), ecorePackage.getEString(), "fixity", null, 0, 1, fixityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfixityDeclaration_FixityLevel(), ecorePackage.getEString(), "fixityLevel", null, 0, 1, fixityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfixityDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, fixityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sigMetaDeclarationEClass, sigMetaDeclaration.class, "sigMetaDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsigMetaDeclaration_Ref(), this.getsigDeclaration(), null, "ref", null, 0, 1, sigMetaDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sigIncludeDeclarationEClass, sigIncludeDeclaration.class, "sigIncludeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsigIncludeDeclaration_Ref(), this.getsigDeclaration(), null, "ref", null, 0, 1, sigIncludeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsigIncludeDeclaration_IncOpt(), this.getincludeOps(), null, "incOpt", null, 0, 1, sigIncludeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structDeclarationEClass, structDeclaration.class, "structDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getstructDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, structDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstructDeclaration_Def(), ecorePackage.getEObject(), null, "def", null, 0, 1, structDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstructDeclaration_From(), this.getsigDeclaration(), null, "from", null, 0, 1, structDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstructDeclaration_IncOpt(), this.getincludeOps(), null, "incOpt", null, 0, 1, structDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(includeOpsEClass, includeOps.class, "includeOps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getincludeOps_Aliases(), this.getaliasDeclaration(), null, "aliases", null, 0, -1, includeOps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aliasDeclarationEClass, aliasDeclaration.class, "aliasDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getaliasDeclaration_Old(), ecorePackage.getEString(), "old", null, 0, 1, aliasDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getaliasDeclaration_New(), ecorePackage.getEString(), "new", null, 0, 1, aliasDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantAssignmentEClass, constantAssignment.class, "constantAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getconstantAssignment_Name(), ecorePackage.getEString(), "name", null, 0, 1, constantAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getconstantAssignment_Def(), this.getterm(), null, "def", null, 0, 1, constantAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structAssignmentEClass, structAssignment.class, "structAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getstructAssignment_Name(), ecorePackage.getEString(), "name", null, 0, 1, structAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstructAssignment_Def(), this.getmorphism(), null, "def", null, 0, 1, structAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewMetaDeclarationEClass, viewMetaDeclaration.class, "viewMetaDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getviewMetaDeclaration_Def(), this.getmorphism(), null, "def", null, 0, 1, viewMetaDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewIncludeDeclarationEClass, viewIncludeDeclaration.class, "viewIncludeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getviewIncludeDeclaration_Def(), this.getmorphism(), null, "def", null, 0, 1, viewIncludeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unknownBracketsEClass, unknownBrackets.class, "unknownBrackets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getunknownBrackets_T(), this.getanyConstruct(), null, "t", null, 0, -1, unknownBrackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anyConstructEClass, anyConstruct.class, "anyConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getanyConstruct_T(), this.getunknownBody(), null, "t", null, 0, 1, anyConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getanyConstruct_Directive(), ecorePackage.getEString(), "directive", null, 0, 1, anyConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unknownBodyEClass, unknownBody.class, "unknownBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getunknownBody_T(), ecorePackage.getEObject(), null, "t", null, 0, -1, unknownBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unknownConstructEClass, unknownConstruct.class, "unknownConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getunknownConstruct_Directive(), ecorePackage.getEString(), "directive", null, 0, 1, unknownConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getunknownConstruct_T(), this.getunknownBody(), null, "t", null, 0, 1, unknownConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespaceDeclarationEClass, namespaceDeclaration.class, "namespaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnamespaceDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, namespaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnamespaceDeclaration_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, namespaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(readDeclarationEClass, readDeclaration.class, "readDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getreadDeclaration_File(), ecorePackage.getEString(), "file", null, 0, 1, readDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sigConstructNOSPEClass, sigConstructNOSP.class, "sigConstructNOSP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sigConstructEClass, sigConstruct.class, "sigConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sigBodyEClass, sigBody.class, "sigBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsigBody_Constructs(), this.getsigConstructNOSP(), null, "constructs", null, 0, -1, sigBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sigDeclarationEClass, sigDeclaration.class, "sigDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsigDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, sigDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsigDeclaration_Def(), this.getsigBody(), null, "def", null, 0, 1, sigDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkConstructNOSPEClass, linkConstructNOSP.class, "linkConstructNOSP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(linkConstructEClass, linkConstruct.class, "linkConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(linkBodyEClass, linkBody.class, "linkBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlinkBody_Constructs(), this.getlinkConstruct(), null, "constructs", null, 0, -1, linkBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewDeclarationEClass, viewDeclaration.class, "viewDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getviewDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, viewDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getviewDeclaration_From(), this.getsigDeclaration(), null, "from", null, 0, 1, viewDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getviewDeclaration_To(), this.getmorphism(), null, "to", null, 0, 1, viewDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getviewDeclaration_Def(), ecorePackage.getEObject(), null, "def", null, 0, 1, viewDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(internalViewDeclarationEClass, internalViewDeclaration.class, "internalViewDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getinternalViewDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, internalViewDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinternalViewDeclaration_From(), this.getsigDeclaration(), null, "from", null, 0, 1, internalViewDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinternalViewDeclaration_To(), this.getmorphism(), null, "to", null, 0, 1, internalViewDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinternalViewDeclaration_Def(), ecorePackage.getEObject(), null, "def", null, 0, 1, internalViewDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkDeclarationEClass, linkDeclaration.class, "linkDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tempTypeEClass, TempType.class, "TempType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTempType_FullURI(), ecorePackage.getEString(), "fullURI", null, 0, 1, TempType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LFPackageImpl
