/**
 * <copyright>
 * </copyright>
 *
 */
package info.kwarc.mmt.lF.util;

import info.kwarc.mmt.lF.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see info.kwarc.mmt.lF.LFPackage
 * @generated
 */
public class LFAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LFPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LFAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LFPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LFSwitch<Adapter> modelSwitch =
    new LFSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casemodelConstructNOSP(modelConstructNOSP object)
      {
        return createmodelConstructNOSPAdapter();
      }
      @Override
      public Adapter caseterm(term object)
      {
        return createtermAdapter();
      }
      @Override
      public Adapter casetermPi(termPi object)
      {
        return createtermPiAdapter();
      }
      @Override
      public Adapter casetermLambda(termLambda object)
      {
        return createtermLambdaAdapter();
      }
      @Override
      public Adapter casemorphism(morphism object)
      {
        return createmorphismAdapter();
      }
      @Override
      public Adapter casetermDeclaration(termDeclaration object)
      {
        return createtermDeclarationAdapter();
      }
      @Override
      public Adapter caseabbrevTermDeclaration(abbrevTermDeclaration object)
      {
        return createabbrevTermDeclarationAdapter();
      }
      @Override
      public Adapter casenameDeclaration(nameDeclaration object)
      {
        return createnameDeclarationAdapter();
      }
      @Override
      public Adapter casefixityDeclaration(fixityDeclaration object)
      {
        return createfixityDeclarationAdapter();
      }
      @Override
      public Adapter casesigMetaDeclaration(sigMetaDeclaration object)
      {
        return createsigMetaDeclarationAdapter();
      }
      @Override
      public Adapter casesigIncludeDeclaration(sigIncludeDeclaration object)
      {
        return createsigIncludeDeclarationAdapter();
      }
      @Override
      public Adapter casestructDeclaration(structDeclaration object)
      {
        return createstructDeclarationAdapter();
      }
      @Override
      public Adapter caseincludeOps(includeOps object)
      {
        return createincludeOpsAdapter();
      }
      @Override
      public Adapter casealiasDeclaration(aliasDeclaration object)
      {
        return createaliasDeclarationAdapter();
      }
      @Override
      public Adapter caseconstantAssignment(constantAssignment object)
      {
        return createconstantAssignmentAdapter();
      }
      @Override
      public Adapter casestructAssignment(structAssignment object)
      {
        return createstructAssignmentAdapter();
      }
      @Override
      public Adapter caseviewMetaDeclaration(viewMetaDeclaration object)
      {
        return createviewMetaDeclarationAdapter();
      }
      @Override
      public Adapter caseviewIncludeDeclaration(viewIncludeDeclaration object)
      {
        return createviewIncludeDeclarationAdapter();
      }
      @Override
      public Adapter caseunknownBrackets(unknownBrackets object)
      {
        return createunknownBracketsAdapter();
      }
      @Override
      public Adapter caseanyConstruct(anyConstruct object)
      {
        return createanyConstructAdapter();
      }
      @Override
      public Adapter caseunknownBody(unknownBody object)
      {
        return createunknownBodyAdapter();
      }
      @Override
      public Adapter caseunknownConstruct(unknownConstruct object)
      {
        return createunknownConstructAdapter();
      }
      @Override
      public Adapter casenamespaceDeclaration(namespaceDeclaration object)
      {
        return createnamespaceDeclarationAdapter();
      }
      @Override
      public Adapter casereadDeclaration(readDeclaration object)
      {
        return createreadDeclarationAdapter();
      }
      @Override
      public Adapter casesigConstructNOSP(sigConstructNOSP object)
      {
        return createsigConstructNOSPAdapter();
      }
      @Override
      public Adapter casesigConstruct(sigConstruct object)
      {
        return createsigConstructAdapter();
      }
      @Override
      public Adapter casesigBody(sigBody object)
      {
        return createsigBodyAdapter();
      }
      @Override
      public Adapter casesigDeclaration(sigDeclaration object)
      {
        return createsigDeclarationAdapter();
      }
      @Override
      public Adapter caselinkConstructNOSP(linkConstructNOSP object)
      {
        return createlinkConstructNOSPAdapter();
      }
      @Override
      public Adapter caselinkConstruct(linkConstruct object)
      {
        return createlinkConstructAdapter();
      }
      @Override
      public Adapter caselinkBody(linkBody object)
      {
        return createlinkBodyAdapter();
      }
      @Override
      public Adapter caseviewDeclaration(viewDeclaration object)
      {
        return createviewDeclarationAdapter();
      }
      @Override
      public Adapter caseinternalViewDeclaration(internalViewDeclaration object)
      {
        return createinternalViewDeclarationAdapter();
      }
      @Override
      public Adapter caselinkDeclaration(linkDeclaration object)
      {
        return createlinkDeclarationAdapter();
      }
      @Override
      public Adapter caseTempType(TempType object)
      {
        return createTempTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.modelConstructNOSP <em>model Construct NOSP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.modelConstructNOSP
   * @generated
   */
  public Adapter createmodelConstructNOSPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.term <em>term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.term
   * @generated
   */
  public Adapter createtermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.termPi <em>term Pi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.termPi
   * @generated
   */
  public Adapter createtermPiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.termLambda <em>term Lambda</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.termLambda
   * @generated
   */
  public Adapter createtermLambdaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.morphism <em>morphism</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.morphism
   * @generated
   */
  public Adapter createmorphismAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.termDeclaration <em>term Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.termDeclaration
   * @generated
   */
  public Adapter createtermDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.abbrevTermDeclaration <em>abbrev Term Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.abbrevTermDeclaration
   * @generated
   */
  public Adapter createabbrevTermDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.nameDeclaration <em>name Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.nameDeclaration
   * @generated
   */
  public Adapter createnameDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.fixityDeclaration <em>fixity Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.fixityDeclaration
   * @generated
   */
  public Adapter createfixityDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.sigMetaDeclaration <em>sig Meta Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.sigMetaDeclaration
   * @generated
   */
  public Adapter createsigMetaDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.sigIncludeDeclaration <em>sig Include Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.sigIncludeDeclaration
   * @generated
   */
  public Adapter createsigIncludeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.structDeclaration <em>struct Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.structDeclaration
   * @generated
   */
  public Adapter createstructDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.includeOps <em>include Ops</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.includeOps
   * @generated
   */
  public Adapter createincludeOpsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.aliasDeclaration <em>alias Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.aliasDeclaration
   * @generated
   */
  public Adapter createaliasDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.constantAssignment <em>constant Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.constantAssignment
   * @generated
   */
  public Adapter createconstantAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.structAssignment <em>struct Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.structAssignment
   * @generated
   */
  public Adapter createstructAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.viewMetaDeclaration <em>view Meta Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.viewMetaDeclaration
   * @generated
   */
  public Adapter createviewMetaDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.viewIncludeDeclaration <em>view Include Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.viewIncludeDeclaration
   * @generated
   */
  public Adapter createviewIncludeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.unknownBrackets <em>unknown Brackets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.unknownBrackets
   * @generated
   */
  public Adapter createunknownBracketsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.anyConstruct <em>any Construct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.anyConstruct
   * @generated
   */
  public Adapter createanyConstructAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.unknownBody <em>unknown Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.unknownBody
   * @generated
   */
  public Adapter createunknownBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.unknownConstruct <em>unknown Construct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.unknownConstruct
   * @generated
   */
  public Adapter createunknownConstructAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.namespaceDeclaration <em>namespace Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.namespaceDeclaration
   * @generated
   */
  public Adapter createnamespaceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.readDeclaration <em>read Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.readDeclaration
   * @generated
   */
  public Adapter createreadDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.sigConstructNOSP <em>sig Construct NOSP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.sigConstructNOSP
   * @generated
   */
  public Adapter createsigConstructNOSPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.sigConstruct <em>sig Construct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.sigConstruct
   * @generated
   */
  public Adapter createsigConstructAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.sigBody <em>sig Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.sigBody
   * @generated
   */
  public Adapter createsigBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.sigDeclaration <em>sig Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.sigDeclaration
   * @generated
   */
  public Adapter createsigDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.linkConstructNOSP <em>link Construct NOSP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.linkConstructNOSP
   * @generated
   */
  public Adapter createlinkConstructNOSPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.linkConstruct <em>link Construct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.linkConstruct
   * @generated
   */
  public Adapter createlinkConstructAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.linkBody <em>link Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.linkBody
   * @generated
   */
  public Adapter createlinkBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.viewDeclaration <em>view Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.viewDeclaration
   * @generated
   */
  public Adapter createviewDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.internalViewDeclaration <em>internal View Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.internalViewDeclaration
   * @generated
   */
  public Adapter createinternalViewDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.linkDeclaration <em>link Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.linkDeclaration
   * @generated
   */
  public Adapter createlinkDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link info.kwarc.mmt.lF.TempType <em>Temp Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see info.kwarc.mmt.lF.TempType
   * @generated
   */
  public Adapter createTempTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LFAdapterFactory
