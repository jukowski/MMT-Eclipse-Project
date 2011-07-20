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
   * Returns a new object of class '<em>JUSTSPACE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JUSTSPACE</em>'.
   * @generated
   */
  JUSTSPACE createJUSTSPACE();

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
   * Returns a new object of class '<em>signature Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>signature Declaration</em>'.
   * @generated
   */
  signatureDeclaration createsignatureDeclaration();

  /**
   * Returns a new object of class '<em>sig Definitions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>sig Definitions</em>'.
   * @generated
   */
  sigDefinitions createsigDefinitions();

  /**
   * Returns a new object of class '<em>sig Construct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>sig Construct</em>'.
   * @generated
   */
  sigConstruct createsigConstruct();

  /**
   * Returns a new object of class '<em>classic Symbol Construct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>classic Symbol Construct</em>'.
   * @generated
   */
  classicSymbolConstruct createclassicSymbolConstruct();

  /**
   * Returns a new object of class '<em>include Construct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>include Construct</em>'.
   * @generated
   */
  includeConstruct createincludeConstruct();

  /**
   * Returns a new object of class '<em>struct Construct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>struct Construct</em>'.
   * @generated
   */
  structConstruct createstructConstruct();

  /**
   * Returns a new object of class '<em>Temp Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Temp Type</em>'.
   * @generated
   */
  TempType createTempType();

  /**
   * Returns a new object of class '<em>view Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>view Declaration</em>'.
   * @generated
   */
  viewDeclaration createviewDeclaration();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LFPackage getLFPackage();

} //LFFactory
