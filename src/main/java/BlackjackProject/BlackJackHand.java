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

        //go through each card in hand
        for (PlayingCard playingCard: hand) {
            int value = playingCard.getFaceValue();
            if (value == 14) {
                if(total + 11 <= 21){
                    value = 11; // adding 10 to the value 1 of ace if it will not cause a bust
                } else {
                    value = 1;//counts ace as 1 if it busts with 11
                }

            } else if (value > 10) {
                value = 10;
            }
            total += value; //add the value of the cards to the hand value
        }

        return total; //total hand value
    }
}
