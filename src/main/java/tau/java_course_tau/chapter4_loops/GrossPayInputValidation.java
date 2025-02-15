package tau.java_course_tau.chapter4_loops;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 *
 * Key Points of While Loop:
 * It’s controlled by a condition and will continue to run while that condition remains true.
 * The condition is tested before the loop is entered, so there's a chance that this loop will never execute.
 * It's good to use the While loop when you may or may not need to run the loop, based on the state of the condition.
 *
 * Steps of While Loop:
 * First the condition is evaluated to determine if the loop needs to be executed.
 * If that's true, the statements inside of the loop are executed.
 * Then the condition is rechecked to determine if to run the loop again.
 *
 * Remember to update the sentinel inside your loop.
 */

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args){

        //Initialize known variables
        int rate = 15;
        int maxHours = 40;

        //Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while(hoursWorked > maxHours){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //Calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
