package org.eclipse.main.models;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Biome{
	
	private int id;
    private String name;
    private String category;
    private float temperature;
    private String precipitation;
    private String dimension;
    private String displayName;
    private String color;
    private float rainfall;

    List<Biome> biomes;
    
    public Biome getById(int id) {
    	for (Biome biome : biomes) {
			if(biome.getId() == id) {
				return biome;
			}
		}
    	return null;
    }
    
    public Biome getByName(String name) {
    	for (Biome biome : biomes) {
			if(biome.getName().equals(name)) {
				return biome;
			}
		}
    	return null;
    }
    
    public List<Biome> generateBiomes(String version) {
        
		List<Biome> biomes = null;
		
		ObjectMapper mapper = new ObjectMapper();
		InputStream is = Biome.class.getResourceAsStream("./minecraft-data/data/pc/" + version + "biomes.json");
		try {
			Biome biome = mapper.readValue(is, Biome.class);
			biomes.add(biome);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (Biome b : biomes) {
			System.out.println(b.toString());
		}
		return biomes;
	}
}
