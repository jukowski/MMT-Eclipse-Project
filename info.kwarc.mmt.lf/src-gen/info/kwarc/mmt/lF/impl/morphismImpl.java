/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.impl;

import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.linkDeclaration;
import info.kwarc.mmt.lF.morphism;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>morphism</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link info.kwarc.mmt.lF.impl.morphismImpl#getLinkRefs <em>Link Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class morphismImpl extends MinimalEObjectImpl.Container implements morphism
{
  /**
   * The cached value of the '{@link #getLinkRefs() <em>Link Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkRefs()
   * @generated
   * @ordered
   */
  protected EList<linkDeclaration> linkRefs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected morphismImpl()
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
    return LFPackage.Literals.MORPHISM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<linkDeclaration> getLinkRefs()
  {
    if (linkRefs == null)
    {
      linkRefs = new EObjectResolvingEList<linkDeclaration>(linkDeclaration.class, this, LFPackage.MORPHISM__LINK_REFS);
    }
    return linkRefs;
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
      case LFPackage.MORPHISM__LINK_REFS:
        return getLinkRefs();
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
      case LFPackage.MORPHISM__LINK_REFS:
        getLinkRefs().clear();
        getLinkRefs().addAll((Collection<? extends linkDeclaration>)newValue);
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
      case LFPackage.MORPHISM__LINK_REFS:
        getLinkRefs().clear();
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
      case LFPackage.MORPHISM__LINK_REFS:
        return linkRefs != null && !linkRefs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //morphismImpl
