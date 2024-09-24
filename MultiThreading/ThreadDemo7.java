class MyRunnable implements Runnable{

	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("Child Thread");
		}
	}

}
public class ThreadDemo7{
	public static void main(String[] args) {
		MyRunnable m = new MyRunnable();
		Thread t1 = new Thread();
		Thread t2 = new Thread(m);
		// t1.start();					// new thread will be created which execute thread class run()
		// t1.run();					// thread class run() executed like normal method call
		// t2.start();					// new thread will be created which execute Runnable run()
		t2.run();						// Runnable interface run() call like normal method call 
		for(int i=0; i<5; i++) {
			System.out.println("Main Thread");
		}
	}
}

// output 1: for 1) t1.start();	
//				 2) t1.run();
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread

// output 2: for 1) t2.start();
// Main Thread
// Main Thread
// Main Thread
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
// Child Thread
// Child Thread

// output 3: for 1) t2.run();
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
