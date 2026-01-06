 

import java.util.Scanner;
import java.io.File;
import static org.junit.Assert.*;

import org.junit.Test;


public class OutputFileWriteTests {

	@Test
	public void testWriteToOutputFile() {
		try{
			OutputFile.openOutputFile("output.txt");
			assertEquals(true, OutputFile.isOpen);
			
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
			
			assertEquals("first\r\nsecond\r\nthird\r\nfourth\r\nfifth\r\n6\r\n7\r\n8\r\n9\r\n10\r\n", fileContents);
		}
		catch(Exception e){
			fail("exception occurred in testWriteToOutputFile: " + e.getMessage());
		}
	}

}
