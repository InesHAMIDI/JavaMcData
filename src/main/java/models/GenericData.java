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
public class GenericData<T> {

	private int id;
	private String name;

	private List<T> datas;

	public T getById(int id) {
		for (T genericData : datas) {
			if (" " == " ") {
				return genericData;
			}
		}
		return null;
	}

	public T getByName(String name) {
		for (T genericData : datas) {
			if (name == name) {
				return genericData;
			}
		}
		return null;
	}

	public List<T> generateData(String version, String dataName) {
		List<T> datas = null;

		// read json and write to db
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<T>> typeReference = new TypeReference<List<T>>() {
		};
		InputStream inputStream = TypeReference.class
				.getResourceAsStream("./minecraft-data/data/pc/" + version + dataName + ".json");
		try {
			datas = mapper.readValue(inputStream, typeReference);
		} catch (IOException e) {
			System.out.println("Unable to parse data: " + e.getMessage());
		}
		
		for (T genericData : datas) {
			System.out.println(genericData);
		}
		return datas;
	}

}
