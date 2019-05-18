package de.ugoe.cs.as.utils;

public class StringFormater {
	public static String toCamelCase(String s){
		String[] parts = s.split("_");
		String camelCaseString = parts[0];
		
		for (int i = 1; i < parts.length; i++){
			camelCaseString = camelCaseString + toProperString(parts[i]);
		}
		return camelCaseString;
	}
	
	private static String toProperString(String s){
		return s.substring(0,1).toUpperCase() +
				s.substring(1).toLowerCase();
	}
}
