 

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListDummySortTests {
	private LinkedListDummySort list;

	@Test
	public void testSortListEmpty() {
		try{
			list = new LinkedListDummySort();
			list.sort();
			
			assertEquals("List size is: 0\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListEmpty: " + e.getMessage());
		}
	}
	
	@Test
	public void testSortListOneItem() {
		try{
			list = new LinkedListDummySort();
			list.addFirst("first");
			list.sort();
			
			assertEquals("List size is: 1\r\nfirst\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListOneItem: " + e.getMessage());
		}
	}
	
	@Test
	public void testSortListTwoItems() {
		try{
			list = new LinkedListDummySort();
			list.addFirst("first");
			list.addFirst("second");
			list.sort();
			
			assertEquals("List size is: 2\r\nfirst\r\nsecond\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListTwoItems: " + e.getMessage());
		}
	}

	@Test
	public void testSortListTwoItemsSorted() {
		try{
			list = new LinkedListDummySort();
			list.addFirst("second");
			list.addFirst("first");
			list.sort();
			
			assertEquals("List size is: 2\r\nfirst\r\nsecond\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListTwoItemsSorted: " + e.getMessage());
		}
	}

	@Test
	public void testSortListThreeItems() {
		try{
			list = new LinkedListDummySort();
			list.addFirst("first");
			list.addFirst("second");
			list.addFirst("third");
			list.sort();
			
			assertEquals("List size is: 3\r\nfirst\r\nsecond\r\nthird\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListThreeItems: " + e.getMessage());
		}
	}
	
	@Test
	public void testSortListThreeItemsSorted() {
		try{
			list = new LinkedListDummySort();
			list.addFirst("third");
			list.addFirst("second");
			list.addFirst("first");
			list.sort();
			
			assertEquals("List size is: 3\r\nfirst\r\nsecond\r\nthird\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListThreeItemsSorted: " + e.getMessage());
		}
	}
	
	@Test
	public void testSortListTenItemsSorted() {
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
			
			assertEquals("List size is: 10\r\napple\r\nbanana\r\ncherry\r\ngrape\r\nkumquat\r\nlemon\r\nlime\r\norange\r\npersimmon\r\ntomato\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListTenItemsSorted: " + e.getMessage());
		}
	}

	@Test
	public void testSortListTenItemsRandom() {
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
			
			assertEquals("List size is: 10\r\napple\r\nbanana\r\ncherry\r\ngrape\r\nkumquat\r\nlemon\r\nlime\r\norange\r\npersimmon\r\ntomato\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListTenItemsRandom: " + e.getMessage());
		}
	}
	
	@Test
	public void testSortListTenItemsDuplicates() {
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
			
			assertEquals("List size is: 10\r\napple\r\napple\r\ngrape\r\ngrape\r\nlemon\r\nlemon\r\nlime\r\nlime\r\norange\r\norange\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListTenItemsDuplicates: " + e.getMessage());
		}
	}

}
