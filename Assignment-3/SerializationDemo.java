import java.io.*;
import java.util.*;

// Question 3

class Employee implements Serializable{
	String name;
	int age;
	double salary;
	// transient double salary;
		public Employee(String n, int a, double sal){
			this.name = n;
			this.age = a;
			this.salary = sal;
	}
	public String toString(){
		return name+"\t"+age+"\t"+salary;
	}
}
public class SerializationDemo{
	public static void main(String[] args) throws Exception{

		Employee e1 = new Employee("Sopan Kute", 25, 15000);

		// Serialization
		FileOutputStream fos = new FileOutputStream("Employee.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);

		// DeSerialization
		FileInputStream fis = new FileInputStream("Employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e2 = (Employee)ois.readObject();

		// System.out.println("After using  transient keyword....");
		System.out.println(e1);
		System.out.println(e2);

	}
}