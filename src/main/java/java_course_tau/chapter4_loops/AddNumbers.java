package java_course_tau.chapter4_loops;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 *
 * Key Points of Do While Loop:
 * Just like the While Loop, it's also controlled by a condition.
 * That condition is tested after the completion of the loop. So, the loop will always run at least once.
 * So, it's good to use the do while loop when the loop should run at least one time,
 * and based on the situation, they now need to repeat.
 *
 * Steps of Do While Loop:
 * First the statements inside the loop are executed. Again, be sure to update the sentinel here.
 * Then the condition is checked to determine if to run the loop again.
 */

public class AddNumbers {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean again;

        do{
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over?");
            again = scanner.nextBoolean();

        } while(again);

        scanner.close();

    }
}
