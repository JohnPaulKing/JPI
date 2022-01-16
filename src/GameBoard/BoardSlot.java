package GameBoard;

public class BoardSlot {

    /**
     * the horizontal position
     */
    int yPos;

    /**
     * the vertical position
     */
    int xPos;

    /**
     * The object that fills this slot currently
     */
     BoardObject object;

    /**
     * Construct a boardslot with its position
    * and its initial value;
     * @param y horizontal position
     * @param x vertical position
     * @param obj initial value contained
     */
    BoardSlot(int y, int x, BoardObject obj) {
        this.yPos = y;
        this.xPos = x;
        this.object = obj;
    }

    /**
     * Simpler constructor without initial object
     * @param y the horizontal position
     * @param x the vertical position
     */
    BoardSlot(int y, int x) {
        this(y,x,null);
    }

    boolean insert(BoardObject object) {
        if (this.object != null && this.object.isReplaceable()) {
            this.object = object;
            return true;
        }
        else {
            return false;
        }
    }

    boolean remove() {
        if (this.object != null && this.object.isRemovable()) {
            this.object = null;
            return true;
        }
        else {
            return false;
        }
    }



}
