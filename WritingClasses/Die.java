import java.util.Random;

/**
 * A single Die for games.
 * @author mvail and CS121-1 F25
 */
public class Die {
    //instance variables / attributes
    private int numSides;
    private int faceValue;

    //constants
    public static final int DEFAULT_SIDES = 6; //static so it's universal and shared by all Die objects

    //constructor(s)
    public Die(int numSides) { //in parentheses is the "formal parameter list"
        this.numSides = numSides; //assigning local numSides value to instance var numSides
        this.faceValue = roll(); //start with a random faceValue
    }

    public Die() { //"default constructor" that uses default values
        // this.numSides = DEFAULT_SIDES; //using named constant instead of numeric literal
        // this.faceValue = 1;
        this(DEFAULT_SIDES); //this constructor is calling the other constructor
    }

    //methods / behaviors

    //getters for numSides and faceValue
    public int getNumSides() {
        return numSides;
    }

    public int getFaceValue() {
        return faceValue;
    }

    //setters? 
    public boolean setFaceValue(int newFaceValue) {
        if (newFaceValue > 0 && newFaceValue <= numSides) { //"validation"
            faceValue = newFaceValue;
            return true;
        } else { //invalid new value
            return false;
        }
    }

    //roll
    public int roll() {
        Random rand = new Random();
        faceValue = rand.nextInt(numSides) + 1;
        return faceValue;
    }
}
