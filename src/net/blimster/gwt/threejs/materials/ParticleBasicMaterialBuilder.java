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
	public enum Blending {
		NoBlending, NormalBlending, AdditiveBlending, SubtractiveBlending, MultiplyBlending, AdditiveAlphaBlending, CustomBlending
	}
//	THREE.NoBlending = 0;
//	THREE.NormalBlending = 1;
//	THREE.AdditiveBlending = 2;
//	THREE.SubtractiveBlending = 3;
//	THREE.MultiplyBlending = 4;
//	THREE.AdditiveAlphaBlending = 5;
//	THREE.CustomBlending = 6;
	
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
    
    public native ParticleBasicMaterialBuilder transparent(boolean transparent)
    /*-{

		this['transparent'] = transparent;
		return this;

    }-*/;

    public native ParticleBasicMaterialBuilder opacity(float opacity)
    /*-{

		this['opacity'] = opacity;
		return this;

    }-*/;
    
    public native ParticleBasicMaterialBuilder blending(Blending blending)
    /*-{

		this['blending'] = blending;
		return this;

    }-*/;

    public native ParticleBasicMaterialBuilder blending(int blending)
    /*-{

		this['blending'] = blending;
		return this;

    }-*/;

    



    public native ParticleBasicMaterial build()
    /*-{

		return new $wnd.THREE.ParticleBasicMaterial(this);

    }-*/;

}
