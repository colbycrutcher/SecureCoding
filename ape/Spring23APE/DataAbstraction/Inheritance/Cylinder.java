 

/*
-Cylinder inherits from Circle
-write Cylinder constructor based on how it's called in the tester. It MUST call the
 appropriate Circle constructor. Use tools provided in Cylinder and Circle
 to properly initialize the fields in the class -- do NOT directly assign into 
 the fields
-write the area method (2PIrh + 2PIr^2) (circumference of circle times height
 + 2 times area of circle). You will have to use the methods provided by
 Circle to complete this task.

DO NOT MODIFY ANY OTHER CODE IN THE CLASS APART FROM WHAT IS SPECIFIED ABOVE

*/
public class Cylinder extends Circle
{
//startMethod
	private double height;
	public Cylinder(double radius, double height)
	{

	}//end constructor

	//area (surface area) is: 2PIrh + 2PIr^2
	public double area()
	{
	   return 0; //You may have to change this statement.
	}//end area
//endMethod
	public void setHeight(double height)
	{
		if (height < 0.0)
			throw new IllegalArgumentException("height must be non-negative");
		else
			this.height = height;

	}//end setHeight

}//end Cylinder class