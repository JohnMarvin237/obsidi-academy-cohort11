package com.bptn.course._09_java_collections_framework;

import java.util.*;

public class ListGetSet {
	public static void main(String[] args) {
	      ArrayList<String> nameList = new ArrayList<String>();
	      nameList.add("Diego");
	      nameList.add("Grace");
	      nameList.add("Deja");
	      System.out.println(nameList);
	      System.out.println(nameList.get(0));
	      System.out.println(nameList.get(1));
	      nameList.set(1, "John");
	      System.out.println(nameList);
	   }
}
