package main.java.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class Biome extends GenericData{
	
	private int id;
    private String name;
    private String category;
    private float temperature;
    private String precipitation;
    private String dimension;
    private String displayName;
    private String color;
    private float rainfall;

}
