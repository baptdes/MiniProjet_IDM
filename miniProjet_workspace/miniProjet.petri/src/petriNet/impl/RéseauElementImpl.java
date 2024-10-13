/**
 */
package petriNet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import petriNet.PetriNetPackage;
import petriNet.Réseau;
import petriNet.RéseauElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Réseau Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petriNet.impl.RéseauElementImpl#getReseau <em>Reseau</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RéseauElementImpl extends MinimalEObjectImpl.Container implements RéseauElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RéseauElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.RÉSEAU_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Réseau getReseau() {
		if (eContainerFeatureID() != PetriNetPackage.RÉSEAU_ELEMENT__RESEAU) return null;
		return (Réseau)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReseau(Réseau newReseau, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReseau, PetriNetPackage.RÉSEAU_ELEMENT__RESEAU, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReseau(Réseau newReseau) {
		if (newReseau != eInternalContainer() || (eContainerFeatureID() != PetriNetPackage.RÉSEAU_ELEMENT__RESEAU && newReseau != null)) {
			if (EcoreUtil.isAncestor(this, newReseau))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReseau != null)
				msgs = ((InternalEObject)newReseau).eInverseAdd(this, PetriNetPackage.RÉSEAU__RESEAU_ELEMENTS, Réseau.class, msgs);
			msgs = basicSetReseau(newReseau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.RÉSEAU_ELEMENT__RESEAU, newReseau, newReseau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.RÉSEAU_ELEMENT__RESEAU:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReseau((Réseau)otherEnd, msgs);
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
			case PetriNetPackage.RÉSEAU_ELEMENT__RESEAU:
				return basicSetReseau(null, msgs);
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
			case PetriNetPackage.RÉSEAU_ELEMENT__RESEAU:
				return eInternalContainer().eInverseRemove(this, PetriNetPackage.RÉSEAU__RESEAU_ELEMENTS, Réseau.class, msgs);
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
			case PetriNetPackage.RÉSEAU_ELEMENT__RESEAU:
				return getReseau();
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
			case PetriNetPackage.RÉSEAU_ELEMENT__RESEAU:
				setReseau((Réseau)newValue);
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
			case PetriNetPackage.RÉSEAU_ELEMENT__RESEAU:
				setReseau((Réseau)null);
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
			case PetriNetPackage.RÉSEAU_ELEMENT__RESEAU:
				return getReseau() != null;
		}
		return super.eIsSet(featureID);
	}

} //RéseauElementImpl
