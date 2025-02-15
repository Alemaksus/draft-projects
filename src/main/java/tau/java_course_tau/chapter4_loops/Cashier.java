package tau.java_course_tau.chapter4_loops;

import java.util.Scanner;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 *
 * Key Points of the For Loop:
 * It's count-controlled, meaning it will run a specified number of times.
 * The sentinel is expressed within a condition which is tested before the loop is entered.
 * It's best to use when you know how many times the loop should be executed.
 *
 *Steps of the For Loop:
 * First, the sentinel is initialized to a starting value and the ending value is also specified.
 * Then the statements inside the loop or executed.
 * And the condition is rechecked to determine if to run the loop again.
 */

public class Cashier {

    public static void main(String[] args){

        //Get number of items to scan
        System.out.println("Enter the number of items you would you like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        //Create loop to iterate through all the items and accumulate the costs
        for (int i=0; i<quantity; i++){

            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();

        System.out.println("Your total is $" + total);
    }
}
