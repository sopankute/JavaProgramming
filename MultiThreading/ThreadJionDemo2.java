class MyThread extends Thread{

	static Thread mt;	// main thread object

	public void run(){
		try{
				mt.join();					// until completing main thread child thread wait
		}catch(InterruptedException e){}

		for(int i=0; i<10; i++){
			System.out.println("Child Thread");
			
		}
	}

}
public class ThreadJionDemo2{
	public static void main(String[] args) throws InterruptedException{

		MyThread.mt = Thread.currentThread();	// main thread 
		MyThread t = new MyThread();
		// t.join();						// gives same output
		t.start();
		// t.join();		// no ouput - if both thread calls join methods

		// * no output- if main thread calls join on obj itself methods that means main thread wants to wait until complting main thread *
		// Thread.currentThread().join();


		for(int i=0; i<10; i++){
			Thread.sleep(1000);
			System.out.println("Main Thread");
		}
	}
}
// ouput :
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
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