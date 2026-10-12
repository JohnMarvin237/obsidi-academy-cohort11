package com.bptn.course._10_sets_maps._custom_exception_with_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Store {
    
    // create the map instance variable
	private Map<String, Integer> products = new HashMap<>();
    
    public Store() {
        // Initialize the products map with default values
    	products.put("apple", 10);
    	products.put("banana", 5);
    	products.put("orange", 0);
    }

    public void purchase(String product, int quantity) throws OutOfStockException {
        // Check if the product is available in the store. Hint: Use the map
        if (!products.containsKey(product)){
        	throw new OutOfStockException("Product is unavailable!");
            // If not, throw an OutOfStockException with a message indicating the product is not available.
            
        }
        // Check if there is enough stock for the desired quantity. Hint: Use the map
        if (products.get(product) < quantity){
            // If not, throw an OutOfStockException with a message indicating the product is out of stock. 
        	throw new OutOfStockException("Product is out of stock!"); 
        }
    }
}