import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Demo opening a file and printing its tokens.
 * @author mvail
 */
public class FileTokenizerF25 {

    public static void main(String[] args) {
        final String DELIMITERS = "[\\W\\d_]+";
        File file = new File("parsing2.txt");
        try {
            Scanner fileScan = new Scanner(file);
            // survived opening the file in a Scanner!
            // ready to read the file
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                Scanner lineScan = new Scanner(line); //break line into tokens
                lineScan.useDelimiter(DELIMITERS); //use custon delimiter in place of default whitespace
                while (lineScan.hasNext()) { //only loop through tokens if you don't know the format of each line
                    String token = lineScan.next();
                    System.out.println(token);
                }
                lineScan.close();
            }
            fileScan.close();
        } catch (FileNotFoundException e) {
            // only get here if Scanner failed to open the file in the try block
            System.out.println("Sorry. Could not open " + file.getName());
        }
    }
}
