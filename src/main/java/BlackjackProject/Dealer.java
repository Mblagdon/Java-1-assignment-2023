package BlackjackProject;

public class Dealer {
    private Hand hand;

    public Dealer() {
        this.hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    public void dealCards(DeckOfCards deck, Hand hand) {
        hand.addCard(deck.drawCard());
    }

    public void dealStartingCards(DeckOfCards deck, Player player, int bet) {
        player.playerBet(bet);
        dealCards(deck, player.getHand());
        dealCards(deck, this.hand);
        dealCards(deck, player.getHand());
        dealCards(deck, this.hand);
    }

    public void turn(DeckOfCards deck) {
        int dealerValue = BlackJackHand.getHighestValue(this.hand.getCards());
        while (dealerValue < 17) {
            dealCards(deck, this.hand);
            dealerValue = BlackJackHand.getHighestValue(this.hand.getCards());
        }
    }

}
