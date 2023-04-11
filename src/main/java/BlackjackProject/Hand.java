package BlackjackProject;

import java.util.ArrayList;

/**
 *This class will add cards to the hand and get the value, then output the hand
 */
public class Hand {
    private ArrayList<PlayingCard> cards; //list of cards in hand

    /**
     * Initialize empty hand
     */
    public Hand() {
        this.cards = new ArrayList<>();
    }

    /**
     * Add card to hand
     * @param card added to hand
     */
    public void addCard(PlayingCard card){
        this.cards.add(card);
    }

    /**
     * Get cards in hand
     * @return cards in hand
     */
    public ArrayList<PlayingCard> getCards() {
        return cards;
    }

    /**
     * Get the value of the hand
     * @return value of hand
     */
    public int getHandValue() {
        return BlackJackHand.getHighestValue(cards);
    }

}
