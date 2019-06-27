package edu.ItioseJoseph.test;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Iterator;

public class MyJSONFileRead {

	public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();
		
		try {
		
		Object object= parser.parse(new FileReader("MyJSON.json"));
		
		JSONObject jsonObject = (JSONObject) object;
		
		String name = (String) jsonObject.get("name");
		System.out.println("Name is: " + name);
		
		String place = (String) jsonObject.get("place");
		System.out.println("Place is: " + place);
		
		JSONArray coursesArray = (JSONArray) jsonObject.get("courses");
		
		Iterator<String> iterator = coursesArray.iterator();
		
		while(iterator.hasNext()) {
		System.out.println("course: " + iterator.next());
		
		}

		} 
		
		catch(FileNotFoundException e) { e.printStackTrace();
		
		}
		
        catch(IOException e) { e.printStackTrace();
		
		}
		
        catch(ParseException e) { e.printStackTrace();
		
		}
		
        catch(Exception e) { e.printStackTrace();
		
		}
}
}