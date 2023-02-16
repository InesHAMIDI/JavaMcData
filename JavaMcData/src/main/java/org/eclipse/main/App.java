package org.eclipse.main;

import java.util.Collection;

import org.eclipse.main.models.Biome;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Biome biome = new Biome();
    	Collection<Biome> biomes = biome.generateBiomes("1.19"); 
    	
    	for (Biome b : biomes) {
			System.out.println(b.toString());
		}
    	
    	System.out.println(biome.getById(1, biomes));
    }
}
