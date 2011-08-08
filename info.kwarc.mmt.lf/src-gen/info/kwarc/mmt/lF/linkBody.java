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
 * A representation of the model object '<em><b>link Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.linkBody#getConstructs <em>Constructs</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getlinkBody()
 * @model
 * @generated
 */
public interface linkBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Constructs</b></em>' containment reference list.
   * The list contents are of type {@link info.kwarc.mmt.lF.linkConstruct}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructs</em>' containment reference list.
   * @see info.kwarc.mmt.lF.LFPackage#getlinkBody_Constructs()
   * @model containment="true"
   * @generated
   */
  EList<linkConstruct> getConstructs();

} // linkBody
