package BlackjackProject;

public class Player {
    private Hand hand;
    private int money;

    public Player(int money) {
        this.hand = new Hand();
        this.money = money;
    }

    public void playerBet(int amount){
        this.money -= amount;
    }

    public void winnings(int amount){
        this.money += amount;
    }

    public Hand getHand() {
        return hand;
    }

    public int getMoney(){
        return money;
    }
}
