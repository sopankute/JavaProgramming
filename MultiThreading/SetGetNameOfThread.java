class MyThread extends Thread{
	
}
class MyThread1 implements Runnable{
	public void run(){

	}
}
public class SetGetNameOfThread{

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());	// main

		System.out.println(Thread.currentThread());				// Thread[main,5,main]
		Thread t = new Thread();
		System.out.println(t.currentThread().getName());	// main
		System.out.println(t.getName());					// Thread-0

		Thread.currentThread().setName("Durga Thread");
		System.out.println(Thread.currentThread().getName());	// Durga Thread

		MyThread1 m = new MyThread1();
		Thread t1 = new Thread(m);
		System.out.println(t1.getName());					// Thread-1

		Thread t2 = new Thread(m);
		System.out.println(t2.getName());					// Thread-2

		System.out.println(Thread.currentThread());			// Thread[Durga Thread,5,main]


	}
	
}