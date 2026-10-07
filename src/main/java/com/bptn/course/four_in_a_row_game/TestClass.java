package com.bptn.course.four_in_a_row_game;

public class TestClass {
	public static void main(String[] args) {
//		Setup the board 
		Board board = new Board();
		
//		Setup the player
		Player[] players = new Player[2];
		
//		Setup the game
        Game fourInARowGame = new Game(players, board);
        
//      Start the game  
        fourInARowGame.play();
    }
}
