/**
 * This driver class (a class with a main() method that represents the program itself)
 * is demonstrating some basic primitive variable declarations, assignments, and
 * expressions.
 * 
 * @author mvail
 */
public class PrimitivesDemo {
    public static void main(String[] args) {
        /*
         * Numeric primitive variables
         */

        int firstInt = 10;
        int secondInt = 3;

        int sum = firstInt + secondInt;

        System.out.println(firstInt + " + " + secondInt + " = " + sum);

        //the division in this expression is an integer division - both numerator and denomenator
        //are integers and the result is only the whole part of the result
        System.out.println(firstInt + " / " + secondInt + " = " + (firstInt / secondInt));
        //the modulus division in this expression returns the remainder of the integer division
        System.out.println(firstInt + " % " + secondInt + " = " + (firstInt % secondInt));

        //int badPi = 3.14; //an invalid narrowing assignment of a double to an int

        double decentPi = 3.14159;

        double notPi = 3; //valid widening conversion of an int to a double

        /*
         * Boolean primitive variables
         */

        //boolean notValid = "true"; //an invalid assignment of a String to a boolean

        boolean isValid = true; //true and false are reserved words and the only valid boolean values

        /*
         * Character primitive variables
         */


        char firstChar = 'a'; //characters use single quotes
        
        //char badChar = "a"; //invalid assignment of a String to a char

        int firstCharValue = firstChar; //valid automatic conversion of char to int

        System.out.println("'" + firstChar + "' numeric value is " + firstCharValue);

        char secondChar = (char)(firstChar + 1); //character math!

        System.out.println("'" + firstChar + "' + 1 is '" + secondChar + "'");
    }
}