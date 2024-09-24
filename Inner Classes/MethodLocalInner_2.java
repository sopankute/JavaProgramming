public class MethodLocalInner_2{
	
	int x = 11;
	static int y = 22;
	private int z = 33;

	public void meth1(){	// Non-static method
		class Inner{
			public void meth2(){
				// can access static, non-static, private and non-private variables directly
				System.out.println(x);	// 11
				System.out.println(y);	// 22
				System.out.println(z);	// 33
			}

		}

		Inner i = new Inner();
		i.meth2();
	}

	public static void main(String[] args) {
		MethodLocalInner_2 m = new MethodLocalInner_2();
		m.meth1();	
	}
}