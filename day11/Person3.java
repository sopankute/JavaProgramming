//abstract class and anonymous class
abstract class Person3 {
	
	// abstract methods, so no body,
	// but must be implemented in child class
	abstract void eat();
	abstract void speak();

	public static void main(String[] args) {
		
		Person3 p = new Person3() { // extends Person3
				// body of Anonymous Inner class
				@Override
				void eat() {
					System.out.println("nice orange");
				}

				@Override
				void speak() {
					System.out.println("German");
				}
		}; // end of anonymous class

		p.eat();
		p.speak();

	} // end of main()

} // end of Person3 abstract class
// two .class files will be created