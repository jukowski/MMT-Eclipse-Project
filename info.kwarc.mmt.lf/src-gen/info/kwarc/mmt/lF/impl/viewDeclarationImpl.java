/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.sigDefinitions;
import info.kwarc.mmt.lF.viewDeclaration;

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
 * An implementation of the model object '<em><b>view Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.impl.viewDeclarationImpl#getViewID <em>View ID</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.viewDeclarationImpl#getFrom <em>From</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.viewDeclarationImpl#getTo <em>To</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.viewDeclarationImpl#getViewDefinitions <em>View Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class viewDeclarationImpl extends MinimalEObjectImpl.Container implements viewDeclaration
{
  /**
   * The default value of the '{@link #getViewID() <em>View ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewID()
   * @generated
   * @ordered
   */
  protected static final String VIEW_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getViewID() <em>View ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewID()
   * @generated
   * @ordered
   */
  protected String viewID = VIEW_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected static final String FROM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected String from = FROM_EDEFAULT;

  /**
   * The default value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected static final String TO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected String to = TO_EDEFAULT;

  /**
   * The cached value of the '{@link #getViewDefinitions() <em>View Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewDefinitions()
   * @generated
   * @ordered
   */
  protected EList<sigDefinitions> viewDefinitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected viewDeclarationImpl()
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
    return LFPackage.Literals.VIEW_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getViewID()
  {
    return viewID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewID(String newViewID)
  {
    String oldViewID = viewID;
    viewID = newViewID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.VIEW_DECLARATION__VIEW_ID, oldViewID, viewID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(String newFrom)
  {
    String oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.VIEW_DECLARATION__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(String newTo)
  {
    String oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.VIEW_DECLARATION__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<sigDefinitions> getViewDefinitions()
  {
    if (viewDefinitions == null)
    {
      viewDefinitions = new EObjectContainmentEList<sigDefinitions>(sigDefinitions.class, this, LFPackage.VIEW_DECLARATION__VIEW_DEFINITIONS);
    }
    return viewDefinitions;
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
      case LFPackage.VIEW_DECLARATION__VIEW_DEFINITIONS:
        return ((InternalEList<?>)getViewDefinitions()).basicRemove(otherEnd, msgs);
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
      case LFPackage.VIEW_DECLARATION__VIEW_ID:
        return getViewID();
      case LFPackage.VIEW_DECLARATION__FROM:
        return getFrom();
      case LFPackage.VIEW_DECLARATION__TO:
        return getTo();
      case LFPackage.VIEW_DECLARATION__VIEW_DEFINITIONS:
        return getViewDefinitions();
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
      case LFPackage.VIEW_DECLARATION__VIEW_ID:
        setViewID((String)newValue);
        return;
      case LFPackage.VIEW_DECLARATION__FROM:
        setFrom((String)newValue);
        return;
      case LFPackage.VIEW_DECLARATION__TO:
        setTo((String)newValue);
        return;
      case LFPackage.VIEW_DECLARATION__VIEW_DEFINITIONS:
        getViewDefinitions().clear();
        getViewDefinitions().addAll((Collection<? extends sigDefinitions>)newValue);
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
      case LFPackage.VIEW_DECLARATION__VIEW_ID:
        setViewID(VIEW_ID_EDEFAULT);
        return;
      case LFPackage.VIEW_DECLARATION__FROM:
        setFrom(FROM_EDEFAULT);
        return;
      case LFPackage.VIEW_DECLARATION__TO:
        setTo(TO_EDEFAULT);
        return;
      case LFPackage.VIEW_DECLARATION__VIEW_DEFINITIONS:
        getViewDefinitions().clear();
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
      case LFPackage.VIEW_DECLARATION__VIEW_ID:
        return VIEW_ID_EDEFAULT == null ? viewID != null : !VIEW_ID_EDEFAULT.equals(viewID);
      case LFPackage.VIEW_DECLARATION__FROM:
        return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
      case LFPackage.VIEW_DECLARATION__TO:
        return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
      case LFPackage.VIEW_DECLARATION__VIEW_DEFINITIONS:
        return viewDefinitions != null && !viewDefinitions.isEmpty();
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
    result.append(" (viewID: ");
    result.append(viewID);
    result.append(", from: ");
    result.append(from);
    result.append(", to: ");
    result.append(to);
    result.append(')');
    return result.toString();
  }

} //viewDeclarationImpl
