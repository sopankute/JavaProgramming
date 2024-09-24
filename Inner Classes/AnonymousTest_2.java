class PopCorn{
	public void test(){
		System.out.println("Salty...");
	}
}

public class AnonymousTest_2{
	public static void main(String[] args) {
		
		PopCorn p = new PopCorn(){

			public void test(){
				
				meth();			// valid call	
				System.out.println("Spicy...");
			}

			public void meth(){
				System.out.println("Child Specific Method");
			}
		};
		p.test();	// Spicy...
		// p.meth();	// Error - can't access				

		PopCorn p1 = new PopCorn();
		p1.test();	// Salty...
	}
}