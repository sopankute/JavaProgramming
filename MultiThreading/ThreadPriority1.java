class MyThread extends Thread{
	
}
public class ThreadPriority1{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);

		MyThread t = new MyThread();			// child thread of main thread
		// by default priority inheriting from parent to child
		System.out.println(t.currentThread().getPriority());	// 8
	
	}
}