 
import java.util.ArrayList;
import java.util.List;


public class LinkedListAddAllMain {
	private static LinkedListAddAll list;
	

	
	public void setUp() {
		list = new LinkedListAddAll();
		
	}

	public void testAddAllWithNull() {
		try{
			
			boolean result = list.addAll(null);
			if (list.toString().equals("List size is: 0\r\n") && !result)
				System.out.println("SUCCESS: testAddWithNull performed as expected");
			else{
				System.out.println("FAILURE: testAddWithNull performed incorrectly");
				System.out.println("Resulting list was\r\n" + list.toString());
				System.out.println("Resulting list should have been\r\n: List size is: 0\r\n");
				System.out.println("Returned value from addAll was: " + result);
			}
		
		}
		catch(Exception e){
			System.out.println("Exception occurred on testAddAllWithNull: " + e.getMessage());
			
		}
	}
	
	
	
	public void testAddAllEmptyList() {
		try{
			List aList = new ArrayList();
			boolean result = list.addAll(aList);
			
			if (list.toString().equals("List size is: 0\r\n") && !result)
				System.out.println("SUCCESS: testAddAllEmptyList performed as expected");
			else{
				System.out.println("FAILURE: testAddAllEmptyList performed incorrectly");
				System.out.println("Resulting list was\r\n" + list.toString());
				System.out.println("Resulting list should have been\r\n: List size is: 0\r\n");
				System.out.println("Returned value from addAll was: " + result);
			}

		}
		catch(Exception e){
			System.out.println("Exception occurred on testAddAllEmptyList: " + e.getMessage());
			
		}
		
	}
	
	
	public void testAddAllOneItemEmptyLinkedList() {
		try{
			List aList = new ArrayList();
			aList.add("single item");
			boolean result = list.addAll(aList);
			
			if (list.toString().equals("List size is: 1\r\nsingle item\r\n") && result)
				System.out.println("SUCCESS: testAddAllOneItemEmptyLinkedList performed as expected");
			else{
				System.out.println("FAILURE: testAddAllOneItemEmptyLinkedList performed incorrectly");
				System.out.println("Resulting list was\r\n" + list.toString());
				System.out.println("Resulting list should have been\r\n: List size is: 1\r\nsingle item\r\n");
				System.out.println("Returned value from addAll was: " + result);
			}

		}
		catch(Exception e){
			System.out.println("Exception occurred on testAddAllOneItemEmptyLinkedList: " + e.getMessage());
			
		}
	}
	
	
	public void testAddAllOneItemSingleItemLinkedList() {
		try{
			List aList = new ArrayList();
			aList.add("single item");
			list.addFirst("one");
			boolean result = list.addAll(aList);
			
			if (list.toString().equals("List size is: 2\r\none\r\nsingle item\r\n") && result)
				System.out.println("SUCCESS: testAddAllOneItemSingleItemLinkedList performed as expected");
			else{
				System.out.println("FAILURE: testAddAllOneItemSingleItemLinkedList performed incorrectly");
				System.out.println("Resulting list was\r\n" + list.toString());
				System.out.println("Resulting list should have been\r\n: List size is: 2\r\none\r\nsingle item\r\n");
				System.out.println("Returned value from addAll was: " + result);
			}

		}
		catch(Exception e){
			System.out.println("Exception occurred on testAddAllOneItemSingleItemLinkedList: " + e.getMessage());
			
		}
	}
	
	
	public void testAddAllThreeItemsEmptyLinkedList() {
		try{
			List aList = new ArrayList();
			aList.add("first");
			aList.add("second");
			aList.add("third");
			boolean result = list.addAll(aList);
			
			if (list.toString().equals("List size is: 3\r\nfirst\r\nsecond\r\nthird\r\n") && result)
				System.out.println("SUCCESS: testAddAllThreeItemsEmptyLinkedList performed as expected");
			else{
				System.out.println("FAILURE: testAddAllThreeItemsEmptyLinkedList performed incorrectly");
				System.out.println("Resulting list was\r\n" + list.toString());
				System.out.println("Resulting list should have been\r\n: List size is: 3\r\nfirst\r\nsecond\r\nthird\r\n");
				System.out.println("Returned value from addAll was: " + result);
			}
		}
		catch(Exception e){
			System.out.println("Exception occurred on testAddAllThreeItemsEmptyLinkedList: " + e.getMessage());
			
		}
	}
	
	
	public void testAddAllThreeItemsFiveItemLinkedList() {
		try{
			List aList = new ArrayList();
			aList.add("first");
			aList.add("second");
			aList.add("third");
			
			list.addFirst("5");
			list.addFirst("4");
			list.addFirst("3");
			list.addFirst("2");
			list.addFirst("1");
			
			boolean result = list.addAll(aList);
			
			if (list.toString().equals("List size is: 8\r\n1\r\n2\r\n3\r\n4\r\n5\r\nfirst\r\nsecond\r\nthird\r\n") && result)
				System.out.println("SUCCESS: testAddAllThreeItemsFiveItemLinkedList performed as expected");
			else{
				System.out.println("FAILURE: testAddAllThreeItemsFiveItemLinkedList performed incorrectly");
				System.out.println("Resulting list was\r\n" + list.toString());
				System.out.println("Resulting list should have been\r\n: List size is: 8\r\n1\r\n2\r\n3\r\n4\r\n5\r\nfirst\r\nsecond\r\nthird\r\n");
				System.out.println("Returned value from addAll was: " + result);
			}

		}
		catch(Exception e){
			System.out.println("Exception occurred on testAddAllThreeItemsFiveItemLinkedList: " + e.getMessage());
			
		}
	}
	
	
	public static void main(String[] args) {
		LinkedListAddAllMain tester = new LinkedListAddAllMain();
		
		tester.setUp();
		tester.testAddAllWithNull();
		tester.setUp();
		tester.testAddAllEmptyList();
		tester.setUp();
		tester.testAddAllOneItemEmptyLinkedList();
		tester.setUp();
		tester.testAddAllOneItemSingleItemLinkedList();
		tester.setUp();
		tester.testAddAllThreeItemsEmptyLinkedList();
		tester.setUp();
		tester.testAddAllThreeItemsFiveItemLinkedList();
		
	}

}
/*
Proper output shown below:

SUCCESS: testAddWithNull performed as expected
SUCCESS: testAddAllEmptyList performed as expected
SUCCESS: testAddAllOneItemEmptyLinkedList performed as expected
SUCCESS: testAddAllOneItemSingleItemLinkedList performed as expected
SUCCESS: testAddAllThreeItemsEmptyLinkedList performed as expected
SUCCESS: testAddAllThreeItemsFiveItemLinkedList performed as expected
 */
