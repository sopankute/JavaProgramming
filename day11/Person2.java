public class Person2 {
	
	void eat() {
		System.out.println("nice fruits");
	}

	public static void main(String[] args) {
		
					// this anonymous class automatically 
					//extends Person class
		Person2 p = new Person2() {
				// body of Anonymous Inner class
				@Override
				void eat() {
					System.out.println("ice cream");
			}
		}; // end of anonymous class

		p.eat();
	} // end of main()

} // end of Person class
// two .class files will be created