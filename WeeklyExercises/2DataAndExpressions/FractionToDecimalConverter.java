import java.util.Scanner;

public class FractionToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        scanner.close();

        if (denominator == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double decimalEquivalent = (double) numerator / denominator;

            System.out.println("Decimal Equivalent: " + decimalEquivalent);
        }
    }
}
