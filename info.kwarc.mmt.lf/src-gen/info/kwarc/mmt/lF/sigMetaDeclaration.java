/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sig Meta Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.sigMetaDeclaration#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getsigMetaDeclaration()
 * @model
 * @generated
 */
public interface sigMetaDeclaration extends sigConstructNOSP, linkDeclaration
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
   * @see info.kwarc.mmt.lF.LFPackage#getsigMetaDeclaration_Ref()
   * @model
   * @generated
   */
  sigDeclaration getRef();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.sigMetaDeclaration#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(sigDeclaration value);

} // sigMetaDeclaration
