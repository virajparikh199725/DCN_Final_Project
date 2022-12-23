//Author: Viraj Parikh (vp2359)
package edu.brown.cs.sdn.apps.l3routing;

import net.floodlightcontroller.core.module.IFloodlightService;

//Floodlight is a community-developed, open source, Java OpenFlow controller, supporting OpenFlow protocols 1.0 through 1.5
public interface IL3Routing extends IFloodlightService
{
	/**
	 * Get the table in which this application installs rules.
	 */
	public byte getTable();
}
