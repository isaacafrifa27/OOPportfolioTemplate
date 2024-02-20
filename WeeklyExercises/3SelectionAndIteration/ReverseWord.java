import java.util.Scanner;
public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        Scanner wordScanner = new Scanner(inputSentence);

        StringBuilder reversedSentence = new StringBuilder();
        while (wordScanner.hasNext()) {
            String word = wordScanner.next();
            String reversedWord = reverseCharacters(word);
            reversedSentence.append(reversedWord).append(" ");
        }

        scanner.close();
        wordScanner.close();

        System.out.println("Reversed Sentence: " + reversedSentence.toString().trim());
    }

    private static String reverseCharacters(String word) {
        StringBuilder reversedWord = new StringBuilder(word);
        return reversedWord.reverse().toString();
    }
}
