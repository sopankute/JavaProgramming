// Interface inside of Interface

interface Outer{
	public void meth1();

	public static interface Inner{	// whether declared or not
		public void meth2();
	}
}
class Test1 implements Outer{
	public void meth1(){
		System.out.println("Outer interface method1 implements");
	}
}
class Test2 implements Outer.Inner{
	public void meth2(){
		System.out.println("Inner interface method2 implements");
	}
}
public class InterfaceInInterface{
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.meth1();
		Test2 t2 = new Test2();
		t2.meth2();		
	}
}