/**
 */
package edu.cmu.sei.annex.dmpl.dmpl.impl;

import edu.cmu.sei.annex.dmpl.dmpl.DmplPackage;
import edu.cmu.sei.annex.dmpl.dmpl.Type;
import edu.cmu.sei.annex.dmpl.dmpl.VarAsgnList;
import edu.cmu.sei.annex.dmpl.dmpl.VarInit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.cmu.sei.annex.dmpl.dmpl.impl.VarInitImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.cmu.sei.annex.dmpl.dmpl.impl.VarInitImpl#getVarAsgnList <em>Var Asgn List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarInitImpl extends MinimalEObjectImpl.Container implements VarInit
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getVarAsgnList() <em>Var Asgn List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarAsgnList()
   * @generated
   * @ordered
   */
  protected VarAsgnList varAsgnList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarInitImpl()
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
    return DmplPackage.Literals.VAR_INIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmplPackage.VAR_INIT__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmplPackage.VAR_INIT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmplPackage.VAR_INIT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmplPackage.VAR_INIT__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarAsgnList getVarAsgnList()
  {
    return varAsgnList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarAsgnList(VarAsgnList newVarAsgnList, NotificationChain msgs)
  {
    VarAsgnList oldVarAsgnList = varAsgnList;
    varAsgnList = newVarAsgnList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmplPackage.VAR_INIT__VAR_ASGN_LIST, oldVarAsgnList, newVarAsgnList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarAsgnList(VarAsgnList newVarAsgnList)
  {
    if (newVarAsgnList != varAsgnList)
    {
      NotificationChain msgs = null;
      if (varAsgnList != null)
        msgs = ((InternalEObject)varAsgnList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmplPackage.VAR_INIT__VAR_ASGN_LIST, null, msgs);
      if (newVarAsgnList != null)
        msgs = ((InternalEObject)newVarAsgnList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmplPackage.VAR_INIT__VAR_ASGN_LIST, null, msgs);
      msgs = basicSetVarAsgnList(newVarAsgnList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmplPackage.VAR_INIT__VAR_ASGN_LIST, newVarAsgnList, newVarAsgnList));
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
      case DmplPackage.VAR_INIT__TYPE:
        return basicSetType(null, msgs);
      case DmplPackage.VAR_INIT__VAR_ASGN_LIST:
        return basicSetVarAsgnList(null, msgs);
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
      case DmplPackage.VAR_INIT__TYPE:
        return getType();
      case DmplPackage.VAR_INIT__VAR_ASGN_LIST:
        return getVarAsgnList();
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
      case DmplPackage.VAR_INIT__TYPE:
        setType((Type)newValue);
        return;
      case DmplPackage.VAR_INIT__VAR_ASGN_LIST:
        setVarAsgnList((VarAsgnList)newValue);
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
      case DmplPackage.VAR_INIT__TYPE:
        setType((Type)null);
        return;
      case DmplPackage.VAR_INIT__VAR_ASGN_LIST:
        setVarAsgnList((VarAsgnList)null);
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
      case DmplPackage.VAR_INIT__TYPE:
        return type != null;
      case DmplPackage.VAR_INIT__VAR_ASGN_LIST:
        return varAsgnList != null;
    }
    return super.eIsSet(featureID);
  }

} //VarInitImpl
