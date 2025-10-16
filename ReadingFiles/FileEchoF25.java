import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Demo opening a file and printing its contents.
 * @author mvail
 */
public class FileEchoF25 {
    public static void main(String[] args) {
        File file = new File("parsing2.txt");
        try {
            Scanner fileScan = new Scanner(file);
            //survived opening the file in a Scanner!
            //ready to read the file
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            //only get here if Scanner failed to open the file in the try block
            System.out.println("Sorry. Could not open " + file.getName());
        }
    }
}
