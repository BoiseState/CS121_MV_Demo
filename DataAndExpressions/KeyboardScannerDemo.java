import java.util.Scanner;

/**
 * This is a javadoc comment.
 * It should describe the class or method that comes next.
 * 
 * e.g.
 * This class includes code to demonstrate use of a Scanner for
 * reading keyboard input.
 * 
 * @author mvail
 * @author meToo
 */
public class KeyboardScannerDemo {
    public static void main(String[] args) {
        /*
         * Read text input and echo
         */
        Scanner kbd = new Scanner(System.in); //@keyterm keyboard Scanner
        
        System.out.print("Enter a sentence: ");

        String input = kbd.nextLine();

        System.out.println("You said:\n" + input);

        /*
         * Read integer input
         */
        System.out.print("Enter an integer: ");

        int inputInteger = Integer.parseInt(kbd.nextLine());

        System.out.println("Your integer: " + inputInteger);

        //NOT a good way to read primitives from the keyboard
        /*
        System.out.print("Enter another integer: ");
        
        int inputInt2 = kbd.nextInt();

        System.out.println("Your integer: " + inputInt2);

        System.out.print("Enter your name: ");

        String name = kbd.nextLine();

        System.out.println("Your name: " + name);
        */

        /*
         * Breaking up a String into tokens.
         */
        System.out.print("Enter a sentence: ");

        String sentence = kbd.nextLine();

        Scanner lineScanner = new Scanner(sentence); //@keyterm String Scanner

        String firstWord = lineScanner.next(); //safe to use in one String
        String secondWord = lineScanner.next();

        System.out.println("First two words were: " + firstWord + " " + secondWord);

        System.out.print("Enter an int and a double: ");

        lineScanner.close();

        String intAndDouble = kbd.nextLine();

        Scanner numberScanner = new Scanner(intAndDouble);

        int theInt = numberScanner.nextInt();

        double theDouble = numberScanner.nextDouble();

        System.out.println("The int: " + theInt + " and the double: " + theDouble);

        numberScanner.close();

        kbd.close();
    }
}