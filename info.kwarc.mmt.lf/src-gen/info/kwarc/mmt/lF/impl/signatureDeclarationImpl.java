/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.sigDefinitions;
import info.kwarc.mmt.lF.signatureDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>signature Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.impl.signatureDeclarationImpl#getSigName <em>Sig Name</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.signatureDeclarationImpl#getSigDefinitions <em>Sig Definitions</em>}</li>
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
   * The cached value of the '{@link #getSigDefinitions() <em>Sig Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSigDefinitions()
   * @generated
   * @ordered
   */
  protected EList<sigDefinitions> sigDefinitions;

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
  public EList<sigDefinitions> getSigDefinitions()
  {
    if (sigDefinitions == null)
    {
      sigDefinitions = new EObjectContainmentEList<sigDefinitions>(sigDefinitions.class, this, LFPackage.SIGNATURE_DECLARATION__SIG_DEFINITIONS);
    }
    return sigDefinitions;
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
      case LFPackage.SIGNATURE_DECLARATION__SIG_DEFINITIONS:
        return ((InternalEList<?>)getSigDefinitions()).basicRemove(otherEnd, msgs);
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
      case LFPackage.SIGNATURE_DECLARATION__SIG_DEFINITIONS:
        return getSigDefinitions();
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
      case LFPackage.SIGNATURE_DECLARATION__SIG_NAME:
        setSigName((String)newValue);
        return;
      case LFPackage.SIGNATURE_DECLARATION__SIG_DEFINITIONS:
        getSigDefinitions().clear();
        getSigDefinitions().addAll((Collection<? extends sigDefinitions>)newValue);
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
      case LFPackage.SIGNATURE_DECLARATION__SIG_DEFINITIONS:
        getSigDefinitions().clear();
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
      case LFPackage.SIGNATURE_DECLARATION__SIG_DEFINITIONS:
        return sigDefinitions != null && !sigDefinitions.isEmpty();
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
