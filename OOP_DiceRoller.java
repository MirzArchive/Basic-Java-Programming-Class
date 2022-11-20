import java.util.concurrent.ThreadLocalRandom;

public class OOP_DiceRoller {
    int roll(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max + 1);
    }
}
