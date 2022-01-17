package BasicGameComponents;

import java.util.ArrayList;
import java.util.Random;

/**
 * A deck is a list of cards with special operations to
 * initialize, and shuffle itself
 */
public abstract class Deck extends ArrayList<Card> {

    /**
     * Simple constructor
     * @param valueRule the rule (algorithm) for determining a value
     */
    public Deck(ValueRule valueRule) {
        this.valueRule = valueRule;
    }

    /**
     * The rule that will determine this card's value
     * This should be used when initializing cards
     */
    protected ValueRule valueRule;

    /**
     * Repreesents the index of the "top" of the deck
     * which is actually the bottom. in order to not shrink
     * the size of the deck when we remove a card, this serves
     * as an alternative to "size" to see the number of instantiated cards
     */
    int top;


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
    public abstract void init();


    /**
     * This shuffles the cards in the deck using
     * a random number generator. For each card, it generates a number in the
     * range of 0,sizeOfDeck, and places the card in that slot.
     * If that slot has been filled, it looks for the next highest slot
     * This search wraps back to 0 if an empty slot cannot be found
     * While this can be overridden, it is assumed
     * that most card games will use the same shuffling
     * algorithm
     */
    public void shuffle() {
        Random rng = new Random();
        //create a shallow copy of this list
        //that means each reference is copied, and cards are not
        //destroyed or remade
        ArrayList<Card> copy = (ArrayList<Card>) this.clone();
        //now clear cards, without changing the size
        for (int i = 0; i < this.size(); i++) {
            this.set(i,null);
        }
        int size = copy.size();

        for (Card card : copy) {
            //generate a number from 0 to size of deck-1, inclusive
            int randNum = rng.nextInt(size-1);
            //starting with this number, increase until we find an unoccupied slot, wrap back to 0
            while (this.get(randNum % size) != null) {
                randNum = (randNum == size()-1 ) ? 0 : randNum+1;
            }
            this.set(randNum,card);
        }
    }

    /**
     * Takes a card from the bottom of deck,
     * removes it, and returns it to caller
     * @return the card "dealt"
     */
    public Card takeFromTop() {
        Card cardDrawn = this.get(top);
        this.set(top,null);
        top--;
        return cardDrawn;
    }

    /**
     * Adds a card to the deck.
     * If a deck slot is empty, it will add to that
     * before adding to the end of the internal arraylist
     * @param card the card to be added
     * @return true if succesffuly added
     */
    @Override
    public boolean add(Card card) {
        //if there are empty slots still
        if (top < this.size()) {
            this.set(top, card);
            top++;
            return true;
        }
        top++;
        return super.add(card);
    }

}
