package code.inheritance.introToInheritance.coins;

/**
 * Represents a two-sided coin that can be flipped.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class Coin implements Lockable {
    /**
     * Internal representation of coin showing heads.
     */
    public static final int HEADS = 0;

    /**
     * Internal representation of coin showing tails.
     */
    public static final int TAILS = 1;

    private int face;
    private int key;
    private boolean locked;

    /**
     * Constructs a Coin object and flips it to give it a starting value.
     */
    public Coin() {
        flip();
        key = 0;
        locked = false;
    }

    /**
     * Flips this Coin by randomly choosing a face value.  The Coin cannot
     * be flipped if it is locked.
     */
    public void flip() {
        if (!locked) {
            face = (int) (Math.random() * 2);
        } else {
            System.out.println("Cannot flip, key is locked");
        }
    }

    /**
     * Returns true if the current face of the Coin is heads.
     *
     * @return true if current face is heads, else false.
     */
    public boolean isHeads() {
        return (face == HEADS);
    }

    /**
     * Returns the current face value of this Coin as a String.
     *
     * @return toString description
     */
    public String toString() {
        String faceName;

        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }

        return faceName;
    }

    @Override
    public void setKey(int key) {
        if (!locked) {
            this.key = key;
        }
    }

    @Override
    public boolean lock(int candidateKey) {
        if (!locked) {
            if (this.key == candidateKey) {
                locked = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean unlock(int candidateKey) {
        if (this.key == candidateKey) {
            locked = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean locked() {
        return locked;
    }
}
