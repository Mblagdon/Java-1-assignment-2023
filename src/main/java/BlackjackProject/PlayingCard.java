package BlackjackProject;

/**
 * A standard deck of playing cards.
 * 52 cards, 4 suites of Spades, Hearts, Diamonds, and Clubs.
 * Each suit contains 13 cards: Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King.
 */
public class PlayingCard {

    //Constants to sort the value of the playing card
    public static final int ACE = 14;
    public static final int KING = 13;
    public static final int QUEEN = 12;
    public static final int JACK = 11;


    //Two attributes - suit and value
    private int faceValue;
    private Suit suit;

    /**
     * Constructor to create playing cards. Note: this is really for testing as cards are created properly in a deck.
     * @param faceValue
     * @param suit
     */

    public PlayingCard(int faceValue, Suit suit) {
        //You can check the value and default it to something
        this.faceValue = faceValue;
        this.suit = suit;
    }

    /**
     * Get face value
     * @return face value
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Get suit
     * @return suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * A method to print out what a card looks like
     * @return
     */
    public String toString(){
        String string = "";

        if(this.faceValue == ACE){
            string = "A";
        } else if (this.faceValue == KING) {
            string = "K";
        } else if (this.faceValue == QUEEN){
            string = "Q";
        } else if (this.faceValue == JACK){
            string = "J";
        } else {
            string = String.valueOf(this.faceValue);
        }

        if(this.suit == Suit.HEARTS){
            string += String.valueOf('\u2665');
        } else if (this.suit == Suit.CLUBS) {
            string += String.valueOf('\u2663');
        } else if (this.suit == Suit.DIAMONDS){
            string += String.valueOf('\u2666');
        } else if (this.suit == Suit.SPADES){
            string += String.valueOf('\u2660');
        }
        //TODO write this
        return string;
    }

    //Note: Enumerations can be stored on their own or within the class they will be used
    public enum Suit {HEARTS, DIAMONDS, SPADES, CLUBS}
    //TODO Add symbols to the enumeration


    /*
    Add the following
    char spade = '\u2660';
    char heart = '\u2665';
    char club = '\u2663';
    char diamond = '\u2666';
     */
}

