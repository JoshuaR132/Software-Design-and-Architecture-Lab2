import java.util.Random;

public class RandomDoubleDiceShaker implements DiceShaker {

    private static final Random random = new Random();

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public int next() {
        int d1 = random.nextInt(6) + 1;
        int d2 = random.nextInt(6) + 1;
        return d1 + d2;
    }
}