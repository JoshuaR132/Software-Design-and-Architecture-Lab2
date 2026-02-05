public class FixedAbstractDiceShaker extends AbstractDiceShaker {

    private final int[] shakes = {2, 2, 5, 1};
    private int index = 0;

    @Override
    public boolean hasNext() {
        return index < shakes.length;
    }

    @Override
    public int next() {
        return shakes[index++];
    }
}