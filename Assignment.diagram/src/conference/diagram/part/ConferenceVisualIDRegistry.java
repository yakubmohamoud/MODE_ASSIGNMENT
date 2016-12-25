/*
* 
*/
package conference.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import conference.Conference;
import conference.ConferencePackage;
import conference.diagram.edit.parts.AttendeeEditPart;
import conference.diagram.edit.parts.AttendeeNameEditPart;
import conference.diagram.edit.parts.ConferenceEditPart;
import conference.diagram.edit.parts.SeatEditPart;
import conference.diagram.edit.parts.TableEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ConferenceVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "Assignment.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ConferenceEditPart.MODEL_ID.equals(view.getType())) {
				return ConferenceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return conference.diagram.part.ConferenceVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ConferenceDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ConferencePackage.eINSTANCE.getConference().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Conference) domainElement)) {
			return ConferenceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = conference.diagram.part.ConferenceVisualIDRegistry.getModelID(containerView);
		if (!ConferenceEditPart.MODEL_ID.equals(containerModelID) && !"conference".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ConferenceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = conference.diagram.part.ConferenceVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ConferenceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ConferenceEditPart.VISUAL_ID:
			if (ConferencePackage.eINSTANCE.getAttendee().isSuperTypeOf(domainElement.eClass())) {
				return AttendeeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = conference.diagram.part.ConferenceVisualIDRegistry.getModelID(containerView);
		if (!ConferenceEditPart.MODEL_ID.equals(containerModelID) && !"conference".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ConferenceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = conference.diagram.part.ConferenceVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ConferenceEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ConferenceEditPart.VISUAL_ID:
			if (AttendeeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttendeeEditPart.VISUAL_ID:
			if (AttendeeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ConferencePackage.eINSTANCE.getSeat().isSuperTypeOf(domainElement.eClass())) {
			return SeatEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Conference element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ConferenceEditPart.VISUAL_ID:
			return false;
		case AttendeeEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return conference.diagram.part.ConferenceVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return conference.diagram.part.ConferenceVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return conference.diagram.part.ConferenceVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return conference.diagram.part.ConferenceVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return conference.diagram.part.ConferenceVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return conference.diagram.part.ConferenceVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
