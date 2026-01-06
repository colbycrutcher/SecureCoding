 

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
public class OutputFileOpenMain {
	
	public static void main(String[] args) {
		setUp();
		testOpenOutputFileFileAlreadyOpen();
		setUp();
		testOpenOutputFile();
		setUp();
		testOpenOutputFileFileNameNull();
		setUp();
		testOpenOutputFileFileNameEmptyString();

	}


/*
SUCCESS - testOpenOutputFileFileAlreadyOpen - Trying to open a file that is already open: file already open, not opening file named: output.txt

SUCCESS - testOpenOutputFile - opening a file named output.txt: true

SUCCESS - testOpenOutputFileFileNameNull - yields: file name passed to openOutputFile was null

SUCCESS - testOpenOutputFileFileNameEmptyString - yields: file name passed to openOutputFile was an empty string

*/
	public static void setUp()  {
		OutputFile.errorMsg = null;
		OutputFile.isOpen = false;
		OutputFile.outputFile = null;
	}

	
	public static void testOpenOutputFileFileAlreadyOpen() {
		try{
			OutputFile.openOutputFile("output.txt");
			OutputFile.openOutputFile("output.txt");
			if (OutputFile.errorMsg.equals("file already open, not opening file named: output.txt"))
				System.out.println("SUCCESS - testOpenOutputFileFileAlreadyOpen - Trying to open a file that is already open: " + OutputFile.errorMsg);
			else
				System.out.println("FAILURE - testOpenOutputFileFileAlreadyOpen");
		}
		catch(Exception e){
			System.out.println("FAILURE - exception occurred in testOpenOutputFileFileAlreadyOpen: " + e.getMessage());
		}
		
	}
	
	
	public static void testOpenOutputFile() {
		try{
			OutputFile.openOutputFile("output.txt");
			if (OutputFile.isOpen)
				System.out.println("\r\nSUCCESS - testOpenOutputFile - opening a file named output.txt: " + OutputFile.isOpen);
			else
				System.out.println("FAILURE - testOpenOutputFile");
			
		}
		catch(Exception e){
			System.out.println("FAILURE - exception occurred in testOpenOutputFileFileAlreadyOpen: " + e.getMessage());
		}
		
	}
	
	
	public static void testOpenOutputFileFileNameNull() {
		try{
			OutputFile.openOutputFile(null);
			if (OutputFile.errorMsg.equals("file name passed to openOutputFile was null"))
				System.out.println("\r\nSUCCESS - testOpenOutputFileFileNameNull - yields: " + OutputFile.errorMsg);
			else
				System.out.println("FAILURE - testOpenOutputFileFileNameNull");
			
		}
		catch(Exception e){
			System.out.println("FAILURE - exception occurred in testOpenOutputFileFileAlreadyOpen: " + e.getMessage());
		}
		
	}
	
	
	public static void testOpenOutputFileFileNameEmptyString() {
		try{
			OutputFile.openOutputFile("");
			if (OutputFile.errorMsg.equals("file name passed to openOutputFile was an empty string"))
				System.out.println("\r\nSUCCESS - testOpenOutputFileFileNameEmptyString - yields: " + OutputFile.errorMsg);
			else
				System.out.println("FAILURE - testOpenOutputFileFileNameEmptyString");
			
		}
		catch(Exception e){
			System.out.println("FAILURE - exception occurred in testOpenOutputFileFileAlreadyOpen: " + e.getMessage());
		}
		
	}

}
