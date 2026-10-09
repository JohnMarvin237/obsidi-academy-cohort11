package com.bptn.course._09_java_collections_framework;

import java.util.*;

public class ArrayListFromArray {

    public static void main(String[] args) {

       String[] names = {"Dakota", "Madison", "Brooklyn"};
       ArrayList<String> namesList = new ArrayList<String>(Arrays.asList(names));
       System.out.println(namesList);

       /*
       Arrays.asList(names) -> Returns a fixed-size list backed by the specified array. Since the returned List is a fixed-size List we can’t add more element(s). An attempt of adding more elements would cause UnsupportedOperationException. It is therefore recommended to create new ArrayList and pass Arrays.asList(array reference) as an argument to it.
       */
    }
}
