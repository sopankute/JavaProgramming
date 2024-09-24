public class MethodLocalInner_3{
	
	int x = 11;
	static int y = 22;
	private int z = 33;

	public static void meth1(){	// static method
		class Inner{
			public void meth2(){

				// can access Only static variables 
				System.out.println(x);	// Error
				System.out.println(y);	// 22
				System.out.println(z);	// Error
			}

		}

		Inner i = new Inner();
		i.meth2();
	}

	public static void main(String[] args) {
		MethodLocalInner_3 m = new MethodLocalInner_3();
		m.meth1();	
	}
}