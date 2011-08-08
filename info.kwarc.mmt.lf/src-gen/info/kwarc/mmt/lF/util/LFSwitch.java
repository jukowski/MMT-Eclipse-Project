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
      case LFPackage.MODEL_CONSTRUCT_NOSP:
      {
        modelConstructNOSP modelConstructNOSP = (modelConstructNOSP)theEObject;
        T result = casemodelConstructNOSP(modelConstructNOSP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.TERM:
      {
        term term = (term)theEObject;
        T result = caseterm(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.TERM_PI:
      {
        termPi termPi = (termPi)theEObject;
        T result = casetermPi(termPi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.TERM_LAMBDA:
      {
        termLambda termLambda = (termLambda)theEObject;
        T result = casetermLambda(termLambda);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.MORPHISM:
      {
        morphism morphism = (morphism)theEObject;
        T result = casemorphism(morphism);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.TERM_DECLARATION:
      {
        termDeclaration termDeclaration = (termDeclaration)theEObject;
        T result = casetermDeclaration(termDeclaration);
        if (result == null) result = caseabbrevTermDeclaration(termDeclaration);
        if (result == null) result = casesigConstructNOSP(termDeclaration);
        if (result == null) result = caseTempType(termDeclaration);
        if (result == null) result = casesigConstruct(termDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.ABBREV_TERM_DECLARATION:
      {
        abbrevTermDeclaration abbrevTermDeclaration = (abbrevTermDeclaration)theEObject;
        T result = caseabbrevTermDeclaration(abbrevTermDeclaration);
        if (result == null) result = casesigConstructNOSP(abbrevTermDeclaration);
        if (result == null) result = caseTempType(abbrevTermDeclaration);
        if (result == null) result = casesigConstruct(abbrevTermDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.NAME_DECLARATION:
      {
        nameDeclaration nameDeclaration = (nameDeclaration)theEObject;
        T result = casenameDeclaration(nameDeclaration);
        if (result == null) result = casesigConstructNOSP(nameDeclaration);
        if (result == null) result = casesigConstruct(nameDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.FIXITY_DECLARATION:
      {
        fixityDeclaration fixityDeclaration = (fixityDeclaration)theEObject;
        T result = casefixityDeclaration(fixityDeclaration);
        if (result == null) result = casesigConstructNOSP(fixityDeclaration);
        if (result == null) result = casesigConstruct(fixityDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.SIG_META_DECLARATION:
      {
        sigMetaDeclaration sigMetaDeclaration = (sigMetaDeclaration)theEObject;
        T result = casesigMetaDeclaration(sigMetaDeclaration);
        if (result == null) result = casesigConstructNOSP(sigMetaDeclaration);
        if (result == null) result = caselinkDeclaration(sigMetaDeclaration);
        if (result == null) result = casesigConstruct(sigMetaDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.SIG_INCLUDE_DECLARATION:
      {
        sigIncludeDeclaration sigIncludeDeclaration = (sigIncludeDeclaration)theEObject;
        T result = casesigIncludeDeclaration(sigIncludeDeclaration);
        if (result == null) result = casesigConstructNOSP(sigIncludeDeclaration);
        if (result == null) result = caselinkDeclaration(sigIncludeDeclaration);
        if (result == null) result = caseTempType(sigIncludeDeclaration);
        if (result == null) result = casesigConstruct(sigIncludeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.STRUCT_DECLARATION:
      {
        structDeclaration structDeclaration = (structDeclaration)theEObject;
        T result = casestructDeclaration(structDeclaration);
        if (result == null) result = casesigConstructNOSP(structDeclaration);
        if (result == null) result = caselinkDeclaration(structDeclaration);
        if (result == null) result = caseTempType(structDeclaration);
        if (result == null) result = casesigConstruct(structDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.INCLUDE_OPS:
      {
        includeOps includeOps = (includeOps)theEObject;
        T result = caseincludeOps(includeOps);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.ALIAS_DECLARATION:
      {
        aliasDeclaration aliasDeclaration = (aliasDeclaration)theEObject;
        T result = casealiasDeclaration(aliasDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.CONSTANT_ASSIGNMENT:
      {
        constantAssignment constantAssignment = (constantAssignment)theEObject;
        T result = caseconstantAssignment(constantAssignment);
        if (result == null) result = caselinkConstruct(constantAssignment);
        if (result == null) result = caseTempType(constantAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.STRUCT_ASSIGNMENT:
      {
        structAssignment structAssignment = (structAssignment)theEObject;
        T result = casestructAssignment(structAssignment);
        if (result == null) result = caselinkConstructNOSP(structAssignment);
        if (result == null) result = caseTempType(structAssignment);
        if (result == null) result = caselinkConstruct(structAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.VIEW_META_DECLARATION:
      {
        viewMetaDeclaration viewMetaDeclaration = (viewMetaDeclaration)theEObject;
        T result = caseviewMetaDeclaration(viewMetaDeclaration);
        if (result == null) result = caselinkConstructNOSP(viewMetaDeclaration);
        if (result == null) result = caselinkConstruct(viewMetaDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.VIEW_INCLUDE_DECLARATION:
      {
        viewIncludeDeclaration viewIncludeDeclaration = (viewIncludeDeclaration)theEObject;
        T result = caseviewIncludeDeclaration(viewIncludeDeclaration);
        if (result == null) result = caselinkConstructNOSP(viewIncludeDeclaration);
        if (result == null) result = caselinkConstruct(viewIncludeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.UNKNOWN_BRACKETS:
      {
        unknownBrackets unknownBrackets = (unknownBrackets)theEObject;
        T result = caseunknownBrackets(unknownBrackets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.ANY_CONSTRUCT:
      {
        anyConstruct anyConstruct = (anyConstruct)theEObject;
        T result = caseanyConstruct(anyConstruct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.UNKNOWN_BODY:
      {
        unknownBody unknownBody = (unknownBody)theEObject;
        T result = caseunknownBody(unknownBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.UNKNOWN_CONSTRUCT:
      {
        unknownConstruct unknownConstruct = (unknownConstruct)theEObject;
        T result = caseunknownConstruct(unknownConstruct);
        if (result == null) result = casesigConstructNOSP(unknownConstruct);
        if (result == null) result = caselinkConstructNOSP(unknownConstruct);
        if (result == null) result = casesigConstruct(unknownConstruct);
        if (result == null) result = caselinkConstruct(unknownConstruct);
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
      case LFPackage.SIG_CONSTRUCT_NOSP:
      {
        sigConstructNOSP sigConstructNOSP = (sigConstructNOSP)theEObject;
        T result = casesigConstructNOSP(sigConstructNOSP);
        if (result == null) result = casesigConstruct(sigConstructNOSP);
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
      case LFPackage.SIG_BODY:
      {
        sigBody sigBody = (sigBody)theEObject;
        T result = casesigBody(sigBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.SIG_DECLARATION:
      {
        sigDeclaration sigDeclaration = (sigDeclaration)theEObject;
        T result = casesigDeclaration(sigDeclaration);
        if (result == null) result = casesigConstructNOSP(sigDeclaration);
        if (result == null) result = caseTempType(sigDeclaration);
        if (result == null) result = casesigConstruct(sigDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.LINK_CONSTRUCT_NOSP:
      {
        linkConstructNOSP linkConstructNOSP = (linkConstructNOSP)theEObject;
        T result = caselinkConstructNOSP(linkConstructNOSP);
        if (result == null) result = caselinkConstruct(linkConstructNOSP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.LINK_CONSTRUCT:
      {
        linkConstruct linkConstruct = (linkConstruct)theEObject;
        T result = caselinkConstruct(linkConstruct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.LINK_BODY:
      {
        linkBody linkBody = (linkBody)theEObject;
        T result = caselinkBody(linkBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.VIEW_DECLARATION:
      {
        viewDeclaration viewDeclaration = (viewDeclaration)theEObject;
        T result = caseviewDeclaration(viewDeclaration);
        if (result == null) result = caselinkDeclaration(viewDeclaration);
        if (result == null) result = caseTempType(viewDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.INTERNAL_VIEW_DECLARATION:
      {
        internalViewDeclaration internalViewDeclaration = (internalViewDeclaration)theEObject;
        T result = caseinternalViewDeclaration(internalViewDeclaration);
        if (result == null) result = casesigConstructNOSP(internalViewDeclaration);
        if (result == null) result = caselinkDeclaration(internalViewDeclaration);
        if (result == null) result = caseTempType(internalViewDeclaration);
        if (result == null) result = casesigConstruct(internalViewDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LFPackage.LINK_DECLARATION:
      {
        linkDeclaration linkDeclaration = (linkDeclaration)theEObject;
        T result = caselinkDeclaration(linkDeclaration);
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
   * Returns the result of interpreting the object as an instance of '<em>model Construct NOSP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>model Construct NOSP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemodelConstructNOSP(modelConstructNOSP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseterm(term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>term Pi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>term Pi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetermPi(termPi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>term Lambda</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>term Lambda</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetermLambda(termLambda object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>morphism</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>morphism</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemorphism(morphism object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>term Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>term Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetermDeclaration(termDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>abbrev Term Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>abbrev Term Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseabbrevTermDeclaration(abbrevTermDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>name Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>name Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenameDeclaration(nameDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fixity Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fixity Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefixityDeclaration(fixityDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sig Meta Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sig Meta Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesigMetaDeclaration(sigMetaDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sig Include Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sig Include Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesigIncludeDeclaration(sigIncludeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>struct Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>struct Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestructDeclaration(structDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>include Ops</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>include Ops</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseincludeOps(includeOps object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>alias Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>alias Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casealiasDeclaration(aliasDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>constant Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constant Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstantAssignment(constantAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>struct Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>struct Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestructAssignment(structAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>view Meta Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>view Meta Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseviewMetaDeclaration(viewMetaDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>view Include Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>view Include Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseviewIncludeDeclaration(viewIncludeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>unknown Brackets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>unknown Brackets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseunknownBrackets(unknownBrackets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>any Construct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>any Construct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseanyConstruct(anyConstruct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>unknown Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>unknown Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseunknownBody(unknownBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>unknown Construct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>unknown Construct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseunknownConstruct(unknownConstruct object)
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
   * Returns the result of interpreting the object as an instance of '<em>sig Construct NOSP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sig Construct NOSP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesigConstructNOSP(sigConstructNOSP object)
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
   * Returns the result of interpreting the object as an instance of '<em>sig Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sig Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesigBody(sigBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sig Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sig Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesigDeclaration(sigDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>link Construct NOSP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>link Construct NOSP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselinkConstructNOSP(linkConstructNOSP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>link Construct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>link Construct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselinkConstruct(linkConstruct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>link Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>link Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselinkBody(linkBody object)
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
   * Returns the result of interpreting the object as an instance of '<em>internal View Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>internal View Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinternalViewDeclaration(internalViewDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>link Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>link Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselinkDeclaration(linkDeclaration object)
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
