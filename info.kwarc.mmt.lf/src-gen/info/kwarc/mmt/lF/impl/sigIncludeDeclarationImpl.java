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
import info.kwarc.mmt.lF.sigIncludeDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sig Include Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.impl.sigIncludeDeclarationImpl#getFullURI <em>Full URI</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.sigIncludeDeclarationImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.sigIncludeDeclarationImpl#getIncOpt <em>Inc Opt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class sigIncludeDeclarationImpl extends sigConstructNOSPImpl implements sigIncludeDeclaration
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
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected sigDeclaration ref;

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
  protected sigIncludeDeclarationImpl()
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
    return LFPackage.Literals.SIG_INCLUDE_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.SIG_INCLUDE_DECLARATION__FULL_URI, oldFullURI, fullURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sigDeclaration getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (sigDeclaration)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LFPackage.SIG_INCLUDE_DECLARATION__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sigDeclaration basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(sigDeclaration newRef)
  {
    sigDeclaration oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.SIG_INCLUDE_DECLARATION__REF, oldRef, ref));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LFPackage.SIG_INCLUDE_DECLARATION__INC_OPT, oldIncOpt, newIncOpt);
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
        msgs = ((InternalEObject)incOpt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LFPackage.SIG_INCLUDE_DECLARATION__INC_OPT, null, msgs);
      if (newIncOpt != null)
        msgs = ((InternalEObject)newIncOpt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LFPackage.SIG_INCLUDE_DECLARATION__INC_OPT, null, msgs);
      msgs = basicSetIncOpt(newIncOpt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.SIG_INCLUDE_DECLARATION__INC_OPT, newIncOpt, newIncOpt));
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
      case LFPackage.SIG_INCLUDE_DECLARATION__INC_OPT:
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
      case LFPackage.SIG_INCLUDE_DECLARATION__FULL_URI:
        return getFullURI();
      case LFPackage.SIG_INCLUDE_DECLARATION__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case LFPackage.SIG_INCLUDE_DECLARATION__INC_OPT:
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
      case LFPackage.SIG_INCLUDE_DECLARATION__FULL_URI:
        setFullURI((String)newValue);
        return;
      case LFPackage.SIG_INCLUDE_DECLARATION__REF:
        setRef((sigDeclaration)newValue);
        return;
      case LFPackage.SIG_INCLUDE_DECLARATION__INC_OPT:
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
      case LFPackage.SIG_INCLUDE_DECLARATION__FULL_URI:
        setFullURI(FULL_URI_EDEFAULT);
        return;
      case LFPackage.SIG_INCLUDE_DECLARATION__REF:
        setRef((sigDeclaration)null);
        return;
      case LFPackage.SIG_INCLUDE_DECLARATION__INC_OPT:
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
      case LFPackage.SIG_INCLUDE_DECLARATION__FULL_URI:
        return FULL_URI_EDEFAULT == null ? fullURI != null : !FULL_URI_EDEFAULT.equals(fullURI);
      case LFPackage.SIG_INCLUDE_DECLARATION__REF:
        return ref != null;
      case LFPackage.SIG_INCLUDE_DECLARATION__INC_OPT:
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
        case LFPackage.SIG_INCLUDE_DECLARATION__FULL_URI: return LFPackage.TEMP_TYPE__FULL_URI;
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
        case LFPackage.TEMP_TYPE__FULL_URI: return LFPackage.SIG_INCLUDE_DECLARATION__FULL_URI;
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

} //sigIncludeDeclarationImpl
