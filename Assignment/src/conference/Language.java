/**
 */
package conference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Language#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getLanguage()
 * @model
 * @generated
 */
public interface Language extends EObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link conference.Languages}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see conference.Languages
	 * @see #setLanguage(Languages)
	 * @see conference.ConferencePackage#getLanguage_Language()
	 * @model annotation="gmf.node label='name'"
	 * @generated
	 */
	Languages getLanguage();

	/**
	 * Sets the value of the '{@link conference.Language#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see conference.Languages
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Languages value);

} // Language
