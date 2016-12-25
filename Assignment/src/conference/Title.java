/**
 */
package conference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Title</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see conference.ConferencePackage#getTitle()
 * @model
 * @generated
 */
public enum Title implements Enumerator {
	/**
	 * The '<em><b>Dr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DR_VALUE
	 * @generated
	 * @ordered
	 */
	DR(0, "Dr", "Dr"),

	/**
	 * The '<em><b>Professor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	PROFESSOR(1, "Professor", "Professor"),

	/**
	 * The '<em><b>Mr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MR_VALUE
	 * @generated
	 * @ordered
	 */
	MR(2, "Mr", "Mr"),

	/**
	 * The '<em><b>Mrs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MRS_VALUE
	 * @generated
	 * @ordered
	 */
	MRS(3, "Mrs", "Mrs"),

	/**
	 * The '<em><b>Miss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISS_VALUE
	 * @generated
	 * @ordered
	 */
	MISS(4, "Miss", "Miss"),

	/**
	 * The '<em><b>Lord</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LORD_VALUE
	 * @generated
	 * @ordered
	 */
	LORD(5, "Lord", "Lord"),

	/**
	 * The '<em><b>Ms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_VALUE
	 * @generated
	 * @ordered
	 */
	MS(6, "Ms", "Ms"),

	/**
	 * The '<em><b>Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER(7, "Master", "Master");

	/**
	 * The '<em><b>Dr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DR
	 * @model name="Dr"
	 * @generated
	 * @ordered
	 */
	public static final int DR_VALUE = 0;

	/**
	 * The '<em><b>Professor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Professor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROFESSOR
	 * @model name="Professor"
	 * @generated
	 * @ordered
	 */
	public static final int PROFESSOR_VALUE = 1;

	/**
	 * The '<em><b>Mr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MR
	 * @model name="Mr"
	 * @generated
	 * @ordered
	 */
	public static final int MR_VALUE = 2;

	/**
	 * The '<em><b>Mrs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mrs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MRS
	 * @model name="Mrs"
	 * @generated
	 * @ordered
	 */
	public static final int MRS_VALUE = 3;

	/**
	 * The '<em><b>Miss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Miss</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MISS
	 * @model name="Miss"
	 * @generated
	 * @ordered
	 */
	public static final int MISS_VALUE = 4;

	/**
	 * The '<em><b>Lord</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lord</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LORD
	 * @model name="Lord"
	 * @generated
	 * @ordered
	 */
	public static final int LORD_VALUE = 5;

	/**
	 * The '<em><b>Ms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ms</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MS
	 * @model name="Ms"
	 * @generated
	 * @ordered
	 */
	public static final int MS_VALUE = 6;

	/**
	 * The '<em><b>Master</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Master</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASTER
	 * @model name="Master"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_VALUE = 7;

	/**
	 * An array of all the '<em><b>Title</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Title[] VALUES_ARRAY =
		new Title[] {
			DR,
			PROFESSOR,
			MR,
			MRS,
			MISS,
			LORD,
			MS,
			MASTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Title</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Title> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Title</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Title get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Title result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Title</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Title getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Title result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Title</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Title get(int value) {
		switch (value) {
			case DR_VALUE: return DR;
			case PROFESSOR_VALUE: return PROFESSOR;
			case MR_VALUE: return MR;
			case MRS_VALUE: return MRS;
			case MISS_VALUE: return MISS;
			case LORD_VALUE: return LORD;
			case MS_VALUE: return MS;
			case MASTER_VALUE: return MASTER;
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
	private Title(int value, String name, String literal) {
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
	
} //Title
