package BlackjackProject;

import java.util.Scanner;
public class BlackJackGameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlackJackGame game = new BlackJackGame(100); //To start with $100
        int bet = 0;

        while (true) {
            System.out.println("\nWelcome to Marcus' BlackJack! You currently have $" + game.getMoney() + "!");
            System.out.println("Please enter your bet! You may quit using 0. Bet: ");

            while (true){
                bet = scanner.nextInt();
                if (bet > 0) {
                    break;
                }
                System.out.println("Please enter a positive bet amount.");
            }

            if (bet == 0) {
                break;
            }

            if (bet > game.getMoney()) {
                System.out.println("You don't have enough money to place this bet.");
                continue;
            }

            game.dealCards(bet);

            while(true) {
                System.out.println("You have: " + game.getPlayersHandValue() + ". Do you want to:");

                System.out.print("1) Hit 2)Stand\n");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    game.playerHit();
                    System.out.println("Players total: " + game.getPlayersHandValue());
                    if (game.playerBusts()) {
                        System.out.println("Bust! You lost your bet of $" + bet + ".");
                        game.payOut();
                        break;
                    }
                } else if (choice == 2) {
                    game.playerStand();

                    System.out.println("Dealer's total: " + game.getDealersHandValue());
                    while (game.getDealersHandValue() < 17) {
                        game.dealerHit();
                        System.out.println("Dealers new card: " + game.getDealersHandValue());
                    }
                    if (game.dealerBusts()) {
                        System.out.println("Dealer has busted! You win $" + bet + "!");
                        game.payOut();

                    } else if (game.playerWins()) {
                        System.out.println("Player wins $" + bet + "!");
                        game.payOut();
                    } else if (game.dealerWins()) {
                        System.out.println("Dealer wins! You have lost your bet of $" + bet + "!");
                        game.payOut();
                    } else if (game.playerBlackJack()) {
                        System.out.println("You have BlackJack! You win $" + bet*1.5 + "!");
                        game.payOut();
                    } else if (game.dealerBlackJack()) {
                        System.out.println("Dealer has BlackJack. You have lost your bet of $" + bet + "!");
                        game.payOut();
                    } else {
                        System.out.println("It's a tie! The $" + bet + " is given back!");
                        game.payOut();
                    }

                    break;
                }
            }

            if (game.getMoney() == 0) {
                System.out.println("Looks like you're out of money! Better luck next time!");
                break;
            }
        }
        System.out.println("Thanks for playing Marcus's BlackJack!");
    }
}
