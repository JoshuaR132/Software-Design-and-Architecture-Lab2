import java.util.Random;

public class RandomDoubleDiceShaker implements DiceShaker {

    private static final Random random = new Random();

    @Override
    public int next() {
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        return die1 + die2;
    }
}
