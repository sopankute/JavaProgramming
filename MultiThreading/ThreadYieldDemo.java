 class MyThread extends Thread{

	public void run(){
		for (int i=0; i<5; i++ ) {
			Thread.yield();
			System.out.println("Child Thread");
		}
	}
}
public class ThreadYieldDemo{
	public static void main(String[] args) {
		
		MyThread t =new MyThread();
		t.start();
		for (int i=0; i<5; i++) {
			System.out.println("Main Thread");
		}
	}
}

// output : 
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Child Thread
// Child Thread
// Main Thread
// Child Thread
// Child Thread
// Child Thread