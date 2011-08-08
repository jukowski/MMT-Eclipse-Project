/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see info.kwarc.mmt.lF.LFPackage
 * @generated
 */
public interface LFFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LFFactory eINSTANCE = info.kwarc.mmt.lF.impl.LFFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>model Construct NOSP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>model Construct NOSP</em>'.
   * @generated
   */
  modelConstructNOSP createmodelConstructNOSP();

  /**
   * Returns a new object of class '<em>term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>term</em>'.
   * @generated
   */
  term createterm();

  /**
   * Returns a new object of class '<em>term Pi</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>term Pi</em>'.
   * @generated
   */
  termPi createtermPi();

  /**
   * Returns a new object of class '<em>term Lambda</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>term Lambda</em>'.
   * @generated
   */
  termLambda createtermLambda();

  /**
   * Returns a new object of class '<em>morphism</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>morphism</em>'.
   * @generated
   */
  morphism createmorphism();

  /**
   * Returns a new object of class '<em>term Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>term Declaration</em>'.
   * @generated
   */
  termDeclaration createtermDeclaration();

  /**
   * Returns a new object of class '<em>abbrev Term Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>abbrev Term Declaration</em>'.
   * @generated
   */
  abbrevTermDeclaration createabbrevTermDeclaration();

  /**
   * Returns a new object of class '<em>name Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>name Declaration</em>'.
   * @generated
   */
  nameDeclaration createnameDeclaration();

  /**
   * Returns a new object of class '<em>fixity Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>fixity Declaration</em>'.
   * @generated
   */
  fixityDeclaration createfixityDeclaration();

  /**
   * Returns a new object of class '<em>sig Meta Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>sig Meta Declaration</em>'.
   * @generated
   */
  sigMetaDeclaration createsigMetaDeclaration();

  /**
   * Returns a new object of class '<em>sig Include Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>sig Include Declaration</em>'.
   * @generated
   */
  sigIncludeDeclaration createsigIncludeDeclaration();

  /**
   * Returns a new object of class '<em>struct Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct Declaration</em>'.
   * @generated
   */
  structDeclaration createstructDeclaration();

  /**
   * Returns a new object of class '<em>include Ops</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>include Ops</em>'.
   * @generated
   */
  includeOps createincludeOps();

  /**
   * Returns a new object of class '<em>alias Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>alias Declaration</em>'.
   * @generated
   */
  aliasDeclaration createaliasDeclaration();

  /**
   * Returns a new object of class '<em>constant Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>constant Assignment</em>'.
   * @generated
   */
  constantAssignment createconstantAssignment();

  /**
   * Returns a new object of class '<em>struct Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct Assignment</em>'.
   * @generated
   */
  structAssignment createstructAssignment();

  /**
   * Returns a new object of class '<em>view Meta Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>view Meta Declaration</em>'.
   * @generated
   */
  viewMetaDeclaration createviewMetaDeclaration();

  /**
   * Returns a new object of class '<em>view Include Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>view Include Declaration</em>'.
   * @generated
   */
  viewIncludeDeclaration createviewIncludeDeclaration();

  /**
   * Returns a new object of class '<em>unknown Brackets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>unknown Brackets</em>'.
   * @generated
   */
  unknownBrackets createunknownBrackets();

  /**
   * Returns a new object of class '<em>any Construct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>any Construct</em>'.
   * @generated
   */
  anyConstruct createanyConstruct();

  /**
   * Returns a new object of class '<em>unknown Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>unknown Body</em>'.
   * @generated
   */
  unknownBody createunknownBody();

  /**
   * Returns a new object of class '<em>unknown Construct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>unknown Construct</em>'.
   * @generated
   */
  unknownConstruct createunknownConstruct();

  /**
   * Returns a new object of class '<em>namespace Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>namespace Declaration</em>'.
   * @generated
   */
  namespaceDeclaration createnamespaceDeclaration();

  /**
   * Returns a new object of class '<em>read Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>read Declaration</em>'.
   * @generated
   */
  readDeclaration createreadDeclaration();

  /**
   * Returns a new object of class '<em>sig Construct NOSP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>sig Construct NOSP</em>'.
   * @generated
   */
  sigConstructNOSP createsigConstructNOSP();

  /**
   * Returns a new object of class '<em>sig Construct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>sig Construct</em>'.
   * @generated
   */
  sigConstruct createsigConstruct();

  /**
   * Returns a new object of class '<em>sig Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>sig Body</em>'.
   * @generated
   */
  sigBody createsigBody();

  /**
   * Returns a new object of class '<em>sig Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>sig Declaration</em>'.
   * @generated
   */
  sigDeclaration createsigDeclaration();

  /**
   * Returns a new object of class '<em>link Construct NOSP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>link Construct NOSP</em>'.
   * @generated
   */
  linkConstructNOSP createlinkConstructNOSP();

  /**
   * Returns a new object of class '<em>link Construct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>link Construct</em>'.
   * @generated
   */
  linkConstruct createlinkConstruct();

  /**
   * Returns a new object of class '<em>link Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>link Body</em>'.
   * @generated
   */
  linkBody createlinkBody();

  /**
   * Returns a new object of class '<em>view Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>view Declaration</em>'.
   * @generated
   */
  viewDeclaration createviewDeclaration();

  /**
   * Returns a new object of class '<em>internal View Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>internal View Declaration</em>'.
   * @generated
   */
  internalViewDeclaration createinternalViewDeclaration();

  /**
   * Returns a new object of class '<em>link Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>link Declaration</em>'.
   * @generated
   */
  linkDeclaration createlinkDeclaration();

  /**
   * Returns a new object of class '<em>Temp Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Temp Type</em>'.
   * @generated
   */
  TempType createTempType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LFPackage getLFPackage();

} //LFFactory
