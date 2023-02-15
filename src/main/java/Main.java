package main.java;

import java.util.List;

import main.java.models.Biome;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Biome biome = new Biome();
		List<Biome> biomes = biome.generateData("1.19", "biomes");
	}
	

}
