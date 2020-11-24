package laba5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();

    public String toString() {
        String cardListOutput = "";
        int i = 0;

        for (Iterator iterator = this.cards.iterator(); iterator.hasNext(); ++i) {
            Card aCard = (Card) iterator.next();
            cardListOutput = cardListOutput + "\n" + aCard.toString();
        }

        return cardListOutput;
    }

    public void fillDeck() {
        for (int i = 0; i < Suit.getSuitLength(); i++) {
            for (int j = 0; j < Value.getValueLength(); j++) {
                Card card = new Card(Suit.getSuits(i), Value.getValues(j));
                cards.add(card);
            }
        }
    }

    public void removeCard(int index) {
        this.cards.remove(index);
    }

    public Card getCard(int i) {
        return (Card) this.cards.get(i);
    }

    public void addCard(Card addCard) {
        this.cards.add(addCard);
    }

    public void resetDeck(Deck deck) {
        int deckSize = this.cards.size();

        for (int i = 0; i < deckSize; i++) {
            deck.cards.add(this.cards.get(i));
        }

        for (int i = 0; i < deckSize; i++) {
            this.removeCard(0);
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void pull(Deck deck) {
        cards.add(deck.cards.get(0));
        deck.removeCard(0);
    }

    public int getDeckSize() {
        return cards.size();
    }

    public int getHandValue() {
        int value = 0;
        int aces = 0;

        for (Card card : cards) {
            switch (card.getValue()) {
                case ACE:
                    aces += 1;
                    break;
                case TWO:
                    value += 2;
                    break;
                case THREE:
                    value += 3;
                    break;
                case FOUR:
                    value += 4;
                    break;
                case FIVE:
                    value += 5;
                    break;
                case SIX:
                    value += 6;
                    break;
                case SEVEN:
                    value += 7;
                    break;
                case EIGHT:
                    value += 8;
                    break;
                case NINE:
                    value += 9;
                    break;
                case TEN:
                    value += 10;
                    break;
                case JACK:
                    value += 10;
                    break;
                case QUEEN:
                    value += 10;
                    break;
                case KING:
                    value += 10;
                    break;
            }
        }

        for (int i = 0; i < aces; i++) {
            if (value <= 10) {
                value += 11;
            } else {
                value += 1;
            }
        }
        return value;
    }
}
