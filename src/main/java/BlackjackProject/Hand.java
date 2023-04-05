package BlackjackProject;

import java.util.ArrayList;

/**
 *This class will add cards to the hand and get the value, then output the hand
 */
public class Hand {
    private ArrayList<PlayingCard> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(PlayingCard card){
        this.cards.add(card);
    }

    public ArrayList<PlayingCard> getCards() {
        return cards;
    }

    public int getValue() {
        return BlackJackHand.getHighestValue(cards);
    }

    public void printHand() {
        for (PlayingCard card: this.cards) {
            System.out.print(card.toString() + " ");
        }
        System.out.println();
    }

}
