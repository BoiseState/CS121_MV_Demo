public class LetterArray {
    public static void main(String[] args) {
        //char[] letter = {'a', 'b', 'c', 'z'};
        char[] letter = new char[26];
        // letter[0] = 'a';
        // letter[1] = 'b';
        // letter[2] = 'c';
        // letter[25] = 'z';
        for (int i = 0; i < 26; i++) {
            letter[i] = (char)('a' + i);
        }

        for (char c : letter) {
            System.out.println(c);
        }
    }
}