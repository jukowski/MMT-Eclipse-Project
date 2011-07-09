/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.elf.impl;

import info.kwarc.elf.ElfFactory;
import info.kwarc.elf.ElfPackage;
import info.kwarc.elf.Model;
import info.kwarc.elf.TempType;
import info.kwarc.elf.namespaceDeclaration;
import info.kwarc.elf.sigDefinitions;
import info.kwarc.elf.signatureDeclaration;

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
public class ElfPackageImpl extends EPackageImpl implements ElfPackage
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
  private EClass namespaceDeclarationEClass = null;

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
   * @see info.kwarc.elf.ElfPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ElfPackageImpl()
  {
    super(eNS_URI, ElfFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ElfPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ElfPackage init()
  {
    if (isInited) return (ElfPackage)EPackage.Registry.INSTANCE.getEPackage(ElfPackage.eNS_URI);

    // Obtain or create and register package
    ElfPackageImpl theElfPackage = (ElfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ElfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ElfPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theElfPackage.createPackageContents();

    // Initialize created meta-data
    theElfPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theElfPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ElfPackage.eNS_URI, theElfPackage);
    return theElfPackage;
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
  public EReference getsignatureDeclaration_SigDefinitions()
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
  public EAttribute getsigDefinitions_SymbName()
  {
    return (EAttribute)sigDefinitionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsigDefinitions_Type()
  {
    return (EAttribute)sigDefinitionsEClass.getEStructuralFeatures().get(1);
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
  public ElfFactory getElfFactory()
  {
    return (ElfFactory)getEFactoryInstance();
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

    namespaceDeclarationEClass = createEClass(NAMESPACE_DECLARATION);
    createEAttribute(namespaceDeclarationEClass, NAMESPACE_DECLARATION__NAME);
    createEAttribute(namespaceDeclarationEClass, NAMESPACE_DECLARATION__URI);

    signatureDeclarationEClass = createEClass(SIGNATURE_DECLARATION);
    createEAttribute(signatureDeclarationEClass, SIGNATURE_DECLARATION__SIG_NAME);
    createEReference(signatureDeclarationEClass, SIGNATURE_DECLARATION__SIG_DEFINITIONS);

    sigDefinitionsEClass = createEClass(SIG_DEFINITIONS);
    createEAttribute(sigDefinitionsEClass, SIG_DEFINITIONS__SYMB_NAME);
    createEAttribute(sigDefinitionsEClass, SIG_DEFINITIONS__TYPE);

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
    namespaceDeclarationEClass.getESuperTypes().add(this.getTempType());
    signatureDeclarationEClass.getESuperTypes().add(this.getTempType());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Declarations(), this.getTempType(), null, "declarations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespaceDeclarationEClass, namespaceDeclaration.class, "namespaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnamespaceDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, namespaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnamespaceDeclaration_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, namespaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signatureDeclarationEClass, signatureDeclaration.class, "signatureDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsignatureDeclaration_SigName(), ecorePackage.getEString(), "sigName", null, 0, 1, signatureDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsignatureDeclaration_SigDefinitions(), this.getsigDefinitions(), null, "sigDefinitions", null, 0, -1, signatureDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sigDefinitionsEClass, sigDefinitions.class, "sigDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsigDefinitions_SymbName(), ecorePackage.getEString(), "symbName", null, 0, 1, sigDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsigDefinitions_Type(), ecorePackage.getEString(), "type", null, 0, 1, sigDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tempTypeEClass, TempType.class, "TempType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTempType_FullURI(), ecorePackage.getEString(), "fullURI", null, 0, 1, TempType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ElfPackageImpl
