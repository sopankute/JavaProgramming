class MyThread extends Thread{

	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("Child Thread");
		}
	}
}

public class ThreadDemo5{

	public static void main(String args[]){
		MyThread t = new MyThread();	
		t.start();					
		t.start();	// IllegalThreadStateException
		// we are not allowed to restart same thread

	}
}

// OUTPUT :
// Exception in thread "main" Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// java.lang.IllegalThreadStateException
// Child Thread
// Child Thread
//         at java.base/java.lang.Thread.start(Thread.java:793)
//         at ThreadDemo5.main(ThreadDemo5.java:15)
