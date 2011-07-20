/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.classicSymbolConstruct;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>classic Symbol Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.impl.classicSymbolConstructImpl#getSymbName <em>Symb Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class classicSymbolConstructImpl extends sigConstructImpl implements classicSymbolConstruct
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected classicSymbolConstructImpl()
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
    return LFPackage.Literals.CLASSIC_SYMBOL_CONSTRUCT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.CLASSIC_SYMBOL_CONSTRUCT__SYMB_NAME, oldSymbName, symbName));
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
      case LFPackage.CLASSIC_SYMBOL_CONSTRUCT__SYMB_NAME:
        return getSymbName();
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
      case LFPackage.CLASSIC_SYMBOL_CONSTRUCT__SYMB_NAME:
        setSymbName((String)newValue);
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
      case LFPackage.CLASSIC_SYMBOL_CONSTRUCT__SYMB_NAME:
        setSymbName(SYMB_NAME_EDEFAULT);
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
      case LFPackage.CLASSIC_SYMBOL_CONSTRUCT__SYMB_NAME:
        return SYMB_NAME_EDEFAULT == null ? symbName != null : !SYMB_NAME_EDEFAULT.equals(symbName);
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
    result.append(')');
    return result.toString();
  }

} //classicSymbolConstructImpl
