import java.util.Random;

enum Suit {
    SPADES, HEARTS, DIAMONDS, CLUBS
}

enum FaceValue {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
}

class Cards {
    private Suit suit;
    private FaceValue faceValue;

    public Cards(Suit suit, FaceValue faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public FaceValue getFaceValue() {
        return faceValue;
    }

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }
}

public class Card {
    public static void main(String[] args) {
        Suit[] suits = Suit.values();
        FaceValue[] faceValues = FaceValue.values();
        Random random = new Random();

        System.out.println("Dealing five random cards:");
        for (int i = 0; i < 5; i++) {
            Suit randomSuit = suits[random.nextInt(suits.length)];
            FaceValue randomFaceValue = faceValues[random.nextInt(faceValues.length)];
            Cards randomCard = new Cards(randomSuit, randomFaceValue);
            System.out.println("Card " + (i + 1) + ": " + randomCard);
        }
    }
}
