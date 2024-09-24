
// Accessing inner class code outside area of outer class
class Outer{
	class Inner{
		public void meth1(){
			System.out.println("Inner Class meth1() method");
		}
	}
}
public class InnerNormal_3{
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.meth1();
	}
}