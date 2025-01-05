package java_course_tau.chapter4_loops;

/*
 * LOOP BREAK STATEMENT
 * Search a String to determine if it contains the letter 'A'.
 */

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args){

        //Get text
        System.out.println("Enter some word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text for letter A
        for(int i=0; !letterFound && i<word.length(); i++){
            char currentLetter = word.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
            }
        }

        if(letterFound){
            System.out.println("This word contains the letter 'A'");
        }
        else{
            System.out.println("This word does not contain the letter 'A'");
        }
    }
}
