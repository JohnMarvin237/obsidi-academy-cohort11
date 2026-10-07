package com.bptn.course.four_in_a_row_game;

import java.util.Scanner;

/**
The player class is concerned with describing a player and things that relate to it. It keeps track of the name of a player, the order of the player in relation to other players in the game, and the move the player may want to make (which is just as simple as the user picking which column of the board they want their token to be dropped in). This class could also have logic to create only valid users. E.g. the playerNumber should not be greater than 4 based on the specification we've received.
*/
//import java.util.Scanner;

public class Player {

	private String name;
	private String number;
// Add other instance variable(s)


// Question: should scanner be static or not? Scanner can not be static, because we intend to use the Scanner class inside a non-static method and it throws an error with the execution
	private Scanner scanner = new Scanner(System.in);

	public Player(String name, String playerNumber) {
	    this.setName(name);
	    this.setNumber(playerNumber);
	}

// create getter methods
	public void setName(String name) {
		  this.name = name;
	 }
	
	 public void setNumber(String number) {
		  this.number = number;
	 }
	
	 public String getName() {
		  return this.name;
	 }
	
	 public String getNumber() {
		  return this.number;
	 }
	
	 public String getPlayerNumber(){
	  return this.number;
	 }

	 public int makeMove() {
	    System.out.println("Make your move. What column do you want to put a token in?");
	    int column = scanner.nextInt();
	    return column;
	 }
	
	 public String toString() {
	    return ("Player " + this.getNumber() + " is " + this.getName());
	 }
	 
	 
}