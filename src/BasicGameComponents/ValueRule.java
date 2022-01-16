package BasicGameComponents;

import DefaultGameComponents.StandardRank;

/**
 * Functional interface that provides
 * an abstract method to determine a card's value
 */
public interface ValueRule {
    int determineValue(Suit suit, Rank rank);
}
