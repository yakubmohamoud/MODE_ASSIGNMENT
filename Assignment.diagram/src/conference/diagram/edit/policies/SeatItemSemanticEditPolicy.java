/*
* 
*/
package conference.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import conference.diagram.providers.ConferenceElementTypes;

/**
 * @generated
 */
public class SeatItemSemanticEditPolicy extends ConferenceBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SeatItemSemanticEditPolicy() {
		super(ConferenceElementTypes.Seat_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
