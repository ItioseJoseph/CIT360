package edu.ItioseJoseph.test;

import java.util.HashMap;

public class applController {
	
public static HashMap<String,applHandler> applHandlerMap = new HashMap<String,applHandler>();
	
	public void applController() {
		
	}
	
	public static void command(String command,HashMap<String,Object>data) {
		applHandler aCommandapplHandler = applHandlerMap.get(command);
		if(aCommandapplHandler == null) {
			aCommandapplHandler.command(data);
		}
	}
	
	public static void mapCommand(String aCommand, applHandler aHandler) {
		applHandlerMap.put(aCommand,aHandler);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
