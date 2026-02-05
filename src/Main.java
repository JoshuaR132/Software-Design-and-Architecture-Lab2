public class Main {
    public static void main(String[] args) {

        AbstractDiceShaker shaker = new ConcreteSingleDiceShaker();

        for (int i = 0; i < 10; i++) {
            System.out.println(shaker.next());
        }
    }
}