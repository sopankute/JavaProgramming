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
public class Test{
	public static void main(String[] args) {
		Student s = new Student();
		Class c = s.getClass();
		System.out.println("Class Name : "+c.getName()+"\n");	// Student

		Method[] m = c.getDeclaredMethods();
		int count = 0;
		for(int i=0; i<m.length; i++){
			count++;
			System.out.println(m[i]);
		}
		System.out.println("No of methods : "+count+"\n");

		Field[] f = c.getDeclaredFields();
		count = 0;
		for(int i=0; i<f.length; i++){
			count++;
			System.out.println(f[i]);
		}
		System.out.println("No of Fields : "+count+"\n");
	}
}
// output :
// Class Name : Student

// public java.lang.String Student.getName()
// public void Student.setRollNo(int)
// No of methods : 2


// private java.lang.String Student.name
// private int Student.rollNo
// No of Fields : 2
