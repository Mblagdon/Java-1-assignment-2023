package BlackjackProject;

import java.util.ArrayList;

/**
 * A class to help/manage
 */
public class BlackJackHand {


    /**
     * Calculate value of a blackjack hand stored in an arraylist of playing cards.
     * @param hand hand to value
     * @return value as an int (>21) is bust
     */
    public static int getHighestValue(ArrayList<PlayingCard> hand){
        int total = 0; //initial hand total value is 0
        int numberAces = 0; //initial number of aces is 0

        //go through each card in hand
        for (PlayingCard playingCard: hand) {
            int value = playingCard.getFaceValue();
            if (value > 10) {
                value = 10;
            }
            if (value == 1) {
                numberAces++;
            }
            total += value; //add the value of the cards to the hand value
        }

        //Aces not going as 1 or 11?
        while (numberAces > 0) {
            if (total + 11 <= 21) {
                total += 11; // adding 10 to the value 1 of ace if it will not cause a bust
            } else {
                total += 1; //counts ace as 1 if it busts with 11
            }
            numberAces--; //decrement number of aces left to process
        }

        return total; //total hand value
    }
}
