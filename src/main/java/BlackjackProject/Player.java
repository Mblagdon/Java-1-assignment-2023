package BlackjackProject;

import java.util.ArrayList;

/**
 * Class to represent the player in the BlackJack game
 */
public class Player {
    private Hand hand;
    private int money;

    /**
     * Constructor to make a player with the given amount of money
     * @param money amount of money the player will have
     */
    public Player(int money) {
        this.hand = new Hand();
        this.money = money;
    }


    /**
     * Increases players money by bet amount if player wins
     * @param amount increases
     */
    public void winnings(int amount){
        this.money += amount;
    }

    /**
     * Get players hand
     * @return hand
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * String representation of the hand
     * @return players hand
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
     * Gets players current money
     * @return money
     */
    public int getMoney(){
        return money;
    }

    /**
     * Will set the players money
     * @param money
     */
    public void setMoney(int money) {
        this.money = money;
    }

    /**
     * Resets the hand for new turn
     */
    public void clearHand() {
        this.hand = new Hand();
    }
}
