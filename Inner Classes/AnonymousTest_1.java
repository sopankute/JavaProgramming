class PopCorn{
	public void test(){
		System.out.println("Salty...");
	}
}

public class AnonymousTest_1{
	public static void main(String[] args) {
		
		PopCorn p = new PopCorn(){

			public void test(){
				System.out.println("Spicy...");
			}
		};
		p.test();	// Spicy...

		PopCorn p1 = new PopCorn();
		p1.test();	// Salty...

		PopCorn p2 = new PopCorn(){

			public void test(){
				System.out.println("Sweet...");
			}
		};
		p2.test();	// Sweet...
	}
}