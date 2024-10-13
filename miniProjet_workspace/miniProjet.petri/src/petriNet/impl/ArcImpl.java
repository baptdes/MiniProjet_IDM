/**
 */
package petriNet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petriNet.Arc;
import petriNet.PetriNetPackage;
import petriNet.Place;
import petriNet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petriNet.impl.ArcImpl#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#isIsReadArc <em>Is Read Arc</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#isPlaceToTransition <em>Place To Transition</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getNbTransfered <em>Nb Transfered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArcImpl extends RéseauElementImpl implements Arc {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsReadArc() <em>Is Read Arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadArc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ARC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadArc() <em>Is Read Arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadArc()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadArc = IS_READ_ARC_EDEFAULT;

	/**
	 * The default value of the '{@link #isPlaceToTransition() <em>Place To Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlaceToTransition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PLACE_TO_TRANSITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPlaceToTransition() <em>Place To Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlaceToTransition()
	 * @generated
	 * @ordered
	 */
	protected boolean placeToTransition = PLACE_TO_TRANSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected Place place;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition transition;

	/**
	 * The default value of the '{@link #getNbTransfered() <em>Nb Transfered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbTransfered()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_TRANSFERED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbTransfered() <em>Nb Transfered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbTransfered()
	 * @generated
	 * @ordered
	 */
	protected int nbTransfered = NB_TRANSFERED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsReadArc() {
		return isReadArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsReadArc(boolean newIsReadArc) {
		boolean oldIsReadArc = isReadArc;
		isReadArc = newIsReadArc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__IS_READ_ARC, oldIsReadArc, isReadArc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPlaceToTransition() {
		return placeToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlaceToTransition(boolean newPlaceToTransition) {
		boolean oldPlaceToTransition = placeToTransition;
		placeToTransition = newPlaceToTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__PLACE_TO_TRANSITION, oldPlaceToTransition, placeToTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Place getPlace() {
		if (place != null && place.eIsProxy()) {
			InternalEObject oldPlace = (InternalEObject)place;
			place = (Place)eResolveProxy(oldPlace);
			if (place != oldPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.ARC__PLACE, oldPlace, place));
			}
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlace(Place newPlace, NotificationChain msgs) {
		Place oldPlace = place;
		place = newPlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__PLACE, oldPlace, newPlace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlace(Place newPlace) {
		if (newPlace != place) {
			NotificationChain msgs = null;
			if (place != null)
				msgs = ((InternalEObject)place).eInverseRemove(this, PetriNetPackage.PLACE__ARCS, Place.class, msgs);
			if (newPlace != null)
				msgs = ((InternalEObject)newPlace).eInverseAdd(this, PetriNetPackage.PLACE__ARCS, Place.class, msgs);
			msgs = basicSetPlace(newPlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__PLACE, newPlace, newPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition getTransition() {
		if (transition != null && transition.eIsProxy()) {
			InternalEObject oldTransition = (InternalEObject)transition;
			transition = (Transition)eResolveProxy(oldTransition);
			if (transition != oldTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.ARC__TRANSITION, oldTransition, transition));
			}
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransition(Transition newTransition, NotificationChain msgs) {
		Transition oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__TRANSITION, oldTransition, newTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransition(Transition newTransition) {
		if (newTransition != transition) {
			NotificationChain msgs = null;
			if (transition != null)
				msgs = ((InternalEObject)transition).eInverseRemove(this, PetriNetPackage.TRANSITION__ARCS, Transition.class, msgs);
			if (newTransition != null)
				msgs = ((InternalEObject)newTransition).eInverseAdd(this, PetriNetPackage.TRANSITION__ARCS, Transition.class, msgs);
			msgs = basicSetTransition(newTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__TRANSITION, newTransition, newTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNbTransfered() {
		return nbTransfered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNbTransfered(int newNbTransfered) {
		int oldNbTransfered = nbTransfered;
		nbTransfered = newNbTransfered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__NB_TRANSFERED, oldNbTransfered, nbTransfered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.ARC__PLACE:
				if (place != null)
					msgs = ((InternalEObject)place).eInverseRemove(this, PetriNetPackage.PLACE__ARCS, Place.class, msgs);
				return basicSetPlace((Place)otherEnd, msgs);
			case PetriNetPackage.ARC__TRANSITION:
				if (transition != null)
					msgs = ((InternalEObject)transition).eInverseRemove(this, PetriNetPackage.TRANSITION__ARCS, Transition.class, msgs);
				return basicSetTransition((Transition)otherEnd, msgs);
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
			case PetriNetPackage.ARC__PLACE:
				return basicSetPlace(null, msgs);
			case PetriNetPackage.ARC__TRANSITION:
				return basicSetTransition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetriNetPackage.ARC__NAME:
				return getName();
			case PetriNetPackage.ARC__IS_READ_ARC:
				return isIsReadArc();
			case PetriNetPackage.ARC__PLACE_TO_TRANSITION:
				return isPlaceToTransition();
			case PetriNetPackage.ARC__PLACE:
				if (resolve) return getPlace();
				return basicGetPlace();
			case PetriNetPackage.ARC__TRANSITION:
				if (resolve) return getTransition();
				return basicGetTransition();
			case PetriNetPackage.ARC__NB_TRANSFERED:
				return getNbTransfered();
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
			case PetriNetPackage.ARC__NAME:
				setName((String)newValue);
				return;
			case PetriNetPackage.ARC__IS_READ_ARC:
				setIsReadArc((Boolean)newValue);
				return;
			case PetriNetPackage.ARC__PLACE_TO_TRANSITION:
				setPlaceToTransition((Boolean)newValue);
				return;
			case PetriNetPackage.ARC__PLACE:
				setPlace((Place)newValue);
				return;
			case PetriNetPackage.ARC__TRANSITION:
				setTransition((Transition)newValue);
				return;
			case PetriNetPackage.ARC__NB_TRANSFERED:
				setNbTransfered((Integer)newValue);
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
			case PetriNetPackage.ARC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetriNetPackage.ARC__IS_READ_ARC:
				setIsReadArc(IS_READ_ARC_EDEFAULT);
				return;
			case PetriNetPackage.ARC__PLACE_TO_TRANSITION:
				setPlaceToTransition(PLACE_TO_TRANSITION_EDEFAULT);
				return;
			case PetriNetPackage.ARC__PLACE:
				setPlace((Place)null);
				return;
			case PetriNetPackage.ARC__TRANSITION:
				setTransition((Transition)null);
				return;
			case PetriNetPackage.ARC__NB_TRANSFERED:
				setNbTransfered(NB_TRANSFERED_EDEFAULT);
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
			case PetriNetPackage.ARC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetriNetPackage.ARC__IS_READ_ARC:
				return isReadArc != IS_READ_ARC_EDEFAULT;
			case PetriNetPackage.ARC__PLACE_TO_TRANSITION:
				return placeToTransition != PLACE_TO_TRANSITION_EDEFAULT;
			case PetriNetPackage.ARC__PLACE:
				return place != null;
			case PetriNetPackage.ARC__TRANSITION:
				return transition != null;
			case PetriNetPackage.ARC__NB_TRANSFERED:
				return nbTransfered != NB_TRANSFERED_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isReadArc: ");
		result.append(isReadArc);
		result.append(", PlaceToTransition: ");
		result.append(placeToTransition);
		result.append(", nbTransfered: ");
		result.append(nbTransfered);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
