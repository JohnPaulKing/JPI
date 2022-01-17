package DefaultGameComponents;

import BasicGameComponents.Card;
import BasicGameComponents.Deck;
import BasicGameComponents.ValueRule;

public class StandardDeck extends Deck {

    /**
     * Whether or not to include two joker cards (of suit none)
     */
    boolean includeJokers;

    /**
     * Standard constructor with args
     * @param valueRule
     */
    public StandardDeck(ValueRule valueRule, boolean includeJokers) {
        super(valueRule);
        this.includeJokers = includeJokers;
    }

    /**
     * Constructor with just value rule
     * @param valueRule
     */
    StandardDeck(ValueRule valueRule) {
        this(valueRule,false);
    }

    /**
     * Nullary constructor, which creates a
     * default value determining rule
     */
    StandardDeck() {
        this(new DefaultValueDeterminer(), false);
    }

    /**
     * Initializes standard 52 cards
     */
    @Override
    public void init() {
        //go through all the suits, and all the ranks
        //except special ranks like NONE or JOKER
        for(StandardSuit suit : StandardSuit.values()) {
            if (suit == StandardSuit.NONE
                || suit == StandardSuit.BLACK
                || suit == StandardSuit.RED) {
                continue;
            }
            for (StandardRank rank : StandardRank.values()) {
                if (rank == StandardRank.NONE || rank == StandardRank.JOKER) {
                    continue;
                }
                this.add(new Card(suit, rank, valueRule));
            }
        }
        //add jokers if jokers are on
        if (includeJokers) {
            this.add(new Card(StandardSuit.RED, StandardRank.JOKER, valueRule));
            this.add(new Card(StandardSuit.BLACK, StandardRank.JOKER, valueRule));
        }
    }

    /**
     * Returns the top card of the deck
     * @return
     */
    public Card cut() {
        return this.takeFromTop();
    }
}
