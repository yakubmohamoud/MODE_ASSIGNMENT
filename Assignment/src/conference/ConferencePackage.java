/**
 */
package conference;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see conference.ConferenceFactory
 * @model kind="package"
 * @generated
 */
public interface ConferencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conference";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "conference";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConferencePackage eINSTANCE = conference.impl.ConferencePackageImpl.init();

	/**
	 * The meta object id for the '{@link conference.impl.ConferenceImpl <em>Conference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.ConferenceImpl
	 * @see conference.impl.ConferencePackageImpl#getConference()
	 * @generated
	 */
	int CONFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Attendee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__ATTENDEE = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__TABLE = 1;

	/**
	 * The number of structural features of the '<em>Conference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link conference.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.TableImpl
	 * @see conference.impl.ConferencePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>Attendees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ATTENDEES = 2;

	/**
	 * The feature id for the '<em><b>Occupied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__OCCUPIED = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TARGET = 4;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link conference.impl.SeatImpl <em>Seat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.SeatImpl
	 * @see conference.impl.ConferencePackageImpl#getSeat()
	 * @generated
	 */
	int SEAT = 2;

	/**
	 * The feature id for the '<em><b>Seat Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__SEAT_ID = 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__OUTGOING = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__INCOMING = 2;

	/**
	 * The number of structural features of the '<em>Seat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link conference.impl.AttendeeImpl <em>Attendee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.AttendeeImpl
	 * @see conference.impl.ConferencePackageImpl#getAttendee()
	 * @generated
	 */
	int ATTENDEE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENDEE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENDEE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Affliation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENDEE__AFFLIATION = 2;

	/**
	 * The feature id for the '<em><b>Seat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENDEE__SEAT = 3;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENDEE__LANGUAGE = 4;

	/**
	 * The feature id for the '<em><b>Allergie</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENDEE__ALLERGIE = 5;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENDEE__SUBJECT = 6;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENDEE__CHOICE = 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENDEE__TARGET = 8;

	/**
	 * The number of structural features of the '<em>Attendee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENDEE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link conference.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.ChoiceImpl
	 * @see conference.impl.ConferencePackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 4;

	/**
	 * The feature id for the '<em><b>Attendee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ATTENDEE = 0;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CHOICES = 1;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link conference.impl.SubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.SubjectImpl
	 * @see conference.impl.ConferencePackageImpl#getSubject()
	 * @generated
	 */
	int SUBJECT = 5;

	/**
	 * The feature id for the '<em><b>Subjects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__SUBJECTS = 0;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link conference.impl.AllergieImpl <em>Allergie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.AllergieImpl
	 * @see conference.impl.ConferencePackageImpl#getAllergie()
	 * @generated
	 */
	int ALLERGIE = 6;

	/**
	 * The feature id for the '<em><b>Allergie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIE__ALLERGIE = 0;

	/**
	 * The number of structural features of the '<em>Allergie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLERGIE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link conference.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.LanguageImpl
	 * @see conference.impl.ConferencePackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 7;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__LANGUAGE = 0;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link conference.Choices <em>Choices</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.Choices
	 * @see conference.impl.ConferencePackageImpl#getChoices()
	 * @generated
	 */
	int CHOICES = 8;

	/**
	 * The meta object id for the '{@link conference.Subjects <em>Subjects</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.Subjects
	 * @see conference.impl.ConferencePackageImpl#getSubjects()
	 * @generated
	 */
	int SUBJECTS = 9;

	/**
	 * The meta object id for the '{@link conference.Allergies <em>Allergies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.Allergies
	 * @see conference.impl.ConferencePackageImpl#getAllergies()
	 * @generated
	 */
	int ALLERGIES = 10;

	/**
	 * The meta object id for the '{@link conference.Title <em>Title</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.Title
	 * @see conference.impl.ConferencePackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 11;

	/**
	 * The meta object id for the '{@link conference.Languages <em>Languages</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.Languages
	 * @see conference.impl.ConferencePackageImpl#getLanguages()
	 * @generated
	 */
	int LANGUAGES = 12;


	/**
	 * Returns the meta object for class '{@link conference.Conference <em>Conference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference</em>'.
	 * @see conference.Conference
	 * @generated
	 */
	EClass getConference();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Conference#getAttendee <em>Attendee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attendee</em>'.
	 * @see conference.Conference#getAttendee()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Attendee();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Conference#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see conference.Conference#getTable()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Table();

	/**
	 * Returns the meta object for class '{@link conference.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see conference.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link conference.Table#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see conference.Table#getNumber()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Number();

	/**
	 * Returns the meta object for the attribute '{@link conference.Table#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see conference.Table#getCapacity()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Capacity();

	/**
	 * Returns the meta object for the reference list '{@link conference.Table#getAttendees <em>Attendees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attendees</em>'.
	 * @see conference.Table#getAttendees()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Attendees();

	/**
	 * Returns the meta object for the attribute '{@link conference.Table#getOccupied <em>Occupied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occupied</em>'.
	 * @see conference.Table#getOccupied()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Occupied();

	/**
	 * Returns the meta object for the reference '{@link conference.Table#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see conference.Table#getTarget()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Target();

	/**
	 * Returns the meta object for class '{@link conference.Seat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seat</em>'.
	 * @see conference.Seat
	 * @generated
	 */
	EClass getSeat();

	/**
	 * Returns the meta object for the attribute '{@link conference.Seat#getSeatId <em>Seat Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Id</em>'.
	 * @see conference.Seat#getSeatId()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_SeatId();

	/**
	 * Returns the meta object for the reference list '{@link conference.Seat#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see conference.Seat#getOutgoing()
	 * @see #getSeat()
	 * @generated
	 */
	EReference getSeat_Outgoing();

	/**
	 * Returns the meta object for the reference '{@link conference.Seat#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see conference.Seat#getIncoming()
	 * @see #getSeat()
	 * @generated
	 */
	EReference getSeat_Incoming();

	/**
	 * Returns the meta object for class '{@link conference.Attendee <em>Attendee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attendee</em>'.
	 * @see conference.Attendee
	 * @generated
	 */
	EClass getAttendee();

	/**
	 * Returns the meta object for the attribute '{@link conference.Attendee#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see conference.Attendee#getTitle()
	 * @see #getAttendee()
	 * @generated
	 */
	EAttribute getAttendee_Title();

	/**
	 * Returns the meta object for the attribute '{@link conference.Attendee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.Attendee#getName()
	 * @see #getAttendee()
	 * @generated
	 */
	EAttribute getAttendee_Name();

	/**
	 * Returns the meta object for the attribute '{@link conference.Attendee#getAffliation <em>Affliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affliation</em>'.
	 * @see conference.Attendee#getAffliation()
	 * @see #getAttendee()
	 * @generated
	 */
	EAttribute getAttendee_Affliation();

	/**
	 * Returns the meta object for the containment reference '{@link conference.Attendee#getSeat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seat</em>'.
	 * @see conference.Attendee#getSeat()
	 * @see #getAttendee()
	 * @generated
	 */
	EReference getAttendee_Seat();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Attendee#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language</em>'.
	 * @see conference.Attendee#getLanguage()
	 * @see #getAttendee()
	 * @generated
	 */
	EReference getAttendee_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Attendee#getAllergie <em>Allergie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allergie</em>'.
	 * @see conference.Attendee#getAllergie()
	 * @see #getAttendee()
	 * @generated
	 */
	EReference getAttendee_Allergie();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Attendee#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subject</em>'.
	 * @see conference.Attendee#getSubject()
	 * @see #getAttendee()
	 * @generated
	 */
	EReference getAttendee_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Attendee#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice</em>'.
	 * @see conference.Attendee#getChoice()
	 * @see #getAttendee()
	 * @generated
	 */
	EReference getAttendee_Choice();

	/**
	 * Returns the meta object for the reference '{@link conference.Attendee#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see conference.Attendee#getTarget()
	 * @see #getAttendee()
	 * @generated
	 */
	EReference getAttendee_Target();

	/**
	 * Returns the meta object for class '{@link conference.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see conference.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the reference '{@link conference.Choice#getAttendee <em>Attendee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attendee</em>'.
	 * @see conference.Choice#getAttendee()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Attendee();

	/**
	 * Returns the meta object for the attribute '{@link conference.Choice#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Choices</em>'.
	 * @see conference.Choice#getChoices()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Choices();

	/**
	 * Returns the meta object for class '{@link conference.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see conference.Subject
	 * @generated
	 */
	EClass getSubject();

	/**
	 * Returns the meta object for the attribute '{@link conference.Subject#getSubjects <em>Subjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subjects</em>'.
	 * @see conference.Subject#getSubjects()
	 * @see #getSubject()
	 * @generated
	 */
	EAttribute getSubject_Subjects();

	/**
	 * Returns the meta object for class '{@link conference.Allergie <em>Allergie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allergie</em>'.
	 * @see conference.Allergie
	 * @generated
	 */
	EClass getAllergie();

	/**
	 * Returns the meta object for the attribute '{@link conference.Allergie#getAllergie <em>Allergie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allergie</em>'.
	 * @see conference.Allergie#getAllergie()
	 * @see #getAllergie()
	 * @generated
	 */
	EAttribute getAllergie_Allergie();

	/**
	 * Returns the meta object for class '{@link conference.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see conference.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link conference.Language#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see conference.Language#getLanguage()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Language();

	/**
	 * Returns the meta object for enum '{@link conference.Choices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Choices</em>'.
	 * @see conference.Choices
	 * @generated
	 */
	EEnum getChoices();

	/**
	 * Returns the meta object for enum '{@link conference.Subjects <em>Subjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subjects</em>'.
	 * @see conference.Subjects
	 * @generated
	 */
	EEnum getSubjects();

	/**
	 * Returns the meta object for enum '{@link conference.Allergies <em>Allergies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergies</em>'.
	 * @see conference.Allergies
	 * @generated
	 */
	EEnum getAllergies();

	/**
	 * Returns the meta object for enum '{@link conference.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Title</em>'.
	 * @see conference.Title
	 * @generated
	 */
	EEnum getTitle();

	/**
	 * Returns the meta object for enum '{@link conference.Languages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Languages</em>'.
	 * @see conference.Languages
	 * @generated
	 */
	EEnum getLanguages();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConferenceFactory getConferenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link conference.impl.ConferenceImpl <em>Conference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.ConferenceImpl
		 * @see conference.impl.ConferencePackageImpl#getConference()
		 * @generated
		 */
		EClass CONFERENCE = eINSTANCE.getConference();

		/**
		 * The meta object literal for the '<em><b>Attendee</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__ATTENDEE = eINSTANCE.getConference_Attendee();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__TABLE = eINSTANCE.getConference_Table();

		/**
		 * The meta object literal for the '{@link conference.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.TableImpl
		 * @see conference.impl.ConferencePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NUMBER = eINSTANCE.getTable_Number();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__CAPACITY = eINSTANCE.getTable_Capacity();

		/**
		 * The meta object literal for the '<em><b>Attendees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ATTENDEES = eINSTANCE.getTable_Attendees();

		/**
		 * The meta object literal for the '<em><b>Occupied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__OCCUPIED = eINSTANCE.getTable_Occupied();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TARGET = eINSTANCE.getTable_Target();

		/**
		 * The meta object literal for the '{@link conference.impl.SeatImpl <em>Seat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.SeatImpl
		 * @see conference.impl.ConferencePackageImpl#getSeat()
		 * @generated
		 */
		EClass SEAT = eINSTANCE.getSeat();

		/**
		 * The meta object literal for the '<em><b>Seat Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__SEAT_ID = eINSTANCE.getSeat_SeatId();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEAT__OUTGOING = eINSTANCE.getSeat_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEAT__INCOMING = eINSTANCE.getSeat_Incoming();

		/**
		 * The meta object literal for the '{@link conference.impl.AttendeeImpl <em>Attendee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.AttendeeImpl
		 * @see conference.impl.ConferencePackageImpl#getAttendee()
		 * @generated
		 */
		EClass ATTENDEE = eINSTANCE.getAttendee();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTENDEE__TITLE = eINSTANCE.getAttendee_Title();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTENDEE__NAME = eINSTANCE.getAttendee_Name();

		/**
		 * The meta object literal for the '<em><b>Affliation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTENDEE__AFFLIATION = eINSTANCE.getAttendee_Affliation();

		/**
		 * The meta object literal for the '<em><b>Seat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTENDEE__SEAT = eINSTANCE.getAttendee_Seat();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTENDEE__LANGUAGE = eINSTANCE.getAttendee_Language();

		/**
		 * The meta object literal for the '<em><b>Allergie</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTENDEE__ALLERGIE = eINSTANCE.getAttendee_Allergie();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTENDEE__SUBJECT = eINSTANCE.getAttendee_Subject();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTENDEE__CHOICE = eINSTANCE.getAttendee_Choice();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTENDEE__TARGET = eINSTANCE.getAttendee_Target();

		/**
		 * The meta object literal for the '{@link conference.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.ChoiceImpl
		 * @see conference.impl.ConferencePackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Attendee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__ATTENDEE = eINSTANCE.getChoice_Attendee();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__CHOICES = eINSTANCE.getChoice_Choices();

		/**
		 * The meta object literal for the '{@link conference.impl.SubjectImpl <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.SubjectImpl
		 * @see conference.impl.ConferencePackageImpl#getSubject()
		 * @generated
		 */
		EClass SUBJECT = eINSTANCE.getSubject();

		/**
		 * The meta object literal for the '<em><b>Subjects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECT__SUBJECTS = eINSTANCE.getSubject_Subjects();

		/**
		 * The meta object literal for the '{@link conference.impl.AllergieImpl <em>Allergie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.AllergieImpl
		 * @see conference.impl.ConferencePackageImpl#getAllergie()
		 * @generated
		 */
		EClass ALLERGIE = eINSTANCE.getAllergie();

		/**
		 * The meta object literal for the '<em><b>Allergie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLERGIE__ALLERGIE = eINSTANCE.getAllergie_Allergie();

		/**
		 * The meta object literal for the '{@link conference.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.LanguageImpl
		 * @see conference.impl.ConferencePackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__LANGUAGE = eINSTANCE.getLanguage_Language();

		/**
		 * The meta object literal for the '{@link conference.Choices <em>Choices</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.Choices
		 * @see conference.impl.ConferencePackageImpl#getChoices()
		 * @generated
		 */
		EEnum CHOICES = eINSTANCE.getChoices();

		/**
		 * The meta object literal for the '{@link conference.Subjects <em>Subjects</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.Subjects
		 * @see conference.impl.ConferencePackageImpl#getSubjects()
		 * @generated
		 */
		EEnum SUBJECTS = eINSTANCE.getSubjects();

		/**
		 * The meta object literal for the '{@link conference.Allergies <em>Allergies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.Allergies
		 * @see conference.impl.ConferencePackageImpl#getAllergies()
		 * @generated
		 */
		EEnum ALLERGIES = eINSTANCE.getAllergies();

		/**
		 * The meta object literal for the '{@link conference.Title <em>Title</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.Title
		 * @see conference.impl.ConferencePackageImpl#getTitle()
		 * @generated
		 */
		EEnum TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '{@link conference.Languages <em>Languages</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.Languages
		 * @see conference.impl.ConferencePackageImpl#getLanguages()
		 * @generated
		 */
		EEnum LANGUAGES = eINSTANCE.getLanguages();

	}

} //ConferencePackage
