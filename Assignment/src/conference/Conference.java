/**
 */
package conference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Conference#getAttendee <em>Attendee</em>}</li>
 *   <li>{@link conference.Conference#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getConference()
 * @model
 * @generated
 */
public interface Conference extends EObject {
	/**
	 * Returns the value of the '<em><b>Attendee</b></em>' containment reference list.
	 * The list contents are of type {@link conference.Attendee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attendee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attendee</em>' containment reference list.
	 * @see conference.ConferencePackage#getConference_Attendee()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attendee> getAttendee();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link conference.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see conference.ConferencePackage#getConference_Table()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTable();

} // Conference
