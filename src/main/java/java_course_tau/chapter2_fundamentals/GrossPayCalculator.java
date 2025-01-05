package java_course_tau.chapter2_fundamentals;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]) {

        //1. Get the number of hours worked.
        System.out.println("Enter the number of hours the employee worked:");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate.
        System.out.println("Enter the employee's hourly pay rate:");
        double rate = scanner.nextDouble();
        scanner.close();

        //3. Multiply the hours and the pay rate.
        double grossPay = hours * rate;

        //4. Display the result.
        System.out.println("The employee's gross pay is " + grossPay);
    }
}
