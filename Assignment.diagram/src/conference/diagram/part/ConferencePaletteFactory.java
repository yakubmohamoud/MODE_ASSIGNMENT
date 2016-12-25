
/*
 * 
 */
package conference.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import conference.diagram.providers.ConferenceElementTypes;

/**
 * @generated
 */
public class ConferencePaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAttendee1CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createSeat1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttendee1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Attendee1CreationTool_title,
				Messages.Attendee1CreationTool_desc, Collections.singletonList(ConferenceElementTypes.Attendee_2001));
		entry.setId("createAttendee1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConferenceElementTypes.getImageDescriptor(ConferenceElementTypes.Attendee_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSeat1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Seat1CreationTool_title,
				Messages.Seat1CreationTool_desc, Collections.singletonList(ConferenceElementTypes.Seat_4001));
		entry.setId("createSeat1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConferenceElementTypes.getImageDescriptor(ConferenceElementTypes.Seat_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
