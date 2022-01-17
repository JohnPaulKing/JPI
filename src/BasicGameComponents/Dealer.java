package BasicGameComponents;

import java.util.List;

/**
 * Each dealer has specific rules for how cards should be dealt
 */
public interface Dealer {
    /**
     * Deals cards to each player
     * @param hands list of hands to deal from
     * @param deck deck of cards to deal from
     */
    void deal(List<Hand> hands, Deck deck);

    /**
     * Collects cards from player's hands and returns them
     * to a deck
     * @param list list of hands to collect cards from
     * @param deck deck to return cards to
     */
    void collectCards(List<Hand> list, Deck deck);

}
