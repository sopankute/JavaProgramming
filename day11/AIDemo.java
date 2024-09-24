public class AIDemo {
	public static void main(String[] args) {
		
					// this anonymous class automatically 
					//extends Person class
		Person p = new Person() {
				// body of Anonymous Inner class
				@Override
				void eat() {
					System.out.println("ice cream");
				}
		}; // end of anonymous class

		p.eat();
	}
}

//three .class files will be generated