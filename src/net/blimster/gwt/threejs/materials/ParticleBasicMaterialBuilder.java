/*
 * (c) 2011 by Oliver Damm, Am Wasserberg 8, 22869 Schenefeld 
 */
package net.blimster.gwt.threejs.materials;

import net.blimster.gwt.threejs.textures.CombineOperation;
import net.blimster.gwt.threejs.textures.Texture;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author Kenny Sabir
 */
public final class ParticleBasicMaterialBuilder extends JavaScriptObject
{
	
    protected ParticleBasicMaterialBuilder()
    {
    }

    protected static ParticleBasicMaterialBuilder create()
    {

	return JavaScriptObject.createObject().cast();

    }

    public native ParticleBasicMaterialBuilder color(int color)
    /*-{

		this['color'] = color;
		return this;

    }-*/;


    public native ParticleBasicMaterialBuilder size(int size)
    /*-{

		this['size'] = size;
		return this;

    }-*/;


    public native ParticleBasicMaterialBuilder sizeAttenuation(boolean sizeAttenuation)
    /*-{

		this['sizeAttenuation'] = sizeAttenuation;
		return this;

    }-*/;
    
    public native ParticleBasicMaterialBuilder map(Texture map)
    /*-{

		this['map'] = map;
		return this;

    }-*/;



    public native ParticleBasicMaterialBuilder fog(boolean fog)
    /*-{

		this['fog'] = fog;
		return this;

    }-*/;


    public native ParticleBasicMaterialBuilder vertexColors(boolean vertexColors)
    /*-{

		this['vertexColors'] = vertexColors;
		return this;

    }-*/;


    public native ParticleBasicMaterial build()
    /*-{

		return new $wnd.THREE.ParticleBasicMaterial(this);

    }-*/;

}
