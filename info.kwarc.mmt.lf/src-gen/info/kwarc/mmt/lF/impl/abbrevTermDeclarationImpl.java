/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.TempType;
import info.kwarc.mmt.lF.abbrevTermDeclaration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>abbrev Term Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.impl.abbrevTermDeclarationImpl#getFullURI <em>Full URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class abbrevTermDeclarationImpl extends sigConstructNOSPImpl implements abbrevTermDeclaration
{
  /**
   * The default value of the '{@link #getFullURI() <em>Full URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFullURI()
   * @generated
   * @ordered
   */
  protected static final String FULL_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFullURI() <em>Full URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFullURI()
   * @generated
   * @ordered
   */
  protected String fullURI = FULL_URI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected abbrevTermDeclarationImpl()
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
    return LFPackage.Literals.ABBREV_TERM_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFullURI()
  {
    return fullURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFullURI(String newFullURI)
  {
    String oldFullURI = fullURI;
    fullURI = newFullURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.ABBREV_TERM_DECLARATION__FULL_URI, oldFullURI, fullURI));
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
      case LFPackage.ABBREV_TERM_DECLARATION__FULL_URI:
        return getFullURI();
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
      case LFPackage.ABBREV_TERM_DECLARATION__FULL_URI:
        setFullURI((String)newValue);
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
      case LFPackage.ABBREV_TERM_DECLARATION__FULL_URI:
        setFullURI(FULL_URI_EDEFAULT);
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
      case LFPackage.ABBREV_TERM_DECLARATION__FULL_URI:
        return FULL_URI_EDEFAULT == null ? fullURI != null : !FULL_URI_EDEFAULT.equals(fullURI);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == TempType.class)
    {
      switch (derivedFeatureID)
      {
        case LFPackage.ABBREV_TERM_DECLARATION__FULL_URI: return LFPackage.TEMP_TYPE__FULL_URI;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == TempType.class)
    {
      switch (baseFeatureID)
      {
        case LFPackage.TEMP_TYPE__FULL_URI: return LFPackage.ABBREV_TERM_DECLARATION__FULL_URI;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (fullURI: ");
    result.append(fullURI);
    result.append(')');
    return result.toString();
  }

} //abbrevTermDeclarationImpl
