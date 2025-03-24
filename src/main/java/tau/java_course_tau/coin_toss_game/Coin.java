package tau.java_course_tau.coin_toss_game;

import java.util.Random;

public class Coin {
    private String side;
    private static final String HEADS = "heads";
    private static final String TAILS = "tails";

    public Coin() {
        flip();
    }

    public void flip() {
        Random random = new Random();
        side = (random.nextBoolean()) ? HEADS : TAILS;
    }

    public String getSide() {
        return side;
    }
}
