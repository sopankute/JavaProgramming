package demo.two;

import demo.one.*;

public class Driver2 {
	public static void main(String[] args) {
		
		Person p1 = new Person("Ramesh", 20);
		System.out.println(p1.name);
		p1.sayHello();

		//cannot be accessed in this package
		p1.display();
	}
}