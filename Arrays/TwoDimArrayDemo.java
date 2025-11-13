import java.util.Random;

/**
 * Demo working with a 2D array.
 * @author mvail
 */
public class TwoDimArrayDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        
        final int UPPER_BOUND = 100;
        
        int[][] array1 = new int[5][10]; //5 rows, 10 columns
        
        //fill array with random ints from 1 to 100
        for (int row = 0; row < array1.length; row++) {
            for (int col = 0; col < array1[row].length; col++) {
                array1[row][col] = rand.nextInt(UPPER_BOUND) + 1;
            }
        }

        //print full array
        for (int row = 0; row < array1.length; row++) {
            for (int col = 0; col < array1[row].length; col++) {
                System.out.printf("%3d ", array1[row][col]); //stay on current row
            }
            System.out.println(); //go to next row of output
        }

        //can also use initializer lists for mulit-dimensional arrays!
        int[][] array2 = { //initialize a 3 row, 5 col 2D array
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };
    }
}
