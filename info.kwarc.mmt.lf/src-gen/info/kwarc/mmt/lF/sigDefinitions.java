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
 *   <li>{@link info.kwarc.mmt.lF.sigDefinitions#getConstucts <em>Constucts</em>}</li>
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
   * Returns the value of the '<em><b>Constucts</b></em>' containment reference list.
   * The list contents are of type {@link info.kwarc.mmt.lF.sigConstruct}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constucts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constucts</em>' containment reference list.
   * @see info.kwarc.mmt.lF.LFPackage#getsigDefinitions_Constucts()
   * @model containment="true"
   * @generated
   */
  EList<sigConstruct> getConstucts();

} // sigDefinitions
