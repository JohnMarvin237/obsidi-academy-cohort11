package com.bptn.course._06_smart_home_device;

//Controllable.java - The "Can Change Settings" contract
public interface Controllable {
 void changeSetting(String settingName, String value); // Anyone implementing this MUST provide this method
}
