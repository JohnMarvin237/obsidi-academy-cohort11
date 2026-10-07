package com.bptn.course.four_in_a_row_game;

import java.util.Scanner;

public class Game {

    private Player[] players;
    private Board board;
    private static Scanner scanner = new Scanner(System.in);

    public Game(Player[] players, Board board) {
        // Let's default it two players for now. Later, you can improve upon this to allow the game creator to choose how many players are involved.
        this.players = players; // complete line.
        this.board = board; // complete line
    }

    public void setUpGame() {
        
//    	Enter the name of the first player 
    		System.out.println("Enter player 1's name: ");
        players[0] = new Player(scanner.nextLine(), "1");
        
//        Enter the name of second player and verify if it's different from the first one
        System.out.println("Enter player 2's name: ");
        String playerTwoName = scanner.nextLine(); 
        
        
        while (players[0].getName().equals(playerTwoName)) {
        		System.out.println("Error! Both Players cannot have the same name.");
            System.out.println("Enter player 2's name: ");
        		playerTwoName = scanner.nextLine();			
		}
        /** add logic to prevent a user from giving a second name that's equal to the first. Allow the user to try as long as the names are not different.*/

        /* wrap the code in here with a conditional block that enables the check described above. 
        
            System.out.println("Error! Both Players cannot have the same name.");
            System.out.println("Enter player 2's name: ");
            playerTwoName = scanner.nextLine();
        
        */
        players[1] = new Player(playerTwoName, "2");

        // set up the board using the appropriate method
        // print the board the using appropriate method
        board.boardSetUp();
        board.printBoard();
    }

//    Check if the current player is the winner
    public void printWinner(Player player) {    		
    		if(board.checkIfPlayerIsTheWinner(player.getPlayerNumber())) {    			
    			System.out.println(player.getName() + " is the winner");
    		}
    }

//    Change the current player to the next one
    public void playerTurn(Player currentPlayer) {
        int col = currentPlayer.makeMove();
        while (!board.addToken(col, currentPlayer.getPlayerNumber())) {
           // call board method to add token.
        		board.addToken(col, currentPlayer.getPlayerNumber());
        }
        // print board
        board.printBoard();
    }

//    Start the game
    public void play() {
        boolean noWinner = true;
        this.setUpGame();
        int currentPlayerIndex = 0;

        while (noWinner) {
            if (board.boardFull()) {  // provide condition
                System.out.println("Board is now full. Game Ends.");
                return;
            }
            Player currentPlayer = players[currentPlayerIndex];
            // Override default toString for Player class
            
            System.out.println("It is player " + currentPlayer.getPlayerNumber() + "'s turn. " + currentPlayer);
            
            playerTurn(currentPlayer);
            
            if (board.checkIfPlayerIsTheWinner(currentPlayer.getPlayerNumber())) {
                printWinner(currentPlayer);
                noWinner = false;
            } else {
                currentPlayerIndex =  (currentPlayerIndex + 1) % players.length ;// reassign the variable to allow the game to continue. Note the index would wrap back to the first player if we are at the end. Think of using modulus (%).
            }
        }
    }

}
