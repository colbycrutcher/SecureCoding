 

/*
 * Write the code for the stubbed out cutList method at the bottom of this class.
 * If the index is less than 0, set the index to 0.
 * If the index is greater than size, set the index to size.
 * 
 * The existing list should be cut at the specified index.  The location of the cut
 * should then be assigned to a new LinkedList and returned from the method.  All nodes
 * from the cut point on will be part of the new LinkedList.
 * 
 * The existing list will terminate at the point where the list was cut.
 * 
 * Note that cutting at an index of 0 will empty the existing list.
 * Cutting at an index the same as the size of the list will leave the
 * existing list unchanged and the new LinkedList will be empty.
 */
//LinkedList with no dummy node (head points at first node in list)
public class LinkedList {

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
	
	public LinkedList(){
		
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
//startMethod
	public LinkedList cutList(int index){
		return null;//You may have to change this statement.

	}//end cutList
//endMethod
	
}

