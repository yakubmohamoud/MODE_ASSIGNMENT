/*
 * 
 */
package conference.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import conference.ConferencePackage;
import conference.diagram.edit.parts.AttendeeEditPart;
import conference.diagram.edit.parts.ConferenceEditPart;
import conference.diagram.edit.parts.SeatEditPart;
import conference.diagram.edit.parts.TableEditPart;
import conference.diagram.part.ConferenceDiagramEditorPlugin;

/**
 * @generated
 */
public class ConferenceElementTypes {

	/**
	* @generated
	*/
	private ConferenceElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ConferenceDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Conference_1000 = getElementType("Assignment.diagram.Conference_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Attendee_2001 = getElementType("Assignment.diagram.Attendee_2001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Seat_4001 = getElementType("Assignment.diagram.Seat_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Conference_1000, ConferencePackage.eINSTANCE.getConference());

			elements.put(Attendee_2001, ConferencePackage.eINSTANCE.getAttendee());

			elements.put(Seat_4001, ConferencePackage.eINSTANCE.getSeat());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Conference_1000);
			KNOWN_ELEMENT_TYPES.add(Attendee_2001);
			KNOWN_ELEMENT_TYPES.add(Seat_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ConferenceEditPart.VISUAL_ID:
			return Conference_1000;
		case AttendeeEditPart.VISUAL_ID:
			return Attendee_2001;
		case SeatEditPart.VISUAL_ID:
			return Seat_4001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return conference.diagram.providers.ConferenceElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return conference.diagram.providers.ConferenceElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return conference.diagram.providers.ConferenceElementTypes.getElement(elementTypeAdapter);
		}
	};

}
