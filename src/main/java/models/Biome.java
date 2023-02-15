package main.java.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
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
