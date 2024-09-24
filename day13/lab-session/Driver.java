package demo.one;

public class Driver {
	public static void main(String[] args) {
		
		Person p1 = new Person("Ramesh", 20);
		System.out.println(p1.name);
		// System.out.println(p1.age);		

		p1.display();
		p1.sayHello();

		//display can be accessed by Student
		Student s1 = new Student("Suresh", 21, 111);
		s1.display();
	}
}