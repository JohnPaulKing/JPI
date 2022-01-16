package BasicGameComponents;

import java.util.ArrayList;

/**
 * A deck is a list of cards with special operations to
 * initialize, and shuffle itself
 */
public abstract class Deck extends ArrayList<Card> {

    /**
     * This function initializes the deck
     * That means that it creates all of the cards
     * that belong to it.
     * This is separate from constructor, so cards will
     * not exist until this is called.
     * By default, this should also be called to reinitialize a deck
     * but in special cases, a developer may create their own reinitialze
     * method in the concrete class
     */
    public abstract void initDeck();


    /**
     * This shuffles the cards in the deck using
     * a random number generator
     * While this can be overwritten, it is assumed
     * that most card games will use the same shuffling
     * algorithm
     */
    public void shuffle() {

    }


}
