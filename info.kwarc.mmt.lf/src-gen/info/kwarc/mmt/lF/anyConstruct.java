/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>any Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.anyConstruct#getT <em>T</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.anyConstruct#getDirective <em>Directive</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getanyConstruct()
 * @model
 * @generated
 */
public interface anyConstruct extends EObject
{
  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(unknownBody)
   * @see info.kwarc.mmt.lF.LFPackage#getanyConstruct_T()
   * @model containment="true"
   * @generated
   */
  unknownBody getT();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.anyConstruct#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(unknownBody value);

  /**
   * Returns the value of the '<em><b>Directive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directive</em>' attribute.
   * @see #setDirective(String)
   * @see info.kwarc.mmt.lF.LFPackage#getanyConstruct_Directive()
   * @model
   * @generated
   */
  String getDirective();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.anyConstruct#getDirective <em>Directive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Directive</em>' attribute.
   * @see #getDirective()
   * @generated
   */
  void setDirective(String value);

} // anyConstruct
