package BlackjackProject;

public class FunWithPlayingCards {

    public static void main(String[] args) {
        System.out.printf("Fun with playing cards");

        PlayingCard playingCard = new PlayingCard(PlayingCard.ACE, PlayingCard.Suit.HEARTS);

        System.out.printf("\nCard: %s", playingCard.toString());

        PlayingCard playingCard1 = new PlayingCard(PlayingCard.ACE, PlayingCard.Suit.SPADES);

        System.out.printf("\nCard: %s", playingCard1.toString());

        PlayingCard playingCard2 = new PlayingCard(PlayingCard.ACE, PlayingCard.Suit.DIAMONDS);

        System.out.printf("\nCard: %s", playingCard2.toString());

    }
}
