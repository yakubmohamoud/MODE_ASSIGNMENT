/*
 * 
 */
package conference.diagram.providers;

import conference.diagram.part.ConferenceDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ConferenceDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ConferenceDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
