import java.util.Scanner;

/**
 * Compare 2 files and report lines that are different.
 * @author mvail
 */
public class FileDiff {
	Scanner s1, s2;
	
	/**
	 * Receives 2 scanners for use in compareFiles()
	 * @param s1
	 * @param s2
	 */
	public FileDiff(Scanner s1, Scanner s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void compareFiles()
	{
		int currentLine = 1;
		while (s1.hasNext() && s2.hasNext())
		{
			String s1Line = s1.nextLine().trim();
			String s2Line = s2.nextLine().trim();
			
			if (s1Line.compareToIgnoreCase(s2Line) != 0)
			{
				System.out.println("Difference at line " + currentLine);
				System.out.println(s1Line);
				System.out.println(s2Line);
				System.out.println();
			}
			
			currentLine++;
		}
		
		//now, what if one file is longer than the other?
		
		while (s1.hasNext())
		{
			System.out.println("Unmatched line in first file:");
			System.out.println(s1.nextLine());
			System.out.println();
		}
		
		while (s2.hasNext())
		{
			System.out.println("Unmatched line in second file:");
			System.out.println(s2.nextLine());			
			System.out.println();
		}
	}
	
}
