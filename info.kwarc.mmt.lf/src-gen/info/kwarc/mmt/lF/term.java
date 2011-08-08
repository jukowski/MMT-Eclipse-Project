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
 * A representation of the model object '<em><b>term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.term#getLeft <em>Left</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.term#getRight <em>Right</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.term#getQuantifiers <em>Quantifiers</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.term#getTerm <em>Term</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.term#getType <em>Type</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.term#getAtom <em>Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getterm()
 * @model
 * @generated
 */
public interface term extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(term)
   * @see info.kwarc.mmt.lF.LFPackage#getterm_Left()
   * @model containment="true"
   * @generated
   */
  term getLeft();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.term#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(term value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(term)
   * @see info.kwarc.mmt.lF.LFPackage#getterm_Right()
   * @model containment="true"
   * @generated
   */
  term getRight();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.term#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(term value);

  /**
   * Returns the value of the '<em><b>Quantifiers</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantifiers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantifiers</em>' containment reference list.
   * @see info.kwarc.mmt.lF.LFPackage#getterm_Quantifiers()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getQuantifiers();

  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(term)
   * @see info.kwarc.mmt.lF.LFPackage#getterm_Term()
   * @model containment="true"
   * @generated
   */
  term getTerm();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.term#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(term value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(term)
   * @see info.kwarc.mmt.lF.LFPackage#getterm_Type()
   * @model containment="true"
   * @generated
   */
  term getType();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.term#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(term value);

  /**
   * Returns the value of the '<em><b>Atom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atom</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom</em>' attribute.
   * @see #setAtom(String)
   * @see info.kwarc.mmt.lF.LFPackage#getterm_Atom()
   * @model
   * @generated
   */
  String getAtom();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.term#getAtom <em>Atom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom</em>' attribute.
   * @see #getAtom()
   * @generated
   */
  void setAtom(String value);

} // term
