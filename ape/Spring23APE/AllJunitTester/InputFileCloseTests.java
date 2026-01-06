 

import static org.junit.Assert.*;


import org.junit.Test;


public class InputFileCloseTests {

	@Test
	public void testCloseInputFile() {
		try{
			InputFile.openInputFile("input.txt");
			InputFileClose.closeInputFile();
			assertEquals(false, InputFile.isOpen);
			assertEquals(null, InputFile.file);
			assertEquals(null, InputFile.inputFile);
			assertEquals(null, InputFile.errorMsg);
		}
		catch(Exception e){
			fail("exception occurred in testCloseInputFile: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCloseInputFileFileNotOpen() {
		try{
			
			InputFileClose.closeInputFile();
			assertEquals(false, InputFile.isOpen);
			assertEquals(null, InputFile.file);
			assertEquals(null, InputFile.inputFile);
			assertEquals("attempt to close input file that is not open", InputFile.errorMsg);
		}
		catch(Exception e){
			fail("exception occurred in testCloseInputFile: " + e.getMessage());
		}
		
	}

}
