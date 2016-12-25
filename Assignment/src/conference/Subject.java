/**
 */
package conference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Subject#getSubjects <em>Subjects</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getSubject()
 * @model
 * @generated
 */
public interface Subject extends EObject {
	/**
	 * Returns the value of the '<em><b>Subjects</b></em>' attribute.
	 * The literals are from the enumeration {@link conference.Subjects}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subjects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjects</em>' attribute.
	 * @see conference.Subjects
	 * @see #setSubjects(Subjects)
	 * @see conference.ConferencePackage#getSubject_Subjects()
	 * @model annotation="gmf.node label='name'"
	 * @generated
	 */
	Subjects getSubjects();

	/**
	 * Sets the value of the '{@link conference.Subject#getSubjects <em>Subjects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subjects</em>' attribute.
	 * @see conference.Subjects
	 * @see #getSubjects()
	 * @generated
	 */
	void setSubjects(Subjects value);

} // Subject
