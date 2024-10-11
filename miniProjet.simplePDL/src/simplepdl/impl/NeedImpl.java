/**
 */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import simplepdl.Need;
import simplepdl.Ressource;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.NeedImpl#getWorkdefinition <em>Workdefinition</em>}</li>
 *   <li>{@link simplepdl.impl.NeedImpl#getRessource <em>Ressource</em>}</li>
 *   <li>{@link simplepdl.impl.NeedImpl#getQuantityNeeded <em>Quantity Needed</em>}</li>
 *   <li>{@link simplepdl.impl.NeedImpl#isUsed <em>Used</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeedImpl extends MinimalEObjectImpl.Container implements Need {
	/**
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected Ressource ressource;

	/**
	 * The default value of the '{@link #getQuantityNeeded() <em>Quantity Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityNeeded()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_NEEDED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantityNeeded() <em>Quantity Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityNeeded()
	 * @generated
	 * @ordered
	 */
	protected int quantityNeeded = QUANTITY_NEEDED_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsed() <em>Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsed() <em>Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsed()
	 * @generated
	 * @ordered
	 */
	protected boolean used = USED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.NEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkDefinition getWorkdefinition() {
		if (eContainerFeatureID() != SimplepdlPackage.NEED__WORKDEFINITION) return null;
		return (WorkDefinition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkdefinition(WorkDefinition newWorkdefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWorkdefinition, SimplepdlPackage.NEED__WORKDEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkdefinition(WorkDefinition newWorkdefinition) {
		if (newWorkdefinition != eInternalContainer() || (eContainerFeatureID() != SimplepdlPackage.NEED__WORKDEFINITION && newWorkdefinition != null)) {
			if (EcoreUtil.isAncestor(this, newWorkdefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorkdefinition != null)
				msgs = ((InternalEObject)newWorkdefinition).eInverseAdd(this, SimplepdlPackage.WORK_DEFINITION__NEED, WorkDefinition.class, msgs);
			msgs = basicSetWorkdefinition(newWorkdefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.NEED__WORKDEFINITION, newWorkdefinition, newWorkdefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ressource getRessource() {
		if (ressource != null && ressource.eIsProxy()) {
			InternalEObject oldRessource = (InternalEObject)ressource;
			ressource = (Ressource)eResolveProxy(oldRessource);
			if (ressource != oldRessource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.NEED__RESSOURCE, oldRessource, ressource));
			}
		}
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource basicGetRessource() {
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRessource(Ressource newRessource) {
		Ressource oldRessource = ressource;
		ressource = newRessource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.NEED__RESSOURCE, oldRessource, ressource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQuantityNeeded() {
		return quantityNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityNeeded(int newQuantityNeeded) {
		int oldQuantityNeeded = quantityNeeded;
		quantityNeeded = newQuantityNeeded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.NEED__QUANTITY_NEEDED, oldQuantityNeeded, quantityNeeded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUsed() {
		return used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsed(boolean newUsed) {
		boolean oldUsed = used;
		used = newUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.NEED__USED, oldUsed, used));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.NEED__WORKDEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWorkdefinition((WorkDefinition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.NEED__WORKDEFINITION:
				return basicSetWorkdefinition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SimplepdlPackage.NEED__WORKDEFINITION:
				return eInternalContainer().eInverseRemove(this, SimplepdlPackage.WORK_DEFINITION__NEED, WorkDefinition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.NEED__WORKDEFINITION:
				return getWorkdefinition();
			case SimplepdlPackage.NEED__RESSOURCE:
				if (resolve) return getRessource();
				return basicGetRessource();
			case SimplepdlPackage.NEED__QUANTITY_NEEDED:
				return getQuantityNeeded();
			case SimplepdlPackage.NEED__USED:
				return isUsed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplepdlPackage.NEED__WORKDEFINITION:
				setWorkdefinition((WorkDefinition)newValue);
				return;
			case SimplepdlPackage.NEED__RESSOURCE:
				setRessource((Ressource)newValue);
				return;
			case SimplepdlPackage.NEED__QUANTITY_NEEDED:
				setQuantityNeeded((Integer)newValue);
				return;
			case SimplepdlPackage.NEED__USED:
				setUsed((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.NEED__WORKDEFINITION:
				setWorkdefinition((WorkDefinition)null);
				return;
			case SimplepdlPackage.NEED__RESSOURCE:
				setRessource((Ressource)null);
				return;
			case SimplepdlPackage.NEED__QUANTITY_NEEDED:
				setQuantityNeeded(QUANTITY_NEEDED_EDEFAULT);
				return;
			case SimplepdlPackage.NEED__USED:
				setUsed(USED_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.NEED__WORKDEFINITION:
				return getWorkdefinition() != null;
			case SimplepdlPackage.NEED__RESSOURCE:
				return ressource != null;
			case SimplepdlPackage.NEED__QUANTITY_NEEDED:
				return quantityNeeded != QUANTITY_NEEDED_EDEFAULT;
			case SimplepdlPackage.NEED__USED:
				return used != USED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (quantityNeeded: ");
		result.append(quantityNeeded);
		result.append(", used: ");
		result.append(used);
		result.append(')');
		return result.toString();
	}

} //NeedImpl
