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
import com.google.gwt.core.client.JsArrayInteger;
import net.blimster.gwt.threejs.math.Vector3;
import net.blimster.gwt.threejs.core.Object3D;
import com.google.gwt.core.client.JsArray;import net.blimster.gwt.threejs.cameras.Camera;
import net.blimster.gwt.threejs.math.RaycasterIntersect;

/**
 * This file is generated, do not edit.
 */
public final class Raycaster extends JavaScriptObject
{
	
	protected Raycaster()
	{
		super();
	}
	
	
	
	
	
	public static native Raycaster create(Vector3 origin, Vector3 direction)
	/*-{
		
		return new $wnd.THREE.Raycaster(origin, direction);
		
	}-*/;
	
	
	public final native void setPrecision(double precision)
	/*-{
		
		this.precision = precision;
		
	}-*/;
	
	public final native double getPrecision()
	/*-{
		
		return this.precision;
		
	}-*/;
	
	
	public final native Vector3 unprojectVector(Vector3 vector, Camera camera)
	/*-{
		
		return this.unprojectVector(vector, camera);
		
	}-*/;
	
	public final native JsArray<RaycasterIntersect> intersectObject(Object3D object, boolean recursive)
	/*-{
		
		return this.intersectObject(object, recursive);
		
	}-*/;
	
	public final native JsArray<RaycasterIntersect> intersectObjects(JsArray<Object3D> objects, boolean recursive)
	/*-{
		
		return this.intersectObjects(objects, recursive);
		
	}-*/;
	
	
}
