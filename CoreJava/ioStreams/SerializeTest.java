import java.io.*;
import java.util.*;

class Person implements Serializable{
	String name;
	int age;
	transient String password;
		public Person(String n, int a, String pwd){
			name = n;
			age = a;
			password = pwd;
		}
	public String toString(){
		return name+"\t"+age+"\t"+password;
	}
}
public class SerializeTest{
	public static void main(String[] args) throws Exception{
		// Serialization
		Person p1 = new Person("Sopan", 24, "acbd@123");

		FileOutputStream fos = new FileOutputStream("person.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);

		// DeSerialization
		FileInputStream fis = new FileInputStream("person.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p2 = (Person)ois.readObject();

		System.out.println(p1);
		System.out.println(p2);
	}
}
// output :
// Sopan   24      acbd@123
// Sopan   24      null
