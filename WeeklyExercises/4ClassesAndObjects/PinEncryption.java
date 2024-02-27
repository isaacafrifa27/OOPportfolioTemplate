import java.util.Random;
import java.util.Scanner;

public class PinEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter a 4 digit pin number to encrypt: ");
        int pin = scanner.nextInt();

        if (pin < 1000 || pin > 9999) {
            System.out.println("Invalid input. Please enter a 4-digit pin.");
            return;
        }

        String pinHex = Integer.toHexString(pin);

        int random1 = random.nextInt(64536) + 1000;
        int random2 = random.nextInt(64536) + 1000;

        String random1Hex = Integer.toHexString(random1);
        String random2Hex = Integer.toHexString(random2);

        String encryptedPin = random1Hex + pinHex + random2Hex;

        System.out.println("Your encrypted pin number is " + encryptedPin);

        scanner.close();
    }
}
