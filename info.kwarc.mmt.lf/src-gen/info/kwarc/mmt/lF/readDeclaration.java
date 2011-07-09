/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>read Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.readDeclaration#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getreadDeclaration()
 * @model
 * @generated
 */
public interface readDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' attribute.
   * @see #setFile(String)
   * @see info.kwarc.mmt.lF.LFPackage#getreadDeclaration_File()
   * @model
   * @generated
   */
  String getFile();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.readDeclaration#getFile <em>File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' attribute.
   * @see #getFile()
   * @generated
   */
  void setFile(String value);

} // readDeclaration
