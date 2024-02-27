import java.util.Random;
import java.util.Scanner;

public class DiceRollSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("How many sides does die 1 have? ");
        int sides1 = scanner.nextInt();

        System.out.print("How many sides does die 2 have? ");
        int sides2 = scanner.nextInt();

        int totalRolls1 = 0;
        int totalRolls2 = 0;

        for (int i = 1; i <= 3; i++) {
            int roll1 = random.nextInt(sides1) + 1;
            int roll2 = random.nextInt(sides2) + 1;

            System.out.println("Die 1 " + i + " roll = " + roll1 + ".");
            System.out.println("Die 2 " + i + " roll = " + roll2 + ".");

            totalRolls1 += roll1;
            totalRolls2 += roll2;
        }

        double average1 = (double) totalRolls1 / 3;
        double average2 = (double) totalRolls2 / 3;

        System.out.println("Die 1 rolled a total of " + totalRolls1 + " and rolled " + average1 + " on average.");
        System.out.println("Die 2 rolled a total of " + totalRolls2 + " and rolled " + average2 + " on average.");

        scanner.close();
    }
}
