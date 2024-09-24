//1st way of creating a thread: extending Thread class
/*
Giving uniform time to every thread

t1: prints, then t2: prints, then t3: prints
t1: prints, then t2: prints, then t3: prints
t1: prints, then t2: prints, then t3: prints
....
*/
public class MultiDemo2 extends Thread{

	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500); //make this thread sleep for 500 miliseconds after printing one value
				//which results in giving access to another thread to print
			}
			catch(Exception e) {}
		}
	}

	public static void main(String[] args) { // main thread - controller thread
		MultiDemo2 t1 = new MultiDemo2(); //thread 1
 		MultiDemo2 t2 = new MultiDemo2(); //thread 2
		MultiDemo2 t3 = new MultiDemo2(); //thread 3

		t1.start();
		t2.start();
		t3.start();

	}
}