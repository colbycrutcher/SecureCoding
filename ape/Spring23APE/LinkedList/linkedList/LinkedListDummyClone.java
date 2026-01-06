 

/*
 * Write the clone method for the LinkedListDummyClone class below.
 * The linked list uses a dummy/sentinel/buffer Node.
 * 
 * The clone method should produce a copy of the existing linked list.
 * The copy should have its own nodes -- do not design the copy so that
 * it points at the same nodes as the existing list.
 */
public class LinkedListDummyClone implements Cloneable{
	//nested Node class
	class Node{
		Object data;
		Node next;
		
		private Node(){
			this(null, null);
			
		}// end default Node constructor
		
		private Node(Object data, Node next){
			this.data = data;
			this.next = next;
		}// end parameterized Node constructor
		
				
	}//end nested class Node
	
	Node head;
	private int size;
	
	public LinkedListDummyClone(){
		
		this.head = new Node(null, null);
		this.size = 0;
		
	}// end default LinkedList constructor
	
	public int size(){
		return this.size;
	}// end size method
	
	@Override
	public String toString(){
		
		String result = "";
		
		result += "List size is: " + this.size + "\r\n";
		
		for (Node cur = this.head.next; cur != null; cur = cur.next){
			result += cur.data + "\r\n";
		}//end for
		
		return result;
		
	}// end toString method
	
	public void addFirst(Object data){
		
		this.head.next = new Node(data, this.head.next);
		this.size++;
		
	}// end addFirst
	
	/*
	 * Write the clone method below.  It creates a copy of the existing list.
	 * It should create a new LinkedListDummyClone object that contains the same 
	 * contents as the existing list.  The copy must contain its own Nodes -- it should
	 * NOT point at the Nodes in the existing list.
	 */
//startMethod
	@Override
	public LinkedListDummyClone clone(){
		return null;//You may have to change this statement.
	}//end clone method
//endMethod
	
}//end LinkedListDummyClone
