class MyRunnable implements Runnable{

	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("Child Thread");
		}
	}

}
public class ThreadDemo8{
	public static void main(String[] args) {
		MyRunnable m = new MyRunnable();
		Thread t1 = new Thread();
		Thread t2 = new Thread(m);
		// m.start();					// Compile time error
		m.run();						// like normal method call		

		for(int i=0; i<5; i++) {
			System.out.println("Main Thread");
		}
	}
}

// output :
// Child Thread
// Child Thread
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
