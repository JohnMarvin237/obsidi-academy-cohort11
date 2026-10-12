package com.bptn.course._10_sets_maps._custom_exception_with_hashmap;

public class Main {
	public static void main(String[] args) {
	    Store store = new Store();
	    try {
	        store.purchase("apple",11);
	        System.out.println("Purchase successful!");
	    } catch (OutOfStockException e) {
	        System.out.println(e.getMessage());
	    }
	}
}
