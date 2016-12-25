/**
 */
package conference.impl;

import conference.Allergie;
import conference.Attendee;
import conference.Choice;
import conference.ConferencePackage;
import conference.Language;
import conference.Seat;
import conference.Subject;
import conference.Title;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attendee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conference.impl.AttendeeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link conference.impl.AttendeeImpl#getName <em>Name</em>}</li>
 *   <li>{@link conference.impl.AttendeeImpl#getAffliation <em>Affliation</em>}</li>
 *   <li>{@link conference.impl.AttendeeImpl#getSeat <em>Seat</em>}</li>
 *   <li>{@link conference.impl.AttendeeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link conference.impl.AttendeeImpl#getAllergie <em>Allergie</em>}</li>
 *   <li>{@link conference.impl.AttendeeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link conference.impl.AttendeeImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link conference.impl.AttendeeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttendeeImpl extends EObjectImpl implements Attendee {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final Title TITLE_EDEFAULT = Title.DR;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Title title = TITLE_EDEFAULT;

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
	 * The default value of the '{@link #getAffliation() <em>Affliation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffliation()
	 * @generated
	 * @ordered
	 */
	protected static final String AFFLIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAffliation() <em>Affliation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffliation()
	 * @generated
	 * @ordered
	 */
	protected String affliation = AFFLIATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeat() <em>Seat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeat()
	 * @generated
	 * @ordered
	 */
	protected Seat seat;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<Language> language;

	/**
	 * The cached value of the '{@link #getAllergie() <em>Allergie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergie()
	 * @generated
	 * @ordered
	 */
	protected EList<Allergie> allergie;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Subject> subject;

	/**
	 * The cached value of the '{@link #getChoice() <em>Choice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected EList<Choice> choice;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Seat target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttendeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.ATTENDEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Title getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(Title newTitle) {
		Title oldTitle = title;
		title = newTitle == null ? TITLE_EDEFAULT : newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.ATTENDEE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.ATTENDEE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAffliation() {
		return affliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffliation(String newAffliation) {
		String oldAffliation = affliation;
		affliation = newAffliation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.ATTENDEE__AFFLIATION, oldAffliation, affliation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seat getSeat() {
		return seat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeat(Seat newSeat, NotificationChain msgs) {
		Seat oldSeat = seat;
		seat = newSeat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConferencePackage.ATTENDEE__SEAT, oldSeat, newSeat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeat(Seat newSeat) {
		if (newSeat != seat) {
			NotificationChain msgs = null;
			if (seat != null)
				msgs = ((InternalEObject)seat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConferencePackage.ATTENDEE__SEAT, null, msgs);
			if (newSeat != null)
				msgs = ((InternalEObject)newSeat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConferencePackage.ATTENDEE__SEAT, null, msgs);
			msgs = basicSetSeat(newSeat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.ATTENDEE__SEAT, newSeat, newSeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Language> getLanguage() {
		if (language == null) {
			language = new EObjectContainmentEList<Language>(Language.class, this, ConferencePackage.ATTENDEE__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Allergie> getAllergie() {
		if (allergie == null) {
			allergie = new EObjectContainmentEList<Allergie>(Allergie.class, this, ConferencePackage.ATTENDEE__ALLERGIE);
		}
		return allergie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subject> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<Subject>(Subject.class, this, ConferencePackage.ATTENDEE__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choice> getChoice() {
		if (choice == null) {
			choice = new EObjectContainmentEList<Choice>(Choice.class, this, ConferencePackage.ATTENDEE__CHOICE);
		}
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seat getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Seat)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConferencePackage.ATTENDEE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seat basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Seat newTarget, NotificationChain msgs) {
		Seat oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConferencePackage.ATTENDEE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Seat newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, ConferencePackage.SEAT__INCOMING, Seat.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, ConferencePackage.SEAT__INCOMING, Seat.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.ATTENDEE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConferencePackage.ATTENDEE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, ConferencePackage.SEAT__INCOMING, Seat.class, msgs);
				return basicSetTarget((Seat)otherEnd, msgs);
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
			case ConferencePackage.ATTENDEE__SEAT:
				return basicSetSeat(null, msgs);
			case ConferencePackage.ATTENDEE__LANGUAGE:
				return ((InternalEList<?>)getLanguage()).basicRemove(otherEnd, msgs);
			case ConferencePackage.ATTENDEE__ALLERGIE:
				return ((InternalEList<?>)getAllergie()).basicRemove(otherEnd, msgs);
			case ConferencePackage.ATTENDEE__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case ConferencePackage.ATTENDEE__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
			case ConferencePackage.ATTENDEE__TARGET:
				return basicSetTarget(null, msgs);
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
			case ConferencePackage.ATTENDEE__TITLE:
				return getTitle();
			case ConferencePackage.ATTENDEE__NAME:
				return getName();
			case ConferencePackage.ATTENDEE__AFFLIATION:
				return getAffliation();
			case ConferencePackage.ATTENDEE__SEAT:
				return getSeat();
			case ConferencePackage.ATTENDEE__LANGUAGE:
				return getLanguage();
			case ConferencePackage.ATTENDEE__ALLERGIE:
				return getAllergie();
			case ConferencePackage.ATTENDEE__SUBJECT:
				return getSubject();
			case ConferencePackage.ATTENDEE__CHOICE:
				return getChoice();
			case ConferencePackage.ATTENDEE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConferencePackage.ATTENDEE__TITLE:
				setTitle((Title)newValue);
				return;
			case ConferencePackage.ATTENDEE__NAME:
				setName((String)newValue);
				return;
			case ConferencePackage.ATTENDEE__AFFLIATION:
				setAffliation((String)newValue);
				return;
			case ConferencePackage.ATTENDEE__SEAT:
				setSeat((Seat)newValue);
				return;
			case ConferencePackage.ATTENDEE__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends Language>)newValue);
				return;
			case ConferencePackage.ATTENDEE__ALLERGIE:
				getAllergie().clear();
				getAllergie().addAll((Collection<? extends Allergie>)newValue);
				return;
			case ConferencePackage.ATTENDEE__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Subject>)newValue);
				return;
			case ConferencePackage.ATTENDEE__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends Choice>)newValue);
				return;
			case ConferencePackage.ATTENDEE__TARGET:
				setTarget((Seat)newValue);
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
			case ConferencePackage.ATTENDEE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ConferencePackage.ATTENDEE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConferencePackage.ATTENDEE__AFFLIATION:
				setAffliation(AFFLIATION_EDEFAULT);
				return;
			case ConferencePackage.ATTENDEE__SEAT:
				setSeat((Seat)null);
				return;
			case ConferencePackage.ATTENDEE__LANGUAGE:
				getLanguage().clear();
				return;
			case ConferencePackage.ATTENDEE__ALLERGIE:
				getAllergie().clear();
				return;
			case ConferencePackage.ATTENDEE__SUBJECT:
				getSubject().clear();
				return;
			case ConferencePackage.ATTENDEE__CHOICE:
				getChoice().clear();
				return;
			case ConferencePackage.ATTENDEE__TARGET:
				setTarget((Seat)null);
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
			case ConferencePackage.ATTENDEE__TITLE:
				return title != TITLE_EDEFAULT;
			case ConferencePackage.ATTENDEE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConferencePackage.ATTENDEE__AFFLIATION:
				return AFFLIATION_EDEFAULT == null ? affliation != null : !AFFLIATION_EDEFAULT.equals(affliation);
			case ConferencePackage.ATTENDEE__SEAT:
				return seat != null;
			case ConferencePackage.ATTENDEE__LANGUAGE:
				return language != null && !language.isEmpty();
			case ConferencePackage.ATTENDEE__ALLERGIE:
				return allergie != null && !allergie.isEmpty();
			case ConferencePackage.ATTENDEE__SUBJECT:
				return subject != null && !subject.isEmpty();
			case ConferencePackage.ATTENDEE__CHOICE:
				return choice != null && !choice.isEmpty();
			case ConferencePackage.ATTENDEE__TARGET:
				return target != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", name: ");
		result.append(name);
		result.append(", affliation: ");
		result.append(affliation);
		result.append(')');
		return result.toString();
	}

} //AttendeeImpl
