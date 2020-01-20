package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 	Interface which allows processing from a file
 * 
 *	@author Rémi ESPIN
 */
public interface ISymptomReader {
	
	/**
	 * add symptoms in a list from a file
	 * 
	 * @param file with symptoms
	 *
	 * @return list of symptoms
	 *         
	 * @author Rémi ESPIN
	 */
	List<String> getSymptoms(String fileName);

	/**
	 * count occurences of symptoms from a list of symptoms
	 *
	 * @param list of symptoms
	 * 
	 * @return map of iteration of symptoms with their occurences
	 * 
	 * @author Rémi ESPIN
	 */
	public Map<String, Integer> getSymptomsWithOccurences(List<String> symptoms);

	/**
	 * write a new file from a map of symptoms
	 *
	 * @param map with symptoms and their occurences
	 * 
	 * @return file with number of iteration of each symptoms from the map in param
	 *        
	 * @author Rémi ESPIN
	 */
	void writeSymptomsAndOccurences(Map<String, Integer> mapSymptomsOccurences) throws IOException;
}
