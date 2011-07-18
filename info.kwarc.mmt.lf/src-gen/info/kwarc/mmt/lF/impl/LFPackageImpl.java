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
import info.kwarc.mmt.lF.namespaceDeclaration;
import info.kwarc.mmt.lF.readDeclaration;
import info.kwarc.mmt.lF.sigConstruct;
import info.kwarc.mmt.lF.sigDefinitions;
import info.kwarc.mmt.lF.signatureDeclaration;
import info.kwarc.mmt.lF.viewDeclaration;

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
  private EClass justspaceEClass = null;

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
  private EClass signatureDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sigDefinitionsEClass = null;

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
  private EClass tempTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewDeclarationEClass = null;

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
  public EReference getModel_Declarations()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJUSTSPACE()
  {
    return justspaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJUSTSPACE_J()
  {
    return (EAttribute)justspaceEClass.getEStructuralFeatures().get(0);
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
  public EClass getsignatureDeclaration()
  {
    return signatureDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsignatureDeclaration_SigName()
  {
    return (EAttribute)signatureDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsignatureDeclaration_Defs()
  {
    return (EReference)signatureDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsigDefinitions()
  {
    return sigDefinitionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsigDefinitions_Cons()
  {
    return (EReference)sigDefinitionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsigDefinitions_Fcons()
  {
    return (EReference)sigDefinitionsEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getsigConstruct_SymbName()
  {
    return (EAttribute)sigConstructEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsigConstruct_Namespace()
  {
    return (EAttribute)sigConstructEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsigConstruct_StructName()
  {
    return (EAttribute)sigConstructEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsigConstruct_IncOpt()
  {
    return (EAttribute)sigConstructEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsigConstruct_Tmp()
  {
    return (EAttribute)sigConstructEClass.getEStructuralFeatures().get(4);
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
  public EClass getviewDeclaration()
  {
    return viewDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getviewDeclaration_ViewID()
  {
    return (EAttribute)viewDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getviewDeclaration_From()
  {
    return (EAttribute)viewDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getviewDeclaration_To()
  {
    return (EAttribute)viewDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getviewDeclaration_ViewDefs()
  {
    return (EReference)viewDeclarationEClass.getEStructuralFeatures().get(3);
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
    createEReference(modelEClass, MODEL__DECLARATIONS);

    justspaceEClass = createEClass(JUSTSPACE);
    createEAttribute(justspaceEClass, JUSTSPACE__J);

    namespaceDeclarationEClass = createEClass(NAMESPACE_DECLARATION);
    createEAttribute(namespaceDeclarationEClass, NAMESPACE_DECLARATION__NAME);
    createEAttribute(namespaceDeclarationEClass, NAMESPACE_DECLARATION__URI);

    readDeclarationEClass = createEClass(READ_DECLARATION);
    createEAttribute(readDeclarationEClass, READ_DECLARATION__FILE);

    signatureDeclarationEClass = createEClass(SIGNATURE_DECLARATION);
    createEAttribute(signatureDeclarationEClass, SIGNATURE_DECLARATION__SIG_NAME);
    createEReference(signatureDeclarationEClass, SIGNATURE_DECLARATION__DEFS);

    sigDefinitionsEClass = createEClass(SIG_DEFINITIONS);
    createEReference(sigDefinitionsEClass, SIG_DEFINITIONS__CONS);
    createEReference(sigDefinitionsEClass, SIG_DEFINITIONS__FCONS);

    sigConstructEClass = createEClass(SIG_CONSTRUCT);
    createEAttribute(sigConstructEClass, SIG_CONSTRUCT__SYMB_NAME);
    createEAttribute(sigConstructEClass, SIG_CONSTRUCT__NAMESPACE);
    createEAttribute(sigConstructEClass, SIG_CONSTRUCT__STRUCT_NAME);
    createEAttribute(sigConstructEClass, SIG_CONSTRUCT__INC_OPT);
    createEAttribute(sigConstructEClass, SIG_CONSTRUCT__TMP);

    tempTypeEClass = createEClass(TEMP_TYPE);
    createEAttribute(tempTypeEClass, TEMP_TYPE__FULL_URI);

    viewDeclarationEClass = createEClass(VIEW_DECLARATION);
    createEAttribute(viewDeclarationEClass, VIEW_DECLARATION__VIEW_ID);
    createEAttribute(viewDeclarationEClass, VIEW_DECLARATION__FROM);
    createEAttribute(viewDeclarationEClass, VIEW_DECLARATION__TO);
    createEReference(viewDeclarationEClass, VIEW_DECLARATION__VIEW_DEFS);
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
    namespaceDeclarationEClass.getESuperTypes().add(this.getTempType());
    signatureDeclarationEClass.getESuperTypes().add(this.getTempType());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Declarations(), ecorePackage.getEObject(), null, "declarations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(justspaceEClass, info.kwarc.mmt.lF.JUSTSPACE.class, "JUSTSPACE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJUSTSPACE_J(), ecorePackage.getEString(), "J", null, 0, 1, info.kwarc.mmt.lF.JUSTSPACE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespaceDeclarationEClass, namespaceDeclaration.class, "namespaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnamespaceDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, namespaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnamespaceDeclaration_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, namespaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(readDeclarationEClass, readDeclaration.class, "readDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getreadDeclaration_File(), ecorePackage.getEString(), "file", null, 0, 1, readDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signatureDeclarationEClass, signatureDeclaration.class, "signatureDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsignatureDeclaration_SigName(), ecorePackage.getEString(), "sigName", null, 0, 1, signatureDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsignatureDeclaration_Defs(), this.getsigDefinitions(), null, "defs", null, 0, 1, signatureDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sigDefinitionsEClass, sigDefinitions.class, "sigDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsigDefinitions_Cons(), this.getsigConstruct(), null, "cons", null, 0, 1, sigDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsigDefinitions_Fcons(), this.getsigConstruct(), null, "fcons", null, 0, -1, sigDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sigConstructEClass, sigConstruct.class, "sigConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsigConstruct_SymbName(), ecorePackage.getEString(), "symbName", null, 0, 1, sigConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsigConstruct_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, sigConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsigConstruct_StructName(), ecorePackage.getEString(), "structName", null, 0, 1, sigConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsigConstruct_IncOpt(), ecorePackage.getEString(), "incOpt", null, 0, 1, sigConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsigConstruct_Tmp(), ecorePackage.getEString(), "tmp", null, 0, 1, sigConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tempTypeEClass, TempType.class, "TempType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTempType_FullURI(), ecorePackage.getEString(), "fullURI", null, 0, 1, TempType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewDeclarationEClass, viewDeclaration.class, "viewDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getviewDeclaration_ViewID(), ecorePackage.getEString(), "viewID", null, 0, 1, viewDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getviewDeclaration_From(), ecorePackage.getEString(), "from", null, 0, 1, viewDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getviewDeclaration_To(), ecorePackage.getEString(), "to", null, 0, 1, viewDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getviewDeclaration_ViewDefs(), this.getsigDefinitions(), null, "viewDefs", null, 0, 1, viewDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LFPackageImpl
