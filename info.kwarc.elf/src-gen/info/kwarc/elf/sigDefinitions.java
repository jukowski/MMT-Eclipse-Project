/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.elf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sig Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.elf.sigDefinitions#getSymbName <em>Symb Name</em>}</li>
 *   <li>{@link info.kwarc.elf.sigDefinitions#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.elf.ElfPackage#getsigDefinitions()
 * @model
 * @generated
 */
public interface sigDefinitions extends EObject
{
  /**
   * Returns the value of the '<em><b>Symb Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symb Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symb Name</em>' attribute.
   * @see #setSymbName(String)
   * @see info.kwarc.elf.ElfPackage#getsigDefinitions_SymbName()
   * @model
   * @generated
   */
  String getSymbName();

  /**
   * Sets the value of the '{@link info.kwarc.elf.sigDefinitions#getSymbName <em>Symb Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symb Name</em>' attribute.
   * @see #getSymbName()
   * @generated
   */
  void setSymbName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see info.kwarc.elf.ElfPackage#getsigDefinitions_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link info.kwarc.elf.sigDefinitions#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // sigDefinitions
