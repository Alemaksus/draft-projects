package java_course_tau.chapter2_fundamentals;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a season of the year: ");
        String season = scanner.nextLine();

        System.out.print("Enter a whole number: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        // Create and print the sentence
        String sentence = "On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.";
        System.out.println(sentence);

        scanner.close();
    }
}
