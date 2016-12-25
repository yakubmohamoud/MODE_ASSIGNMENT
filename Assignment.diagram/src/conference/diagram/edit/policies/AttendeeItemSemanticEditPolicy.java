/*
* 
*/
package conference.diagram.edit.policies;

import java.util.Iterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import conference.diagram.edit.commands.SeatCreateCommand;
import conference.diagram.edit.commands.SeatReorientCommand;
import conference.diagram.edit.parts.SeatEditPart;
import conference.diagram.part.ConferenceVisualIDRegistry;
import conference.diagram.providers.ConferenceElementTypes;

/**
 * @generated
 */
public class AttendeeItemSemanticEditPolicy extends ConferenceBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AttendeeItemSemanticEditPolicy() {
		super(ConferenceElementTypes.Attendee_2001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ConferenceVisualIDRegistry.getVisualID(incomingLink) == SeatEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ConferenceElementTypes.Seat_4001 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ConferenceElementTypes.Seat_4001 == req.getElementType()) {
			return getGEFWrapper(new SeatCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	* Returns command to reorient EClass based link. New link target or source
	* should be the domain model element associated with this node.
	* 
	* @generated
	*/
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case SeatEditPart.VISUAL_ID:
			return getGEFWrapper(new SeatReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
