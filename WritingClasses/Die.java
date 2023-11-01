import java.util.Random;

/**
 * A single die for use in dice games or other such applications.
 * @author mvail and cs121-3 f23
 */
public class Die {
    //instance variables / attributes

    private int faceValue;
    private int numSides;

    public static final int DEFAULT_SIDES = 6;

    //constructors - initialize instance variables

    public Die() {
        this(DEFAULT_SIDES);
    }

    public Die(int numSides) {
        this.numSides = numSides;
        Random rand = new Random();
        faceValue = rand.nextInt(numSides) + 1;
    }

    //methods / behaviors

    public int getFaceValue() {
        return faceValue;
    }

    // public void setFaceValue(int faceValue) {
    //     this.faceValue = faceValue;
    // }

    public int getNumSides() {
        return numSides;
    }

    // public void setNumSides(int numSides) {
    //     this.numSides = numSides;
    // }


}
