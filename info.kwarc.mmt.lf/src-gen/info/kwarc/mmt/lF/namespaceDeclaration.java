/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>namespace Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.namespaceDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.namespaceDeclaration#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see info.kwarc.mmt.lF.LFPackage#getnamespaceDeclaration()
 * @model
 * @generated
 */
public interface namespaceDeclaration extends TempType
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
   * @see info.kwarc.mmt.lF.LFPackage#getnamespaceDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.namespaceDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see info.kwarc.mmt.lF.LFPackage#getnamespaceDeclaration_Uri()
   * @model
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link info.kwarc.mmt.lF.namespaceDeclaration#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

} // namespaceDeclaration
