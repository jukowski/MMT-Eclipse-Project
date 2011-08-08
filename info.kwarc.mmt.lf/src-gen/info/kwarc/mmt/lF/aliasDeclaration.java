/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>alias Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.aliasDeclaration#getOld <em>Old</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.aliasDeclaration#getNew <em>New</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getaliasDeclaration()
 * @model
 * @generated
 */
public interface aliasDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Old</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Old</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Old</em>' attribute.
   * @see #setOld(String)
   * @see info.kwarc.mmt.lF.LFPackage#getaliasDeclaration_Old()
   * @model
   * @generated
   */
  String getOld();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.aliasDeclaration#getOld <em>Old</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Old</em>' attribute.
   * @see #getOld()
   * @generated
   */
  void setOld(String value);

  /**
   * Returns the value of the '<em><b>New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New</em>' attribute.
   * @see #setNew(String)
   * @see info.kwarc.mmt.lF.LFPackage#getaliasDeclaration_New()
   * @model
   * @generated
   */
  String getNew();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.aliasDeclaration#getNew <em>New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New</em>' attribute.
   * @see #getNew()
   * @generated
   */
  void setNew(String value);

} // aliasDeclaration
