/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.elf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.elf.Model#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.elf.ElfPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link info.kwarc.elf.TempType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see info.kwarc.elf.ElfPackage#getModel_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<TempType> getDeclarations();

} // Model
