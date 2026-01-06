 

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InputFileReadTests {

	@Before
	public void setUp() throws Exception {
		InputFile.errorMsg = null;
		InputFile.file = null;
		InputFile.inputFile = null;
		InputFile.isOpen = false;
	}

	@Test
	public void testReadFileNotOpen() {
		try{
			String result = InputFileRead.read();
			assertEquals("File not open for reading", result);
		}
		catch(Exception e){
			fail("exception occurred in testReadFileNotOpen: " + e.getMessage());
		}
	}
	
	@Test
	public void testReadFileEmpty() {
		try{
			boolean success = InputFile.openInputFile("empty_file.txt");
			String result = InputFileRead.read();
			assertEquals("", result);
		}
		catch(Exception e){
			fail("exception occurred in testReadFileNotOpen: " + e.getMessage());
		}
	}
	
	@Test
	public void testReadFileAllInts() {
		try{
			boolean success = InputFile.openInputFile("int_file.txt");
			String result = InputFileRead.read();
			assertEquals("Integer: 1\r\nInteger: 2\r\nInteger: 33\r\nInteger: 44\r\nInteger: 55\r\n", result);
		}
		catch(Exception e){
			fail("exception occurred in testReadFileNotOpen: " + e.getMessage());
		}
	}

	@Test
	public void testReadFileAllDoubles() {
		try{
			boolean success = InputFile.openInputFile("double_file.txt");
			String result = InputFileRead.read();
			assertEquals("Double: 1.0\r\nDouble: 2.0\r\nDouble: 33.0\r\nDouble: 44.55\r\nDouble: 55.66\r\nDouble: 789.123\r\n", result);
		}
		catch(Exception e){
			fail("exception occurred in testReadFileNotOpen: " + e.getMessage());
		}
	}
	
	@Test
	public void testReadFileAllStrings() {
		try{
			boolean success = InputFile.openInputFile("string_file.txt");
			String result = InputFileRead.read();
			assertEquals("String: a1.0\r\nString: 2.0b\r\nString: c33.0c\r\nString: d44.55\r\nString: 55.66e\r\nString: f789.123f\r\n", result);
		}
		catch(Exception e){
			fail("exception occurred in testReadFileNotOpen: " + e.getMessage());
		}
	}

	@Test
	public void testReadFileMixed() {
		try{
			boolean success = InputFile.openInputFile("mixed_file.txt");
			String result = InputFileRead.read();
			assertEquals("String: a1.0\r\nDouble: 2.0\r\nInteger: 33\r\nDouble: 44.55\r\nInteger: 55\r\nString: f789.123f\r\n", result);
		}
		catch(Exception e){
			fail("exception occurred in testReadFileNotOpen: " + e.getMessage());
		}
	}



}

