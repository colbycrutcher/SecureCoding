 

/*
Shape is super class for a Shape hierarchy.
Do NOT change any code in this class!
*/

public abstract class Shape
{
	private String name;
	
	//for use only by sub-classes
	protected Shape(String name)
	{
	   if (name != null)
	      this.name = name;
	   else
	      this.name = "";
	}//end Shape constructor
	
	//each concrete sub-class must implement this
	public abstract double area();
	
	public String toString()
	{
	   return "Shape name: " + this.name + "\r\nArea is: " + area();
	
	}//end toString
	

}//end Shape class
