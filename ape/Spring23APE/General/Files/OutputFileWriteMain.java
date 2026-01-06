 

import java.io.File;
import java.util.Scanner;

/*
 * Non JUnit test file.  The main method below calls test methods that
 * examine the functionality of your solution.
 * 
 * Examine the output produced from running this file against a correct solution.
 * The output is shown as a comment below the main method.
 * 
 * Be sure and look at the code in the test methods to help guide how your
 * solution should perform.
 * 
 */


public class OutputFileWriteMain {
	
	public static void main(String[] args) {
		testWriteToOutputFile();

	}
/*
testWriteToOutputFile - Resulting file contents are: 
first
second
third
fourth
fifth
6
7
8
9
10

*/	
	
	public static void testWriteToOutputFile() {
		try{
			OutputFile.openOutputFile("output.txt");
			
			
			String [] data = {"first", "second", "third", "fourth", "fifth"};
			
			for (int i = 0; i < data.length; i++){
				
				OutputFileWrite.writeToOutputFile(data[i]);
			}
			
			for (int i = 6; i <= 10; i++){
				OutputFileWrite.writeToOutputFile(i);
			}
			
			OutputFile.outputFile.close();
			
			String fileContents = "";
			
			Scanner input = new Scanner(new File("output.txt"));
			while(input.hasNext()){
				fileContents += input.nextLine() + "\r\n";
			}
			
			input.close();
			
			System.out.println("testWriteToOutputFile - Resulting file contents are: \r\n" + fileContents);
		}
		catch(Exception e){
			System.out.println("FAILURE - exception occurred in testWriteToOutputFile: " + e.getMessage());
		}
	}
}
