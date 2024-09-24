class MyRunnable implements Runnable{

	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("Child Thread");
		}
	}

}
public class ThreadDemo6{
	public static void main(String[] args) {
		MyRunnable m = new MyRunnable();
		Thread t = new Thread(m);
		t.start();

		for(int i=0; i<5; i++) {
			System.out.println("Main Thread");
		}
	}
}

// Can't expect exact output : 
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


