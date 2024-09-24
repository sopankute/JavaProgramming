/*
join(millis)
*/
public class MultiDemo4 extends Thread{

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
		MultiDemo4 t1 = new MultiDemo4(); //thread 1
 		MultiDemo4 t2 = new MultiDemo4(); //thread 2
		MultiDemo4 t3 = new MultiDemo4(); //thread 3

		t1.start();
		try {
			t1.join(1500); //after 1500 t2 and t3 will also compete for running
		}
		catch(Exception e) {}

		t2.start();
		t3.start();

	}
}