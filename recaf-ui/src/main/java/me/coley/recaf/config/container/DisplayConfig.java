package me.coley.recaf.config.container;

import me.coley.recaf.config.ConfigContainer;
import me.coley.recaf.config.ConfigID;
import me.coley.recaf.config.Group;
import me.coley.recaf.ui.util.Lang;

/**
 * Config container for display values.
 *
 * @author Matt Coley
 */
public class DisplayConfig implements ConfigContainer {
	/**
	 * Maximum depth of a directory structure to display before it gets truncated.
	 */
	@Group("tree")
	@ConfigID("maxtreedirectorydepth")
	public int maxTreeDirectoryDepth = 35;

	/**
	 * Maximum length of a tree item's text before it gets truncated.
	 */
	@Group("tree")
	@ConfigID("maxtreetextlength")
	public int maxTreeTextLength = 100;

	/**
	 * Show the file filter buttons in workspace tree. Disabling frees up some space.
	 */
	@Group("tree")
	@ConfigID("showfilterbuttons")
	public boolean showFilterButtons = true;

	/**
	 * Prompt the user to double check if they want to close the workspace.
	 */
	@Group("workspace")
	@ConfigID("promptcloseworkspace")
	public boolean promptCloseWorkspace = true;

	@Override
	public String displayName() {
		return Lang.get(internalName());
	}

	@Override
	public String internalName() {
		return "conf.display";
	}
}