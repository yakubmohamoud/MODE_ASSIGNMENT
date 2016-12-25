/*
 * 
 */
package conference.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import conference.diagram.edit.parts.ConferenceEditPart;
import conference.diagram.edit.parts.ConferenceEditPartFactory;
import conference.diagram.part.ConferenceVisualIDRegistry;

/**
 * @generated
 */
public class ConferenceEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ConferenceEditPartProvider() {
		super(new ConferenceEditPartFactory(), ConferenceVisualIDRegistry.TYPED_INSTANCE, ConferenceEditPart.MODEL_ID);
	}

}
