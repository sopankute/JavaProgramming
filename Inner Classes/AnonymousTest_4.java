public class AnonymousTest_4{
	public static void main(String[] args) {
		
		Runnable r = new Runnable(){
			public void run(){
				for(int i=0; i<8; i++)
					System.out.println("Child Thread - Anonymous class");
			}
		};

		Thread t = new Thread(r);
		t.start();

		for(int i=0; i<8; i++)
			System.out.println("Main Thread");
	}
}

// output : 
// Main Thread
// Child Thread - Anonymous class
// Child Thread - Anonymous class
// Main Thread
// Main Thread
// Child Thread - Anonymous class
// Child Thread - Anonymous class
// Child Thread - Anonymous class
// Child Thread - Anonymous class
// Child Thread - Anonymous class
// Main Thread
// Main Thread
// Child Thread - Anonymous class
// Main Thread
// Main Thread
// Main Thread
