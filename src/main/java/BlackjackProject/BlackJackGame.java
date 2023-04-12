package BlackjackProject;

/**
 * Represents the BlackJack game
 */
public class BlackJackGame {
    private DeckOfCards deck;
    private Dealer dealer;
    private Player player;
    private int bet;
    private int money;

    /**
     * Starts new game with starting money amount
     * @param startingMoney amount for player
     */
    public BlackJackGame(int startingMoney) {
        this.deck = new DeckOfCards();
        this.dealer = new Dealer();
        this.player = new Player(startingMoney);
        deck.shuffle();
        bet = 0;
        money = startingMoney;
    }

    /**
     * Deals and prints cards
     * @param bet amount for hand
     */
    public void dealCards(int bet) {
        this.bet = bet;

        //Deal player two cards and dealer two cards
        player.clearHand();
        dealer.clearHand();
        player.getHand().addCard(deck.drawCard());
        dealer.getHand().addCard(deck.drawCard());
        player.getHand().addCard(deck.drawCard());
        dealer.getHand().addCard(deck.drawCard());
        deck.shuffle();


        System.out.println("Player's hand: " + player.printHand());

    }

    /**
     * Deals another card if player hits
     */
    public void playerHit() {
        player.getHand().addCard(deck.drawCard());
        System.out.println("Player's hand: " + player.printHand());
    }

    /**
     * Deals another card if dealer hits
     */
    public void dealerHit() {
        dealer.getHand().addCard(deck.drawCard());
        System.out.println("Dealers hand: " + dealer.printHand());
    }

    /**
     * Dealer will draw until hand value is at least 17 and prints dealers hand
     */
    public void playerStand() {
        while (dealer.getHand().getHandValue() < getPlayersHandValue() && dealer.getHand().getHandValue() <=21){
            dealer.getHand().addCard(deck.drawCard());
        }
        System.out.println("Dealer's hand: " + dealer.printHand());
    }

    /**
     * Gets current value of players hand
     * @return players hand value
     */
    public int getPlayersHandValue() {
        return player.getHand().getHandValue();
    }

    /**
     * Gets current value of dealers hand
     * @return dealers hand value
     */
    public int getDealersHandValue() {
        return dealer.getHand().getHandValue();
    }

    /**
     * Checks if player has BlackJack
     * @return true if there is BlackJack
     */
    public boolean playerBlackJack() {
        return player.getHand().getHandValue() == 21 && player.getHand().getCards().size() == 2;
    }

    /**
     * Checks if dealer has BlackJack
     * @return true if there is BlackJack
     */
    public boolean dealerBlackJack() {
        return dealer.getHand().getHandValue() == 21 && dealer.getHand().getCards().size() == 2;
    }

    /**
     * Checks if players hand value is over 21
     * @return bust if value of over 21
     */
    public boolean playerBusts() {
        return player.getHand().getHandValue() > 21;
    }

    /**
     * Checks if dealers hand value is over 21
     * @return bust if value over 21
     */
    public boolean dealerBusts() {
        return dealer.getHand().getHandValue() > 21;
    }

    /**
     * Checks to see if player has won
     * @return if player has won the hand
     */
    public boolean playerWins() {
        if (playerBusts()) {
            return false;
        } else if (dealerBusts()) {
            return true;
        } else {
            return player.getHand().getHandValue() > dealer.getHand().getHandValue();
        }
    }

    /**
     * Check to see if dealer has won
     * @return if dealer has won the hand
     */
    public boolean dealerWins () {
        if (dealerBusts()) {
            return false;
        } else if (playerBusts()) {
            return true;
        } else {
            return dealer.getHand().getHandValue() > player.getHand().getHandValue();
        }
    }

    /**
     * Checks to see if player and dealers hand values are the same
     * @return true for a tie if hand values are the same
     */
    public boolean tie() {
        return player.getHand().getHandValue() == dealer.getHand().getHandValue();
    }

    /**
     * Returns players money
     * @return money
     */
    public int getMoney() {
        return player.getMoney();
    }

    /**
     * Gets the payout for the winnings or loss
     * Resets the player and dealers hands
     */
    public void payOut() {
        if (playerBlackJack()) {
            player.winnings((int) (bet * 1.5));

        } else if (dealerBlackJack()) {
            player.setMoney(player.getMoney() - bet);

        } else if (playerWins()) {
            player.setMoney(player.getMoney() + bet );

        } else if (tie()) {
            player.setMoney(player.getMoney());

        } else if (dealerWins()) {
            player.setMoney(player.getMoney() - bet);

        } else if (playerBusts()) {
            player.setMoney(player.getMoney() - bet);
        } else if (dealerBusts()) {
            player.setMoney(player.getMoney() + bet);
        }

    }
}