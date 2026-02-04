import java.util.Random;

public class RandomSingleDiceShaker implements DiceShaker {

    private static final Random random = new Random();

    @Override
    public int next() {
        return random.nextInt(6) + 1;
    }
}