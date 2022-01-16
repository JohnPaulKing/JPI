package GameBoard;

/**
 * Any thing which can appear on the game board
 * is a board object. Each object has position data,
 * size data
 * and a method to draw itself
 */
public abstract class BoardObject {

    /**
     * The slot of the board
     * this object occupies
     * This ensures objects don't occupy the same slot
     */
    BoardSlot slot;

    /**
     * How many vertical spaces this object takes up
     */
    int width;

    /**
     * How many horizontal spaces this object takes up
     */
    int height;

    /**
     * whether or not this board object can be replaced with
     * another item. This is unused by the default contructor
     */
    boolean isReplaceable;

    /**
     * Whether an object, once inserted
     * can be removed from a slot
     */
    boolean isRemovable;

    /**
     * The constructor attempts to
     * register this object into the correct
     * slot of the board
     * @param slot
     */
    BoardObject(BoardSlot slot) {
        this.slot = slot;
        slot.insert(this);
    }

    boolean isReplaceable() {
        return isReplaceable;
    }

    boolean isRemovable() {
        return isRemovable;
    }

    /**
     * This function draws the object on to the
     * screen
     */
    abstract void draw();

}
