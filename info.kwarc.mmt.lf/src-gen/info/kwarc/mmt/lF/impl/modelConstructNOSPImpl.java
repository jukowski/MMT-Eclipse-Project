/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.modelConstructNOSP;
import info.kwarc.mmt.lF.namespaceDeclaration;
import info.kwarc.mmt.lF.readDeclaration;
import info.kwarc.mmt.lF.sigConstructNOSP;
import info.kwarc.mmt.lF.sigDeclaration;
import info.kwarc.mmt.lF.viewDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>model Construct NOSP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.impl.modelConstructNOSPImpl#getNamespaceDeclarations <em>Namespace Declarations</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.modelConstructNOSPImpl#getReadDeclarations <em>Read Declarations</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.modelConstructNOSPImpl#getSigDeclarations <em>Sig Declarations</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.modelConstructNOSPImpl#getViewDeclarations <em>View Declarations</em>}</li>
 *   <li>{@link info.kwarc.mmt.lF.impl.modelConstructNOSPImpl#getRawDeclarations <em>Raw Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class modelConstructNOSPImpl extends MinimalEObjectImpl.Container implements modelConstructNOSP
{
  /**
   * The cached value of the '{@link #getNamespaceDeclarations() <em>Namespace Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespaceDeclarations()
   * @generated
   * @ordered
   */
  protected EList<namespaceDeclaration> namespaceDeclarations;

  /**
   * The cached value of the '{@link #getReadDeclarations() <em>Read Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadDeclarations()
   * @generated
   * @ordered
   */
  protected EList<readDeclaration> readDeclarations;

  /**
   * The cached value of the '{@link #getSigDeclarations() <em>Sig Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSigDeclarations()
   * @generated
   * @ordered
   */
  protected EList<sigDeclaration> sigDeclarations;

  /**
   * The cached value of the '{@link #getViewDeclarations() <em>View Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewDeclarations()
   * @generated
   * @ordered
   */
  protected EList<viewDeclaration> viewDeclarations;

  /**
   * The cached value of the '{@link #getRawDeclarations() <em>Raw Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRawDeclarations()
   * @generated
   * @ordered
   */
  protected EList<sigConstructNOSP> rawDeclarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected modelConstructNOSPImpl()
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
    return LFPackage.Literals.MODEL_CONSTRUCT_NOSP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<namespaceDeclaration> getNamespaceDeclarations()
  {
    if (namespaceDeclarations == null)
    {
      namespaceDeclarations = new EObjectContainmentEList<namespaceDeclaration>(namespaceDeclaration.class, this, LFPackage.MODEL_CONSTRUCT_NOSP__NAMESPACE_DECLARATIONS);
    }
    return namespaceDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<readDeclaration> getReadDeclarations()
  {
    if (readDeclarations == null)
    {
      readDeclarations = new EObjectContainmentEList<readDeclaration>(readDeclaration.class, this, LFPackage.MODEL_CONSTRUCT_NOSP__READ_DECLARATIONS);
    }
    return readDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<sigDeclaration> getSigDeclarations()
  {
    if (sigDeclarations == null)
    {
      sigDeclarations = new EObjectContainmentEList<sigDeclaration>(sigDeclaration.class, this, LFPackage.MODEL_CONSTRUCT_NOSP__SIG_DECLARATIONS);
    }
    return sigDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<viewDeclaration> getViewDeclarations()
  {
    if (viewDeclarations == null)
    {
      viewDeclarations = new EObjectContainmentEList<viewDeclaration>(viewDeclaration.class, this, LFPackage.MODEL_CONSTRUCT_NOSP__VIEW_DECLARATIONS);
    }
    return viewDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<sigConstructNOSP> getRawDeclarations()
  {
    if (rawDeclarations == null)
    {
      rawDeclarations = new EObjectContainmentEList<sigConstructNOSP>(sigConstructNOSP.class, this, LFPackage.MODEL_CONSTRUCT_NOSP__RAW_DECLARATIONS);
    }
    return rawDeclarations;
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
      case LFPackage.MODEL_CONSTRUCT_NOSP__NAMESPACE_DECLARATIONS:
        return ((InternalEList<?>)getNamespaceDeclarations()).basicRemove(otherEnd, msgs);
      case LFPackage.MODEL_CONSTRUCT_NOSP__READ_DECLARATIONS:
        return ((InternalEList<?>)getReadDeclarations()).basicRemove(otherEnd, msgs);
      case LFPackage.MODEL_CONSTRUCT_NOSP__SIG_DECLARATIONS:
        return ((InternalEList<?>)getSigDeclarations()).basicRemove(otherEnd, msgs);
      case LFPackage.MODEL_CONSTRUCT_NOSP__VIEW_DECLARATIONS:
        return ((InternalEList<?>)getViewDeclarations()).basicRemove(otherEnd, msgs);
      case LFPackage.MODEL_CONSTRUCT_NOSP__RAW_DECLARATIONS:
        return ((InternalEList<?>)getRawDeclarations()).basicRemove(otherEnd, msgs);
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
      case LFPackage.MODEL_CONSTRUCT_NOSP__NAMESPACE_DECLARATIONS:
        return getNamespaceDeclarations();
      case LFPackage.MODEL_CONSTRUCT_NOSP__READ_DECLARATIONS:
        return getReadDeclarations();
      case LFPackage.MODEL_CONSTRUCT_NOSP__SIG_DECLARATIONS:
        return getSigDeclarations();
      case LFPackage.MODEL_CONSTRUCT_NOSP__VIEW_DECLARATIONS:
        return getViewDeclarations();
      case LFPackage.MODEL_CONSTRUCT_NOSP__RAW_DECLARATIONS:
        return getRawDeclarations();
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
      case LFPackage.MODEL_CONSTRUCT_NOSP__NAMESPACE_DECLARATIONS:
        getNamespaceDeclarations().clear();
        getNamespaceDeclarations().addAll((Collection<? extends namespaceDeclaration>)newValue);
        return;
      case LFPackage.MODEL_CONSTRUCT_NOSP__READ_DECLARATIONS:
        getReadDeclarations().clear();
        getReadDeclarations().addAll((Collection<? extends readDeclaration>)newValue);
        return;
      case LFPackage.MODEL_CONSTRUCT_NOSP__SIG_DECLARATIONS:
        getSigDeclarations().clear();
        getSigDeclarations().addAll((Collection<? extends sigDeclaration>)newValue);
        return;
      case LFPackage.MODEL_CONSTRUCT_NOSP__VIEW_DECLARATIONS:
        getViewDeclarations().clear();
        getViewDeclarations().addAll((Collection<? extends viewDeclaration>)newValue);
        return;
      case LFPackage.MODEL_CONSTRUCT_NOSP__RAW_DECLARATIONS:
        getRawDeclarations().clear();
        getRawDeclarations().addAll((Collection<? extends sigConstructNOSP>)newValue);
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
      case LFPackage.MODEL_CONSTRUCT_NOSP__NAMESPACE_DECLARATIONS:
        getNamespaceDeclarations().clear();
        return;
      case LFPackage.MODEL_CONSTRUCT_NOSP__READ_DECLARATIONS:
        getReadDeclarations().clear();
        return;
      case LFPackage.MODEL_CONSTRUCT_NOSP__SIG_DECLARATIONS:
        getSigDeclarations().clear();
        return;
      case LFPackage.MODEL_CONSTRUCT_NOSP__VIEW_DECLARATIONS:
        getViewDeclarations().clear();
        return;
      case LFPackage.MODEL_CONSTRUCT_NOSP__RAW_DECLARATIONS:
        getRawDeclarations().clear();
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
      case LFPackage.MODEL_CONSTRUCT_NOSP__NAMESPACE_DECLARATIONS:
        return namespaceDeclarations != null && !namespaceDeclarations.isEmpty();
      case LFPackage.MODEL_CONSTRUCT_NOSP__READ_DECLARATIONS:
        return readDeclarations != null && !readDeclarations.isEmpty();
      case LFPackage.MODEL_CONSTRUCT_NOSP__SIG_DECLARATIONS:
        return sigDeclarations != null && !sigDeclarations.isEmpty();
      case LFPackage.MODEL_CONSTRUCT_NOSP__VIEW_DECLARATIONS:
        return viewDeclarations != null && !viewDeclarations.isEmpty();
      case LFPackage.MODEL_CONSTRUCT_NOSP__RAW_DECLARATIONS:
        return rawDeclarations != null && !rawDeclarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //modelConstructNOSPImpl
