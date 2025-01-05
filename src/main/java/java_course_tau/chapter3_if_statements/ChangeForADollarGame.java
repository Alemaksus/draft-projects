package java_course_tau.chapter3_if_statements;

/*
Game: Change for a dollar
The objective of the game is to enter enough change to equal exactly one dollar.
 */

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {
        // Define the values of the coins in cents
        final int PENNY_VALUE = 1;
        final int NICKEL_VALUE = 5;
        final int DIME_VALUE = 10;
        final int QUARTER_VALUE = 25;
        final int DOLLAR_VALUE = 100;

        // Use try-with-resources for Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Ask the user for the quantities of each coin
            System.out.print("How many pennies would you like? ");
            int pennies = scanner.nextInt();

            System.out.print("How many nickels would you like? ");
            int nickels = scanner.nextInt();

            System.out.print("How many dimes would you like? ");
            int dimes = scanner.nextInt();

            System.out.print("How many quarters would you like? ");
            int quarters = scanner.nextInt();

            // Calculate the total value of the coins in cents
            int totalValue = (pennies * PENNY_VALUE) + (nickels * NICKEL_VALUE) +
                    (dimes * DIME_VALUE) + (quarters * QUARTER_VALUE);

            // Determine the result using logical operators
            String result = (totalValue == DOLLAR_VALUE) ?
                    "Congratulations! You win! Your total is exactly one dollar." :
                    (totalValue > DOLLAR_VALUE) ?
                            "Oops! That's more than a dollar. You went over by " + (totalValue - DOLLAR_VALUE) + " cents." :
                            "Oops! That's less than a dollar. You were short by " + (DOLLAR_VALUE - totalValue) + " cents.";

            System.out.println(result);
        }
    }
}


//import java.util.Scanner;
//
//public class ChangeForADollarGame {
//    public static void main(String[] args) {
//        // Create a scanner object for user input
//        Scanner scanner = new Scanner(System.in);
//
//        // Define the values of the coins in cents
//        final int PENNY_VALUE = 1;
//        final int NICKEL_VALUE = 5;
//        final int DIME_VALUE = 10;
//        final int QUARTER_VALUE = 25;
//        final int DOLLAR_VALUE = 100;
//
//        // Ask the user for the quantities of each coin
//        System.out.print("How many pennies would you like? ");
//        int pennies = scanner.nextInt();
//
//        System.out.print("How many nickels would you like? ");
//        int nickels = scanner.nextInt();
//
//        System.out.print("How many dimes would you like? ");
//        int dimes = scanner.nextInt();
//
//        System.out.print("How many quarters would you like? ");
//        int quarters = scanner.nextInt();
//
//        // Calculate the total value of the coins in cents
//        int totalValue = (pennies * PENNY_VALUE) + (nickels * NICKEL_VALUE) +
//                (dimes * DIME_VALUE) + (quarters * QUARTER_VALUE);
//
//        // Determine the result
//        if (totalValue == DOLLAR_VALUE) {
//            System.out.println("Congratulations! You win! Your total is exactly one dollar.");
//        } else if (totalValue > DOLLAR_VALUE) {
//            int overAmount = totalValue - DOLLAR_VALUE;
//            System.out.println("Oops! That's more than a dollar. You went over by " + overAmount + " cents.");
//        } else {
//            int underAmount = DOLLAR_VALUE - totalValue;
//            System.out.println("Oops! That's less than a dollar. You were short by " + underAmount + " cents.");
//        }
//
//        // Close the scanner
//        scanner.close();
//    }
//}
