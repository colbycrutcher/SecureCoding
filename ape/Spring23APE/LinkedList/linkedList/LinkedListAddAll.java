 

import java.util.List;

/*
 * Write the addAll method for the LinkedListAddAll class below.
 * The class does NOT use a dummy/sentinel/buffer head node.
 * 
 * The addAll method is passed a List (see the Java API as necessary for
 * List behaviors).  You must add all the items in the list to the end of the 
 * existing linked list.  Each item in List should be assigned its own Node.
 * The items in List should be assigned in order starting from the first item
 * in List.
 */
public class LinkedListAddAll {

	//nested Node class
	private class Node{
		private Object data;
		private Node next;
		
		private Node(){
			this(null, null);
			
		}// end default Node constructor
		
		private Node(Object data, Node next){
			this.data = data;
			this.next = next;
		}// end parameterized Node constructor
		
				
	}//end nested class Node
	
	private Node head;
	private int size;
	
	public LinkedListAddAll(){
		
		this.head = null;
		this.size = 0;
		
	}// end default LinkedList constructor
	
	public int size(){
		return this.size;
	}// end size method
	
	@Override
	public String toString(){
		
		String result = "";
		
		result += "List size is: " + this.size + "\r\n";
		
		for (Node cur = this.head; cur != null; cur = cur.next){
			result += cur.data + "\r\n";
		}//end for
		
		return result;
		
	}// end toString method
	
	public void addFirst(Object data){
		
		this.head = new Node(data, this.head);
		this.size++;
		
	}// end addFirst
	
	/*
	 * Write the code for addAll below.
	 * 
	 * The addAll method is passed a List (see the Java API as necessary for
	 * List behaviors).  You must add all the items in the list to the end of the 
	 * existing linked list.  Each item in List should be assigned its own Node.
	 * The items in List should be assigned in order starting from the first item
	 * in List.
	 */
//startMethod
	public boolean addAll(List c){

		return true;//You may have to change this statement.
		
	}// end addAll
//endMethod
}// end class LinkedListAddAll
