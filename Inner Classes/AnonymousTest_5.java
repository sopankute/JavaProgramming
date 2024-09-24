
// Anonymous class inside method argument

public class AnonymousTest_5{
	public static void main(String[] args) {
		
		new Thread(new Runnable(){

			public void run(){
				for(int i=0; i<8; i++)
					System.out.println("Child Thread");
			}
		}).start();

		for(int i=0; i<8; i++)
			System.out.println("Main Thread");
	}
}

// output :
// Main Thread
// Main Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread