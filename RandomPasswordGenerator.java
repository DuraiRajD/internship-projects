package com.internproject;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Get password length from the user
        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Ask user for complexity options
        System.out.print("Include lowercase letters? (yes/no): ");
        boolean includeLowercase = scanner.nextLine().equalsIgnoreCase("yes");
        
        System.out.print("Include uppercase letters? (yes/no): ");
        boolean includeUppercase = scanner.nextLine().equalsIgnoreCase("yes");
        
        System.out.print("Include numbers? (yes/no): ");
        boolean includeNumbers = scanner.nextLine().equalsIgnoreCase("yes");
        
        System.out.print("Include special characters? (yes/no): ");
        boolean includeSpecialChars = scanner.nextLine().equalsIgnoreCase("yes");
        
        // Define character sets
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~";
        
        // Build the character set to use
        StringBuilder characterSet = new StringBuilder();
        if (includeLowercase) {
            characterSet.append(lowercase);
        }
        if (includeUppercase) {
            characterSet.append(uppercase);
        }
        if (includeNumbers) {
            characterSet.append(numbers);
        }
        if (includeSpecialChars) {
            characterSet.append(specialChars);
        }
        
        // If no character set is chosen, inform the user and exit
        if (characterSet.length() == 0) {
            System.out.println("No character sets selected. Unable to generate password.");
            return;
        }
        
        // Generate the random password
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterSet.length());
            password.append(characterSet.charAt(index));
        }
        
        // Display the generated password
        System.out.println("Generated password: " + password.toString());
    }
}
