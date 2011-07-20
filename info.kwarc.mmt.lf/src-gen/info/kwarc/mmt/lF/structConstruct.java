/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>struct Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.structConstruct#getStructName <em>Struct Name</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.structConstruct#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.structConstruct#getIncOpt <em>Inc Opt</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getstructConstruct()
 * @model
 * @generated
 */
public interface structConstruct extends sigConstruct
{
  /**
   * Returns the value of the '<em><b>Struct Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct Name</em>' attribute.
   * @see #setStructName(String)
   * @see info.kwarc.mmt.lF.LFPackage#getstructConstruct_StructName()
   * @model
   * @generated
   */
  String getStructName();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.structConstruct#getStructName <em>Struct Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct Name</em>' attribute.
   * @see #getStructName()
   * @generated
   */
  void setStructName(String value);

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
   * @see info.kwarc.mmt.lF.LFPackage#getstructConstruct_Namespace()
   * @model
   * @generated
   */
  signatureDeclaration getNamespace();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.structConstruct#getNamespace <em>Namespace</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' reference.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(signatureDeclaration value);

  /**
   * Returns the value of the '<em><b>Inc Opt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inc Opt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inc Opt</em>' attribute.
   * @see #setIncOpt(String)
   * @see info.kwarc.mmt.lF.LFPackage#getstructConstruct_IncOpt()
   * @model
   * @generated
   */
  String getIncOpt();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.structConstruct#getIncOpt <em>Inc Opt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inc Opt</em>' attribute.
   * @see #getIncOpt()
   * @generated
   */
  void setIncOpt(String value);

} // structConstruct
