/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.elf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see info.kwarc.elf.ElfPackage
 * @generated
 */
public interface ElfFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ElfFactory eINSTANCE = info.kwarc.elf.impl.ElfFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>namespace Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>namespace Declaration</em>'.
   * @generated
   */
  namespaceDeclaration createnamespaceDeclaration();

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
  ElfPackage getElfPackage();

} //ElfFactory
