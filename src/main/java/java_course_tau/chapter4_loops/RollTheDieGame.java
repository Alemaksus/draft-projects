package java_course_tau.chapter4_loops;

/**
 * RollTheDieGame
 *
 * Description:
 * This game simulates a dice rolling game where the objective is to reach
 * exactly space 20 on a game board within 5 dice rolls. The game incorporates
 * specific rules for winning and losing:
 *
 * Rules:
 * 1. The game starts with the player on space 0.
 * 2. The player rolls a standard 6-sided die (values from 1 to 6) up to 5 times.
 * 3. The player's position on the board is incremented by the value of each roll.
 * 4. If the player's total position:
 *    - Exactly equals 20 before or on the 5th roll: The player wins immediately, and the game ends.
 *    - Exceeds 20: The player loses immediately, and the game ends.
 *    - Is less than 20 after all 5 rolls: The player loses.
 * 5. The game stops immediately if the player reaches exactly 20, even if there are remaining rolls.
 *
 * Implementation Details:
 * - The game uses a `for` loop to manage up to 5 dice rolls.
 * - Random dice rolls are generated using `java.util.Random`.
 * - The player's current position is updated after each roll and checked against the target (20).
 * - The game provides feedback after each roll, showing the player's current position and the result.
 * - The game terminates as soon as a winning or losing condition is met.
 *
 * Example Output:
 * Roll #1: You've rolled a 4. You are now on space 4.
 * Roll #2: You've rolled a 6. You are now on space 10.
 * Roll #3: You've rolled a 5. You are now on space 15.
 * Roll #4: You've rolled a 5. You're on space 20. Congrats, you win!
 */

import java.util.Random;

public class RollTheDieGame {

    public static void main(String[] args) {
        int target = 20; // Целевая позиция
        int currentSpace = 0; // Текущая позиция
        int maxRolls = 5; // Максимальное количество бросков
        Random random = new Random();

        System.out.println("The objective of the game is to reach space 20 within 5 rolls of the die. Let's begin!");

        for (int roll = 1; roll <= maxRolls; roll++) {
            int die = random.nextInt(6) + 1; // Бросок кубика (случайное число от 1 до 6)
            currentSpace += die;

            System.out.print("Roll #" + roll + ": You've rolled a " + die + ". ");

            if (currentSpace == target) {
                System.out.println("You're on space " + currentSpace + ". Congrats, you win!");
                return; // Завершить игру, если достигнута цель
            } else if (currentSpace > target) {
                System.out.println("Unfortunately, that takes you past " + target + " spaces. You lose!");
                return; // Завершить игру, если превышена цель
            } else {
                System.out.println("You are now on space " + currentSpace + ".");
            }
        }

        // Проверка после всех бросков
        if (currentSpace < target) {
            System.out.println("You've used all " + maxRolls + " rolls and are on space " + currentSpace +
                    ". You needed to reach space 20 to win. You lose!");
        }
    }
}
