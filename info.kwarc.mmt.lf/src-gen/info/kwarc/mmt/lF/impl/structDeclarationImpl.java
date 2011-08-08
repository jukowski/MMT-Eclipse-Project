/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.TempType;
import info.kwarc.mmt.lF.includeOps;
import info.kwarc.mmt.lF.linkDeclaration;
import info.kwarc.mmt.lF.sigDeclaration;
import info.kwarc.mmt.lF.structDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>struct Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.impl.structDeclarationImpl#getFullURI <em>Full URI</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.structDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.structDeclarationImpl#getDef <em>Def</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.structDeclarationImpl#getFrom <em>From</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.structDeclarationImpl#getIncOpt <em>Inc Opt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class structDeclarationImpl extends sigConstructNOSPImpl implements structDeclaration
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
   * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected EObject def;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected sigDeclaration from;

  /**
   * The cached value of the '{@link #getIncOpt() <em>Inc Opt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncOpt()
   * @generated
   * @ordered
   */
  protected includeOps incOpt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected structDeclarationImpl()
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
    return LFPackage.Literals.STRUCT_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.STRUCT_DECLARATION__FULL_URI, oldFullURI, fullURI));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.STRUCT_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDef(EObject newDef, NotificationChain msgs)
  {
    EObject oldDef = def;
    def = newDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LFPackage.STRUCT_DECLARATION__DEF, oldDef, newDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(EObject newDef)
  {
    if (newDef != def)
    {
      NotificationChain msgs = null;
      if (def != null)
        msgs = ((InternalEObject)def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LFPackage.STRUCT_DECLARATION__DEF, null, msgs);
      if (newDef != null)
        msgs = ((InternalEObject)newDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LFPackage.STRUCT_DECLARATION__DEF, null, msgs);
      msgs = basicSetDef(newDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.STRUCT_DECLARATION__DEF, newDef, newDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sigDeclaration getFrom()
  {
    if (from != null && from.eIsProxy())
    {
      InternalEObject oldFrom = (InternalEObject)from;
      from = (sigDeclaration)eResolveProxy(oldFrom);
      if (from != oldFrom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LFPackage.STRUCT_DECLARATION__FROM, oldFrom, from));
      }
    }
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sigDeclaration basicGetFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(sigDeclaration newFrom)
  {
    sigDeclaration oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.STRUCT_DECLARATION__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public includeOps getIncOpt()
  {
    return incOpt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIncOpt(includeOps newIncOpt, NotificationChain msgs)
  {
    includeOps oldIncOpt = incOpt;
    incOpt = newIncOpt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LFPackage.STRUCT_DECLARATION__INC_OPT, oldIncOpt, newIncOpt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncOpt(includeOps newIncOpt)
  {
    if (newIncOpt != incOpt)
    {
      NotificationChain msgs = null;
      if (incOpt != null)
        msgs = ((InternalEObject)incOpt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LFPackage.STRUCT_DECLARATION__INC_OPT, null, msgs);
      if (newIncOpt != null)
        msgs = ((InternalEObject)newIncOpt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LFPackage.STRUCT_DECLARATION__INC_OPT, null, msgs);
      msgs = basicSetIncOpt(newIncOpt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.STRUCT_DECLARATION__INC_OPT, newIncOpt, newIncOpt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LFPackage.STRUCT_DECLARATION__DEF:
        return basicSetDef(null, msgs);
      case LFPackage.STRUCT_DECLARATION__INC_OPT:
        return basicSetIncOpt(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LFPackage.STRUCT_DECLARATION__FULL_URI:
        return getFullURI();
      case LFPackage.STRUCT_DECLARATION__NAME:
        return getName();
      case LFPackage.STRUCT_DECLARATION__DEF:
        return getDef();
      case LFPackage.STRUCT_DECLARATION__FROM:
        if (resolve) return getFrom();
        return basicGetFrom();
      case LFPackage.STRUCT_DECLARATION__INC_OPT:
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
      case LFPackage.STRUCT_DECLARATION__FULL_URI:
        setFullURI((String)newValue);
        return;
      case LFPackage.STRUCT_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case LFPackage.STRUCT_DECLARATION__DEF:
        setDef((EObject)newValue);
        return;
      case LFPackage.STRUCT_DECLARATION__FROM:
        setFrom((sigDeclaration)newValue);
        return;
      case LFPackage.STRUCT_DECLARATION__INC_OPT:
        setIncOpt((includeOps)newValue);
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
      case LFPackage.STRUCT_DECLARATION__FULL_URI:
        setFullURI(FULL_URI_EDEFAULT);
        return;
      case LFPackage.STRUCT_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LFPackage.STRUCT_DECLARATION__DEF:
        setDef((EObject)null);
        return;
      case LFPackage.STRUCT_DECLARATION__FROM:
        setFrom((sigDeclaration)null);
        return;
      case LFPackage.STRUCT_DECLARATION__INC_OPT:
        setIncOpt((includeOps)null);
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
      case LFPackage.STRUCT_DECLARATION__FULL_URI:
        return FULL_URI_EDEFAULT == null ? fullURI != null : !FULL_URI_EDEFAULT.equals(fullURI);
      case LFPackage.STRUCT_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LFPackage.STRUCT_DECLARATION__DEF:
        return def != null;
      case LFPackage.STRUCT_DECLARATION__FROM:
        return from != null;
      case LFPackage.STRUCT_DECLARATION__INC_OPT:
        return incOpt != null;
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
    if (baseClass == linkDeclaration.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == TempType.class)
    {
      switch (derivedFeatureID)
      {
        case LFPackage.STRUCT_DECLARATION__FULL_URI: return LFPackage.TEMP_TYPE__FULL_URI;
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
    if (baseClass == linkDeclaration.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == TempType.class)
    {
      switch (baseFeatureID)
      {
        case LFPackage.TEMP_TYPE__FULL_URI: return LFPackage.STRUCT_DECLARATION__FULL_URI;
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
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //structDeclarationImpl
