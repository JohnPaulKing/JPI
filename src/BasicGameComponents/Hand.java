package BasicGameComponents;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Wrapper class for a list of cards
 */
public class Hand extends ArrayList<Card> {

    /**
     * How many cards may legally be in a hand
     */
    int capacity = 0;

    /**
     * Add a card to a hand
     * if the card is at capacity, return false
     * @param card card to be added
     * @return whether the card was successfully added
     */
    public boolean addToHand(Card card) {
        if (this.size() + 1 > capacity) {
            return false;
        } else {
            this.add(card);
            return true;
        }
    }

    /**
     * if a card exists in a hand
     * remove it
     * @param card card to be removed
     * @return whether the card was successfully removed
     */
    public boolean removeCard(Card card) {
        if (this.contains(card)) {
            this.remove(card);
            return true;
        } else {
            return false;
        }
    }

}
