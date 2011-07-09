/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.elf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>signature Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.elf.signatureDeclaration#getSigName <em>Sig Name</em>}</li>
 *   <li>{@link info.kwarc.elf.signatureDeclaration#getSigDefinitions <em>Sig Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.elf.ElfPackage#getsignatureDeclaration()
 * @model
 * @generated
 */
public interface signatureDeclaration extends TempType
{
  /**
   * Returns the value of the '<em><b>Sig Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sig Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sig Name</em>' attribute.
   * @see #setSigName(String)
   * @see info.kwarc.elf.ElfPackage#getsignatureDeclaration_SigName()
   * @model
   * @generated
   */
  String getSigName();

  /**
   * Sets the value of the '{@link info.kwarc.elf.signatureDeclaration#getSigName <em>Sig Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sig Name</em>' attribute.
   * @see #getSigName()
   * @generated
   */
  void setSigName(String value);

  /**
   * Returns the value of the '<em><b>Sig Definitions</b></em>' containment reference list.
   * The list contents are of type {@link info.kwarc.elf.sigDefinitions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sig Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sig Definitions</em>' containment reference list.
   * @see info.kwarc.elf.ElfPackage#getsignatureDeclaration_SigDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<sigDefinitions> getSigDefinitions();

} // signatureDeclaration
