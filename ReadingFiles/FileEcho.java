import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Prompt for a file to echo. Read the file and print its
 * contents out to the console.
 * 
 * @author mvail
 */
public class FileEcho {

	/**
	 * @param args unused
	 */
	public static void main(String[] args) {
		//create a keyboard Scanner
		//Note - there should only be ONE Scanner connected
		// to any one source in any program
		Scanner kbd = new Scanner(System.in);
		
		//prompt for filename
		System.out.println("Enter a filename: ");
		String filename = kbd.nextLine().trim();
		
		kbd.close();

		//create a File object
		//Note - this will not throw an Exception if the file
		// doesn't exist, because you may be wanting to create
		// a new file!
		File file = new File(filename);
		
		//open the file in a Scanner
		//Note - opening a File has the potential to fail (the
		// file might not exist, you might not have permission
		// to read the file, etc.) so Java requires you to deal
		// with the FileNotFoundException that could be thrown
		// if you can't open the File for any reason. We are
		// demonstrating the try-catch way of handling Exceptions
		// here, because it allows you to print a helpful message
		// before exiting rather than letting the program crash.
		try {
			Scanner fileScan = new Scanner(file);
			//if we succeeded in opening the File in fileScan, we
			// can continue, here - otherwise we will catch the
			// FileNotFoundException in the catch block, below
			
			System.out.println("\nContents of \"" + filename + "\":\n");
			
			//read in each line of the file with fileScan until
			// we run out of lines
			//Note - if our intent is to read whole lines, it is
			// important that we use the hasNextLine() and nextLine()
			// methods rather than the hasNext() and next() methods,
			// which give us only one token (word) at a time - mixing
			// these kinds of methods with a single Scanner leads to
			// trouble
			while (fileScan.hasNextLine()) {
				//read one line
				String line = fileScan.nextLine();
				
				//echo the line to the console
				System.out.println(line);
			}
			
			fileScan.close();
		} catch (FileNotFoundException e) {
			//print a helpful message before exiting
			//Note - we only get into this block of code if a
			// FileNotFoundException was thrown while trying to open
			// the file in fileScan, above
			System.out.println("File \"" + filename + "\" could not be opened.");
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}
}
