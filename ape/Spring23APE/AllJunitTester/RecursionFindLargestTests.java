 

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;


public class RecursionFindLargestTests {

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected=IllegalArgumentException.class)
	public void testFindLargestEmptyArray() {
		
			int [] array = new int[0];
			
			int largest = RecursionFindLargest.findLargest(array);
			assertEquals(0, largest);
		
		
	}
	
	@Test
	public void testFindLargest1ItemArray() {
		try{
			int [] array = {55};
			
			int largest = RecursionFindLargest.findLargest(array);
			assertEquals(55, largest);
		}
		catch(Exception e){
			fail("Exception occurred in testFindLargestEmptyArray: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testFindLargest2ItemArray() {
		try{
			int [] array = {55, 66};
			
			int largest = RecursionFindLargest.findLargest(array);
			assertEquals(66, largest);
		}
		catch(Exception e){
			fail("Exception occurred in testFindLargest2ItemArray: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testFindLargest3ItemArray() {
		try{
			int [] array = {55, 66, 44};
			
			int largest = RecursionFindLargest.findLargest(array);
			assertEquals(66, largest);
		}
		catch(Exception e){
			fail("Exception occurred in testFindLargest3ItemArray: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testFindLargest5ItemArray() {
		try{
			int [] array = {1, 2, 1, 2, 1};
			
			int largest = RecursionFindLargest.findLargest(array);
			assertEquals(2, largest);
		}
		catch(Exception e){
			fail("Exception occurred in testFindLargest5ItemArray: " + e.getMessage());
		}
		
	}

	@Test
	public void testFindLargest10ItemArray() {
		try{
			int [] array = {1, 2, 1, 2, 1, 0, -1, 2, 3, 1};
			
			int largest = RecursionFindLargest.findLargest(array);
			assertEquals(3, largest);
		}
		catch(Exception e){
			fail("Exception occurred in testFindLargest10ItemArray: " + e.getMessage());
		}
		
	}

	@Test
	public void testFindLargest10ItemArrayAllSame() {
		try{
			int [] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
			
			int largest = RecursionFindLargest.findLargest(array);
			assertEquals(1, largest);
		}
		catch(Exception e){
			fail("Exception occurred in testFindLargest10ItemArrayAllSame: " + e.getMessage());
		}
		
	}

	@Test
	public void testFindLargest10ItemArrayAscending() {
		try{
			int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			
			int largest = RecursionFindLargest.findLargest(array);
			assertEquals(10, largest);
		}
		catch(Exception e){
			fail("Exception occurred in testFindLargest10ItemArrayAscending: " + e.getMessage());
		}
		
	}



}

