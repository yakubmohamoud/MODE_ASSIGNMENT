/**
 */
package conference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Subjects</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see conference.ConferencePackage#getSubjects()
 * @model
 * @generated
 */
public enum Subjects implements Enumerator {
	/**
	 * The '<em><b>Computer Science</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTER_SCIENCE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTER_SCIENCE(0, "Computer_Science", "Computer_Science"),

	/**
	 * The '<em><b>Maths</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATHS_VALUE
	 * @generated
	 * @ordered
	 */
	MATHS(1, "Maths", "Maths"),

	/**
	 * The '<em><b>English</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGLISH_VALUE
	 * @generated
	 * @ordered
	 */
	ENGLISH(2, "English", "English"),

	/**
	 * The '<em><b>History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORY(3, "History", "History"),

	/**
	 * The '<em><b>Biology</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOLOGY_VALUE
	 * @generated
	 * @ordered
	 */
	BIOLOGY(4, "Biology", "Biology"),

	/**
	 * The '<em><b>Religous studies</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELIGOUS_STUDIES_VALUE
	 * @generated
	 * @ordered
	 */
	RELIGOUS_STUDIES(5, "Religous_studies", "Religous_studies");

	/**
	 * The '<em><b>Computer Science</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Computer Science</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPUTER_SCIENCE
	 * @model name="Computer_Science"
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTER_SCIENCE_VALUE = 0;

	/**
	 * The '<em><b>Maths</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maths</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MATHS
	 * @model name="Maths"
	 * @generated
	 * @ordered
	 */
	public static final int MATHS_VALUE = 1;

	/**
	 * The '<em><b>English</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>English</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENGLISH
	 * @model name="English"
	 * @generated
	 * @ordered
	 */
	public static final int ENGLISH_VALUE = 2;

	/**
	 * The '<em><b>History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>History</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HISTORY
	 * @model name="History"
	 * @generated
	 * @ordered
	 */
	public static final int HISTORY_VALUE = 3;

	/**
	 * The '<em><b>Biology</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Biology</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIOLOGY
	 * @model name="Biology"
	 * @generated
	 * @ordered
	 */
	public static final int BIOLOGY_VALUE = 4;

	/**
	 * The '<em><b>Religous studies</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Religous studies</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELIGOUS_STUDIES
	 * @model name="Religous_studies"
	 * @generated
	 * @ordered
	 */
	public static final int RELIGOUS_STUDIES_VALUE = 5;

	/**
	 * An array of all the '<em><b>Subjects</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Subjects[] VALUES_ARRAY =
		new Subjects[] {
			COMPUTER_SCIENCE,
			MATHS,
			ENGLISH,
			HISTORY,
			BIOLOGY,
			RELIGOUS_STUDIES,
		};

	/**
	 * A public read-only list of all the '<em><b>Subjects</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Subjects> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Subjects</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Subjects get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Subjects result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Subjects</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Subjects getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Subjects result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Subjects</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Subjects get(int value) {
		switch (value) {
			case COMPUTER_SCIENCE_VALUE: return COMPUTER_SCIENCE;
			case MATHS_VALUE: return MATHS;
			case ENGLISH_VALUE: return ENGLISH;
			case HISTORY_VALUE: return HISTORY;
			case BIOLOGY_VALUE: return BIOLOGY;
			case RELIGOUS_STUDIES_VALUE: return RELIGOUS_STUDIES;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Subjects(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Subjects
