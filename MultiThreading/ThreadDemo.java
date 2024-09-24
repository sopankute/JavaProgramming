class MyThread extends Thread{

	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("Child Thread");
		}
	}
}

public class ThreadDemo{

	public static void main(String args[]){
		MyThread t = new MyThread();		// instantiation thread
		t.start();							// starting a thread

		// no new thread be created and method will execute like normal method
		// t.run();							

		for(int i=0; i<5; i++){
		System.out.println("Main Thread");
		}
	}

}

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
// Main Thread
// Main Thread
// Main Thread


// OUTPUT for
// t.run();

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