package code.inheritance.introToInheritance.coins;

/**
 * CoinDriver exercises the Lockable interface.
 *
 * @author BCIT
 * @version 2020
 */
public class CoinDriver {

    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        final Coin myCoin = new Coin();
        System.out.println("My coin is "
                + (myCoin.locked() ? "" : "not") + " locked");
        myCoin.flip();
        System.out.println(myCoin.toString());
        final int key = 22;
        myCoin.setKey(key);
        myCoin.lock(key);
        myCoin.flip();
        System.out.println(myCoin.toString());
        myCoin.unlock(key);
        myCoin.flip();
        myCoin.flip();
        myCoin.flip();

    }

}
