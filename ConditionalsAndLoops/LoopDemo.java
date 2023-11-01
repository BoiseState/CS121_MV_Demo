/**
 * Demonstrate some loops!
 * @author mvail
 */
public class LoopDemo {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;

        // for (int i = 10; i <= 100; i++) {
        //     if (i % 2 == 0) {
        //         evenSum += i;
        //     }
        // }
        // for (int i = 10; i <= 100; i++) {
        //     if (i % 2 == 1) {
        //         oddSum += i;
        //     }
        // }
        //or
    //    for (int i = 10; i <= 100; i++) {
    //         if (i % 2 == 0) {
    //             evenSum += i;
    //         } else {
    //             oddSum += i;
    //         }
    //     }
        //or
        for (int i = 10; i < 101; i+=2) {
            evenSum += i;
        }
        for (int i = 11; i < 101; i+=2) {
            oddSum += i;
        }

        System.out.println("EvenSum: " + evenSum);
        System.out.println("OddSum: " + oddSum);

        String input = "A string";
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }

        String word = "spoons";
        String reverse = "";
        // for (int i = word.length()-1; i > -1; i--) {
        //     reverse = reverse + word.charAt(i);
        // }
        for (int i = 0; i < word.length(); i++) {
            reverse = word.charAt(i) + reverse;
        }
        System.out.println(word + " reversed is " + reverse);
    }
}