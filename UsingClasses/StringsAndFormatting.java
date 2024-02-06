import java.util.Scanner;

/**
 * Demo use of String methods
 * @author mvail
 */
public class StringsAndFormatting {
    public static void main(String[] args) {
        System.out.print("Enter a name: ");
        Scanner kbd = new Scanner(System.in);
        
        String input = kbd.nextLine();
        System.out.println("You entered: \"" + input + "\".");
        System.out.println("Input length: " + input.length());

        input = input.trim();
        System.out.println("Input trimmed: \"" + input + "\"");
        System.out.println("Input length: " + input.length());

        String inputToUpper = input.toUpperCase();
        System.out.println("Converted to all caps: " + inputToUpper);

        char firstInitial = input.charAt(0);
        System.out.println("First initial: " + firstInitial); 

        System.out.println("Original name: " + input);

        kbd.close();
    }
}