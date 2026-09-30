package com.bptn.course._01_variables;

public class VariablesOperations {

	public static void main(String[] args) {
		
//		Variables declaration:
		int value1 = 96;
		int value2 = 30;
		
//		Operations declaration:
		int addition = value1 + value2;
		int substraction = value1 - value2;
		long multiplication = value1 * value2;
		double division = value1 / value2;
		
//		Print the results:
		System.out.println(value1 +" + "+ value2 + " = " + addition);
		System.out.println(value1 +" - "+ value2 + " = " + substraction);
		System.out.println(value1 +" * "+ value2 + " = " + multiplication);
		System.out.println(value1 +" / "+ value2 + " = " + division);
		
//		Reassign values:
		value1 = 17;
		value2 =10;
		
//		Print the new values: 
		System.out.println("value1 is now: " + value1 + " and value2 is now: " + value2);

	}

}
