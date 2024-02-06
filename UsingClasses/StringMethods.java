import java.util.Scanner;

/**
 * Demo use of String methods
 * @author mvail
 */
public class StringMethods {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a name: "); //prompt for input
        
        String input = kbd.nextLine(); //read full line of keyboard input
        System.out.println("You entered: \"" + input + "\".");
        System.out.println("Input length: " + input.length());

        input = input.trim(); //remove all leading and trailing whitespace from input
        System.out.println("Input trimmed: \"" + input + "\"");
        System.out.println("Input length: " + input.length());

        String inputToUpper = input.toUpperCase(); //get an all upper-case version of input
        System.out.println("Converted to all caps: " + inputToUpper);

        char firstInitial = input.charAt(0); //get first character of input
        System.out.println("First initial: " + firstInitial); 

        System.out.println("Original name: " + input); //original input remains

        kbd.close();
    }
}