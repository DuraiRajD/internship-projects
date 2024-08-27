package com.internproject;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        // Loop until the user guesses the correct number
        while (guess != targetNumber) {
            // Read the user's guess
            guess = scanner.nextInt();
            attempts++;

            // Provide hints to the user
            if (guess < targetNumber) {
                System.out.println("Too low! Try again:");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again:");
            } else {
                System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
            }
        }
    }
}

