 

public class StudentComparableMain {
	
	public static void testCompareToEquals() {
		try{
			Student s1 = new Student("Jim", "Smith", 12345);
			Student s2 = new Student("Jim", "Smith", 12345);
			
			System.out.println("Result of comparing two students that are the same: " + s1.compareTo(s2));
		}
		catch(Exception e){
			System.out.println("Exception occurred in testCompareToEquals: " + e.getMessage());
		}
		
	}
	

	public static void testCompareToLessLast() {
		try{
			Student s1 = new Student("Jim", "Smith", 12345);
			Student s2 = new Student("Jim", "Smyth", 12345);
			
			System.out.println("\r\nIs first student less than second, last name: " + (s1.compareTo(s2) < 0));
		}
		catch(Exception e){
			System.out.println("Exception occurred in testCompareToLessLast: " + e.getMessage());
		}
		
	}
	

	public static void testCompareToLessFirst() {
		try{
			Student s1 = new Student("Jim", "Smith", 12345);
			Student s2 = new Student("Jimm", "Smith", 12345);
			
			System.out.println("\r\nIs first student less than second, first name: " + (s1.compareTo(s2) < 0));
		}
		catch(Exception e){
			System.out.println("Exception occurred in testCompareToLessFirst: " + e.getMessage());
		}
		
	}
	

	public static void testCompareToLessId() {
		try{
			Student s1 = new Student("Jim", "Smith", 12340);
			Student s2 = new Student("Jim", "Smith", 12345);
			
			System.out.println("\r\nIs first student less than second, student Id: " + (s1.compareTo(s2) < 0));
		}
		catch(Exception e){
			System.out.println("Exception occurred in testCompareToLessId: " + e.getMessage());
		}
		
	}
	
	

	public static void testCompareGreaterLast() {
		try{
			Student s1 = new Student("Jim", "Smithe", 12345);
			Student s2 = new Student("Jim", "Smith", 12345);
			
			System.out.println("\r\nIs first student greater than second, last name: " + (s1.compareTo(s2) > 0));
		}
		catch(Exception e){
			System.out.println("Exception occurred in testCompareToGreaterLast: " + e.getMessage());
		}
		
	}
	

	public static void testCompareGreaterFirst() {
		try{
			Student s1 = new Student("Jym", "Smith", 12345);
			Student s2 = new Student("Jim", "Smith", 12345);
			
			System.out.println("\r\nIs first student greater than second, first name: " + (s1.compareTo(s2) > 0));
		}
		catch(Exception e){
			System.out.println("Exception occurred in testCompareToGreaterFirst: " + e.getMessage());
		}
		
	}
	

	public static void testCompareGreaterId() {
		try{
			Student s1 = new Student("Jim", "Smith", 12349);
			Student s2 = new Student("Jim", "Smith", 12345);
			
			System.out.println("\r\nIs first student greater than second, student id: " + (s1.compareTo(s2) > 0));
		}
		catch(Exception e){
			System.out.println("Exception occurred in testCompareToGreaterId: " + e.getMessage());
		}
		
	}


	public static void main(String[] args) {
		testCompareToEquals();
		testCompareToLessLast();
		testCompareToLessFirst();
		testCompareToLessId();
		testCompareGreaterLast();
		testCompareGreaterFirst();
		testCompareGreaterId();
		

	}

}
/*
Result of comparing two students that are the same: 0

Is first student less than second, last name: true

Is first student less than second, first name: true

Is first student less than second, student Id: true

Is first student greater than second, last name: true

Is first student greater than second, first name: true

Is first student greater than second, student id: true
*/

