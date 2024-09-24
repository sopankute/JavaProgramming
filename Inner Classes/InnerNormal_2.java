
// Accessing inner class code Instance area of outer class
class InnerNormal_2{
	class Inner{
		public void meth1(){
			System.out.println("Inner class Meth1() method");
		}
	}
	public void meth2(){
		Inner i = new Inner();
		i.meth1();
	}
	public static void main(String[] args) {
		InnerNormal_2 o = new InnerNormal_2();
		o.meth2();
	}
}