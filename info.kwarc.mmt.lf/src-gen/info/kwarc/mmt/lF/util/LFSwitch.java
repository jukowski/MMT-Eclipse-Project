/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.util;

import info.kwarc.mmt.lF.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see info.kwarc.mmt.lF.LFPackage
 * @generated
 */
public class LFSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LFPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LFSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LFPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LFPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.JUSTSPACE:
      {
        JUSTSPACE justspace = (JUSTSPACE)theEObject;
        T result = caseJUSTSPACE(justspace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.NAMESPACE_DECLARATION:
      {
        namespaceDeclaration namespaceDeclaration = (namespaceDeclaration)theEObject;
        T result = casenamespaceDeclaration(namespaceDeclaration);
        if (result == null) result = caseTempType(namespaceDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.READ_DECLARATION:
      {
        readDeclaration readDeclaration = (readDeclaration)theEObject;
        T result = casereadDeclaration(readDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.SIGNATURE_DECLARATION:
      {
        signatureDeclaration signatureDeclaration = (signatureDeclaration)theEObject;
        T result = casesignatureDeclaration(signatureDeclaration);
        if (result == null) result = caseTempType(signatureDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.SIG_DEFINITIONS:
      {
        sigDefinitions sigDefinitions = (sigDefinitions)theEObject;
        T result = casesigDefinitions(sigDefinitions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.SIG_CONSTRUCT:
      {
        sigConstruct sigConstruct = (sigConstruct)theEObject;
        T result = casesigConstruct(sigConstruct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.TEMP_TYPE:
      {
        TempType tempType = (TempType)theEObject;
        T result = caseTempType(tempType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.VIEW_DECLARATION:
      {
        viewDeclaration viewDeclaration = (viewDeclaration)theEObject;
        T result = caseviewDeclaration(viewDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JUSTSPACE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JUSTSPACE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJUSTSPACE(JUSTSPACE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>namespace Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>namespace Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenamespaceDeclaration(namespaceDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>read Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>read Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casereadDeclaration(readDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>signature Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>signature Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesignatureDeclaration(signatureDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sig Definitions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sig Definitions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesigDefinitions(sigDefinitions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sig Construct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sig Construct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesigConstruct(sigConstruct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Temp Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Temp Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTempType(TempType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>view Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>view Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseviewDeclaration(viewDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LFSwitch
