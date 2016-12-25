/**
 */
package conference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Allergies</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see conference.ConferencePackage#getAllergies()
 * @model
 * @generated
 */
public enum Allergies implements Enumerator {
	/**
	 * The '<em><b>Dust</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUST_VALUE
	 * @generated
	 * @ordered
	 */
	DUST(0, "Dust", "Dust"),

	/**
	 * The '<em><b>Meat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAT_VALUE
	 * @generated
	 * @ordered
	 */
	MEAT(1, "Meat", "Meat"),

	/**
	 * The '<em><b>Fish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FISH_VALUE
	 * @generated
	 * @ordered
	 */
	FISH(2, "Fish", "Fish"),

	/**
	 * The '<em><b>Milk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILK_VALUE
	 * @generated
	 * @ordered
	 */
	MILK(3, "Milk", "Milk"),

	/**
	 * The '<em><b>Cheese</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEESE_VALUE
	 * @generated
	 * @ordered
	 */
	CHEESE(4, "Cheese", "Cheese"),

	/**
	 * The '<em><b>Nothing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTHING_VALUE
	 * @generated
	 * @ordered
	 */
	NOTHING(5, "Nothing", "Nothing");

	/**
	 * The '<em><b>Dust</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dust</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DUST
	 * @model name="Dust"
	 * @generated
	 * @ordered
	 */
	public static final int DUST_VALUE = 0;

	/**
	 * The '<em><b>Meat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Meat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEAT
	 * @model name="Meat"
	 * @generated
	 * @ordered
	 */
	public static final int MEAT_VALUE = 1;

	/**
	 * The '<em><b>Fish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fish</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FISH
	 * @model name="Fish"
	 * @generated
	 * @ordered
	 */
	public static final int FISH_VALUE = 2;

	/**
	 * The '<em><b>Milk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Milk</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MILK
	 * @model name="Milk"
	 * @generated
	 * @ordered
	 */
	public static final int MILK_VALUE = 3;

	/**
	 * The '<em><b>Cheese</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cheese</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHEESE
	 * @model name="Cheese"
	 * @generated
	 * @ordered
	 */
	public static final int CHEESE_VALUE = 4;

	/**
	 * The '<em><b>Nothing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nothing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTHING
	 * @model name="Nothing"
	 * @generated
	 * @ordered
	 */
	public static final int NOTHING_VALUE = 5;

	/**
	 * An array of all the '<em><b>Allergies</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Allergies[] VALUES_ARRAY =
		new Allergies[] {
			DUST,
			MEAT,
			FISH,
			MILK,
			CHEESE,
			NOTHING,
		};

	/**
	 * A public read-only list of all the '<em><b>Allergies</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Allergies> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allergies</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Allergies get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Allergies result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allergies</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Allergies getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Allergies result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allergies</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Allergies get(int value) {
		switch (value) {
			case DUST_VALUE: return DUST;
			case MEAT_VALUE: return MEAT;
			case FISH_VALUE: return FISH;
			case MILK_VALUE: return MILK;
			case CHEESE_VALUE: return CHEESE;
			case NOTHING_VALUE: return NOTHING;
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
	private Allergies(int value, String name, String literal) {
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
	
} //Allergies
