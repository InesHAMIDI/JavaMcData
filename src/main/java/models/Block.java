package main.java.models;

import java.util.Map;

public class Block {

	int id;
	String nameString;
	String displayName;
	float hardness;
	float resistance;
	int stacksize;
	boolean diggable;
	String material;
	boolean transparent;
	int emitLight;
	int filterLight;
	int defaultState;
	int minStateId;
	int maxStateId;
	String[] states;
	Map<String, Boolean>[] harvestTools;
	int drop;
	String boundingBox;

}
