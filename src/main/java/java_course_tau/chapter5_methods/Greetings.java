package java_course_tau.chapter5_methods;

/*
 * OUR FIRST METHOD
 * Write a method that asks a user for their name, then greets them by name.
 */

import java.util.Scanner;

public class Greetings {

    public static void main(String args[]){

        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }

    public static void greetUser(String name){

        System.out.println("Hi there, " + name);
    }
}
