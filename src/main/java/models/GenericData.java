package main.java.models;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class GenericData {

	private int id;
	private String name;
	
	private List<GenericData> datas;
	
	public GenericData getById(int id) {
		for (GenericData genericData : datas) {
			if(genericData.getId() == id) {
				return genericData;
			}
		}
		return null;
	}
	
	public GenericData getByName(String name) {
		for (GenericData genericData : datas) {
			if(genericData.getName() == name) {
				return genericData; 
			}
		}
		return null;
	}
	
	public List<GenericData> generateData(String version, String dataName){
		List<GenericData> datas = null;
		
		// read json and write to db
					ObjectMapper mapper = new ObjectMapper();
					TypeReference<List<GenericData>> typeReference = new TypeReference<List<GenericData>>(){};
					InputStream inputStream = TypeReference.class.getResourceAsStream("./minecraft-data/data/pc/" + version + dataName + ".json");
					try {
						datas = mapper.readValue(inputStream,typeReference);
					} catch (IOException e){
						System.out.println("Unable to parse data: " + e.getMessage());
					}
		
		return datas;
	}
	
}
