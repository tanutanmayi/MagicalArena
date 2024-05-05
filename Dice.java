import java.util.Random;

public class Dice {
    public static int roll() {
        Random random = new Random();
        return random.nextInt(6) + 1; // 1-6 range
    }
}

