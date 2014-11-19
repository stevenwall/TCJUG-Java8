package com.wall.steve.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

public class Ex5Nashorn {
	public static void main(String[] args) throws FileNotFoundException,
			ScriptException, NoSuchMethodException {
		ScriptEngineManager engineManager = new ScriptEngineManager();
		ScriptEngine engine = engineManager.getEngineByName("nashorn");

		engine.eval(new FileReader("./src/com/wall/steve/demo/DistanceConverter.js"));
	    Invocable invocable = (Invocable) engine;

	    Object response = invocable.invokeFunction("milesToKmReturnArray", 26.2);
	    ScriptObjectMirror mirror = (ScriptObjectMirror) response;
	    System.out.println(mirror.values() );
	    System.out.println(mirror.values().getClass());
	    
	    response = invocable.invokeFunction("milesToKmReturnJson", 26.2);
	    mirror = (ScriptObjectMirror) response;
	    System.out.println(Arrays.asList(mirror.getOwnKeys(true)));
	    System.out.println(mirror.values() );
	    System.out.println(mirror.values().getClass());
	    ScriptObjectMirror distances = (ScriptObjectMirror) mirror.get("distances");
	    System.out.println(Arrays.asList(distances.getOwnKeys(true)));
	    System.out.println(distances.values());
	    System.out.println(distances.values().getClass());
	    
	}
}
