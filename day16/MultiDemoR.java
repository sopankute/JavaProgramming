//2nd way of creating a thread: implementing Runnable, then new Thread(obj)
/*
Giving uniform time to every thread

t1: prints, then t2: prints, then t3: prints
t1: prints, then t2: prints, then t3: prints
t1: prints, then t2: prints, then t3: prints
....
*/

public class MultiDemoR extends Thread{

	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(900); //make this thread sleep for 500 miliseconds after printing one value
				//which results in giving access to another thread to print
			}
			catch(Exception e) {}
		}
	}

	public static void main(String[] args) { // main thread - controller thread
		
		MultiDemoR m1 = new MultiDemoR(); // m1 - Runnable instance
		MultiDemoR m2 = new MultiDemoR(); // m2 - Runnable instance

		Thread t1 = new Thread(m1); //thread t1
		Thread t2 = new Thread(m2); //thread t2

		t1.start();
		t2.start();
	}
}