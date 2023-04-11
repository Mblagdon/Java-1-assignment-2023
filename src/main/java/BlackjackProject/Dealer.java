package BlackjackProject;

import java.util.ArrayList;

/**
 * The dealer class for the BlackJack game
 */
public class Dealer {
    private Hand hand;

    /**
     * Makes dealer with an empty hand
     */
    public Dealer() {
        this.hand = new Hand();
    }

    /**
     * Gets the dealers hand
     * @return dealers hand
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * String representation of dealers hand
     * @return dealers cards in hand
     */
    public String printHand(){
        ArrayList<PlayingCard> cards = hand.getCards();
        StringBuilder sb = new StringBuilder();
        for (PlayingCard card: cards) {
            sb.append(card.toString()).append(" ");
        }
        return sb.toString().trim();
    }

    /**
     * Clears dealers hand
     */
    public void clearHand() {
        this.hand = new Hand();
    }

}
