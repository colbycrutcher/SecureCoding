 

/*
 * Implement the Comparable interface to specifically compare against another student.
 * Follow the rules from the Java API for Comparable behavior.
 * 
 * Students should first be compared by last name for order. If the last names are the same,
 * compare by first name.  If first names are the same, compare by studentId.  
 */
public class Student implements Comparable<Student> {
	
	private String first, last;
	private int studentId;
	
	public Student(String first, String last, int studentId){
		this.first = first;
		this.last = last;
		this.studentId = studentId;
	}
	
	@Override
	public String toString(){
		return this.last + ", " + this.first + ": " + this.studentId;
	}
	
	public int getStudentId(){
		return this.studentId;
	}
//startMethod
	@Override
	public int compareTo(Student that) {
        return 0;//You may have to change this statement.
	}
//endMethod
}


