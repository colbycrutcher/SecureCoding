 

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LinkedListAddAllTests {
	private static LinkedListAddAll list, otherList;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		list = new LinkedListAddAll();
		otherList = new LinkedListAddAll();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		list = new LinkedListAddAll();
		otherList = new LinkedListAddAll();
	}
	@Test
	public void testAddAllWithNull() {
		try{
			
			boolean result = list.addAll(null);
			assertEquals("List size is: 0\r\n", list.toString());
			assertEquals(false, result);
		}
		catch(Exception e){
			System.out.println("Exception occurred on testAddAllWithNull");
			System.out.println(e.getMessage());
			fail("Exception occurred in testAddAllWithNull: " + e.getMessage());
		}
	}
	
	
	@Test
	public void testAddAllEmptyList() {
		try{
			List aList = new ArrayList();
			boolean result = list.addAll(aList);
			assertEquals("List size is: 0\r\n", list.toString());
			assertEquals(false, result);
		}
		catch(Exception e){
			System.out.println("Exception occurred on testAddAllEmptyList");
			System.out.println(e.getMessage());
			fail("Exception occurred in testAddAllEmptyList: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testAddAllOneItemEmptyLinkedList() {
		try{
			List aList = new ArrayList();
			aList.add("single item");
			boolean result = list.addAll(aList);
			assertEquals("List size is: 1\r\nsingle item\r\n", list.toString());
			assertEquals(true, result);
		}
		catch(Exception e){
			System.out.println("Exception occurred on testAddAllOneItemEmptyLinkedList");
			System.out.println(e.getMessage());
			fail("Exception occurred in testAddAllOneItemEmptyLinkedList: " + e.getMessage());
		}
	}
	
	@Test
	public void testAddAllOneItemSingleItemLinkedList() {
		try{
			List aList = new ArrayList();
			aList.add("single item");
			list.addFirst("one");
			boolean result = list.addAll(aList);
			assertEquals("List size is: 2\r\none\r\nsingle item\r\n", list.toString());
			assertEquals(true, result);
		}
		catch(Exception e){
			System.out.println("Exception occurred on testAddAllOneItemSingleItemLinkedList");
			System.out.println(e.getMessage());
			fail("Exception occurred in testAddAllOneItemSingleItemLinkedList: " + e.getMessage());
		}
	}
	
	@Test
	public void testAddAllThreeItemsEmptyLinkedList() {
		try{
			List aList = new ArrayList();
			aList.add("first");
			aList.add("second");
			aList.add("third");
			boolean result = list.addAll(aList);
			assertEquals("List size is: 3\r\nfirst\r\nsecond\r\nthird\r\n", list.toString());
			assertEquals(true, result);
		}
		catch(Exception e){
			System.out.println("Exception occurred on testAddAllThreeItemsEmptyLinkedList");
			System.out.println(e.getMessage());
			fail("Exception occurred in testAddAllThreeItemsEmptyLinkedList: " + e.getMessage());
		}
	}
	
	@Test
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
			assertEquals("List size is: 8\r\n1\r\n2\r\n3\r\n4\r\n5\r\nfirst\r\nsecond\r\nthird\r\n", list.toString());
			assertEquals(true, result);
		}
		catch(Exception e){
			System.out.println("Exception occurred on testAddAllThreeItemsFiveItemLinkedList");
			System.out.println(e.getMessage());
			fail("Exception occurred in testAddAllThreeItemsFiveItemLinkedList: " + e.getMessage());
		}
	}


}
