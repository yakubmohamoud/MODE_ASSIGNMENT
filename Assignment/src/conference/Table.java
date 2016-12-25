/**
 */
package conference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Table#getNumber <em>Number</em>}</li>
 *   <li>{@link conference.Table#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link conference.Table#getAttendees <em>Attendees</em>}</li>
 *   <li>{@link conference.Table#getOccupied <em>Occupied</em>}</li>
 *   <li>{@link conference.Table#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see conference.ConferencePackage#getTable_Number()
	 * @model annotation="gmf.node label='name'"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link conference.Table#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see conference.ConferencePackage#getTable_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link conference.Table#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Attendees</b></em>' reference list.
	 * The list contents are of type {@link conference.Attendee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attendees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attendees</em>' reference list.
	 * @see conference.ConferencePackage#getTable_Attendees()
	 * @model
	 * @generated
	 */
	EList<Attendee> getAttendees();

	/**
	 * Returns the value of the '<em><b>Occupied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupied</em>' attribute.
	 * @see #setOccupied(Boolean)
	 * @see conference.ConferencePackage#getTable_Occupied()
	 * @model
	 * @generated
	 */
	Boolean getOccupied();

	/**
	 * Sets the value of the '{@link conference.Table#getOccupied <em>Occupied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupied</em>' attribute.
	 * @see #getOccupied()
	 * @generated
	 */
	void setOccupied(Boolean value);

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
	 * @see conference.ConferencePackage#getTable_Target()
	 * @see conference.Seat#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	Seat getTarget();

	/**
	 * Sets the value of the '{@link conference.Table#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Seat value);

} // Table
