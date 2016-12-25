/**
 */
package conference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Seat#getSeatId <em>Seat Id</em>}</li>
 *   <li>{@link conference.Seat#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link conference.Seat#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getSeat()
 * @model annotation="gmf.link source='outgoing' target='incoming' decoration='arrow' style='dash'"
 * @generated
 */
public interface Seat extends EObject {
	/**
	 * Returns the value of the '<em><b>Seat Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Id</em>' attribute.
	 * @see #setSeatId(int)
	 * @see conference.ConferencePackage#getSeat_SeatId()
	 * @model id="true"
	 * @generated
	 */
	int getSeatId();

	/**
	 * Sets the value of the '{@link conference.Seat#getSeatId <em>Seat Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Id</em>' attribute.
	 * @see #getSeatId()
	 * @generated
	 */
	void setSeatId(int value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link conference.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see conference.ConferencePackage#getSeat_Outgoing()
	 * @model
	 * @generated
	 */
	EList<Table> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conference.Attendee#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(Attendee)
	 * @see conference.ConferencePackage#getSeat_Incoming()
	 * @see conference.Attendee#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	Attendee getIncoming();

	/**
	 * Sets the value of the '{@link conference.Seat#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(Attendee value);

} // Seat
