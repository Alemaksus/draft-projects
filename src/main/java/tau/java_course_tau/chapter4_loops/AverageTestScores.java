package tau.java_course_tau.chapter4_loops;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args){

        //Initialize what we know
        int numberOfStudents = 5;
        int numberOfTests = 3;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        for(int i=0; i< numberOfStudents; i++){

            double total = 0;
            for(int j=0; j<numberOfTests; j++){
                System.out.println("Enter the score for Test #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total/numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }

        scanner.close();
    }
}
