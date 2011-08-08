/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.impl.ModelImpl#getConstructs <em>Constructs</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.ModelImpl#getNotInDocument <em>Not In Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getConstructs() <em>Constructs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructs()
   * @generated
   * @ordered
   */
  protected EList<EObject> constructs;

  /**
   * The cached value of the '{@link #getNotInDocument() <em>Not In Document</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotInDocument()
   * @generated
   * @ordered
   */
  protected EList<String> notInDocument;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return LFPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getConstructs()
  {
    if (constructs == null)
    {
      constructs = new EObjectContainmentEList<EObject>(EObject.class, this, LFPackage.MODEL__CONSTRUCTS);
    }
    return constructs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNotInDocument()
  {
    if (notInDocument == null)
    {
      notInDocument = new EDataTypeEList<String>(String.class, this, LFPackage.MODEL__NOT_IN_DOCUMENT);
    }
    return notInDocument;
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
      case LFPackage.MODEL__CONSTRUCTS:
        return ((InternalEList<?>)getConstructs()).basicRemove(otherEnd, msgs);
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
      case LFPackage.MODEL__CONSTRUCTS:
        return getConstructs();
      case LFPackage.MODEL__NOT_IN_DOCUMENT:
        return getNotInDocument();
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
      case LFPackage.MODEL__CONSTRUCTS:
        getConstructs().clear();
        getConstructs().addAll((Collection<? extends EObject>)newValue);
        return;
      case LFPackage.MODEL__NOT_IN_DOCUMENT:
        getNotInDocument().clear();
        getNotInDocument().addAll((Collection<? extends String>)newValue);
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
      case LFPackage.MODEL__CONSTRUCTS:
        getConstructs().clear();
        return;
      case LFPackage.MODEL__NOT_IN_DOCUMENT:
        getNotInDocument().clear();
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
      case LFPackage.MODEL__CONSTRUCTS:
        return constructs != null && !constructs.isEmpty();
      case LFPackage.MODEL__NOT_IN_DOCUMENT:
        return notInDocument != null && !notInDocument.isEmpty();
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
    result.append(" (notInDocument: ");
    result.append(notInDocument);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
