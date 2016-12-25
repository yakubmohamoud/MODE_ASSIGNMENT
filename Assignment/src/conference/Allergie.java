/**
 */
package conference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Allergie#getAllergie <em>Allergie</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getAllergie()
 * @model
 * @generated
 */
public interface Allergie extends EObject {
	/**
	 * Returns the value of the '<em><b>Allergie</b></em>' attribute.
	 * The literals are from the enumeration {@link conference.Allergies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allergie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allergie</em>' attribute.
	 * @see conference.Allergies
	 * @see #setAllergie(Allergies)
	 * @see conference.ConferencePackage#getAllergie_Allergie()
	 * @model annotation="gmf.node label='name'"
	 * @generated
	 */
	Allergies getAllergie();

	/**
	 * Sets the value of the '{@link conference.Allergie#getAllergie <em>Allergie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allergie</em>' attribute.
	 * @see conference.Allergies
	 * @see #getAllergie()
	 * @generated
	 */
	void setAllergie(Allergies value);

} // Allergie
