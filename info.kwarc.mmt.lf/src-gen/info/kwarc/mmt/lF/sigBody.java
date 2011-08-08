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
 * A representation of the model object '<em><b>sig Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.sigBody#getConstructs <em>Constructs</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getsigBody()
 * @model
 * @generated
 */
public interface sigBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Constructs</b></em>' containment reference list.
   * The list contents are of type {@link info.kwarc.mmt.lF.sigConstructNOSP}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructs</em>' containment reference list.
   * @see info.kwarc.mmt.lF.LFPackage#getsigBody_Constructs()
   * @model containment="true"
   * @generated
   */
  EList<sigConstructNOSP> getConstructs();

} // sigBody
