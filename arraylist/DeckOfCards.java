package code.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Card.
 *
 * @author BCIT
 * @version 2020
 */
class Card {

    /**
     * Faces.
     */
    public enum Face {
        Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    }

    /**
     * Suits.
     */
    public enum Suit {
        Clubs, Diamonds, Hearts, Spades
    }

    private final Face face;
    private final Suit suit;

    /**
     * Constructs an object of type Card.
     * @param cardFace
     * @param cardSuit
     */
    Card(final Face cardFace, final Suit cardSuit) {
        face = cardFace;
        suit = cardSuit;
    }

    /**
     * Returns the face.
     * @return face a Face
     */
    public Face getFace() {
        return face;
    }

    /**
     * Returns the suit.
     * @return suit a Suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Returns a string representation of this Card.
     * @return description as a string
     */
    public String toString() {
        return String.format("%s of %s", face, suit);
    }
}

/**
 * Deck of cards.
 *
 * @author BCIT
 * @version 2020
 */
public class DeckOfCards {

    private List<Card> list;

    /**
     * Constructs an object of type DeckOfCards.
     */
    public DeckOfCards() {

        Card[] deck = new Card[52];
        int count = 0;

        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Face face : Card.Face.values()) {
                deck[count] = new Card(face, suit);
                count++;
            }
        }
        list = Arrays.asList(deck);
        Collections.shuffle(list);
    }

    /**
     * Prints the cards in the Deck.
     */
    public void printCards() {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-20s%s", list.get(i), ((i + 1) % 2 == 0) ? "\n" : "");
        }
    }

    /**
     * Drives the program.
     *
     * @param args command line arguments (unused)
     */
    public static void main(final String[] args) {
        DeckOfCards cards = new DeckOfCards();
        cards.printCards();
    }
}
