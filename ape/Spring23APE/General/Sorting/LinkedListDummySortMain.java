 

public class LinkedListDummySortMain {
	private static LinkedListDummySort list;

	
	public static void testSortListEmpty() {
		try{
			list = new LinkedListDummySort();
			list.sort();
			
			System.out.println("testSortListEmpty - yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testSortListEmpty: " + e.getMessage());
		}
	}
	
	
	public static void testSortListOneItem() {
		try{
			list = new LinkedListDummySort();
			list.addFirst("first");
			list.sort();
			
			System.out.println("testSortListOneItem - yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testSortListOneItem: " + e.getMessage());
		}
	}
	
	
	public static void testSortListTwoItems() {
		try{
			list = new LinkedListDummySort();
			list.addFirst("first");
			list.addFirst("second");
			list.sort();
			
			System.out.println("testSortListTwoItems - yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testSortListTwoItems: " + e.getMessage());
		}
	}

	
	public static void testSortListTwoItemsSorted() {
		try{
			list = new LinkedListDummySort();
			list.addFirst("second");
			list.addFirst("first");
			list.sort();
			
			System.out.println("testSortListTwoItemsSorted - yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testSortListTwoItemsSorted: " + e.getMessage());
		}
	}

	
	public static void testSortListThreeItems() {
		try{
			list = new LinkedListDummySort();
			list.addFirst("first");
			list.addFirst("second");
			list.addFirst("third");
			list.sort();
			
			System.out.println("testSortListThreeItems - yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testSortListThreeItems: " + e.getMessage());
		}
	}
	
	
	public static void testSortListThreeItemsSorted() {
		try{
			list = new LinkedListDummySort();
			list.addFirst("third");
			list.addFirst("second");
			list.addFirst("first");
			list.sort();
			
			System.out.println("testSortListThreeItemsSorted - yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testSortListThreeItemsSorted: " + e.getMessage());
		}
	}
	
	
	public static void testSortListTenItemsSorted() {
		try{
			list = new LinkedListDummySort();
			list.addFirst("tomato");
			list.addFirst("persimmon");
			list.addFirst("orange");
			list.addFirst("lime");
			list.addFirst("lemon");
			list.addFirst("kumquat");
			list.addFirst("grape");
			list.addFirst("cherry");
			list.addFirst("banana");
			list.addFirst("apple");
			list.sort();
			
			System.out.println("testSortListTenItemsSorted - yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testSortListTenItemsSorted: " + e.getMessage());
		}
	}

	
	public static void testSortListTenItemsRandom() {
		try{
			list = new LinkedListDummySort();
			list.addFirst("apple");
			list.addFirst("cherry");
			list.addFirst("persimmon");
			list.addFirst("orange");
			list.addFirst("tomato");
			list.addFirst("kumquat");
			list.addFirst("lemon");
			list.addFirst("grape");
			list.addFirst("lime");
			list.addFirst("banana");
			
			list.sort();
			
			System.out.println("testSortListTenItemsRandom - yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testSortListTenItemsRandom: " + e.getMessage());
		}
	}
	
	
	public static void testSortListTenItemsDuplicates() {
		try{
			list = new LinkedListDummySort();
			list.addFirst("apple");
			list.addFirst("apple");
			list.addFirst("lime");
			list.addFirst("orange");
			list.addFirst("lemon");
			list.addFirst("grape");
			list.addFirst("lemon");
			list.addFirst("grape");
			list.addFirst("lime");
			list.addFirst("orange");
			
			list.sort();
			
			System.out.println("testSortListTenItemsDuplicates - yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testSortListTenItemsDuplicates: " + e.getMessage());
		}
	}


	public static void main(String[] args) {
		testSortListEmpty();
		testSortListOneItem();
		testSortListTwoItems();
		testSortListTwoItemsSorted();
		testSortListThreeItems();
		testSortListThreeItemsSorted();
		testSortListTenItemsSorted();
		testSortListTenItemsRandom();
		testSortListTenItemsDuplicates();

	}

}
/*
testSortListEmpty - yields: 
List size is: 0

testSortListOneItem - yields: 
List size is: 1
first

testSortListTwoItems - yields: 
List size is: 2
first
second

testSortListTwoItemsSorted - yields: 
List size is: 2
first
second

testSortListThreeItems - yields: 
List size is: 3
first
second
third

testSortListThreeItemsSorted - yields: 
List size is: 3
first
second
third

testSortListTenItemsSorted - yields: 
List size is: 10
apple
banana
cherry
grape
kumquat
lemon
lime
orange
persimmon
tomato

testSortListTenItemsRandom - yields: 
List size is: 10
apple
banana
cherry
grape
kumquat
lemon
lime
orange
persimmon
tomato

testSortListTenItemsDuplicates - yields: 
List size is: 10
apple
apple
grape
grape
lemon
lemon
lime
lime
orange
orange

*/

