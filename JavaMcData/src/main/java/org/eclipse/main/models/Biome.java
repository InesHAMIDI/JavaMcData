package org.eclipse.main.models;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//"./minecraft-data/data/pc/" + version + "/biomes.json"
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Biome {

	private int id;
	private String name;
	private String category;
	private float temperature;
	private String precipitation;
	private String dimension;
	private String displayName;
	private String color;
	private float rainfall;

	Collection<Biome> biomes;

	public Biome getById(int id, Collection<Biome> biomes) {
		for (Biome biome : biomes) {
			if (biome.getId() == id) {
				return biome;
			}
		}
		return null;
	}

	public Biome getByName(String name, Collection<Biome> biomes) {
		for (Biome biome : this.biomes) {
			if (biome.getName().equals(name)) {
				return biome;
			}
		}
		return null;
	}

	public Collection<Biome> generateBiomes(String version) {
		//JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("employees.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONArray biomeArray = (JSONArray) obj;             

            for (Object b : biomeArray) {
				b = parseObject((JSONObject)b);
			};
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
		
		
		return this.biomes;

	}

	private Biome parseObject(JSONObject emp) {
		Biome biome = null;
		
		return biome;
	}
}
