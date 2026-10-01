package com.bptn.course._01_variables;

public class SmartThermostat {

	public static void main(String[] args) {
		int temperature = 26;
        String timeOfDay = "night";

        String mode = (temperature < 18)
                        ? (timeOfDay.equals("morning") || timeOfDay.equals("evening") ? "HEAT" : "ECO")
                     : (temperature <= 25)
                        ? (timeOfDay.equals("morning") || timeOfDay.equals("evening") ? "COMFORT" : "ECO")
                     : (timeOfDay.equals("day") || timeOfDay.equals("afternoon") ? "COOL" : "ECO");

        System.out.println(mode);

	}

}
