/*
 *
 * This file is part of three4g.
 *
 * three4g is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesse General Public License as 
 * published by the Free Software Foundation, either version 3 of 
 * the License, or (at your option) any later version.
 *
 * three4g is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public 
 * License along with three4g. If not, see <http://www.gnu.org/licenses/>.
 *
 * (c) 2012 by Oliver Damm, Am Wasserberg 8, 22869 Schenefeld
 *
 * mail: oliver [dot] damm [at] gmx [dot] de
 * web: http://www.blimster.net 
 */
package net.blimster.gwt.threejs.scenes;

import net.blimster.gwt.threejs.math.Color;
import net.blimster.gwt.threejs.scenes.Fog;
import net.blimster.gwt.threejs.scenes.AbstractFog;

/**
 * This file is generated, do not edit.
 */
public final class Fog extends AbstractFog
{
	
	protected Fog()
	{
		super();
	}
	
	
	public static native Fog create()
	/*-{
		
		return new $wnd.THREE.Fog();
		
	}-*/;
	
	
	
	public static native Fog create(Color color, int near, int far)
	/*-{
		
		return new $wnd.THREE.Fog(color, near, far);
		
	}-*/;
	
	
	public final native void setNear(int near)
	/*-{
		
		this.near = near;
		
	}-*/;
	
	public final native int getNear()
	/*-{
		
		return this.near;
		
	}-*/;
	
	public final native void setFar(int far)
	/*-{
		
		this.far = far;
		
	}-*/;
	
	public final native int getFar()
	/*-{
		
		return this.far;
		
	}-*/;
	
	
	public final native Fog clone()
	/*-{
		
		return this.clone();
		
	}-*/;
	
	
}
