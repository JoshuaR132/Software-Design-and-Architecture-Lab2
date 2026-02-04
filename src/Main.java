import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type 1 for single die, 2 for double dice:");
        int choice = scan.nextInt();

        DiceShaker shaker;

        if (choice == 1) {
            shaker = new RandomSingleDiceShaker();
        } else {
            shaker = new RandomDoubleDiceShaker();
        }

        System.out.println("Shake result: " + shaker.next());
    }
}