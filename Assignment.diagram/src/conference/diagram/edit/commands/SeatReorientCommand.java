/*
 * 
 */
package conference.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import conference.Attendee;
import conference.Seat;
import conference.Table;
import conference.diagram.edit.policies.ConferenceBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class SeatReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public SeatReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Seat) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Table && newEnd instanceof Table)) {
			return false;
		}
		Attendee target = getLink().getIncoming();
		if (!(getLink().eContainer() instanceof Attendee)) {
			return false;
		}
		Attendee container = (Attendee) getLink().eContainer();
		return ConferenceBaseItemSemanticEditPolicy.getLinkConstraints().canExistSeat_4001(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Attendee && newEnd instanceof Attendee)) {
			return false;
		}
		if (getLink().getOutgoing().size() != 1) {
			return false;
		}
		Table source = (Table) getLink().getOutgoing().get(0);
		if (!(getLink().eContainer() instanceof Attendee)) {
			return false;
		}
		Attendee container = (Attendee) getLink().eContainer();
		return ConferenceBaseItemSemanticEditPolicy.getLinkConstraints().canExistSeat_4001(container, getLink(), source,
				getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().getOutgoing().remove(getOldSource());
		getLink().getOutgoing().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setIncoming(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected Seat getLink() {
		return (Seat) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Table getOldSource() {
		return (Table) oldEnd;
	}

	/**
	* @generated
	*/
	protected Table getNewSource() {
		return (Table) newEnd;
	}

	/**
	* @generated
	*/
	protected Attendee getOldTarget() {
		return (Attendee) oldEnd;
	}

	/**
	* @generated
	*/
	protected Attendee getNewTarget() {
		return (Attendee) newEnd;
	}
}
