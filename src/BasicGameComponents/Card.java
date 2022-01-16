package BasicGameComponents;

import BasicGameComponents.Suit;
import DefaultGameComponents.DefaultValueDeterminer;

import java.util.HashSet;
import java.util.Set;

/**
Basic card type
 */

public class Card {

    /**
     * The suit of a certain card
     * In a traditional deck this is Hearts, Clubs, Spades, and Diamonds
     */
    protected Suit suit;

    /**
     * The rank of a certain card
     * In a traditional deck this is Ace, 2-10, Jack, Queen, and King
     */
    protected Rank rank;

    /**
     * The numeric value of the card if calculations are performed on it
     * This will vary based on the game
     */
    protected int value;

    /**
     * Whether a card is "face down" or "face up"
     * If it is face up, everyone is able to see it
     * Otherwise, only specific players may view it
     */
    protected boolean hidden;

    /**
     * The player who owns this card
     * in some instances, the owner of a card
     * can see it even when it is hidden
     */
    protected Player owner;

    /**
     * This set contains each player that can view this card
     * instead of making wrapper functions, this set is to
     * be directly interacted with by the card game developer
     */
    public Set<Player> playersThatCanViewThisCard = new HashSet<>();

    /**
     * Whether the current card is selected
     * Typically, this is when the player has selected a card
     * to play, but has not yet played it
     */
    protected boolean selected;


    /**
     * This is the basic constructor. It will create a hidden,
     * unselected card with no owner and a default value rule
     * @param suit the card's suit
     * @param rank the card's rank
     */
    Card(Suit suit, Rank rank) {
        this(suit,rank, new DefaultValueDeterminer() );
    }

    /**
     * This constructor works like the basic constructor
     * but allows the developer to pass in a value rule
     * to determine the numeric value of a card
     * @param suit
     * @param rank
     * @param valueRule
     */
    Card(Suit suit, Rank rank, ValueRule valueRule) {
        this.suit = suit;
        this.rank = rank;
        this.owner = null;  //no owner
        //by its enumeration number.
        this.value = valueRule.determineValue(suit,rank);
        this.hidden = true; //default to hidden
        this.selected = false;
    }

    /**
     *
     * @return the suit of the card
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     *
     * @return the rank of the card
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * The numeric value of the card
     * This could be the points it garners,
     * the amount that it adds to a count,
     * the order a deck should be sorted, or anything else
     * as needed by the rules of a game
     * @return
     */
    public int getValue() {
        return value;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
