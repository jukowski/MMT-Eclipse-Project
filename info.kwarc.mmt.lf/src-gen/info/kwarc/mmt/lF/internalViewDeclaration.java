/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>internal View Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.internalViewDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.internalViewDeclaration#getFrom <em>From</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.internalViewDeclaration#getTo <em>To</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.internalViewDeclaration#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getinternalViewDeclaration()
 * @model
 * @generated
 */
public interface internalViewDeclaration extends sigConstructNOSP, linkDeclaration, TempType
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
   * @see info.kwarc.mmt.lF.LFPackage#getinternalViewDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.internalViewDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see info.kwarc.mmt.lF.LFPackage#getinternalViewDeclaration_From()
   * @model
   * @generated
   */
  sigDeclaration getFrom();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.internalViewDeclaration#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(sigDeclaration value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(morphism)
   * @see info.kwarc.mmt.lF.LFPackage#getinternalViewDeclaration_To()
   * @model containment="true"
   * @generated
   */
  morphism getTo();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.internalViewDeclaration#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(morphism value);

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
   * @see info.kwarc.mmt.lF.LFPackage#getinternalViewDeclaration_Def()
   * @model containment="true"
   * @generated
   */
  EObject getDef();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.internalViewDeclaration#getDef <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' containment reference.
   * @see #getDef()
   * @generated
   */
  void setDef(EObject value);

} // internalViewDeclaration
