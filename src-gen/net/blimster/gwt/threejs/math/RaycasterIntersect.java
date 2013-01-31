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
package net.blimster.gwt.threejs.math;

import com.google.gwt.core.client.JavaScriptObject;
import net.blimster.gwt.threejs.math.Vector3;
import net.blimster.gwt.threejs.core.Face;
import net.blimster.gwt.threejs.core.Object3D;

/**
 * This file is generated, do not edit.
 */
public final class RaycasterIntersect extends JavaScriptObject
{
	
	protected RaycasterIntersect()
	{
		super();
	}
	
	
	
	
	
		
	public final native void setDistance(double distance)
	/*-{
		
		this.distance = distance;
		
	}-*/;
	
	public final native double getDistance()
	/*-{
		
		return this.distance;
		
	}-*/;
	
	public final native void setPoint(Vector3 point)
	/*-{
		
		this.point = point;
		
	}-*/;
	
	public final native Vector3 getPoint()
	/*-{
		
		return this.point;
		
	}-*/;
	
	public final native void setFace(Face face)
	/*-{
		
		this.face = face;
		
	}-*/;
	
	public final native Face getFace()
	/*-{
		
		return this.face;
		
	}-*/;
	
	public final native void setFaceIndex(int faceIndex)
	/*-{
		
		this.faceIndex = faceIndex;
		
	}-*/;
	
	public final native int getFaceIndex()
	/*-{
		
		return this.faceIndex;
		
	}-*/;
	
	public final native void setObject(Object3D object)
	/*-{
		
		this.object = object;
		
	}-*/;
	
	public final native Object3D getObject()
	/*-{
		
		return this.object;
		
	}-*/;
	
	
	
}
