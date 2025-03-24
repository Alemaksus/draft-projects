package tau.java_course_tau.coin_toss_game;

public class Player {
    private String name;
    private String guess;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        if (guess.equalsIgnoreCase("heads") || guess.equalsIgnoreCase("tails")) {
            this.guess = guess.toLowerCase();
        } else {
            throw new IllegalArgumentException("Invalid guess! Choose 'heads' or 'tails'.");
        }
    }
}
