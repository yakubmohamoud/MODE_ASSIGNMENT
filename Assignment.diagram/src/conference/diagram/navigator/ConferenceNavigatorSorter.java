/*
* 
*/
package conference.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import conference.diagram.part.ConferenceVisualIDRegistry;

/**
 * @generated
 */
public class ConferenceNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 4002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ConferenceNavigatorItem) {
			ConferenceNavigatorItem item = (ConferenceNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ConferenceVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
