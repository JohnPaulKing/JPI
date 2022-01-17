package DefaultGameComponents;

import BasicGameComponents.Dealer;
import BasicGameComponents.Deck;
import BasicGameComponents.Hand;
import BasicGameComponents.PlayerList;

import java.util.List;

public class StandardDealer implements Dealer {

    /**
     * Number of cards to deal to each player
     */
    int numberOfCards = 0;

    StandardDealer(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }

    /**
     * Deal from each hand the number of cards specified in the constructor
     * @param list list of hands to deal from
     * @param deck deck of cards to deal from
     */
    @Override
    public void deal(List<Hand> list, Deck deck) {
        for (int i = 0; i < this.numberOfCards; i++) {
            for (Hand hand : list) {
                hand.addCard(deck.takeFromTop());
            }
        }
    }

    /**
     * Removes all cards from each hand and returns them
     * to the dealer
     * @param list list of hands to collect cards from
     * @param deck deck to return cards to
     */
    @Override
    public void collectCards(List<Hand> list, Deck deck) {
        for (Hand hand : list) {
            while (!hand.isEmpty()) {
                deck.add(hand.get(0));
                hand.remove(0);
            }
        }
    }
}
