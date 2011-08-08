/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>view Meta Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.viewMetaDeclaration#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getviewMetaDeclaration()
 * @model
 * @generated
 */
public interface viewMetaDeclaration extends linkConstructNOSP
{
  /**
   * Returns the value of the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' containment reference.
   * @see #setDef(morphism)
   * @see info.kwarc.mmt.lF.LFPackage#getviewMetaDeclaration_Def()
   * @model containment="true"
   * @generated
   */
  morphism getDef();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.viewMetaDeclaration#getDef <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' containment reference.
   * @see #getDef()
   * @generated
   */
  void setDef(morphism value);

} // viewMetaDeclaration
