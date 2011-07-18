/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.sigDefinitions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sig Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.impl.sigDefinitionsImpl#getSymbName <em>Symb Name</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.sigDefinitionsImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.sigDefinitionsImpl#getStructName <em>Struct Name</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.sigDefinitionsImpl#getType <em>Type</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.sigDefinitionsImpl#getPrecendece <em>Precendece</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.sigDefinitionsImpl#getTmp <em>Tmp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class sigDefinitionsImpl extends MinimalEObjectImpl.Container implements sigDefinitions
{
  /**
   * The default value of the '{@link #getSymbName() <em>Symb Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbName()
   * @generated
   * @ordered
   */
  protected static final String SYMB_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSymbName() <em>Symb Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbName()
   * @generated
   * @ordered
   */
  protected String symbName = SYMB_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected static final String NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected String namespace = NAMESPACE_EDEFAULT;

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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getPrecendece() <em>Precendece</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecendece()
   * @generated
   * @ordered
   */
  protected static final int PRECENDECE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPrecendece() <em>Precendece</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecendece()
   * @generated
   * @ordered
   */
  protected int precendece = PRECENDECE_EDEFAULT;

  /**
   * The default value of the '{@link #getTmp() <em>Tmp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTmp()
   * @generated
   * @ordered
   */
  protected static final String TMP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTmp() <em>Tmp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTmp()
   * @generated
   * @ordered
   */
  protected String tmp = TMP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected sigDefinitionsImpl()
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
    return LFPackage.Literals.SIG_DEFINITIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSymbName()
  {
    return symbName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbName(String newSymbName)
  {
    String oldSymbName = symbName;
    symbName = newSymbName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.SIG_DEFINITIONS__SYMB_NAME, oldSymbName, symbName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(String newNamespace)
  {
    String oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.SIG_DEFINITIONS__NAMESPACE, oldNamespace, namespace));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.SIG_DEFINITIONS__STRUCT_NAME, oldStructName, structName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.SIG_DEFINITIONS__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPrecendece()
  {
    return precendece;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrecendece(int newPrecendece)
  {
    int oldPrecendece = precendece;
    precendece = newPrecendece;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.SIG_DEFINITIONS__PRECENDECE, oldPrecendece, precendece));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTmp()
  {
    return tmp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTmp(String newTmp)
  {
    String oldTmp = tmp;
    tmp = newTmp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.SIG_DEFINITIONS__TMP, oldTmp, tmp));
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
      case LFPackage.SIG_DEFINITIONS__SYMB_NAME:
        return getSymbName();
      case LFPackage.SIG_DEFINITIONS__NAMESPACE:
        return getNamespace();
      case LFPackage.SIG_DEFINITIONS__STRUCT_NAME:
        return getStructName();
      case LFPackage.SIG_DEFINITIONS__TYPE:
        return getType();
      case LFPackage.SIG_DEFINITIONS__PRECENDECE:
        return getPrecendece();
      case LFPackage.SIG_DEFINITIONS__TMP:
        return getTmp();
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
      case LFPackage.SIG_DEFINITIONS__SYMB_NAME:
        setSymbName((String)newValue);
        return;
      case LFPackage.SIG_DEFINITIONS__NAMESPACE:
        setNamespace((String)newValue);
        return;
      case LFPackage.SIG_DEFINITIONS__STRUCT_NAME:
        setStructName((String)newValue);
        return;
      case LFPackage.SIG_DEFINITIONS__TYPE:
        setType((String)newValue);
        return;
      case LFPackage.SIG_DEFINITIONS__PRECENDECE:
        setPrecendece((Integer)newValue);
        return;
      case LFPackage.SIG_DEFINITIONS__TMP:
        setTmp((String)newValue);
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
      case LFPackage.SIG_DEFINITIONS__SYMB_NAME:
        setSymbName(SYMB_NAME_EDEFAULT);
        return;
      case LFPackage.SIG_DEFINITIONS__NAMESPACE:
        setNamespace(NAMESPACE_EDEFAULT);
        return;
      case LFPackage.SIG_DEFINITIONS__STRUCT_NAME:
        setStructName(STRUCT_NAME_EDEFAULT);
        return;
      case LFPackage.SIG_DEFINITIONS__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case LFPackage.SIG_DEFINITIONS__PRECENDECE:
        setPrecendece(PRECENDECE_EDEFAULT);
        return;
      case LFPackage.SIG_DEFINITIONS__TMP:
        setTmp(TMP_EDEFAULT);
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
      case LFPackage.SIG_DEFINITIONS__SYMB_NAME:
        return SYMB_NAME_EDEFAULT == null ? symbName != null : !SYMB_NAME_EDEFAULT.equals(symbName);
      case LFPackage.SIG_DEFINITIONS__NAMESPACE:
        return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
      case LFPackage.SIG_DEFINITIONS__STRUCT_NAME:
        return STRUCT_NAME_EDEFAULT == null ? structName != null : !STRUCT_NAME_EDEFAULT.equals(structName);
      case LFPackage.SIG_DEFINITIONS__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case LFPackage.SIG_DEFINITIONS__PRECENDECE:
        return precendece != PRECENDECE_EDEFAULT;
      case LFPackage.SIG_DEFINITIONS__TMP:
        return TMP_EDEFAULT == null ? tmp != null : !TMP_EDEFAULT.equals(tmp);
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
    result.append(" (symbName: ");
    result.append(symbName);
    result.append(", namespace: ");
    result.append(namespace);
    result.append(", structName: ");
    result.append(structName);
    result.append(", type: ");
    result.append(type);
    result.append(", precendece: ");
    result.append(precendece);
    result.append(", tmp: ");
    result.append(tmp);
    result.append(')');
    return result.toString();
  }

} //sigDefinitionsImpl
