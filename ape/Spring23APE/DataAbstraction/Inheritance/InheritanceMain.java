public class InheritanceMain {

	public void testShapes1() {
		try{
			Shape circleRef, cylinderRef;
			double radius = 1.0, height = 1.0;
			
			circleRef = new Circle(radius);
			cylinderRef = new Cylinder(radius, height);
			
			if (circleRef.toString().equals("Shape name: Circle\r\nArea is: 3.141592653589793")
				&& cylinderRef.toString().equals("Shape name: Cylinder\r\nArea is: 12.566370614359172"))
				System.out.println("SUCCESS: testShapes1 produced expected output");
			else{
				System.out.println("FAILURE: testShapes1 did not produce expected ouput");
				System.out.println("circleRef.toString should be: Shape name: Circle\r\nArea is: 3.141592653589793");
				System.out.println("circleRef.toString was: " + circleRef.toString());
				System.out.println("cylinderRef.toString should be: Shape name: Cylinder\r\nArea is: 12.566370614359172");
				System.out.println("cylinderRef.toString was: " + cylinderRef.toString());
			}
		
		}
		catch(Exception e){
			System.out.println("Exception occurred in testShapes1: " + e.getMessage());
		}
	}
	
	
	public void testShapes2() {
		try{
			Shape circleRef, cylinderRef;
			double radius = 2.0, height = 1.0;
			
			circleRef = new Circle(radius);
			cylinderRef = new Cylinder(radius, height);
			
			if (circleRef.toString().equals("Shape name: Circle\r\nArea is: 12.566370614359172")
					&& cylinderRef.toString().equals("Shape name: Cylinder\r\nArea is: 37.69911184307752"))
					System.out.println("SUCCESS: testShapes2 produced expected output");
				else{
					System.out.println("FAILURE: testShapes2 did not produce expected ouput");
					System.out.println("circleRef.toString should be: Shape name: Circle\r\nArea is: 12.566370614359172");
					System.out.println("circleRef.toString was: " + circleRef.toString());
					System.out.println("cylinderRef.toString should be: Shape name: Cylinder\r\nArea is: 37.69911184307752");
					System.out.println("cylinderRef.toString was: " + cylinderRef.toString());
				}
			
		}
		catch(Exception e){
			System.out.println("Exception occurred in testShapes2: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
	    InheritanceMain tester = new InheritanceMain();
	    tester.testShapes1();
	    tester.testShapes2();

	}

}
/*
Correct output shown below:

SUCCESS: testShapes1 produced expected output
SUCCESS: testShapes2 produced expected output

 */


