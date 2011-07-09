/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temp Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.TempType#getFullURI <em>Full URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getTempType()
 * @model
 * @generated
 */
public interface TempType extends EObject
{
  /**
   * Returns the value of the '<em><b>Full URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Full URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Full URI</em>' attribute.
   * @see #setFullURI(String)
   * @see info.kwarc.mmt.lF.LFPackage#getTempType_FullURI()
   * @model
   * @generated
   */
  String getFullURI();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.TempType#getFullURI <em>Full URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Full URI</em>' attribute.
   * @see #getFullURI()
   * @generated
   */
  void setFullURI(String value);

} // TempType
