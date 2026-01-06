 

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseArrayTests {

	@Test
	public void testReverseEmptyArray() {
		try{
			ReverseArray tester = new ReverseArray();
			int [] array = new int[0];
			tester.reverseArray(array);
			
			assertArrayEquals(new int[0],array);
			
		}
		catch(Exception e){
			fail("Exception occurred in testReverseEmptyArray: " + e.getMessage());
		}
	}
	
	@Test
	public void testReverseOneItemArray() {
		try{
			ReverseArray tester = new ReverseArray();
			int [] array = new int[] {1};
			tester.reverseArray(array);
			
			assertArrayEquals(new int[]{1},array);
			
		}
		catch(Exception e){
			fail("Exception occurred in testReverseOneItemArray: " + e.getMessage());
		}
	}
	
	@Test
	public void testReverseTwoItemArray() {
		try{
			ReverseArray tester = new ReverseArray();
			int [] array = new int[] {1,2};
			tester.reverseArray(array);
			
			assertArrayEquals(new int[]{2,1},array);
			
		}
		catch(Exception e){
			fail("Exception occurred in testReverseTwoItemArray: " + e.getMessage());
		}
	}
	
	@Test
	public void testReverseThreeItemArray() {
		try{
			ReverseArray tester = new ReverseArray();
			int [] array = new int[] {1,2,3};
			tester.reverseArray(array);
			
			assertArrayEquals(new int[]{3,2,1},array);
			
		}
		catch(Exception e){
			fail("Exception occurred in testReverseThreeItemArray: " + e.getMessage());
		}
	}
	
	@Test
	public void testReverseTenItemArray() {
		try{
			ReverseArray tester = new ReverseArray();
			int [] array = new int[] {1,2,3,4,5,6,7,8,9,10};
			tester.reverseArray(array);
			
			assertArrayEquals(new int[]{10,9,8,7,6,5,4,3,2,1},array);
			
		}
		catch(Exception e){
			fail("Exception occurred in testReverseTenItemArray: " + e.getMessage());
		}
	}

}
