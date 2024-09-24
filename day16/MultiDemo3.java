/*
directly running run()
-won't generate any CE or RE
-compared to running start(), calling run() directly would ne normall program flow
*/
public class MultiDemo3 extends Thread{

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
		MultiDemo3 t1 = new MultiDemo3(); //thread 1
 		MultiDemo3 t2 = new MultiDemo3(); //thread 2
		MultiDemo3 t3 = new MultiDemo3(); //thread 3

		t1.run();
		t2.run();
		t3.run();

	}
}