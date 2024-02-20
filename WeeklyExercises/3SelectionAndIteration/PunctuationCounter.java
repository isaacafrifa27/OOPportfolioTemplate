import java.util.HashMap;
import java.util.Map;

public class PunctuationCounter {

    public static void main(String[] args) {
        String inputString = "Isaac is a child of God. He loves God but God loves him even more. God came to die for him through Jesus Christ our God and Isaac is eternally grateful and cannot wait to dwell with Jesus in His Kingdom for all eternity. In Jesus' mighty name, Amen!";

        Map<Character, Integer> punctuationCounts = countPunctuation(inputString);

        System.out.println("Punctuation Counts:");
        System.out.printf("%-10s %-10s%n", "Symbol", "Count");
        System.out.println("-------------------");
        for (Map.Entry<Character, Integer> entry : punctuationCounts.entrySet()) {
            System.out.printf("%-10s %-10d%n", entry.getKey(), entry.getValue());
        }
    }

    private static Map<Character, Integer> countPunctuation(String input) {
        Map<Character, Integer> punctuationCounts = new HashMap<>();

        for (char character : input.toCharArray()) {
            if (isPunctuation(character)) {
                punctuationCounts.put(character, punctuationCounts.getOrDefault(character, 0) + 1);
            }
        }

        return punctuationCounts;
    }

    private static boolean isPunctuation(char character) {
        // You can customize this method based on your specific set of punctuation marks
        return ",.!?-".indexOf(character) != -1;
    }
}
