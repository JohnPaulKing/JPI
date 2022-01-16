package BasicGameComponents;

public enum Rank {
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
    JACK (11, "JACK"),
    QUEEN (12, "QUEEN"),
    KING (13, "KING"),
    JOKER(14, "JOKER");

    String str;
    int number;

    Rank(int number, String str) {
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
