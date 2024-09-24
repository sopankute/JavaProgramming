public class OuterDemo {
	
	private int data = 99; // instance

	class Inner { // non-static nested(inner) class
		String name = "Java";

		void msg() { // Inner class's method
			System.out.println(name+" "+data);
		}
	} // Inner ends

	// Outer class's method
	void display() {
		//instantiating Inner in order to access
		//msg(). We are doing this because msg() is
		//present inside Inner class, and to access
		//methods in any other class, we use objects
		Inner in = new Inner();
		in.msg();
	}

	public static void main(String[] args) {
		
		OuterDemo out = new OuterDemo();
		out.display();
	}
}

/*
Outer.Inner inn = new Outer().new Inner(); 
is also possible
*/