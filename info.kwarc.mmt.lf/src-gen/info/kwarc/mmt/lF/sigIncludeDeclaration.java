/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sig Include Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.sigIncludeDeclaration#getRef <em>Ref</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.sigIncludeDeclaration#getIncOpt <em>Inc Opt</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getsigIncludeDeclaration()
 * @model
 * @generated
 */
public interface sigIncludeDeclaration extends sigConstructNOSP, linkDeclaration, TempType
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(sigDeclaration)
   * @see info.kwarc.mmt.lF.LFPackage#getsigIncludeDeclaration_Ref()
   * @model
   * @generated
   */
  sigDeclaration getRef();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.sigIncludeDeclaration#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(sigDeclaration value);

  /**
   * Returns the value of the '<em><b>Inc Opt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inc Opt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inc Opt</em>' containment reference.
   * @see #setIncOpt(includeOps)
   * @see info.kwarc.mmt.lF.LFPackage#getsigIncludeDeclaration_IncOpt()
   * @model containment="true"
   * @generated
   */
  includeOps getIncOpt();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.sigIncludeDeclaration#getIncOpt <em>Inc Opt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inc Opt</em>' containment reference.
   * @see #getIncOpt()
   * @generated
   */
  void setIncOpt(includeOps value);

} // sigIncludeDeclaration
