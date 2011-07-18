/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sig Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.sigDefinitions#getCons <em>Cons</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.sigDefinitions#getFcons <em>Fcons</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getsigDefinitions()
 * @model
 * @generated
 */
public interface sigDefinitions extends EObject
{
  /**
   * Returns the value of the '<em><b>Cons</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cons</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cons</em>' containment reference.
   * @see #setCons(sigConstruct)
   * @see info.kwarc.mmt.lF.LFPackage#getsigDefinitions_Cons()
   * @model containment="true"
   * @generated
   */
  sigConstruct getCons();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.sigDefinitions#getCons <em>Cons</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cons</em>' containment reference.
   * @see #getCons()
   * @generated
   */
  void setCons(sigConstruct value);

  /**
   * Returns the value of the '<em><b>Fcons</b></em>' containment reference list.
   * The list contents are of type {@link info.kwarc.mmt.lF.sigConstruct}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fcons</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fcons</em>' containment reference list.
   * @see info.kwarc.mmt.lF.LFPackage#getsigDefinitions_Fcons()
   * @model containment="true"
   * @generated
   */
  EList<sigConstruct> getFcons();

} // sigDefinitions
