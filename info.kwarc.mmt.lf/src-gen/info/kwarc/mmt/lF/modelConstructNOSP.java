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
 * A representation of the model object '<em><b>model Construct NOSP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.modelConstructNOSP#getNamespaceDeclarations <em>Namespace Declarations</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.modelConstructNOSP#getReadDeclarations <em>Read Declarations</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.modelConstructNOSP#getSigDeclarations <em>Sig Declarations</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.modelConstructNOSP#getViewDeclarations <em>View Declarations</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.modelConstructNOSP#getRawDeclarations <em>Raw Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getmodelConstructNOSP()
 * @model
 * @generated
 */
public interface modelConstructNOSP extends EObject
{
  /**
   * Returns the value of the '<em><b>Namespace Declarations</b></em>' containment reference list.
   * The list contents are of type {@link info.kwarc.mmt.lF.namespaceDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace Declarations</em>' containment reference list.
   * @see info.kwarc.mmt.lF.LFPackage#getmodelConstructNOSP_NamespaceDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<namespaceDeclaration> getNamespaceDeclarations();

  /**
   * Returns the value of the '<em><b>Read Declarations</b></em>' containment reference list.
   * The list contents are of type {@link info.kwarc.mmt.lF.readDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read Declarations</em>' containment reference list.
   * @see info.kwarc.mmt.lF.LFPackage#getmodelConstructNOSP_ReadDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<readDeclaration> getReadDeclarations();

  /**
   * Returns the value of the '<em><b>Sig Declarations</b></em>' containment reference list.
   * The list contents are of type {@link info.kwarc.mmt.lF.sigDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sig Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sig Declarations</em>' containment reference list.
   * @see info.kwarc.mmt.lF.LFPackage#getmodelConstructNOSP_SigDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<sigDeclaration> getSigDeclarations();

  /**
   * Returns the value of the '<em><b>View Declarations</b></em>' containment reference list.
   * The list contents are of type {@link info.kwarc.mmt.lF.viewDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View Declarations</em>' containment reference list.
   * @see info.kwarc.mmt.lF.LFPackage#getmodelConstructNOSP_ViewDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<viewDeclaration> getViewDeclarations();

  /**
   * Returns the value of the '<em><b>Raw Declarations</b></em>' containment reference list.
   * The list contents are of type {@link info.kwarc.mmt.lF.sigConstructNOSP}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Raw Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Raw Declarations</em>' containment reference list.
   * @see info.kwarc.mmt.lF.LFPackage#getmodelConstructNOSP_RawDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<sigConstructNOSP> getRawDeclarations();

} // modelConstructNOSP
