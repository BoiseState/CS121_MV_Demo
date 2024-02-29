import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileDiffDriver {
	public static void main(String[] args)
	{
		if (args.length != 2) printUsage();
		
		File file1 = new File(args[0]);
		File file2 = new File(args[1]);	
		
		try {
			Scanner s1 = new Scanner(file1);
			Scanner s2 = new Scanner(file2);
			FileDiff tester = new FileDiff(s1, s2);
			tester.compareFiles();
		} catch (FileNotFoundException e) {
			System.err.println(e);
			System.exit(1);
		}
	}
	
	private static void printUsage() {
		System.err.println();
		System.err.println("FileDiff: Usage: java FileDiffDriver <textfile1> <textfile2>");
		System.err.println();
		System.exit(1);
	}
}
