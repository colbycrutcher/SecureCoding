 

public class LinkedListDummyCloneMain {
	
	private  LinkedListDummyClone list;

	public void setUp()  {
		list = new LinkedListDummyClone();
		
	}
	
	public void testCloneEmptyList() {
		try{
			LinkedListDummyClone theClone = list.clone();
			
			if (list.toString().equals(theClone.toString()))
				System.out.println("SUCCESS: testCloneEmptyList produced correct results");
			else{
				System.out.println("FAILURE: testCloneEmpytList produced INCORRECT results");
				System.out.println("The original list was: \r\n" + list.toString());
				System.out.println("The cloned list was: \r\n" + theClone.toString() );
			}
			
		}
		catch(Exception e){
			System.out.println("Exception occurred in testCloneEmptyList: " + e.getMessage());
		}
		
	}
	
	
	public void testClone1ItemList() {
		try{
			list.addFirst("single item");
			LinkedListDummyClone theClone = list.clone();
			
			if (list.toString().equals(theClone.toString()) && list.head.next != theClone.head.next)
				System.out.println("SUCCESS: testClone1ItemList produced correct results");
			else{
				System.out.println("FAILURE: testClone1ItemList produced INCORRECT results");
				System.out.println("The original list was: \r\n" + list.toString());
				System.out.println("The cloned list was: \r\n" + theClone.toString() );
				System.out.println("list.head.next was: " + list.head.next);
				System.out.println("theClone.head.next was: " + theClone.head.next);
			}

		}
		catch(Exception e){
			System.out.println("Exception occurred in testClone1ItemList: " + e.getMessage());
		}
		
	}
	
	
	public void testClone10ItemList() {
		try{
			list.addFirst("10");
			list.addFirst("9");
			list.addFirst("8");
			list.addFirst("7");
			list.addFirst("6");
			list.addFirst("5");
			list.addFirst("4");
			list.addFirst("3");
			list.addFirst("2");
			list.addFirst("1");
			LinkedListDummyClone theClone = list.clone();
			
			if (list.toString().equals(theClone.toString()) && list.head.next != theClone.head.next)
				System.out.println("SUCCESS: testClone10ItemList produced correct results");
			else{
				System.out.println("FAILURE: testClone10ItemList produced INCORRECT results");
				System.out.println("The original list was: \r\n" + list.toString());
				System.out.println("The cloned list was: \r\n" + theClone.toString() );
				System.out.println("list.head.next was: " + list.head.next);
				System.out.println("theClone.head.next was: " + theClone.head.next);
			}

		}
		catch(Exception e){
			System.out.println("Exception occurred in testClone10ItemList: " + e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		LinkedListDummyCloneMain tester = new LinkedListDummyCloneMain();
		
		tester.setUp();
		tester.testCloneEmptyList();
		tester.setUp();
		tester.testClone1ItemList();
		tester.setUp();
		tester.testClone10ItemList();

	}

}
/*
The correct output is shown below:

SUCCESS: testCloneEmptyList produced correct results
SUCCESS: testClone1ItemList produced correct results
SUCCESS: testClone10ItemList produced correct results
*/


