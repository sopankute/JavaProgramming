//final keyword in local scope
public class Test {

	//final int x; // CE because instance variable
	// it MUST be initialized!
	
	public void test() {
		final int x; //local variable! hence no error UNTIL USED!
		
		System.out.println("Hello");
		
		//System.out.println(x); // CE, because x is used
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.test();
	}
}