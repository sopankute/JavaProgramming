import java.lang.reflect.*;		// Method class

class Student{
	private String name;
	private int rollNo;

	public String getName() {
		return name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}
public class Test1{
	public static void main(String[] args) {
		Student s1 = new Student();
		Class c1 = s1.getClass();
		Student s2 = new Student();
		Class c2 = s2.getClass();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1 == c2);
	}
}

// output : 
// 1175962212
// 1175962212
// true