 

import java.util.Arrays;

public class ReverseArrayMain {


	public void testReverseEmptyArray() {
		try{
			ReverseArray tester = new ReverseArray();
			int [] array = new int[0];
			tester.reverseArray(array);
			
			if (Arrays.equals(new int[0], array))
				System.out.println("SUCCESS: testReverseEmptyArray worked correctly");
			else{
				System.out.println("FAILURE: testReverseEmptyArray produced: \r\n" + Arrays.toString(array));
				System.out.println("The correct output is: " + Arrays.toString(new int[0]));
			}
			
			
		}
		catch(Exception e){
			System.out.println("Exception occurred in testReverseEmptyArray: " + e.getMessage());
		}
	}
	
	
	public void testReverseOneItemArray() {
		try{
			ReverseArray tester = new ReverseArray();
			int [] array = new int[] {1};
			tester.reverseArray(array);
			
			if (Arrays.equals(new int[] {1}, array))
				System.out.println("SUCCESS: testReverseOneItemyArray worked correctly");
			else{
				System.out.println("FAILURE: testReverseOneItemyArray produced: \r\n" + Arrays.toString(array));
				System.out.println("The correct output is: " + Arrays.toString(new int[] {1}));
			}
			
		}
		catch(Exception e){
			System.out.println("Exception occurred in testReverseOneItemArray: " + e.getMessage());
		}
	}
	
	
	public void testReverseTwoItemArray() {
		try{
			ReverseArray tester = new ReverseArray();
			int [] array = new int[] {1,2};
			tester.reverseArray(array);
			
			if (Arrays.equals(new int[] {2,1}, array))
				System.out.println("SUCCESS: testReverseTwoItemyArray worked correctly");
			else{
				System.out.println("FAILURE: testReverseTwoItemyArray produced: \r\n" + Arrays.toString(array));
				System.out.println("The correct output is: " + Arrays.toString(new int[] {2,1}));
			}
			
		}
		catch(Exception e){
			System.out.println("Exception occurred in testReverseTwoItemArray: " + e.getMessage());
		}
	}
	
	
	public void testReverseThreeItemArray() {
		try{
			ReverseArray tester = new ReverseArray();
			int [] array = new int[] {1,2,3};
			tester.reverseArray(array);
			
			if (Arrays.equals(new int[] {3,2,1}, array))
				System.out.println("SUCCESS: testReverseThreeItemyArray worked correctly");
			else{
				System.out.println("FAILURE: testReverseThreeItemyArray produced: \r\n" + Arrays.toString(array));
				System.out.println("The correct output is: " + Arrays.toString(new int[] {3,2,1}));
			}
			
		}
		catch(Exception e){
			System.out.println("Exception occurred in testReverseThreeItemArray: " + e.getMessage());
		}
	}
	
	
	public void testReverseTenItemArray() {
		try{
			ReverseArray tester = new ReverseArray();
			int [] array = new int[] {1,2,3,4,5,6,7,8,9,10};
			tester.reverseArray(array);
			
			if (Arrays.equals(new int[] {10,9,8,7,6,5,4,3,2,1}, array))
				System.out.println("SUCCESS: testReverseThreeItemyArray worked correctly");
			else{
				System.out.println("FAILURE: testReverseThreeItemyArray produced: \r\n" + Arrays.toString(array));
				System.out.println("The correct output is: " + Arrays.toString(new int[] {10,9,8,7,6,5,4,3,2,1}));
			}
			
		}
		catch(Exception e){
			System.out.println("Exception occurred in testReverseTenItemArray: " + e.getMessage());
		}
	}
	
	public static void main(String [] args){
		ReverseArrayMain tester = new ReverseArrayMain();
		
		tester.testReverseEmptyArray();
		tester.testReverseOneItemArray();
		tester.testReverseTwoItemArray();
		tester.testReverseThreeItemArray();
		tester.testReverseTenItemArray();
	}
	
}
/*
Proper output shown below:

SUCCESS: testReverseEmptyArray worked correctly
SUCCESS: testReverseOneItemyArray worked correctly
SUCCESS: testReverseTwoItemyArray worked correctly
SUCCESS: testReverseThreeItemyArray worked correctly
SUCCESS: testReverseThreeItemyArray worked correctly
 */
