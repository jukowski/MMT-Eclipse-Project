/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.aliasDeclaration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>alias Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.impl.aliasDeclarationImpl#getOld <em>Old</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.aliasDeclarationImpl#getNew <em>New</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class aliasDeclarationImpl extends MinimalEObjectImpl.Container implements aliasDeclaration
{
  /**
   * The default value of the '{@link #getOld() <em>Old</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOld()
   * @generated
   * @ordered
   */
  protected static final String OLD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOld() <em>Old</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOld()
   * @generated
   * @ordered
   */
  protected String old = OLD_EDEFAULT;

  /**
   * The default value of the '{@link #getNew() <em>New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNew()
   * @generated
   * @ordered
   */
  protected static final String NEW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNew() <em>New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNew()
   * @generated
   * @ordered
   */
  protected String new_ = NEW_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected aliasDeclarationImpl()
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
    return LFPackage.Literals.ALIAS_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOld()
  {
    return old;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOld(String newOld)
  {
    String oldOld = old;
    old = newOld;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.ALIAS_DECLARATION__OLD, oldOld, old));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNew()
  {
    return new_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNew(String newNew)
  {
    String oldNew = new_;
    new_ = newNew;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.ALIAS_DECLARATION__NEW, oldNew, new_));
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
      case LFPackage.ALIAS_DECLARATION__OLD:
        return getOld();
      case LFPackage.ALIAS_DECLARATION__NEW:
        return getNew();
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
      case LFPackage.ALIAS_DECLARATION__OLD:
        setOld((String)newValue);
        return;
      case LFPackage.ALIAS_DECLARATION__NEW:
        setNew((String)newValue);
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
      case LFPackage.ALIAS_DECLARATION__OLD:
        setOld(OLD_EDEFAULT);
        return;
      case LFPackage.ALIAS_DECLARATION__NEW:
        setNew(NEW_EDEFAULT);
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
      case LFPackage.ALIAS_DECLARATION__OLD:
        return OLD_EDEFAULT == null ? old != null : !OLD_EDEFAULT.equals(old);
      case LFPackage.ALIAS_DECLARATION__NEW:
        return NEW_EDEFAULT == null ? new_ != null : !NEW_EDEFAULT.equals(new_);
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
    result.append(" (old: ");
    result.append(old);
    result.append(", new: ");
    result.append(new_);
    result.append(')');
    return result.toString();
  }

} //aliasDeclarationImpl
