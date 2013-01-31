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
package net.blimster.gwt.threejsx.extras.geometries;

import net.blimster.gwt.threejs.core.Face;
import net.blimster.gwt.threejs.core.Face4;
import net.blimster.gwt.threejs.core.Geometry;
import net.blimster.gwt.threejs.math.UV;
import net.blimster.gwt.threejs.math.Vector3;
import net.blimster.gwt.threejsx.util.Arrays;

import com.google.gwt.core.client.JsArray;

/**
 * @author Oliver Damm
 */
public final class HeightMapGeometry extends Geometry
{

    protected HeightMapGeometry()
    {
	super();
    }

    public static HeightMapGeometry create(double width, double height, int segmentsWidth, int segmentsHeight)
    {
	return HeightMapGeometry.create(width, height, segmentsWidth, segmentsHeight, null);
    }

    public static HeightMapGeometry create(double width, double height, int segmentsWidth, int segmentsHeight,
	    HeightProvider heightProvider)
    {
	HeightMapGeometry result = HeightMapGeometry.createNative();

	double width_half = width / 2;
	double height_half = height / 2;
	int gridX = segmentsWidth;
	int gridY = segmentsHeight;
	int gridX1 = gridX + 1;
	int gridY1 = gridY + 1;
	double segment_width = width / gridX;
	double segment_height = height / gridY;

	double minX = 0.0;
	double maxX = 0.0;
	double minY = 0.0;
	double maxY = 0.0;

	for (int iy = 0; iy < gridY1; iy++)
	{
	    for (int ix = 0; ix < gridX1; ix++)
	    {
		double x = ix * segment_width - width_half;
		double y = iy * segment_height - height_half;

		minX = Math.min(x, minX);
		maxX = Math.max(x, maxX);

		minY = Math.min(y, minY);
		maxY = Math.max(y, maxY);

		result.getVertices().push(Vector3.create(x, -y, 0.0));
	    }
	}

	if (heightProvider != null)
	{
	    double factor = 2.0 / (Math.max(maxX - minX, maxY - minY));

	    JsArray<Vector3> vertices = result.getVertices();
	    for (int i = 0; i < vertices.length(); i++)
	    {
		Vector3 v = vertices.get(i);
		v.setZ(heightProvider.getHeight(v.getX() * factor, v.getY() * factor));
	    }
	}

	for (int iy = 0; iy < gridY; iy++)
	{
	    for (int ix = 0; ix < gridX; ix++)
	    {
		int a = ix + gridX1 * iy;
		int b = ix + gridX1 * (iy + 1);
		int c = (ix + 1) + gridX1 * (iy + 1);
		int d = (ix + 1) + gridX1 * iy;

		Face face = Face4.create(a, b, c, d);

		result.getFaces().push(face);
		result.getFaceVertexUvs().get(0).push(
			Arrays.createArray(UV.create(ix / (double) gridX, iy / (double) gridY), UV.create(ix
				/ (double) gridX, (iy + 1) / (double) gridY), UV.create((ix + 1) / (double) gridX,
				(iy + 1) / (double) gridY), UV.create((ix + 1) / (double) gridX, iy / (double) gridY)));
	    }
	}

	result.computeFaceNormals();
	result.computeCentroids();

	return result;
    }

    private static native HeightMapGeometry createNative()
    /*-{

		return new $wnd.THREE.Geometry();

    }-*/;

}
