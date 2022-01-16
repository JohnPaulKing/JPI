package BasicGameComponents;

public class Player {
    /**
     * the player's current score
     */
    int score;

    /**
     * The player's hand
     */
    Hand hand = new Hand();

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
