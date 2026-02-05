import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a shaker:");
        System.out.println("1 = Single Random");
        System.out.println("2 = Double Random");
        System.out.println("3 = Fixed Sequence");

        int choice = scan.nextInt();

        DiceShaker shaker;

        switch (choice) {
            case 1 -> shaker = new RandomSingleDiceShaker();
            case 2 -> shaker = new RandomDoubleDiceShaker();
            case 3 -> shaker = new FixedSingleDiceShaker();
            default -> {
                System.out.println("Invalid choice.");
                return;
            }
        }

        while (shaker.hasNext()) {
            System.out.println("Shake: " + shaker.next());
        }

        System.out.println("No more shakes!");
    }
}