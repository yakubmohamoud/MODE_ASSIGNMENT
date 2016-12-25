/**
 */
package conference.impl;

import conference.Attendee;
import conference.Choice;
import conference.Choices;
import conference.ConferencePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conference.impl.ChoiceImpl#getAttendee <em>Attendee</em>}</li>
 *   <li>{@link conference.impl.ChoiceImpl#getChoices <em>Choices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoiceImpl extends EObjectImpl implements Choice {
	/**
	 * The cached value of the '{@link #getAttendee() <em>Attendee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttendee()
	 * @generated
	 * @ordered
	 */
	protected Attendee attendee;

	/**
	 * The default value of the '{@link #getChoices() <em>Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoices()
	 * @generated
	 * @ordered
	 */
	protected static final Choices CHOICES_EDEFAULT = Choices.FRIEND;

	/**
	 * The cached value of the '{@link #getChoices() <em>Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoices()
	 * @generated
	 * @ordered
	 */
	protected Choices choices = CHOICES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attendee getAttendee() {
		if (attendee != null && attendee.eIsProxy()) {
			InternalEObject oldAttendee = (InternalEObject)attendee;
			attendee = (Attendee)eResolveProxy(oldAttendee);
			if (attendee != oldAttendee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConferencePackage.CHOICE__ATTENDEE, oldAttendee, attendee));
			}
		}
		return attendee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attendee basicGetAttendee() {
		return attendee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttendee(Attendee newAttendee) {
		Attendee oldAttendee = attendee;
		attendee = newAttendee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.CHOICE__ATTENDEE, oldAttendee, attendee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choices getChoices() {
		return choices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoices(Choices newChoices) {
		Choices oldChoices = choices;
		choices = newChoices == null ? CHOICES_EDEFAULT : newChoices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.CHOICE__CHOICES, oldChoices, choices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConferencePackage.CHOICE__ATTENDEE:
				if (resolve) return getAttendee();
				return basicGetAttendee();
			case ConferencePackage.CHOICE__CHOICES:
				return getChoices();
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
			case ConferencePackage.CHOICE__ATTENDEE:
				setAttendee((Attendee)newValue);
				return;
			case ConferencePackage.CHOICE__CHOICES:
				setChoices((Choices)newValue);
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
			case ConferencePackage.CHOICE__ATTENDEE:
				setAttendee((Attendee)null);
				return;
			case ConferencePackage.CHOICE__CHOICES:
				setChoices(CHOICES_EDEFAULT);
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
			case ConferencePackage.CHOICE__ATTENDEE:
				return attendee != null;
			case ConferencePackage.CHOICE__CHOICES:
				return choices != CHOICES_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (choices: ");
		result.append(choices);
		result.append(')');
		return result.toString();
	}

} //ChoiceImpl
