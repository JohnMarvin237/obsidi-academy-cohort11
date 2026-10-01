package com.bptn.course._03_scanner_user_input;

import java.util.*;

public class NegNumbers {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in) ;

        System.out.print("Provide a single numerical value: ");
        float number = myObj.nextFloat();

        String result="";

        if(number > 0){
          result= "positive";
        } else if(number < 0) {
          result= "negative";
        } else {
          result="equal to zero";
        }

        System.out.println("The number is " + result);
        myObj.close();

	}

}
