/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.signatureDeclaration;
import info.kwarc.mmt.lF.structConstruct;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>struct Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.impl.structConstructImpl#getStructName <em>Struct Name</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.structConstructImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.structConstructImpl#getIncOpt <em>Inc Opt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class structConstructImpl extends sigConstructImpl implements structConstruct
{
  /**
   * The default value of the '{@link #getStructName() <em>Struct Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructName()
   * @generated
   * @ordered
   */
  protected static final String STRUCT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStructName() <em>Struct Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructName()
   * @generated
   * @ordered
   */
  protected String structName = STRUCT_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected signatureDeclaration namespace;

  /**
   * The default value of the '{@link #getIncOpt() <em>Inc Opt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncOpt()
   * @generated
   * @ordered
   */
  protected static final String INC_OPT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIncOpt() <em>Inc Opt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncOpt()
   * @generated
   * @ordered
   */
  protected String incOpt = INC_OPT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected structConstructImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LFPackage.Literals.STRUCT_CONSTRUCT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStructName()
  {
    return structName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructName(String newStructName)
  {
    String oldStructName = structName;
    structName = newStructName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.STRUCT_CONSTRUCT__STRUCT_NAME, oldStructName, structName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public signatureDeclaration getNamespace()
  {
    if (namespace != null && namespace.eIsProxy())
    {
      InternalEObject oldNamespace = (InternalEObject)namespace;
      namespace = (signatureDeclaration)eResolveProxy(oldNamespace);
      if (namespace != oldNamespace)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LFPackage.STRUCT_CONSTRUCT__NAMESPACE, oldNamespace, namespace));
      }
    }
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public signatureDeclaration basicGetNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(signatureDeclaration newNamespace)
  {
    signatureDeclaration oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.STRUCT_CONSTRUCT__NAMESPACE, oldNamespace, namespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIncOpt()
  {
    return incOpt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncOpt(String newIncOpt)
  {
    String oldIncOpt = incOpt;
    incOpt = newIncOpt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.STRUCT_CONSTRUCT__INC_OPT, oldIncOpt, incOpt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LFPackage.STRUCT_CONSTRUCT__STRUCT_NAME:
        return getStructName();
      case LFPackage.STRUCT_CONSTRUCT__NAMESPACE:
        if (resolve) return getNamespace();
        return basicGetNamespace();
      case LFPackage.STRUCT_CONSTRUCT__INC_OPT:
        return getIncOpt();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LFPackage.STRUCT_CONSTRUCT__STRUCT_NAME:
        setStructName((String)newValue);
        return;
      case LFPackage.STRUCT_CONSTRUCT__NAMESPACE:
        setNamespace((signatureDeclaration)newValue);
        return;
      case LFPackage.STRUCT_CONSTRUCT__INC_OPT:
        setIncOpt((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LFPackage.STRUCT_CONSTRUCT__STRUCT_NAME:
        setStructName(STRUCT_NAME_EDEFAULT);
        return;
      case LFPackage.STRUCT_CONSTRUCT__NAMESPACE:
        setNamespace((signatureDeclaration)null);
        return;
      case LFPackage.STRUCT_CONSTRUCT__INC_OPT:
        setIncOpt(INC_OPT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LFPackage.STRUCT_CONSTRUCT__STRUCT_NAME:
        return STRUCT_NAME_EDEFAULT == null ? structName != null : !STRUCT_NAME_EDEFAULT.equals(structName);
      case LFPackage.STRUCT_CONSTRUCT__NAMESPACE:
        return namespace != null;
      case LFPackage.STRUCT_CONSTRUCT__INC_OPT:
        return INC_OPT_EDEFAULT == null ? incOpt != null : !INC_OPT_EDEFAULT.equals(incOpt);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (structName: ");
    result.append(structName);
    result.append(", incOpt: ");
    result.append(incOpt);
    result.append(')');
    return result.toString();
  }

} //structConstructImpl
