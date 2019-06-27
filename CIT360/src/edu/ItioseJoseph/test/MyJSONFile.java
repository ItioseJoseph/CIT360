package edu.ItioseJoseph.test;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.io.FileWriter;
import java.io.IOException;


public class MyJSONFile {

	public static void main(String[] args) {
		JSONObject object = new JSONObject();
		object.put("name", "Karim Hamid");
		object.put("place", "Nigeria");
		
		JSONArray array = new JSONArray();
		array.add("Hibernate");
		array.add("Qcjson");
		array.add("MVC");
		array.add("ACP");
		
		object.put("courses", array);
		
		try (FileWriter file = new FileWriter("MyJSON.json")) {
			
			file.write(object.toString());
			
			file.flush();
			
		} catch(IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(object);

	}

}
