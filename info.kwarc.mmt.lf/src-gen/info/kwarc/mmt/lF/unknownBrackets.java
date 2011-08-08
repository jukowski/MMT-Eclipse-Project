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
 * A representation of the model object '<em><b>unknown Brackets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.unknownBrackets#getT <em>T</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getunknownBrackets()
 * @model
 * @generated
 */
public interface unknownBrackets extends EObject
{
  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference list.
   * The list contents are of type {@link info.kwarc.mmt.lF.anyConstruct}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference list.
   * @see info.kwarc.mmt.lF.LFPackage#getunknownBrackets_T()
   * @model containment="true"
   * @generated
   */
  EList<anyConstruct> getT();

} // unknownBrackets
