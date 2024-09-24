public class Outer {
	
	private int data = 99; // instance

	class Inner { // non-static nested(inner) class
		String name = "Java";

		void disp() { // Inner class's method
			System.out.println(name+" "+data);
		}
	} // Inner ends

	// no methods in Outer class

	public static void main(String[] args) {
		
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.disp();
	}
}

/*
Outer.Inner inn = new Outer().new Inner(); 
is also possible
*/