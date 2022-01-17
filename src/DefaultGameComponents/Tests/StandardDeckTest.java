package DefaultGameComponents.Tests;

import BasicGameComponents.Card;
import BasicGameComponents.Deck;
import DefaultGameComponents.DefaultValueDeterminer;
import DefaultGameComponents.StandardDeck;

import static org.junit.jupiter.api.Assertions.*;

class StandardDeckTest {

    @org.junit.jupiter.api.Test
    void init() {
        //instantiate deck
        Deck deck = new StandardDeck(new DefaultValueDeterminer(), true);
        deck.init(); //build deck

        //shuffle
        deck.shuffle();
        for (Card card : deck) {
            if (card == null) {
                System.out.println("null");
            }
            else {
                System.out.println(card.getRank() + " " + card.getSuit() + " " + card.getValue());
            }
        }


    }

    @org.junit.jupiter.api.Test
    void cut() {
    }
}