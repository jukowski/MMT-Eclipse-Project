/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>include Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.includeConstruct#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getincludeConstruct()
 * @model
 * @generated
 */
public interface includeConstruct extends sigConstruct, TempType
{
  /**
   * Returns the value of the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace</em>' reference.
   * @see #setNamespace(signatureDeclaration)
   * @see info.kwarc.mmt.lF.LFPackage#getincludeConstruct_Namespace()
   * @model
   * @generated
   */
  signatureDeclaration getNamespace();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.includeConstruct#getNamespace <em>Namespace</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' reference.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(signatureDeclaration value);

} // includeConstruct
