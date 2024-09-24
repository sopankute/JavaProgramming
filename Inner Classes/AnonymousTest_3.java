public class AnonymousTest_3{
	
	public static void main(String[] args) {

		Thread t = new Thread(){
			public void run(){
				for(int i=0; i<10; i++)
					System.out.println("Child Thread - Anonymous class");
			}
		};
		t.start();

		for(int i=0; i<10; i++)
			System.out.println("Main Thread...");
	}
}

// ouput : 
// Main Thread...
// Main Thread...
// Child Thread - Anonymous class
// Child Thread - Anonymous class
// Child Thread - Anonymous class
// Child Thread - Anonymous class
// Main Thread...
// Main Thread...
// Main Thread...
// Main Thread...
// Main Thread...
// Main Thread...
// Main Thread...
// Main Thread...
// Child Thread - Anonymous class
// Child Thread - Anonymous class
// Child Thread - Anonymous class
// Child Thread - Anonymous class
// Child Thread - Anonymous class
// Child Thread - Anonymous class
