 
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
public class InputFileReadMain {
	
	public static void main(String[] args) {
		setUp();
		testReadFileNotOpen();
		setUp();
		testReadFileEmpty();
		setUp();
		testReadFileAllInts();
		setUp();
		testReadFileAllDoubles();
		setUp();
		testReadFileAllStrings();
		setUp();
		testReadFileMixed();

	}
	/*
	Read from file not open: 
	File not open for reading

	Read from file which is empty: 


	Read from file with all integers: 
	Integer: 1
	Integer: 2
	Integer: 33
	Integer: 44
	Integer: 55


	Read from file will all doubles: 
	Double: 1.0
	Double: 2.0
	Double: 33.0
	Double: 44.55
	Double: 55.66
	Double: 789.123


	Read from a file with all strings: 
	String: a1.0
	String: 2.0b
	String: c33.0c
	String: d44.55
	String: 55.66e
	String: f789.123f


	Read from a file with mixed data: 
	String: a1.0
	Double: 2.0
	Integer: 33
	Double: 44.55
	Integer: 55
	String: f789.123f

	*/


	public static void setUp() {
		InputFile.errorMsg = null;
		InputFile.file = null;
		InputFile.inputFile = null;
		InputFile.isOpen = false;
	}

	public static void testReadFileNotOpen() {
		try{
			String result = InputFileRead.read();
			System.out.println("Read from file not open: \r\n" + result);
		}
		catch(Exception e){
			System.out.println("FAILURE - exception occurred in testReadFileNotOpen: " + e.getMessage());
		}
	}
	

	public static void testReadFileEmpty() {
		try{
			boolean success = InputFile.openInputFile("empty_file.txt");
			String result = InputFileRead.read();
			System.out.println("\r\nRead from file which is empty: \r\n" + result);
		}
		catch(Exception e){
			System.out.println("FAILURE - exception occurred in testReadFileNotOpen: " + e.getMessage());
		}
	}
	

	public static void testReadFileAllInts() {
		try{
			boolean success = InputFile.openInputFile("int_file.txt");
			String result = InputFileRead.read();
			System.out.println("\r\nRead from file with all integers: \r\n" + result);
		}
		catch(Exception e){
			System.out.println("FAILURE - exception occurred in testReadFileNotOpen: " + e.getMessage());
		}
	}


	public static void testReadFileAllDoubles() {
		try{
			boolean success = InputFile.openInputFile("double_file.txt");
			String result = InputFileRead.read();
			System.out.println("\r\nRead from file will all doubles: \r\n" + result);
		}
		catch(Exception e){
			System.out.println("FAILURE - exception occurred in testReadFileNotOpen: " + e.getMessage());
		}
	}
	

	public static void testReadFileAllStrings() {
		try{
			boolean success = InputFile.openInputFile("string_file.txt");
			String result = InputFileRead.read();
			System.out.println("\r\nRead from a file with all strings: \r\n" + result);
		}
		catch(Exception e){
			System.out.println("FAILURE - exception occurred in testReadFileNotOpen: " + e.getMessage());
		}
	}


	public static void testReadFileMixed() {
		try{
			boolean success = InputFile.openInputFile("mixed_file.txt");
			String result = InputFileRead.read();
			System.out.println("\r\nRead from a file with mixed data: \r\n" + result);
		}
		catch(Exception e){
			System.out.println("FAILURE - exception occurred in testReadFileNotOpen: " + e.getMessage());
		}
	}




}


