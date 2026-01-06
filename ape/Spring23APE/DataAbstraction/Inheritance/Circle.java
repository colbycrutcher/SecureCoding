 

/*
-Circle inherits from Shape
-write Circle constructor that is passed the radius.  It MUST set the radius and name based on
 tools provided in Circle and Shape.  Do NOT try and directly assign into the radius or name fields.
-write Circle constructor that is passed radius and name
 of shape.  This constructor is for use by sub-classes only, so set visibility accordingly.
 It must also assign values to fields using tools provided by
 Circle and Shape.
 
-write the area method (PIr^2)
-write the circumference method (2PIr)

DO NOT MODIFY ANY OTHER CODE IN THE CLASS APART FROM WHAT IS SPECIFIED ABOVE
   
*/
public class Circle extends Shape
{
//startMethod
	private double radius;
	
	public Circle(double radius)
	{

	}//end constructor
	
	protected Circle(String name, double radius)
	{
	
	}//end constructor

	//area is PI*r^2
	public double area()
	{
	   return 0.0f;//You may have to change this statement.
	}//end area method
	
	public double circumference()
	{
	   return 0.0f;//You may have to change this statement.
	
	}//end circumference
//endMethod
	public void setRadius(double radius)
	{
		if (radius > 0.0)
			this.radius = radius;
		else
			throw new IllegalArgumentException("radius must be greater than 0");
	}


}//end class Circle
