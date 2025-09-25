public class Mod2_1Demo {
    public static void main(String[] args) {
        //System.out.println("Hello World");

        int numCookies = 12;
        int numFriends = 5;

        int cookiesPerFriend = numCookies / numFriends;
        int cookiesLeftOver = numCookies % numFriends;

        System.out.print("cookiesPerFriend = " + cookiesPerFriend); //staying on same line
        System.out.println(" with " + cookiesLeftOver + " cookies left over."); //ends this line

        char initial = 'T';
        System.out.println("initial: " + initial);

        char pi = '\u03C0';
        System.out.println("pi symbol: " + pi);
        //pi = 3.14; //characters are not and cannot be floating point values
    }
}
