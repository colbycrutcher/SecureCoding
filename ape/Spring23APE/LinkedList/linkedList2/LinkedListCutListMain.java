 


public class LinkedListCutListMain {
	
	private static LinkedList list;

	
	public static void setUp() {
		list = new LinkedList();
		
	}
	
	
	public static void testCutListSize1OriginalBecomesEmpty() {
		try{
			list.addFirst("single item");
			LinkedList cutList = list.cutList(0);
			System.out.println("testCutListSize1OriginalBecomesEmpty - Original list is: \r\n" + list.toString());
			System.out.println("Cut List is: \r\n" + cutList.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testCutListSize1OriginalBecomesEmpty: " + e.getMessage());
		}
		
	}
	
	
	public static void testCutListSize1OriginalStaysSame() {
		try{
			list.addFirst("single item");
			LinkedList cutList = list.cutList(1);
			System.out.println("\r\ntestCutListSize1OriginalStaysSame - Original list is: \r\n" + list.toString());
			System.out.println("Cut List is: \r\n" + cutList.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testCutListSize1OriginalStaysSame: " + e.getMessage());
		}
		
	}
	
	
	public static void testCutListSize3OriginalStaysSame() {
		try{
			list.addFirst("third");
			list.addFirst("second");
			list.addFirst("first");
			LinkedList cutList = list.cutList(3);
			System.out.println("\r\ntestCutListSize3OriginalStaysSame - Original list is: \r\n" + list.toString());
			System.out.println("Cut List is: \r\n" + cutList.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testCutListSize3OriginalStaysSame: " + e.getMessage());
		}
		
	}
	
	
	public static void testCutListSize3OriginalBecomesEmpty() {
		try{
			list.addFirst("third");
			list.addFirst("second");
			list.addFirst("first");
			LinkedList cutList = list.cutList(0);
			System.out.println("\r\ntestCutListSize3OriginalBecomesEmpty - Original list is: \r\n" + list.toString());
			System.out.println("Cut List is: \r\n" + cutList.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testCutListSize3OriginalBecomesEmpty: " + e.getMessage());
		}
		
	}
	
	
	public static void testCutListSize10OriginalBecomesSize1() {
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
			System.out.println("\r\ntestCutListSize10OriginalBecomesSize1 - Original list is: \r\n" + list.toString());
			System.out.println("Cut List is: \r\n" + cutList.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testCutListSize10OriginalBecomesSize1: " + e.getMessage());
		}
		
	}
	
	
	public static void testCutListSize10OriginalBecomesSize4() {
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
			System.out.println("\r\ntestCutListSize10OriginalBecomesSize4 - Original list is: \r\n" + list.toString());
			System.out.println("Cut List is: \r\n" + cutList.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testCutListSize10OriginalBecomesSize4: " + e.getMessage());
		}
		
	}
	
	
	public static void testCutListSize10OriginalBecomesSize8() {
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
			System.out.println("\r\ntestCutListSize10OriginalBecomesSize8 - Original list is: \r\n" + list.toString());
			System.out.println("Cut List is: \r\n" + cutList.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testCutListSize10OriginalBecomesSize8: " + e.getMessage());
		}
		
	}
	
	
	public static void testCutListSize10OriginalBecomesSize9() {
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
			System.out.println("\r\ntestCutListSize10OriginalBecomesSize9 - Original list is: \r\n" + list.toString());
			System.out.println("Cut List is: \r\n" + cutList.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testCutListSize10OriginalBecomesSize9: " + e.getMessage());
		}
		
	}
	
	
	public static void testCutListSize10NegativeIndex() {
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
			System.out.println("\r\ntestCutListSize10NegativeIndex - Original list is: \r\n" + list.toString());
			System.out.println("Cut List is: \r\n" + cutList.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testCutListSize10NegativeIndex: " + e.getMessage());
		}
		
	}
	

	public static void testCutListSize10IndexLargerThanSize() {
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
			System.out.println("\r\ntestCutListSize10IndexLargerThanSize - Original list is: \r\n" + list.toString());
			System.out.println("Cut List is: \r\n" + cutList.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testCutListSize10IndexLargerThanSize: " + e.getMessage());
		}
		
	}


	public static void main(String[] args) {
		setUp();
		testCutListSize1OriginalBecomesEmpty();
		setUp();
		testCutListSize1OriginalStaysSame();
		setUp();
		testCutListSize3OriginalStaysSame();
		setUp();
		testCutListSize3OriginalBecomesEmpty();
		setUp();
		testCutListSize10OriginalBecomesSize1();
		setUp();
		testCutListSize10OriginalBecomesSize4();
		setUp();
		testCutListSize10OriginalBecomesSize8();
		setUp();
		testCutListSize10OriginalBecomesSize9();
		setUp();
		testCutListSize10NegativeIndex();
		setUp();
		testCutListSize10IndexLargerThanSize();
		

	}

}
/*
testCutListSize1OriginalBecomesEmpty - Original list is: 
List size is: 0

Cut List is: 
List size is: 1
single item


testCutListSize1OriginalStaysSame - Original list is: 
List size is: 1
single item

Cut List is: 
List size is: 0


testCutListSize3OriginalStaysSame - Original list is: 
List size is: 3
first
second
third

Cut List is: 
List size is: 0


testCutListSize3OriginalBecomesEmpty - Original list is: 
List size is: 0

Cut List is: 
List size is: 3
first
second
third


testCutListSize10OriginalBecomesSize1 - Original list is: 
List size is: 1
first

Cut List is: 
List size is: 9
second
third
four
five
six
seven
eight
nine
ten


testCutListSize10OriginalBecomesSize4 - Original list is: 
List size is: 4
first
second
third
four

Cut List is: 
List size is: 6
five
six
seven
eight
nine
ten


testCutListSize10OriginalBecomesSize8 - Original list is: 
List size is: 8
first
second
third
four
five
six
seven
eight

Cut List is: 
List size is: 2
nine
ten


testCutListSize10OriginalBecomesSize9 - Original list is: 
List size is: 9
first
second
third
four
five
six
seven
eight
nine

Cut List is: 
List size is: 1
ten


testCutListSize10NegativeIndex - Original list is: 
List size is: 0

Cut List is: 
List size is: 10
first
second
third
four
five
six
seven
eight
nine
ten


testCutListSize10IndexLargerThanSize - Original list is: 
List size is: 10
first
second
third
four
five
six
seven
eight
nine
ten

Cut List is: 
List size is: 0

*/

