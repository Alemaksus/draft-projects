package tau.java_course_tau.coin_toss_game;

import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating players
        System.out.print("Enter Player 1's name: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("Enter Player 2's name: ");
        Player player2 = new Player(scanner.nextLine());

        // Player 1 chooses heads or tails
        String guess;
        while (true) {
            System.out.print(player1.getName() + ", choose heads or tails: ");
            guess = scanner.nextLine().toLowerCase();
            if (guess.equals("heads") || guess.equals("tails")) {
                player1.setGuess(guess);
                break;
            } else {
                System.out.println("Invalid choice. Please choose 'heads' or 'tails'.");
            }
        }

        // Player 2 gets the opposite choice
        String oppositeGuess = player1.getGuess().equals("heads") ? "tails" : "heads";
        player2.setGuess(oppositeGuess);

        System.out.println(player2.getName() + " automatically gets " + oppositeGuess + ".");

        // Flip the coin
        Coin coin = new Coin();
        coin.flip();
        System.out.println("The coin landed on: " + coin.getSide());

        // Determine the winner
        if (coin.getSide().equals(player1.getGuess())) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }

        scanner.close();
    }
}
