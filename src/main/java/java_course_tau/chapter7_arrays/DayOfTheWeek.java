package java_course_tau.chapter7_arrays;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        // Array holding the days of the week, starting with Monday
        String[] daysOfWeek = {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Enter a number (1-7) to represent the day of the week: ");
        int dayNumber = scanner.nextInt();

        // Check if the number is valid (between 1 and 7)
        if (dayNumber >= 1 && dayNumber <= 7) {
            // Output the day of the week corresponding to the number
            System.out.println("The day of the week is: " + daysOfWeek[dayNumber - 1]);
        } else {
            // Handle invalid input
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
