import java.util.Scanner;

public class StringsAndFormatting {
    public static void main(String[] args) {
        System.out.print("Enter a name: ");
        Scanner kbd = new Scanner(System.in);
        String input = kbd.nextLine().trim();
        System.out.println("You entered: \"" + input + "\".");

        String inputToUpper = input.toUpperCase();
        System.out.println("Converted to all caps: " + inputToUpper);
        System.out.println("Original name:" + input);

        char firstInitial = input.charAt(0);
        System.out.println("First initial: " + firstInitial); 
    }
}