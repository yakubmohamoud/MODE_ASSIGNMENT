/*
* 
*/
package conference.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import conference.Seat;
import conference.Table;
import conference.diagram.edit.parts.AttendeeEditPart;
import conference.diagram.edit.parts.AttendeeNameEditPart;
import conference.diagram.edit.parts.ConferenceEditPart;
import conference.diagram.edit.parts.SeatEditPart;
import conference.diagram.edit.parts.TableEditPart;
import conference.diagram.part.ConferenceDiagramEditorPlugin;
import conference.diagram.part.ConferenceVisualIDRegistry;
import conference.diagram.providers.ConferenceElementTypes;
import conference.diagram.providers.ConferenceParserProvider;

/**
 * @generated
 */
public class ConferenceNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ConferenceDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ConferenceDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ConferenceNavigatorItem && !isOwnView(((ConferenceNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ConferenceNavigatorGroup) {
			ConferenceNavigatorGroup group = (ConferenceNavigatorGroup) element;
			return ConferenceDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ConferenceNavigatorItem) {
			ConferenceNavigatorItem navigatorItem = (ConferenceNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ConferenceVisualIDRegistry.getVisualID(view)) {
		case ConferenceEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?conference?Conference", ConferenceElementTypes.Conference_1000); //$NON-NLS-1$
		case AttendeeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?conference?Attendee", ConferenceElementTypes.Attendee_2001); //$NON-NLS-1$
		case SeatEditPart.VISUAL_ID:
			return getImage("Navigator?Link?conference?Seat", ConferenceElementTypes.Seat_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ConferenceDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ConferenceElementTypes.isKnownElementType(elementType)) {
			image = ConferenceElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ConferenceNavigatorGroup) {
			ConferenceNavigatorGroup group = (ConferenceNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ConferenceNavigatorItem) {
			ConferenceNavigatorItem navigatorItem = (ConferenceNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ConferenceVisualIDRegistry.getVisualID(view)) {
		case ConferenceEditPart.VISUAL_ID:
			return getConference_1000Text(view);
		case AttendeeEditPart.VISUAL_ID:
			return getAttendee_2001Text(view);
		case SeatEditPart.VISUAL_ID:
			return getSeat_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getConference_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getAttendee_2001Text(View view) {
		IParser parser = ConferenceParserProvider.getParser(ConferenceElementTypes.Attendee_2001,
				view.getElement() != null ? view.getElement() : view,
				ConferenceVisualIDRegistry.getType(AttendeeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConferenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSeat_4001Text(View view) {
		Seat domainModelElement = (Seat) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getSeatId());
		} else {
			ConferenceDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ConferenceEditPart.MODEL_ID.equals(ConferenceVisualIDRegistry.getModelID(view));
	}

}
