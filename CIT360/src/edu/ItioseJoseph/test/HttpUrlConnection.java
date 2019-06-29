package edu.ItioseJoseph.test;

import java.io.*;
import java.net.*;

public class HttpUrlConnection {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.joejoe.com");
			HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
			
			BufferedReader input = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			
			String urlInput;
			
			while ((urlInput = input.readLine()) != null)
				System.out.println(urlInput);
			
			input.close();
		}
		
		catch (Exception exc) {
			
			System.out.println(exc);
			
		}

	}

}
