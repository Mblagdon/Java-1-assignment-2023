package BlackjackProject;

public class BlackJackGame {
    private DeckOfCards deck;
    private Dealer dealer;
    private Player player;
    private int bet;

    public BlackJackGame(int startingMoney) {
        this.deck = new DeckOfCards();
        this.dealer = new Dealer();
        this.player = new Player(startingMoney);
    }

    public boolean gameOver() {
        return this.player.getMoney() == 0;
    }

    public boolean playRound(int bet) {
        if (this.player.getMoney() < bet) {
            System.out.println("Not enough money to place this bet.");
            return false;
        }
    }
}
