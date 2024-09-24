class ThreadB extends Thread{
	int total = 0;
	public void run(){
	
			for(int i=0; i<100; i++){
				total += i;
			}
		this.notify();
		
	}
}
public class ThreadWaitDemo{
	public static void main(String[] args) throws InterruptedException {

		ThreadB b = new ThreadB();
		b.start();
		
		// Thread.sleep(1000);		// not recommended
		// b.join();				// not recommended
		
		b.wait();
		System.out.println(b.total);
		
	}
}

// output :	without synchronized keyword

// Exception in thread "main" Exception in thread "Thread-0" java.lang.IllegalMonitorStateException: current thread is not owner
//         at java.base/java.lang.Object.wait(Native Method)
//         at java.base/java.lang.Object.wait(Object.java:338)
//         at ThreadWaitDemo.main(ThreadWaitDemo.java:18)
// java.lang.IllegalMonitorStateException: current thread is not owner
//         at java.base/java.lang.Object.notify(Native Method)
//         at ThreadB.run(ThreadWaitDemo.java:8)
