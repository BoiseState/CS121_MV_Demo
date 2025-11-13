/**
 * Demo initializing an array of all 26 letters.
 * @author mvail
 */
public class LetterArray {
    public static void main(String[] args) {
        //could use an initializer list, but will get long
        //char[] letter = {'a', 'b', 'c', 'z'};

        //could initialize all indexes explicitly, but ewww
        char[] letter = new char[26];
        // letter[0] = 'a';
        // letter[1] = 'b';
        // letter[2] = 'c';
        // letter[25] = 'z';

        //use a list and character math - awesome
        for (int i = 0; i < 26; i++) {
            letter[i] = (char)('a' + i);
        }

        //can use for-each loops to access (not change) arrays
        //useful for printing
        for (char c : letter) {
            System.out.println(c);
        }
    }
}