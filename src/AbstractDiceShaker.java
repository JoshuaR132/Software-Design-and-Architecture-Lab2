import java.util.Random;

public abstract class AbstractDiceShaker {

    private static final Random random = new Random();

    protected int shakeSingleDie() {
        return random.nextInt(6) + 1;
    }

    public abstract boolean hasNext();
    public abstract int next();
}