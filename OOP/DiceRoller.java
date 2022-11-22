package OOP;
import java.util.concurrent.ThreadLocalRandom;

public class DiceRoller {
    int roll(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max + 1);
    }
}
