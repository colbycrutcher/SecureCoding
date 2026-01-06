 

/*
 * Write the sort method (stubbed out at bottom of class) for the LinkedListDummySort class.
 * The class uses a dummy/sentinel/buffer head node.
 */
public class LinkedListDummySort {
	//nested Node class
	private class Node{
		private Comparable data;
		private Node next;
		
		private Node(){
			this(null, null);
			
		}// end default Node constructor
		
		private Node(Comparable data, Node next){
			this.data = data;
			this.next = next;
		}// end parameterized Node constructor
		
				
	}//end nested class Node
	
	private Node head;
	private int size;
	
	public LinkedListDummySort(){
		
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
	
	public void addFirst(Comparable data){
		
		this.head.next = new Node(data, this.head.next);
		this.size++;
		
	}// end addFirst
	
	
	/*
	 * Write the code for your sort method below.  You must write the algorithm to sort.
	 * No calls to sort methods that are a part of the Java API are allowed.
	 */
//startMethod
	public void sort(){

	}
//endMethod
}
