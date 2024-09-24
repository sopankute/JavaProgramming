
// Accessing inner class code static area of outer class
class InnerNormal_1{
	class Inner{
		public void meth1(){
			System.out.println("Inner Class meth1() Method");
		}
	}
	public static void main(String[] args) {
		// InnerNormal_1 o = new InnerNormal_1();
		// InnerNormal_1.Inner i = o.new Inner();
		// i.meth1();

		// new InnerNormal_1().new Inner().meth1();	// valid

		InnerNormal_1.Inner i = new InnerNormal_1().new Inner();	// valid
		i.meth1();

		System.out.println("Outer class Main Method");
	}
}