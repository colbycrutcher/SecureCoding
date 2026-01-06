 

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinkedListDummyCloneTests {
	private static LinkedListDummyClone list;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		list = new LinkedListDummyClone();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		list = new LinkedListDummyClone();
		
	}
	@Test
	public void testCloneEmptyList() {
		try{
			LinkedListDummyClone theClone = list.clone();
			
			assertEquals(true, list.toString().equals(theClone.toString()));
		}
		catch(Exception e){
			fail("Exception occurred in testCloneEmptyList");
		}
		
	}
	
	@Test
	public void testClone1ItemList() {
		try{
			list.addFirst("single item");
			LinkedListDummyClone theClone = list.clone();
			
			assertEquals(true, list.toString().equals(theClone.toString()));
			assertEquals(true, list.head.next != theClone.head.next);
		}
		catch(Exception e){
			fail("Exception occurred in testClone1ItemList");
		}
		
	}
	
	@Test
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
			
			assertEquals(true, list.toString().equals(theClone.toString()));
			assertEquals(true, list.head.next != theClone.head.next);
		}
		catch(Exception e){
			fail("Exception occurred in testClone10ItemList");
		}
		
	}

}
