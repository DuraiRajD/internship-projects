package com.internproject;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Create a random number generator for the computer's move
        Random random = new Random();

        // Loop to allow multiple games
        while (true) {
            // Prompt the user to enter their move
            System.out.println("Enter your move (rock, paper, scissors). Enter 'quit' to exit the game:");
            String userMove = scanner.nextLine().toLowerCase();

            // Check if the user wants to quit the game
            if (userMove.equals("quit")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }

            // Validate user input
            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println("Invalid move. Please enter 'rock', 'paper', or 'scissors'.");
                continue;
            }

            // Generate the computer's move
            int computerMoveInt = random.nextInt(3);
            String computerMove;
            if (computerMoveInt == 0) {
                computerMove = "rock";
            } else if (computerMoveInt == 1) {
                computerMove = "paper";
            } else {
                computerMove = "scissors";
            }

            // Display both moves
            System.out.println("You chose: " + userMove);
            System.out.println("Computer chose: " + computerMove);

            // Determine the result
            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((userMove.equals("rock") && computerMove.equals("scissors")) ||
                       (userMove.equals("paper") && computerMove.equals("rock")) ||
                       (userMove.equals("scissors") && computerMove.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            // Prompt for another game
            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
