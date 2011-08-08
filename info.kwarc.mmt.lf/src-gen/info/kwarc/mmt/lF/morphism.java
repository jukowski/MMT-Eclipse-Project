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
 * A representation of the model object '<em><b>morphism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.morphism#getLinkRefs <em>Link Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getmorphism()
 * @model
 * @generated
 */
public interface morphism extends EObject
{
  /**
   * Returns the value of the '<em><b>Link Refs</b></em>' reference list.
   * The list contents are of type {@link info.kwarc.mmt.lF.linkDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link Refs</em>' reference list.
   * @see info.kwarc.mmt.lF.LFPackage#getmorphism_LinkRefs()
   * @model
   * @generated
   */
  EList<linkDeclaration> getLinkRefs();

} // morphism
