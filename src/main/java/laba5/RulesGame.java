package laba5;

import java.util.Scanner;

public class RulesGame {
    public void Play() {
        System.out.println("Welcome to Blackjack!");
        Deck playingDeck = new Deck();
        playingDeck.fillDeck();
        playingDeck.shuffle();
        Deck playerCards = new Deck();
        Deck dealerCards = new Deck();

        Scanner userInput = new Scanner(System.in);
        boolean endRound = false;

        while (true) {

            System.out.println("Dealing...");
            playerCards.pull(playingDeck);
            playerCards.pull(playingDeck);
            dealerCards.pull(playingDeck);
            dealerCards.pull(playingDeck);

            int response;
            do {
                System.out.println("Your Hand:" + playerCards.toString());
                System.out.println("Your hand is currently valued at: " + playerCards.getHandValue());
                System.out.println("Dealer Hand: " + dealerCards.getCard(0).toString() + " and [hidden]");
                System.out.println("Would you like to (1)Hit or (2)Stand");
                response = userInput.nextInt();
                if (response == 1) {
                    playerCards.pull(playingDeck);
                    System.out.println("You pull a:" + playerCards.getCard(playerCards.getDeckSize() - 1).toString());
                    if (playerCards.getHandValue() > 21) {
                        System.out.println("Bust. Currently valued at: " + playerCards.getHandValue());
                        endRound = true;
                        break;
                    }
                }
            } while (response != 2);

            System.out.println("Dealer Cards:" + dealerCards.toString());
            if (dealerCards.getHandValue() > playerCards.getHandValue() && !endRound) {
                System.out.println("Dealer beats you " + dealerCards.getHandValue() + " to " + playerCards.getHandValue());
                endRound = true;
            }

            while (dealerCards.getHandValue() < 17 && !endRound) {
                dealerCards.pull(playingDeck);
                System.out.println("Dealer draws: " + dealerCards.getCard(dealerCards.getDeckSize() - 1).toString());
            }

            System.out.println("Dealers hand value: " + dealerCards.getHandValue());
            if (dealerCards.getHandValue() > 21 && !endRound ) {
                System.out.println("Dealer Busts. You win!");
                endRound = true;
            }

            if (dealerCards.getHandValue() == playerCards.getHandValue() && !endRound) {
                System.out.println("Push.");
                endRound = true;
            }

            if (playerCards.getHandValue() > dealerCards.getHandValue() && !endRound) {
                System.out.println("You win the hand.");
                endRound = true;
            } else if (!endRound) {
                System.out.println("Dealer wins.");
            }

            playerCards.resetDeck(playingDeck);
            dealerCards.resetDeck(playingDeck);
            System.out.println("End of Hand.");

            System.out.println("Do you want to continue game? (yes = 1), (no = 2) ");
            if (userInput.nextInt() == 2) {
                break;

            }
        }


    }

}


