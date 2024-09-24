package demo.one;

public class Person {
	public String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	void sayHello() {
		System.out.println("Hello there!");
		System.out.println();
	}

	protected void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println();
	}
}

class Student extends Person {
	private int rollNo;

	public Student(String name, int age, int rollNo) {
		super(name, age);
		this.rollNo = rollNo;
	}

	@Override
	protected void display() {
		super.display();
		System.out.println("Roll no: "+rollNo);
	}
}