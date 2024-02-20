import java.util.Scanner;

public class MilesToKilometersConverter {
    public static void main(String[] args) {
        final double MILES_TO_KM = 1.60935;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");

        double miles = scanner.nextDouble();

        scanner.close();

        double kilometers = miles * MILES_TO_KM;

        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}
