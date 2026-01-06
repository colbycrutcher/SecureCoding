 

import static org.junit.Assert.*;

import org.junit.Test;

public class InheritanceTests {

	@Test
	public void testShapes1() {
		try{
			Shape circleRef, cylinderRef;
			double radius = 1.0, height = 1.0;
			
			circleRef = new Circle(radius);
			cylinderRef = new Cylinder(radius, height);
			
			assertEquals("Shape name: Circle\r\nArea is: 3.141592653589793", circleRef.toString());
			assertEquals("Shape name: Cylinder\r\nArea is: 12.566370614359172", cylinderRef.toString());
			
		}
		catch(Exception e){
			fail("Exception occurred in testShapes1: " + e.getMessage());
		}
	}
	
	@Test
	public void testShapes2() {
		try{
			Shape circleRef, cylinderRef;
			double radius = 2.0, height = 1.0;
			
			circleRef = new Circle(radius);
			cylinderRef = new Cylinder(radius, height);
			
			assertEquals("Shape name: Circle\r\nArea is: 12.566370614359172", circleRef.toString());
			assertEquals("Shape name: Cylinder\r\nArea is: 37.69911184307752", cylinderRef.toString());
			
		}
		catch(Exception e){
			fail("Exception occurred in testShapes2: " + e.getMessage());
		}
	}

}
