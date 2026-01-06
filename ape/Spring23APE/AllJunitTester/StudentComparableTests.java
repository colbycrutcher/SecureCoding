 

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentComparableTests {

	@Test
	public void testCompareToEquals() {
		try{
			Student s1 = new Student("Jim", "Smith", 12345);
			Student s2 = new Student("Jim", "Smith", 12345);
			
			assertEquals(0, s1.compareTo(s2));
		}
		catch(Exception e){
			fail("Exception occurred in testCompareToEquals: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCompareToLessLast() {
		try{
			Student s1 = new Student("Jim", "Smith", 12345);
			Student s2 = new Student("Jim", "Smyth", 12345);
			
			assertTrue(s1.compareTo(s2) < 0);
		}
		catch(Exception e){
			fail("Exception occurred in testCompareToLessLast: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCompareToLessFirst() {
		try{
			Student s1 = new Student("Jim", "Smith", 12345);
			Student s2 = new Student("Jimm", "Smith", 12345);
			
			assertTrue(s1.compareTo(s2) < 0);
		}
		catch(Exception e){
			fail("Exception occurred in testCompareToLessFirst: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCompareToLessId() {
		try{
			Student s1 = new Student("Jim", "Smith", 12340);
			Student s2 = new Student("Jim", "Smith", 12345);
			
			assertTrue(s1.compareTo(s2) < 0);
		}
		catch(Exception e){
			fail("Exception occurred in testCompareToLessId: " + e.getMessage());
		}
		
	}
	
	
	@Test
	public void testCompareGreaterLast() {
		try{
			Student s1 = new Student("Jim", "Smithe", 12345);
			Student s2 = new Student("Jim", "Smith", 12345);
			
			assertTrue(s1.compareTo(s2) > 0);
		}
		catch(Exception e){
			fail("Exception occurred in testCompareToGreaterLast: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCompareGreaterFirst() {
		try{
			Student s1 = new Student("Jym", "Smith", 12345);
			Student s2 = new Student("Jim", "Smith", 12345);
			
			assertTrue(s1.compareTo(s2) > 0);
		}
		catch(Exception e){
			fail("Exception occurred in testCompareToGreaterFirst: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCompareGreaterId() {
		try{
			Student s1 = new Student("Jim", "Smith", 12349);
			Student s2 = new Student("Jim", "Smith", 12345);
			
			assertTrue(s1.compareTo(s2) > 0);
		}
		catch(Exception e){
			fail("Exception occurred in testCompareToGreaterId: " + e.getMessage());
		}
		
	}



}

