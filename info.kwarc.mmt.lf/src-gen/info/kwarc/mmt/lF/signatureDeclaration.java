/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>signature Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.signatureDeclaration#getSigName <em>Sig Name</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.signatureDeclaration#getDefs <em>Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getsignatureDeclaration()
 * @model
 * @generated
 */
public interface signatureDeclaration extends TempType
{
  /**
   * Returns the value of the '<em><b>Sig Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sig Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sig Name</em>' attribute.
   * @see #setSigName(String)
   * @see info.kwarc.mmt.lF.LFPackage#getsignatureDeclaration_SigName()
   * @model
   * @generated
   */
  String getSigName();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.signatureDeclaration#getSigName <em>Sig Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sig Name</em>' attribute.
   * @see #getSigName()
   * @generated
   */
  void setSigName(String value);

  /**
   * Returns the value of the '<em><b>Defs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defs</em>' containment reference.
   * @see #setDefs(sigDefinitions)
   * @see info.kwarc.mmt.lF.LFPackage#getsignatureDeclaration_Defs()
   * @model containment="true"
   * @generated
   */
  sigDefinitions getDefs();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.signatureDeclaration#getDefs <em>Defs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Defs</em>' containment reference.
   * @see #getDefs()
   * @generated
   */
  void setDefs(sigDefinitions value);

} // signatureDeclaration
