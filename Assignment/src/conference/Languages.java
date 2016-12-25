/**
 */
package conference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Languages</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see conference.ConferencePackage#getLanguages()
 * @model
 * @generated
 */
public enum Languages implements Enumerator {
	/**
	 * The '<em><b>English</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGLISH_VALUE
	 * @generated
	 * @ordered
	 */
	ENGLISH(0, "English", "English"),

	/**
	 * The '<em><b>French</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRENCH_VALUE
	 * @generated
	 * @ordered
	 */
	FRENCH(1, "French", "French"),

	/**
	 * The '<em><b>Spanish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPANISH_VALUE
	 * @generated
	 * @ordered
	 */
	SPANISH(2, "Spanish", "Spanish"),

	/**
	 * The '<em><b>German</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GERMAN_VALUE
	 * @generated
	 * @ordered
	 */
	GERMAN(3, "German", "German"),

	/**
	 * The '<em><b>Swedish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWEDISH_VALUE
	 * @generated
	 * @ordered
	 */
	SWEDISH(4, "Swedish", "Swedish"),

	/**
	 * The '<em><b>Arabic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARABIC_VALUE
	 * @generated
	 * @ordered
	 */
	ARABIC(5, "Arabic", "Arabic"),

	/**
	 * The '<em><b>Russian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUSSIAN_VALUE
	 * @generated
	 * @ordered
	 */
	RUSSIAN(6, "Russian", "Russian"),

	/**
	 * The '<em><b>Greek</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEK_VALUE
	 * @generated
	 * @ordered
	 */
	GREEK(7, "Greek", "Greek");

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
	public static final int ENGLISH_VALUE = 0;

	/**
	 * The '<em><b>French</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>French</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRENCH
	 * @model name="French"
	 * @generated
	 * @ordered
	 */
	public static final int FRENCH_VALUE = 1;

	/**
	 * The '<em><b>Spanish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spanish</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPANISH
	 * @model name="Spanish"
	 * @generated
	 * @ordered
	 */
	public static final int SPANISH_VALUE = 2;

	/**
	 * The '<em><b>German</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>German</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GERMAN
	 * @model name="German"
	 * @generated
	 * @ordered
	 */
	public static final int GERMAN_VALUE = 3;

	/**
	 * The '<em><b>Swedish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Swedish</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWEDISH
	 * @model name="Swedish"
	 * @generated
	 * @ordered
	 */
	public static final int SWEDISH_VALUE = 4;

	/**
	 * The '<em><b>Arabic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Arabic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARABIC
	 * @model name="Arabic"
	 * @generated
	 * @ordered
	 */
	public static final int ARABIC_VALUE = 5;

	/**
	 * The '<em><b>Russian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Russian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUSSIAN
	 * @model name="Russian"
	 * @generated
	 * @ordered
	 */
	public static final int RUSSIAN_VALUE = 6;

	/**
	 * The '<em><b>Greek</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greek</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREEK
	 * @model name="Greek"
	 * @generated
	 * @ordered
	 */
	public static final int GREEK_VALUE = 7;

	/**
	 * An array of all the '<em><b>Languages</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Languages[] VALUES_ARRAY =
		new Languages[] {
			ENGLISH,
			FRENCH,
			SPANISH,
			GERMAN,
			SWEDISH,
			ARABIC,
			RUSSIAN,
			GREEK,
		};

	/**
	 * A public read-only list of all the '<em><b>Languages</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Languages> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Languages</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Languages get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Languages result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Languages</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Languages getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Languages result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Languages</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Languages get(int value) {
		switch (value) {
			case ENGLISH_VALUE: return ENGLISH;
			case FRENCH_VALUE: return FRENCH;
			case SPANISH_VALUE: return SPANISH;
			case GERMAN_VALUE: return GERMAN;
			case SWEDISH_VALUE: return SWEDISH;
			case ARABIC_VALUE: return ARABIC;
			case RUSSIAN_VALUE: return RUSSIAN;
			case GREEK_VALUE: return GREEK;
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
	private Languages(int value, String name, String literal) {
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
	
} //Languages
