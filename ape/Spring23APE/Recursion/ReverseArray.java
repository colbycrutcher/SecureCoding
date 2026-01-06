 

/*
 * Write the code for the reverseArray method.  It must be recursive in nature.
 * No loops are allowed.  Recursion must be used productively to solve problem
 * for credit.
 * 
 * The method needs to reverse the contents of the array that is passed in
 * 
 * You may write a single method or two methods with one that is a helper
 * and does the actual recursive work.
 * 
 * Use the calls made in the tester file to build your first method.
 * Also look at the tests to determine how your method should behave
 * for different input to the method (null, empty array, etc.)
 */
public class ReverseArray {
	
	//write the reverseArray method in the space below
	public void reverseArray(int [] array){
		if (array == null || array.length < 2)
			return;
		reverseArray(array, 0, array.length-1);
		
	}
//startMethod
	private void reverseArray(int[] array, int left, int right) {

	}
//endMethod
}
