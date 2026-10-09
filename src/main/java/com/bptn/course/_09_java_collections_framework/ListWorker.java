package com.bptn.course._09_java_collections_framework;
import java.util.*;

public class ListWorker {
	private ArrayList<String> nameList;

	   public ListWorker(ArrayList<String> theNames) {
	       nameList = theNames;
	   }

	   public boolean removeName(String name) {
	       boolean found = false;
	       int index = 0;
	       while (index < nameList.size() && !found) {
	           if (name.equals(nameList.get(index))) {
	               nameList.remove(index);
	               found = true;
	           }
	           else index++;
	       }
	       return found;
	    }

	    public static void main(String[] args) {
	        ArrayList<String> myList = new ArrayList<String>();
	        myList.add("Amun");
	        myList.add("Ethan");
	        myList.add("Donnie");
	        myList.add("Ethan");
	        ListWorker listWorker = new ListWorker(myList);
	        System.out.println("Before removing Ethan: " + listWorker.nameList);
	        listWorker.removeName("Ethan");
	        System.out.println("After removing Ethan: " + listWorker.nameList);
	    }
}
