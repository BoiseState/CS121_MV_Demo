/**
 * This class bundles together several examples from the Module 2 slides.
 */
public class Mod2Demo1 {
    public static void main(String[] args) {
        //System.out.println("Hello World");

        int numCookies = 12;
        int numFriends = 5;

        int cookiesPerFriend = numCookies / numFriends; //integer division
        int cookiesLeftOver = numCookies % numFriends;  //modulus division

        System.out.print("cookiesPerFriend = " + cookiesPerFriend); //print stays on same line
        System.out.println(" with " + cookiesLeftOver + " cookies left over."); //println ends this line

        char initial = 'T';
        System.out.println("initial: " + initial); //concatenating a String and a char

        char pi = '\u03C0'; //accessing a Unicode char by its hexadecimal number
        System.out.println("pi symbol: " + pi); //concatenating a String and a char from Unicode set
        //pi = 3.14; //characters are not and cannot be floating point values
    }
}
