package DefaultGameComponents;

import BasicGameComponents.Suit;

/**
 * Standard suits in a deck
 */

public enum StandardSuit implements Suit {
    NONE(0,"NONE"),
    HEARTS(1,"HEARTS"),
    CLUBS(2, "CLUBS"),
    DIAMONDS(3,"DIAMONDS"),
    SPADES(4,"SPADES"),
    //these two used only for jokers
    RED(5, "RED"),
    BLACK(6, "BLACK");

    String str;
    int number;

    StandardSuit(int number, String str) {
        this.number = number;
        this.str = str;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return this.str;
    }
}
