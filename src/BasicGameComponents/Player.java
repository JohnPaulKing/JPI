package BasicGameComponents;

public class Player {
    /**
     * the player's current score
     */
    int score;

    /**
     * The player's hand
     */
    public Hand hand = new Hand();

    /**
     * Whether the player is currently the dealer
     */
    boolean isDealer = false;

    void increaseScore(int points) {
        score += points;
    }

    void decreaseScore(int points) {
        score -= points;
    }

    void setScore(int points) {
        this.score = points;
    }

    int getScore() {
        return this.score;
    }
}
