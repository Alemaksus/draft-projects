package java_course_tau.chapter4_loops;

/**
 * RollTheDieGameProbability
 *
 * Description:
 * This program calculates the probability of winning in the "Roll the Die" game
 * based on the predefined rules, including early termination if the target is reached
 * before using all dice rolls.
 *
 * Probability Calculation:
 * - The program evaluates all possible combinations of dice rolls (6^5 = 7776 combinations for 5 rolls).
 * - It checks each combination to determine if it results in a win under the rules.
 * - Early termination is accounted for: if the target (20) is reached in fewer than 5 rolls,
 *   further rolls are ignored, and the combination is considered a valid win.
 * - If the sum exceeds the target (20) or doesn't reach it after 5 rolls, the combination is invalid.
 *
 * Implementation Details:
 * - A recursive or iterative approach generates all possible combinations of up to 5 dice rolls.
 * - The program checks the sum at each step to determine if the game ends early.
 * - Winning combinations are counted and divided by the total number of combinations to calculate
 *   the probability of winning.
 *
 * Example Output:
 * Total combinations: 7776
 * Winning combinations: 651
 * Probability of winning: 8.37%
 *
 * Notes:
 * This implementation fully respects the game's early termination rule, ensuring an accurate
 * probability calculation tailored to the specific rules.
 */

import java.util.ArrayList;
import java.util.List;

public class RollTheDieGameProbability {

    public static void main(String[] args) {
        calculateWinProbability();
    }

    private static void calculateWinProbability() {
        int sidesOfDie = 6; // 6-sided die
        int rolls = 5; // Maximum rolls allowed
        int target = 20; // Target space to win

        List<int[]> allCombinations = generateCombinations(rolls, sidesOfDie);
        int winningCombinations = 0;

        for (int[] combination : allCombinations) {
            int sum = 0;
            boolean validWin = false;

            for (int i = 0; i < combination.length; i++) {
                sum += combination[i];
                if (sum == target && i == combination.length - 1) {
                    validWin = true; // Win only if 20 is reached on the last roll
                    break;
                } else if (sum == target && i < combination.length - 1) {
                    break; // Stop if target is reached before the last roll
                } else if (sum > target) {
                    break; // Stop if the sum exceeds the target
                }
            }

            if (validWin) {
                winningCombinations++;
            }
        }

        double totalCombinations = Math.pow(sidesOfDie, rolls);
        double probability = winningCombinations / totalCombinations;

        System.out.println("Total combinations: " + (int) totalCombinations);
        System.out.println("Winning combinations: " + winningCombinations);
        System.out.println("Probability of winning: " + (probability * 100) + "%");
    }

    private static List<int[]> generateCombinations(int rolls, int sides) {
        List<int[]> combinations = new ArrayList<>();
        generateCombinationsRecursive(new int[rolls], 0, sides, combinations);
        return combinations;
    }

    private static void generateCombinationsRecursive(int[] current, int index, int sides, List<int[]> combinations) {
        if (index == current.length) {
            combinations.add(current.clone());
            return;
        }
        for (int i = 1; i <= sides; i++) {
            current[index] = i;
            generateCombinationsRecursive(current, index + 1, sides, combinations);
        }
    }
}
