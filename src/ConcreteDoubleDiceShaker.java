public class ConcreteDoubleDiceShaker extends AbstractDiceShaker {

    @Override
    public boolean hasNext() {
        return true; // infinite
    }

    @Override
    public int next() {
        return shakeSingleDie() + shakeSingleDie();
    }
}