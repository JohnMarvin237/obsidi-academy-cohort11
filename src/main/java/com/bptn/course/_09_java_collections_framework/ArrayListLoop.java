package com.bptn.course._09_java_collections_framework;

import java.util.*;

public class ArrayListLoop {
	public static void main(String[] args) {
//		For-each Loop
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(50);
        myList.add(30);
        myList.add(20);
        int total = 0;
        // enhanced for-each loop
        for (Integer value: myList) {
            total = total + value;
        }
        System.out.println(total);
        
        System.out.println("===============================================================================================");
//        For loop 
        for (int i=0; i < myList.size(); i++) {
            total = total + myList.get(i);
        }
    }
}
