package DefaultGameComponents;

import BasicGameComponents.Rank;
import BasicGameComponents.Suit;
import BasicGameComponents.ValueRule;

/**
 * This provides the simplest rule for determining a given card's
 * numeric value.
 */
public class DefaultValueDeterminer implements ValueRule{
    @Override
    public int determineValue(Suit suit, Rank rank) {
        return rank.getNumber();
    }

}
