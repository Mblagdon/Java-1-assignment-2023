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
        int total = 0;
        int numberAces = 0;

        for (PlayingCard playingCard: hand) {
            //TODO check for Jack, Queen and King and add as 10
            int value = playingCard.getFaceValue();
            if (value > 10) {
                value = 10;
            }
            if (value == 1) {
                numberAces++;
            }
            total += value;
        }
        //TODO you have to handle Aces!
        for (int i = 0; i < numberAces; i++){
            if (total + 10 <= 21){
                total += 10;
            }
        }

        return total;
    }
}
