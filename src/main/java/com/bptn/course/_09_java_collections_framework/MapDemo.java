package com.bptn.course._09_java_collections_framework;

import java.util.*;

public class MapDemo {
	
	public static void printMap(Map<Integer,String> myMap) {
		for (Map.Entry<Integer, String> entry : myMap.entrySet()){
		      System.out.println(entry.getKey() + " : " + entry.getValue());
		    }
	}
	public static void main(String[] args) {
//		Create HashMap 
		Map<Integer, String> numbers = new HashMap<>();
		
//		Add key-value pairs 
		numbers.put(1, "one");
		numbers.put(2, "two");
		numbers.put(3, "three");
		numbers.put(4, "four");
		numbers.put(5, "five");
		numbers.put(6, "six");
		numbers.put(7, "seven");
		numbers.put(8, "eight");
		numbers.put(9, "nine");
		numbers.put(10, "ten");
		
//		Print out the map 
		
		printMap(numbers);
		
//		remove the value whose key is 7 
		numbers.remove(7);
		
//		Add another key-pair values 11: eleven
		numbers.put(11, "eleven");
		
//		Print out the map 
		printMap(numbers);
    }
}
