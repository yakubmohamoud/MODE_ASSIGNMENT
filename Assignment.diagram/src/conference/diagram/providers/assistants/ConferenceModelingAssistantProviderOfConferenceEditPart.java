/*
 * 
 */
package conference.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import conference.diagram.providers.ConferenceElementTypes;
import conference.diagram.providers.ConferenceModelingAssistantProvider;

/**
 * @generated
 */
public class ConferenceModelingAssistantProviderOfConferenceEditPart extends ConferenceModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ConferenceElementTypes.Attendee_2001);
		return types;
	}

}
