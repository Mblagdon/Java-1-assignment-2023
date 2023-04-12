package BlackjackProject;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * A deck of playing cards.
 * All the cards are stored in a list.
 * A deck should have 52 cards.
 * You can shuffle a deck (randomize full deck)
 * You can draw a card from the deck which removes the card
 */
public class DeckOfCards {

    /**
     * Array list for the playing cards
     */
    private ArrayList<PlayingCard> playingCardArrayList;

    /**
     * Create a new deck of cards. Not shuffled!
     */
    public DeckOfCards() {
        this.initializeDeck();
    }

    /**
     * Draw a card from the deck, remove card from deck
     *
     * @return drawn card
     */
    public PlayingCard drawCard() {
        return this.playingCardArrayList.remove(0);
    }


    /**
     * Shuffle deck
     */
    public void shuffle() {
        Collections.shuffle(this.playingCardArrayList);

    }

    /**
     * This method sets up the deck correctly
     */
    private void initializeDeck() {
        playingCardArrayList = new ArrayList<>();
        //Add the hearts
        for (int i = 2; i <= PlayingCard.ACE; i++) {
            playingCardArrayList.add(new PlayingCard(i, PlayingCard.Suit.HEARTS));
        }
        //Add the clubs
        for (int i = 2; i <= PlayingCard.ACE; i++) {
            playingCardArrayList.add(new PlayingCard(i, PlayingCard.Suit.CLUBS));
        }
        //Add the diamonds
        for (int i = 2; i <= PlayingCard.ACE; i++) {
            playingCardArrayList.add(new PlayingCard(i, PlayingCard.Suit.DIAMONDS));
        }
        //Add the spades
        for (int i = 2; i <= PlayingCard.ACE; i++) {
            playingCardArrayList.add(new PlayingCard(i, PlayingCard.Suit.SPADES));
        }
    }
}

