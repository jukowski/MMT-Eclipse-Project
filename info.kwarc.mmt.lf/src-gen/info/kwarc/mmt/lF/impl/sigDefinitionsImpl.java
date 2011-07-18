/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.sigConstruct;
import info.kwarc.mmt.lF.sigDefinitions;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sig Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.impl.sigDefinitionsImpl#getCons <em>Cons</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.sigDefinitionsImpl#getFcons <em>Fcons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class sigDefinitionsImpl extends MinimalEObjectImpl.Container implements sigDefinitions
{
  /**
   * The cached value of the '{@link #getCons() <em>Cons</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCons()
   * @generated
   * @ordered
   */
  protected sigConstruct cons;

  /**
   * The cached value of the '{@link #getFcons() <em>Fcons</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFcons()
   * @generated
   * @ordered
   */
  protected EList<sigConstruct> fcons;

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
  public sigConstruct getCons()
  {
    return cons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCons(sigConstruct newCons, NotificationChain msgs)
  {
    sigConstruct oldCons = cons;
    cons = newCons;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LFPackage.SIG_DEFINITIONS__CONS, oldCons, newCons);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCons(sigConstruct newCons)
  {
    if (newCons != cons)
    {
      NotificationChain msgs = null;
      if (cons != null)
        msgs = ((InternalEObject)cons).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LFPackage.SIG_DEFINITIONS__CONS, null, msgs);
      if (newCons != null)
        msgs = ((InternalEObject)newCons).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LFPackage.SIG_DEFINITIONS__CONS, null, msgs);
      msgs = basicSetCons(newCons, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.SIG_DEFINITIONS__CONS, newCons, newCons));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<sigConstruct> getFcons()
  {
    if (fcons == null)
    {
      fcons = new EObjectContainmentEList<sigConstruct>(sigConstruct.class, this, LFPackage.SIG_DEFINITIONS__FCONS);
    }
    return fcons;
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
      case LFPackage.SIG_DEFINITIONS__CONS:
        return basicSetCons(null, msgs);
      case LFPackage.SIG_DEFINITIONS__FCONS:
        return ((InternalEList<?>)getFcons()).basicRemove(otherEnd, msgs);
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
      case LFPackage.SIG_DEFINITIONS__CONS:
        return getCons();
      case LFPackage.SIG_DEFINITIONS__FCONS:
        return getFcons();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LFPackage.SIG_DEFINITIONS__CONS:
        setCons((sigConstruct)newValue);
        return;
      case LFPackage.SIG_DEFINITIONS__FCONS:
        getFcons().clear();
        getFcons().addAll((Collection<? extends sigConstruct>)newValue);
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
      case LFPackage.SIG_DEFINITIONS__CONS:
        setCons((sigConstruct)null);
        return;
      case LFPackage.SIG_DEFINITIONS__FCONS:
        getFcons().clear();
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
      case LFPackage.SIG_DEFINITIONS__CONS:
        return cons != null;
      case LFPackage.SIG_DEFINITIONS__FCONS:
        return fcons != null && !fcons.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //sigDefinitionsImpl
