 
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

public class InputFileCloseMain {

	public static void main(String[] args) {
		testCloseInputFile();
		testCloseInputFileFileNotOpen();

	}


/*
SUCCESS -- Just closed file, isOpen has value: false
file has value: null
inputFile has value: null
errorMsg has value: null

SUCCESS -- Tried to close file not open, isOpen has value: false
file has value: null
inputFile has value: null
errorMsg has value: attempt to close input file that is not open

*/
	public static void testCloseInputFile() {
		try{
			InputFile.openInputFile("input.txt");
			InputFileClose.closeInputFile();
			if (!InputFile.isOpen && InputFile.file == null && InputFile.inputFile == null){
				System.out.println("SUCCESS -- Just closed file, isOpen has value: " + InputFile.isOpen);
				System.out.println("file has value: " + InputFile.file);
				System.out.println("inputFile has value: " + InputFile.inputFile);
				System.out.println("errorMsg has value: " + InputFile.errorMsg);
			}
			else
				System.out.println("FAILED testCloseInputFile");
			
		}
		catch(Exception e){
			System.out.println("FAILED - exception occurred in testCloseInputFile: " + e.getMessage());
		}
		
	}
	
	public static void testCloseInputFileFileNotOpen() {
		try{
			
			InputFileClose.closeInputFile();
			if (!InputFile.isOpen && InputFile.file == null && InputFile.inputFile == null
					&& InputFile.errorMsg.equals("attempt to close input file that is not open")){
				System.out.println("\r\nSUCCESS -- Tried to close file not open, isOpen has value: " + InputFile.isOpen);
				System.out.println("file has value: " + InputFile.file);
				System.out.println("inputFile has value: " + InputFile.inputFile);
				System.out.println("errorMsg has value: " + InputFile.errorMsg);
			}
			else
				System.out.println("FAILED testCloseInputFileFileNotOpen");
		
		}
		catch(Exception e){
			System.out.println("FAILED - exception occurred in testCloseInputFile: " + e.getMessage());
		}
		
	}

}//end InputFileCloseMain

