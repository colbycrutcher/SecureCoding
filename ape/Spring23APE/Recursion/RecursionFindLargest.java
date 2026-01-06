 

/*
 * Given the public findLargest method below, write the recursive private helper
 * method based on the call in the public method.
 * 
 * The helper method must recursively walk through the array and find the largest value.
 * The largest value should be returned.
 * 
 * No loops of any form are allowed.
 * Failure to productively use recursion to solve this problem will result in 0 points.
 */
public class RecursionFindLargest {

	public static int findLargest(int [] array){
		if (array == null || array.length == 0)
			throw new IllegalArgumentException("array passed to findLargest was empty");
		return findLargest(array, 1, array[0]);
	}
//startMethod
	private static int findLargest(int[] array, int i, int largest) {

		if (i >= array.length) {
			return largest;
		}
		if (array[i] > largest) {
			largest = array[i];
		}
		return findLargest(array, i + 1, largest);
	}
//endMethod
}

