package com.bptn.course._10_sets_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapManipulation {

  // Create a method which print all the map components with key-value pairs
  public static void printMap(Map<String,Integer> map){
    for (Map.Entry<String, Integer> entry : map.entrySet()){
      System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
  }

	public static void main(String[] args) {
		// Create a HashMap and populate it with initial key-value pairs
		HashMap<String,Integer> map =new HashMap<>();
    map.put("A",1);
    map.put("B",2);
    map.put("C",3);

		// Print the size of the map
		System.out.println("Map size: " + map.size());

		// Use a for-each loop to print the key-value pairs in the map
		printMap(map);

		// Use get() method to get the value of key "A"
    System.out.println("Value of key 'A': " + map.get("A"));


        // use put() method to add a new key-value pair to the map
		map.put("D", 4);
    System.out.println("Map after adding a new key-value pair: ");
    printMap(map);

		// Use the containsKey() method to check if the key "C" exists in the map
		if(map.containsKey("C"))
      System.out.println("Key 'C' exists in the map");  
	}
}