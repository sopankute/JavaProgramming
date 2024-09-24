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
public class Test2{
	public static void main(String[] args) {
		
		System.out.println(String.class.getClassLoader());
		System.out.println(Student.class.getClassLoader());
		System.out.println(Test2.class.getClassLoader());
	}
}

// output : 
// null
// jdk.internal.loader.ClassLoaders$AppClassLoader@2a139a55
// jdk.internal.loader.ClassLoaders$AppClassLoader@2a139a55
