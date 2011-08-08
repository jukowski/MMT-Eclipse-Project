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
 * A representation of the model object '<em><b>include Ops</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.includeOps#getAliases <em>Aliases</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getincludeOps()
 * @model
 * @generated
 */
public interface includeOps extends EObject
{
  /**
   * Returns the value of the '<em><b>Aliases</b></em>' containment reference list.
   * The list contents are of type {@link info.kwarc.mmt.lF.aliasDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aliases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aliases</em>' containment reference list.
   * @see info.kwarc.mmt.lF.LFPackage#getincludeOps_Aliases()
   * @model containment="true"
   * @generated
   */
  EList<aliasDeclaration> getAliases();

} // includeOps
