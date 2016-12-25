/*
* 
*/
package conference.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import conference.Attendee;
import conference.Conference;
import conference.ConferencePackage;
import conference.Seat;
import conference.Table;
import conference.diagram.edit.parts.AttendeeEditPart;
import conference.diagram.edit.parts.ConferenceEditPart;
import conference.diagram.edit.parts.SeatEditPart;
import conference.diagram.edit.parts.TableEditPart;
import conference.diagram.providers.ConferenceElementTypes;

/**
 * @generated
 */
public class ConferenceDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ConferenceNodeDescriptor> getSemanticChildren(View view) {
		switch (ConferenceVisualIDRegistry.getVisualID(view)) {
		case ConferenceEditPart.VISUAL_ID:
			return getConference_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConferenceNodeDescriptor> getConference_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Conference modelElement = (Conference) view.getElement();
		LinkedList<ConferenceNodeDescriptor> result = new LinkedList<ConferenceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttendee().iterator(); it.hasNext();) {
			Attendee childElement = (Attendee) it.next();
			int visualID = ConferenceVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttendeeEditPart.VISUAL_ID) {
				result.add(new ConferenceNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConferenceLinkDescriptor> getContainedLinks(View view) {
		switch (ConferenceVisualIDRegistry.getVisualID(view)) {
		case ConferenceEditPart.VISUAL_ID:
			return getConference_1000ContainedLinks(view);
		case AttendeeEditPart.VISUAL_ID:
			return getAttendee_2001ContainedLinks(view);
		case SeatEditPart.VISUAL_ID:
			return getSeat_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConferenceLinkDescriptor> getIncomingLinks(View view) {
		switch (ConferenceVisualIDRegistry.getVisualID(view)) {
		case AttendeeEditPart.VISUAL_ID:
			return getAttendee_2001IncomingLinks(view);
		case SeatEditPart.VISUAL_ID:
			return getSeat_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConferenceLinkDescriptor> getOutgoingLinks(View view) {
		switch (ConferenceVisualIDRegistry.getVisualID(view)) {
		case AttendeeEditPart.VISUAL_ID:
			return getAttendee_2001OutgoingLinks(view);
		case SeatEditPart.VISUAL_ID:
			return getSeat_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConferenceLinkDescriptor> getConference_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConferenceLinkDescriptor> getAttendee_2001ContainedLinks(View view) {
		Attendee modelElement = (Attendee) view.getElement();
		LinkedList<ConferenceLinkDescriptor> result = new LinkedList<ConferenceLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Seat_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConferenceLinkDescriptor> getSeat_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConferenceLinkDescriptor> getAttendee_2001IncomingLinks(View view) {
		Attendee modelElement = (Attendee) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ConferenceLinkDescriptor> result = new LinkedList<ConferenceLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Seat_4001(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConferenceLinkDescriptor> getSeat_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConferenceLinkDescriptor> getAttendee_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConferenceLinkDescriptor> getSeat_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ConferenceLinkDescriptor> getContainedTypeModelFacetLinks_Seat_4001(Attendee container) {
		LinkedList<ConferenceLinkDescriptor> result = new LinkedList<ConferenceLinkDescriptor>();
		Seat link = container.getSeat();
		if (SeatEditPart.VISUAL_ID != ConferenceVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Attendee dst = link.getIncoming();
		List sources = link.getOutgoing();
		Object theSource = sources.size() == 1 ? sources.get(0) : null;
		if (false == theSource instanceof Table) {
			return result;
		}
		Table src = (Table) theSource;
		result.add(
				new ConferenceLinkDescriptor(src, dst, link, ConferenceElementTypes.Seat_4001, SeatEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConferenceLinkDescriptor> getIncomingTypeModelFacetLinks_Seat_4001(Attendee target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConferenceLinkDescriptor> result = new LinkedList<ConferenceLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConferencePackage.eINSTANCE.getSeat_Incoming()
					|| false == setting.getEObject() instanceof Seat) {
				continue;
			}
			Seat link = (Seat) setting.getEObject();
			if (SeatEditPart.VISUAL_ID != ConferenceVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getOutgoing();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof Table) {
				continue;
			}
			Table src = (Table) theSource;
			result.add(new ConferenceLinkDescriptor(src, target, link, ConferenceElementTypes.Seat_4001,
					SeatEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ConferenceNodeDescriptor> getSemanticChildren(View view) {
			return ConferenceDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConferenceLinkDescriptor> getContainedLinks(View view) {
			return ConferenceDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConferenceLinkDescriptor> getIncomingLinks(View view) {
			return ConferenceDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConferenceLinkDescriptor> getOutgoingLinks(View view) {
			return ConferenceDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
