 

import static org.junit.Assert.*;


import org.junit.Test;


public class OutputFileCloseTests {

	@Test
	public void testCloseOutputFile() {
		try{
			OutputFile.openOutputFile("output.txt");
			assertEquals(true, OutputFile.isOpen);
			OutputFileClose.closeOutputFile();
			assertEquals(false, OutputFile.isOpen);
			assertEquals(null, OutputFile.outputFile);
			assertEquals(null, OutputFile.errorMsg);
		}
		catch(Exception e){
			fail("exception occurred in testCloseOutputFile: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCloseOutputFileFileNotOpen() {
		try{
			
			OutputFileClose.closeOutputFile();
			assertEquals(false, OutputFile.isOpen);
			assertEquals(null, OutputFile.outputFile);
			assertEquals(null, OutputFile.errorMsg);
		}
		catch(Exception e){
			fail("exception occurred in testCloseOutputFile: " + e.getMessage());
		}
		
	}


}
