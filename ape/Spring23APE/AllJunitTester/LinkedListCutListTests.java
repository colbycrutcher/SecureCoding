 

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LinkedListCutListTests {
	
	private static LinkedList list;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		list = new LinkedList();
		
	}
	

	@Before
	public void setUp() throws Exception {
		list = new LinkedList();
		
	}
	
	@Test
	public void testCutListSize1OriginalBecomesEmpty() {
		try{
			list.addFirst("single item");
			LinkedList cutList = list.cutList(0);
			assertEquals("List size is: 0\r\n", list.toString());
			assertEquals("List size is: 1\r\nsingle item\r\n", cutList.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testCutListSize1OriginalBecomesEmpty: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCutListSize1OriginalStaysSame() {
		try{
			list.addFirst("single item");
			LinkedList cutList = list.cutList(1);
			assertEquals("List size is: 1\r\nsingle item\r\n", list.toString());
			assertEquals("List size is: 0\r\n", cutList.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testCutListSize1OriginalStaysSame: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCutListSize3OriginalStaysSame() {
		try{
			list.addFirst("third");
			list.addFirst("second");
			list.addFirst("first");
			LinkedList cutList = list.cutList(3);
			assertEquals("List size is: 3\r\nfirst\r\nsecond\r\nthird\r\n", list.toString());
			assertEquals("List size is: 0\r\n", cutList.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testCutListSize3OriginalStaysSame: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCutListSize3OriginalBecomesEmpty() {
		try{
			list.addFirst("third");
			list.addFirst("second");
			list.addFirst("first");
			LinkedList cutList = list.cutList(0);
			assertEquals("List size is: 3\r\nfirst\r\nsecond\r\nthird\r\n", cutList.toString());
			assertEquals("List size is: 0\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testCutListSize3OriginalBecomesEmpty: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCutListSize10OriginalBecomesSize1() {
		try{
			list.addFirst("ten");
			list.addFirst("nine");
			list.addFirst("eight");
			list.addFirst("seven");
			list.addFirst("six");
			list.addFirst("five");
			list.addFirst("four");
			list.addFirst("third");
			list.addFirst("second");
			list.addFirst("first");
			LinkedList cutList = list.cutList(1);
			assertEquals("List size is: 1\r\nfirst\r\n", list.toString());
			assertEquals("List size is: 9\r\nsecond\r\nthird\r\nfour\r\nfive\r\nsix\r\nseven\r\neight\r\nnine\r\nten\r\n", cutList.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testCutListSize10OriginalBecomesSize1: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCutListSize10OriginalBecomesSize4() {
		try{
			list.addFirst("ten");
			list.addFirst("nine");
			list.addFirst("eight");
			list.addFirst("seven");
			list.addFirst("six");
			list.addFirst("five");
			list.addFirst("four");
			list.addFirst("third");
			list.addFirst("second");
			list.addFirst("first");
			LinkedList cutList = list.cutList(4);
			assertEquals("List size is: 4\r\nfirst\r\nsecond\r\nthird\r\nfour\r\n", list.toString());
			assertEquals("List size is: 6\r\nfive\r\nsix\r\nseven\r\neight\r\nnine\r\nten\r\n", cutList.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testCutListSize10OriginalBecomesSize4: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCutListSize10OriginalBecomesSize8() {
		try{
			list.addFirst("ten");
			list.addFirst("nine");
			list.addFirst("eight");
			list.addFirst("seven");
			list.addFirst("six");
			list.addFirst("five");
			list.addFirst("four");
			list.addFirst("third");
			list.addFirst("second");
			list.addFirst("first");
			LinkedList cutList = list.cutList(8);
			assertEquals("List size is: 8\r\nfirst\r\nsecond\r\nthird\r\nfour\r\nfive\r\nsix\r\nseven\r\neight\r\n", list.toString());
			assertEquals("List size is: 2\r\nnine\r\nten\r\n", cutList.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testCutListSize10OriginalBecomesSize8: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCutListSize10OriginalBecomesSize9() {
		try{
			list.addFirst("ten");
			list.addFirst("nine");
			list.addFirst("eight");
			list.addFirst("seven");
			list.addFirst("six");
			list.addFirst("five");
			list.addFirst("four");
			list.addFirst("third");
			list.addFirst("second");
			list.addFirst("first");
			LinkedList cutList = list.cutList(9);
			assertEquals("List size is: 9\r\nfirst\r\nsecond\r\nthird\r\nfour\r\nfive\r\nsix\r\nseven\r\neight\r\nnine\r\n", list.toString());
			assertEquals("List size is: 1\r\nten\r\n", cutList.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testCutListSize10OriginalBecomesSize9: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCutListSize10NegativeIndex() {
		try{
			list.addFirst("ten");
			list.addFirst("nine");
			list.addFirst("eight");
			list.addFirst("seven");
			list.addFirst("six");
			list.addFirst("five");
			list.addFirst("four");
			list.addFirst("third");
			list.addFirst("second");
			list.addFirst("first");
			LinkedList cutList = list.cutList(-1);
			assertEquals("List size is: 10\r\nfirst\r\nsecond\r\nthird\r\nfour\r\nfive\r\nsix\r\nseven\r\neight\r\nnine\r\nten\r\n", cutList.toString());
			assertEquals("List size is: 0\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testCutListSize10NegativeIndex: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCutListSize10IndexLargerThanSize() {
		try{
			list.addFirst("ten");
			list.addFirst("nine");
			list.addFirst("eight");
			list.addFirst("seven");
			list.addFirst("six");
			list.addFirst("five");
			list.addFirst("four");
			list.addFirst("third");
			list.addFirst("second");
			list.addFirst("first");
			LinkedList cutList = list.cutList(11);
			assertEquals("List size is: 10\r\nfirst\r\nsecond\r\nthird\r\nfour\r\nfive\r\nsix\r\nseven\r\neight\r\nnine\r\nten\r\n", list.toString());
			assertEquals("List size is: 0\r\n", cutList.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testCutListSize10IndexLargerThanSize: " + e.getMessage());
		}
		
	}


}

