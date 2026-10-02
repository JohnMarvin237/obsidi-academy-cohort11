package com.bptn.course_oop_concept.cafe_revenue_calculator;

public class CafeCalculator {

    public static void main(String[] args) {

        // --- Step 1: Calculate revenue for each item type using our custom method ---
        double coffeeRevenue = calculateItemRevenue(7.5, 100);
    	  double pastryRevenue = calculateItemRevenue(13, 10);

        // --- Step 2: Calculate the total daily revenue using another custom method ---
        double totalDailyRevenue = calculateDailyTotalRevenue(coffeeRevenue, pastryRevenue);

        // --- Step 3: Print out the results ---
        System.out.println("Daily Coffee Revenue: $"+coffeeRevenue);
    	  System.out.println("Daily Pastry Revenue: $"+pastryRevenue);
    	  System.out.println("Total Daily Revenue: $"+totalDailyRevenue);
    }

    public static double calculateItemRevenue( double pricePerItem, double numberOfItemSold ){
      return pricePerItem * numberOfItemSold;
    }

    public static double calculateDailyTotalRevenue( double coffeeRevenue, double pastryRevenue ){
      return coffeeRevenue + pastryRevenue;
    }
}