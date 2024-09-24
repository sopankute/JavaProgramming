import java.io.*;

class Person implements Serializable{ // marker interface
	String name;
	int age;
	transient String password; //sensitive info, don't serialize

	public Person(String name, int age, String password){
		this.name = name;
		this.age = age;
		this.password = password;
	}

	@Override
	public String toString() {
		return name+" "+age+" "+password;
	}
}

public class SerializeTest {
	public static void main(String[] args) throws Exception{
		Person p1 = new Person("Java", 27, "java");

		//serialization
		FileOutputStream fos = new FileOutputStream("person.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);

		//deserialization
		FileInputStream fis = new FileInputStream("person.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p2 = (Person) ois.readObject(); //readObject() by default gives object of type Object(the super class) 

		System.out.println(p1); //p1.toString();
		System.out.println(p2);	//p2.toString();
	}
}