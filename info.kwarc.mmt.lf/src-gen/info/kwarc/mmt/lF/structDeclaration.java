/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>struct Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.structDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.structDeclaration#getDef <em>Def</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.structDeclaration#getFrom <em>From</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.structDeclaration#getIncOpt <em>Inc Opt</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getstructDeclaration()
 * @model
 * @generated
 */
public interface structDeclaration extends sigConstructNOSP, linkDeclaration, TempType
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see info.kwarc.mmt.lF.LFPackage#getstructDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.structDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' containment reference.
   * @see #setDef(EObject)
   * @see info.kwarc.mmt.lF.LFPackage#getstructDeclaration_Def()
   * @model containment="true"
   * @generated
   */
  EObject getDef();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.structDeclaration#getDef <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' containment reference.
   * @see #getDef()
   * @generated
   */
  void setDef(EObject value);

  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(sigDeclaration)
   * @see info.kwarc.mmt.lF.LFPackage#getstructDeclaration_From()
   * @model
   * @generated
   */
  sigDeclaration getFrom();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.structDeclaration#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(sigDeclaration value);

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
   * @see info.kwarc.mmt.lF.LFPackage#getstructDeclaration_IncOpt()
   * @model containment="true"
   * @generated
   */
  includeOps getIncOpt();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.structDeclaration#getIncOpt <em>Inc Opt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inc Opt</em>' containment reference.
   * @see #getIncOpt()
   * @generated
   */
  void setIncOpt(includeOps value);

} // structDeclaration
