package DefaultGameComponents;

import BasicGameComponents.Rank;

public enum StandardRank implements Rank {
    NONE (0, "NONE"),
    ACE (1, "A"),
    TWO (2, "2"),
    THREE (3, "3"),
    FOUR(4,"4"),
    FIVE(5,"5"),
    SIX(6,"6"),
    SEVEN(7,"7"),
    EIGHT (8,"8"),
    NINE (9,"9"),
    TEN (10,"10"),
    JACK (11, "J"),
    QUEEN (12, "Q"),
    KING (13, "K"),
    JOKER(14, "JOKER");

    String str;
    int number;

    StandardRank(int number, String str) {
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
