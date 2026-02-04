public class FixedSingleDiceShaker implements DiceShaker {

    private final int[] shakes = {1, 2, 3, 4, 5, 6};
    private int index = 0;

    @Override
    public int next() {
        return shakes[index++];
    }
}