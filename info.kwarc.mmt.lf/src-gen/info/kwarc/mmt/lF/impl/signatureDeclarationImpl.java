/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.sigDefinitions;
import info.kwarc.mmt.lF.signatureDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>signature Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.impl.signatureDeclarationImpl#getSigName <em>Sig Name</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.signatureDeclarationImpl#getDefs <em>Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class signatureDeclarationImpl extends TempTypeImpl implements signatureDeclaration
{
  /**
   * The default value of the '{@link #getSigName() <em>Sig Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSigName()
   * @generated
   * @ordered
   */
  protected static final String SIG_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSigName() <em>Sig Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSigName()
   * @generated
   * @ordered
   */
  protected String sigName = SIG_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefs() <em>Defs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefs()
   * @generated
   * @ordered
   */
  protected sigDefinitions defs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected signatureDeclarationImpl()
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
    return LFPackage.Literals.SIGNATURE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSigName()
  {
    return sigName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSigName(String newSigName)
  {
    String oldSigName = sigName;
    sigName = newSigName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.SIGNATURE_DECLARATION__SIG_NAME, oldSigName, sigName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sigDefinitions getDefs()
  {
    return defs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefs(sigDefinitions newDefs, NotificationChain msgs)
  {
    sigDefinitions oldDefs = defs;
    defs = newDefs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LFPackage.SIGNATURE_DECLARATION__DEFS, oldDefs, newDefs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefs(sigDefinitions newDefs)
  {
    if (newDefs != defs)
    {
      NotificationChain msgs = null;
      if (defs != null)
        msgs = ((InternalEObject)defs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LFPackage.SIGNATURE_DECLARATION__DEFS, null, msgs);
      if (newDefs != null)
        msgs = ((InternalEObject)newDefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LFPackage.SIGNATURE_DECLARATION__DEFS, null, msgs);
      msgs = basicSetDefs(newDefs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LFPackage.SIGNATURE_DECLARATION__DEFS, newDefs, newDefs));
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
      case LFPackage.SIGNATURE_DECLARATION__DEFS:
        return basicSetDefs(null, msgs);
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
      case LFPackage.SIGNATURE_DECLARATION__SIG_NAME:
        return getSigName();
      case LFPackage.SIGNATURE_DECLARATION__DEFS:
        return getDefs();
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
      case LFPackage.SIGNATURE_DECLARATION__SIG_NAME:
        setSigName((String)newValue);
        return;
      case LFPackage.SIGNATURE_DECLARATION__DEFS:
        setDefs((sigDefinitions)newValue);
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
      case LFPackage.SIGNATURE_DECLARATION__SIG_NAME:
        setSigName(SIG_NAME_EDEFAULT);
        return;
      case LFPackage.SIGNATURE_DECLARATION__DEFS:
        setDefs((sigDefinitions)null);
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
      case LFPackage.SIGNATURE_DECLARATION__SIG_NAME:
        return SIG_NAME_EDEFAULT == null ? sigName != null : !SIG_NAME_EDEFAULT.equals(sigName);
      case LFPackage.SIGNATURE_DECLARATION__DEFS:
        return defs != null;
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
    result.append(" (sigName: ");
    result.append(sigName);
    result.append(')');
    return result.toString();
  }

} //signatureDeclarationImpl
