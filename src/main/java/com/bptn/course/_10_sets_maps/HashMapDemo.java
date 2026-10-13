package com.bptn.course._10_sets_maps;

import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> people = new HashMap<>();
		people.put("Jonathan", 33);
		people.put("Steve", 30);
		people.put("John_MArvin", 32);
		
		for(Map.Entry<String, Integer> entry : people.entrySet()) {
			System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
		}
    }
}
