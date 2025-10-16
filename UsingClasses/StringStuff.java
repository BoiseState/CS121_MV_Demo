/**
 * Demo of String methods.
 * @author mvail
 */
public class StringStuff {
    public static void main(String[] args) {
        //common way to initialize a String using a literal
        String string1 = "This is a String."; //implicitly calls String constructor
        //String string1 = new String("This is a String."); //EXACTLY the same as above

        System.out.println("The String: " + string1);
        System.out.println("String length: " + string1.length());
        System.out.println("First character: " + string1.charAt(0));
        System.out.println("Last character: " + string1.charAt(string1.length()-1));
        int spaceIndex1 = string1.indexOf(' ');
        String firstWord = string1.substring(0, spaceIndex1);
        System.out.println("First word: " + firstWord);
        System.out.println("The rest of the string: " + string1.substring(spaceIndex1+1));
        System.out.println("String toUpperCase: " + string1.toUpperCase());
        System.out.println("Was the original String changed? " + string1);
        System.out.println("Excited String: " + string1.replace('.', '!'));
    }
}
