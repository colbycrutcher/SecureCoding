 

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
public class InputFileOpenMain {

	public static void main(String[] args) {
		setUp();
		testOpenInputFileFileNameNull();
		setUp();
		testOpenInputFileFileNameEmpty();
		setUp();
		testOpenInputFileFileNameDoesNotExist();
		setUp();
		testOpenInputFile();
		setUp();
		testOpenInputFileFileAlreadyOpen();

	}


/*
PASSED -- Expected exception: IllegalArgumentException, file name passed to openInputFile was null

PASSED -- Expected exception: IllegalArgumentException, file name passed to openInputFile was empty

SUCCESS -- testOpenInputFileFileNameDoesNotExist - Did file open with file name I_do_not_exist.txt: false
errorMsg based on opening with file I_do_not_exist.txt: file name passed to openInputFile: I_do_not_exist.txt, does not exist

SUCCESS -- testOpenInputFile - Did file open with file name input.txt: true
Does isOpen field show the file is open: true

SUCCESS -- testOpenInputFileFileAlreadyOpen - Does opening a file that is already open succeed: false
Error message from trying to open already open file: Scanner already open and attached to: input.txt

*/

	
	public static void setUp()  {
		InputFile.errorMsg = null;
		InputFile.isOpen = false;
		InputFile.file = null;
		InputFile.inputFile = null;
	}

	
	
	public static void testOpenInputFileFileNameNull() {
		try{
			boolean success = InputFile.openInputFile(null);
			System.out.println("FAILED -- testOpenInputFileFileNameNull - Is file open with null name: " + InputFile.isOpen);
		}
		catch(Exception e){
			System.out.println("PASSED -- Expected exception: " + e.getClass().getSimpleName() + ", " + e.getMessage());
		}
		
	}
	
	
	public static void testOpenInputFileFileNameEmpty() {
		try{
			boolean success = InputFile.openInputFile("");
			System.out.println("FAILED -- testOpenInputFileFileNameEmpty - Is file open with empty string file name: " + InputFile.isOpen);
		}
		catch(Exception e){
			System.out.println("\r\nPASSED -- Expected exception: " + e.getClass().getSimpleName() + ", " + e.getMessage());
		}
		
	}
	

	public static void testOpenInputFileFileNameDoesNotExist() {
		try{
			boolean success = InputFile.openInputFile("I_do_not_exist.txt");
			if (!success && InputFile.errorMsg != null){
				System.out.println("\r\nSUCCESS -- testOpenInputFileFileNameDoesNotExist - Did file open with file name I_do_not_exist.txt: " + success);
				System.out.println("errorMsg based on opening with file I_do_not_exist.txt: " + InputFile.errorMsg);
			}
			else 
				System.out.println("FAILED testOpenInputFileFileNameDoesNotExist");
		}
		catch(Exception e){
			System.out.println("FAILED -- exception occurred in testOpenInputFileFileNameDoesNotExist: " + e.getMessage());
		}
	}

	

	public static void testOpenInputFile() {
		try{
			boolean success = InputFile.openInputFile("input.txt");
			if (success && InputFile.isOpen){
				System.out.println("\r\nSUCCESS -- testOpenInputFile - Did file open with file name input.txt: " + success);
				System.out.println("Does isOpen field show the file is open: " + InputFile.isOpen);
			}
			else
				System.out.println("FAILED testOpenInputFile");
		}
		catch(Exception e){
			System.out.println("FAILED -- an exception occured in testOpenInputFile: " + e.getMessage());
		}
		
	}
	

	public static void testOpenInputFileFileAlreadyOpen() {
		try{
			boolean success = InputFile.openInputFile("input.txt");
			success = InputFile.openInputFile("input.txt");
			if (!success && InputFile.errorMsg != null){
				System.out.println("\r\nSUCCESS -- testOpenInputFileFileAlreadyOpen - Does opening a file that is already open succeed: " + success);
				System.out.println("Error message from trying to open already open file: " + InputFile.errorMsg);
			}
			else
				System.out.println("FAILED testOpenInputFileFileAlreadyOpen");
		}
		catch(Exception e){
			System.out.println("FAILED -- an exception occured in testOpenInputFile: " + e.getMessage());
		}
		
	}

}//end ImputFileOpenMain