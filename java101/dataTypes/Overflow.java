package code.java101.dataTypes;

/**
 * Demonstrates overflow and underflow.
 *
 * @author BCIT
 * @version 2022
 */
public final class Overflow {

    private Overflow() { }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {

        byte aByte = 127;
        aByte++;
        System.out.println(aByte);

        aByte--;
        System.out.println(aByte);

        short aShort = -32_768;
        aShort--;
        System.out.println(aShort);

        aShort++;
        System.out.println(aShort);

        int anInt = Integer.MAX_VALUE;
        System.out.println(anInt);

        anInt++;
        System.out.println(anInt);
    }
}
