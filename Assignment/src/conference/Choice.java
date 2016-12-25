/**
 */
package conference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Choice#getAttendee <em>Attendee</em>}</li>
 *   <li>{@link conference.Choice#getChoices <em>Choices</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends EObject {
	/**
	 * Returns the value of the '<em><b>Attendee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attendee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attendee</em>' reference.
	 * @see #setAttendee(Attendee)
	 * @see conference.ConferencePackage#getChoice_Attendee()
	 * @model annotation="gmf.node label='name'"
	 * @generated
	 */
	Attendee getAttendee();

	/**
	 * Sets the value of the '{@link conference.Choice#getAttendee <em>Attendee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attendee</em>' reference.
	 * @see #getAttendee()
	 * @generated
	 */
	void setAttendee(Attendee value);

	/**
	 * Returns the value of the '<em><b>Choices</b></em>' attribute.
	 * The literals are from the enumeration {@link conference.Choices}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choices</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choices</em>' attribute.
	 * @see conference.Choices
	 * @see #setChoices(Choices)
	 * @see conference.ConferencePackage#getChoice_Choices()
	 * @model
	 * @generated
	 */
	Choices getChoices();

	/**
	 * Sets the value of the '{@link conference.Choice#getChoices <em>Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choices</em>' attribute.
	 * @see conference.Choices
	 * @see #getChoices()
	 * @generated
	 */
	void setChoices(Choices value);

} // Choice
