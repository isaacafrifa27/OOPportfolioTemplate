import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the square's side: ");

        int sideLength = scanner.nextInt();

        scanner.close();

        int perimeter = 4 * sideLength;
        int area = sideLength * sideLength;

        System.out.println("Square Perimeter: " + perimeter);
        System.out.println("Square Area: " + area);
    }
}
