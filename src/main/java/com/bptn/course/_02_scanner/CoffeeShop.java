package com.bptn.course._02_scanner;

import java.util.*;

public class CoffeeShop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String drink="";
        double price=0;
        int choice=0;
//        Boolean isTrue = true;
        
        System.out.println("\nWelcome to JavaBean Café!");
        System.out.println("Please select a drink:");
        System.out.println("1. Espresso - $3.00\n2. Chai Latte - $4.50\n3. Cappuccino - $4.00\n4. Americano - $3.50\n5. Matcha - $4.75");

        // Ask the user to enter a number between 1 to 5 to choose 
        System.out.print("Enter your choice (1-5): ");
        choice = scanner.nextInt();

        switch (choice) {
          case 1:
            price = 3.00;
            drink = "Espresso";
            break;
          case 2:
            price = 4.50;
            drink = "Chai Latte";
            break;
          case 3:
            price = 4.00;
            drink = "Cappuccino";
            break;
          case 4:
            price = 3.50;
            drink = "Americano";
            break;
          case 5: 
            price = 4.75;
            drink = "Matcha";
            break;
          default:
            System.out.println("Invalid choice");
        }
        
        if (choice >= 1 && choice <= 5) {
          System.out.printf("You selected %s. Price: $%.2f%n", drink, price);
          System.out.println("Thank you for your order!");
        }        
        scanner.close();

	}

}
