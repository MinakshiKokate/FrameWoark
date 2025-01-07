package com.testinhShastra.utile;

public class App {// interview question how to get url in using properties
	
	
	private static String baseDir = System.getProperty("user.dir");
	private static String filepath = baseDir + "\\src\\test\\resources\\Proprties\\app.Properties";

	public static String getAppUrl(String env) {
		return PropertiesUtile.getProperty(filepath, env + ".url");
	}

	public static String getUserName(String env) {
		return PropertiesUtile.getProperty(filepath, env + ".username");
	}

	public static String getPassword(String env) {
		return PropertiesUtile.getProperty(filepath, env + ".password");
	}
}
