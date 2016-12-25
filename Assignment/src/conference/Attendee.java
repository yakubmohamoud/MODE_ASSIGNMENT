/**
 */
package conference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attendee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Attendee#getTitle <em>Title</em>}</li>
 *   <li>{@link conference.Attendee#getName <em>Name</em>}</li>
 *   <li>{@link conference.Attendee#getAffliation <em>Affliation</em>}</li>
 *   <li>{@link conference.Attendee#getSeat <em>Seat</em>}</li>
 *   <li>{@link conference.Attendee#getLanguage <em>Language</em>}</li>
 *   <li>{@link conference.Attendee#getAllergie <em>Allergie</em>}</li>
 *   <li>{@link conference.Attendee#getSubject <em>Subject</em>}</li>
 *   <li>{@link conference.Attendee#getChoice <em>Choice</em>}</li>
 *   <li>{@link conference.Attendee#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getAttendee()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Attendee extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The literals are from the enumeration {@link conference.Title}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see conference.Title
	 * @see #setTitle(Title)
	 * @see conference.ConferencePackage#getAttendee_Title()
	 * @model
	 * @generated
	 */
	Title getTitle();

	/**
	 * Sets the value of the '{@link conference.Attendee#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see conference.Title
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Title value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conference.ConferencePackage#getAttendee_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conference.Attendee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Affliation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affliation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affliation</em>' attribute.
	 * @see #setAffliation(String)
	 * @see conference.ConferencePackage#getAttendee_Affliation()
	 * @model
	 * @generated
	 */
	String getAffliation();

	/**
	 * Sets the value of the '{@link conference.Attendee#getAffliation <em>Affliation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affliation</em>' attribute.
	 * @see #getAffliation()
	 * @generated
	 */
	void setAffliation(String value);

	/**
	 * Returns the value of the '<em><b>Seat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat</em>' containment reference.
	 * @see #setSeat(Seat)
	 * @see conference.ConferencePackage#getAttendee_Seat()
	 * @model containment="true"
	 * @generated
	 */
	Seat getSeat();

	/**
	 * Sets the value of the '{@link conference.Attendee#getSeat <em>Seat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat</em>' containment reference.
	 * @see #getSeat()
	 * @generated
	 */
	void setSeat(Seat value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link conference.Language}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see conference.ConferencePackage#getAttendee_Language()
	 * @model containment="true"
	 * @generated
	 */
	EList<Language> getLanguage();

	/**
	 * Returns the value of the '<em><b>Allergie</b></em>' containment reference list.
	 * The list contents are of type {@link conference.Allergie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allergie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allergie</em>' containment reference list.
	 * @see conference.ConferencePackage#getAttendee_Allergie()
	 * @model containment="true"
	 * @generated
	 */
	EList<Allergie> getAllergie();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link conference.Subject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see conference.ConferencePackage#getAttendee_Subject()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subject> getSubject();

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
	 * The list contents are of type {@link conference.Choice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference list.
	 * @see conference.ConferencePackage#getAttendee_Choice()
	 * @model containment="true"
	 * @generated
	 */
	EList<Choice> getChoice();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conference.Seat#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Seat)
	 * @see conference.ConferencePackage#getAttendee_Target()
	 * @see conference.Seat#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	Seat getTarget();

	/**
	 * Sets the value of the '{@link conference.Attendee#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Seat value);

} // Attendee
