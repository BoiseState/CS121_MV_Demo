/**
 * A card from a deck of standard playing cards.
 * @author mvail
 */
public class Card implements Comparable<Card> {
    //instance variable / attributes
    private Suit suit; //Card 'has-a' Suit
    private int faceValue;

    //constructor

    /**
     * Create a new card with the given faceValue and suit.
     * @param faceValue
     * @param suit
     */
    public Card(int faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    @Override
    public int compareTo(Card otherCard) {
        // int difference = this.faceValue - otherCard.faceValue;
        // return difference;
        return this.faceValue - otherCard.faceValue;
    }
}
