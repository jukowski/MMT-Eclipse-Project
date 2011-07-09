/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.elf.impl;

import info.kwarc.elf.ElfPackage;
import info.kwarc.elf.sigDefinitions;

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
 *   <li>{@link info.kwarc.elf.impl.sigDefinitionsImpl#getSymbName <em>Symb Name</em>}</li>
 *   <li>{@link info.kwarc.elf.impl.sigDefinitionsImpl#getType <em>Type</em>}</li>
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
    return ElfPackage.Literals.SIG_DEFINITIONS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ElfPackage.SIG_DEFINITIONS__SYMB_NAME, oldSymbName, symbName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ElfPackage.SIG_DEFINITIONS__TYPE, oldType, type));
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
      case ElfPackage.SIG_DEFINITIONS__SYMB_NAME:
        return getSymbName();
      case ElfPackage.SIG_DEFINITIONS__TYPE:
        return getType();
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
      case ElfPackage.SIG_DEFINITIONS__SYMB_NAME:
        setSymbName((String)newValue);
        return;
      case ElfPackage.SIG_DEFINITIONS__TYPE:
        setType((String)newValue);
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
      case ElfPackage.SIG_DEFINITIONS__SYMB_NAME:
        setSymbName(SYMB_NAME_EDEFAULT);
        return;
      case ElfPackage.SIG_DEFINITIONS__TYPE:
        setType(TYPE_EDEFAULT);
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
      case ElfPackage.SIG_DEFINITIONS__SYMB_NAME:
        return SYMB_NAME_EDEFAULT == null ? symbName != null : !SYMB_NAME_EDEFAULT.equals(symbName);
      case ElfPackage.SIG_DEFINITIONS__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //sigDefinitionsImpl
