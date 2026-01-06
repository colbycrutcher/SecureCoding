 

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

public class OutputFileCloseMain {
	
	public static void main(String[] args) {
		testCloseOutputFile();
		testCloseOutputFileFileNotOpen();

	}
/*
did output file open properly: true
SUCCESS - file close properly: false
value of PrintStream called outputFile: null
value of errorMsg: null

SUCCESS - tried to close file that is not open
value of isOpen: false
value of outputFile: null
value of errorMsg: null
*/	
	
	public static void testCloseOutputFile() {
		try{
			OutputFile.openOutputFile("output.txt");
			System.out.println("did output file open properly: " + OutputFile.isOpen);
			
			OutputFileClose.closeOutputFile();
			if (!OutputFile.isOpen && OutputFile.outputFile == null && OutputFile.errorMsg == null){
				System.out.println("SUCCESS - file close properly: " + OutputFile.isOpen);
				
				System.out.println("value of PrintStream called outputFile: " + OutputFile.outputFile );
				System.out.println("value of errorMsg: " + OutputFile.errorMsg);
			}
			else
				System.out.println("FAILURE - testCloseOutputFile");
			
		}
		catch(Exception e){
			System.out.println("FAILURE - exception occurred in testCloseOutputFile: " + e.getMessage());
		}
		
	}
	
	
	public static void testCloseOutputFileFileNotOpen() {
		try{
			
			OutputFileClose.closeOutputFile();
			if (!OutputFile.isOpen && OutputFile.outputFile == null){
				System.out.println("\r\nSUCCESS - tried to close file that is not open");
				System.out.println("value of isOpen: " + OutputFile.isOpen);
				System.out.println("value of outputFile: " + OutputFile.outputFile);
				System.out.println("value of errorMsg: " + OutputFile.errorMsg);
			}
			else
				System.out.println("FAILURE - testCloseOutputFileFileNotOpen");
			
		}
		catch(Exception e){
			System.out.println("FAILURE - exception occurred in testCloseOutputFile: " + e.getMessage());
		}
		
	}



}



