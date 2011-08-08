/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.fixityDeclaration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>fixity Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.impl.fixityDeclarationImpl#getFixity <em>Fixity</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.fixityDeclarationImpl#getFixityLevel <em>Fixity Level</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.fixityDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class fixityDeclarationImpl extends sigConstructNOSPImpl implements fixityDeclaration
{
  /**
   * The default value of the '{@link #getFixity() <em>Fixity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixity()
   * @generated
   * @ordered
   */
  protected static final String FIXITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFixity() <em>Fixity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixity()
   * @generated
   * @ordered
   */
  protected String fixity = FIXITY_EDEFAULT;

  /**
   * The default value of the '{@link #getFixityLevel() <em>Fixity Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixityLevel()
   * @generated
   * @ordered
   */
  protected static final String FIXITY_LEVEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFixityLevel() <em>Fixity Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixityLevel()
   * @generated
   * @ordered
   */
  protected String fixityLevel = FIXITY_LEVEL_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected fixityDeclarationImpl()
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
    return LFPackage.Literals.FIXITY_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFixity()
  {
    return fixity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixity(String newFixity)
  {
    String oldFixity = fixity;
    fixity = newFixity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.FIXITY_DECLARATION__FIXITY, oldFixity, fixity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFixityLevel()
  {
    return fixityLevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixityLevel(String newFixityLevel)
  {
    String oldFixityLevel = fixityLevel;
    fixityLevel = newFixityLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.FIXITY_DECLARATION__FIXITY_LEVEL, oldFixityLevel, fixityLevel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.FIXITY_DECLARATION__NAME, oldName, name));
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
      case LFPackage.FIXITY_DECLARATION__FIXITY:
        return getFixity();
      case LFPackage.FIXITY_DECLARATION__FIXITY_LEVEL:
        return getFixityLevel();
      case LFPackage.FIXITY_DECLARATION__NAME:
        return getName();
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
      case LFPackage.FIXITY_DECLARATION__FIXITY:
        setFixity((String)newValue);
        return;
      case LFPackage.FIXITY_DECLARATION__FIXITY_LEVEL:
        setFixityLevel((String)newValue);
        return;
      case LFPackage.FIXITY_DECLARATION__NAME:
        setName((String)newValue);
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
      case LFPackage.FIXITY_DECLARATION__FIXITY:
        setFixity(FIXITY_EDEFAULT);
        return;
      case LFPackage.FIXITY_DECLARATION__FIXITY_LEVEL:
        setFixityLevel(FIXITY_LEVEL_EDEFAULT);
        return;
      case LFPackage.FIXITY_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
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
      case LFPackage.FIXITY_DECLARATION__FIXITY:
        return FIXITY_EDEFAULT == null ? fixity != null : !FIXITY_EDEFAULT.equals(fixity);
      case LFPackage.FIXITY_DECLARATION__FIXITY_LEVEL:
        return FIXITY_LEVEL_EDEFAULT == null ? fixityLevel != null : !FIXITY_LEVEL_EDEFAULT.equals(fixityLevel);
      case LFPackage.FIXITY_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (fixity: ");
    result.append(fixity);
    result.append(", fixityLevel: ");
    result.append(fixityLevel);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //fixityDeclarationImpl
