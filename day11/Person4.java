//interface and anonymous class
interface Person4 {
	
	// abstract methods, so no body,
	// but must be implemented in child class
	abstract void eat();
	abstract void speak();

	public static void main(String[] args) {
		
		Person4 p = new Person4() { // implements Person3
				// body of Anonymous Inner class
				@Override
				public void eat() {
					System.out.println("nice mango");
				}

				@Override
				public void speak() {
					System.out.println("Japanese");
				}
		}; // end of anonymous class

		p.eat();
		p.speak();

	} // end of main()

} // end of Person4 interface
// two .class files will be created