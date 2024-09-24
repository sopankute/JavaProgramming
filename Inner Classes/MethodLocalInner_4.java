public class MethodLocalInner_4
{
	int i = 11;
	static int j = 22;

	public void method1(){

		int k = 33;
		final int l = 44;

		class Inner{
			public void method2(){
				System.out.println(i);	// 11
				System.out.println(j);  // 22
				System.out.println(k);	// 33
				System.out.println(l);	// 44
			}
		}

		Inner obj = new Inner();
		obj.method2();
	}

	public static void main(String[] args) {
		 new MethodLocalInner_4().method1();	
	}
}