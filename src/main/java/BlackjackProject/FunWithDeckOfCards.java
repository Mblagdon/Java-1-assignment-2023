/**package BlackjackProject;

import java.util.ArrayList;

public class FunWithDeckOfCards {

    public static void main(String[] args) {
        System.out.printf("Fun with deck of cards");

        DeckOfCards deckOfCards = new DeckOfCards();

        deckOfCards.printDeck(System.out);

        deckOfCards.shuffle();

        deckOfCards.printDeck(System.out);

        System.out.printf("\nDraw card: %s", deckOfCards.drawCard().toString());
        deckOfCards.printDeck(System.out);

        ArrayList<PlayingCard> testHand = new ArrayList<>();
        testHand.add(deckOfCards.drawCard());
        testHand.add(deckOfCards.drawCard());

        System.out.printf("Hand value: %d");
    }
}
*/