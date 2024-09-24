//1st way of creating a thread: extending Thread class
public class MultiDemo extends Thread{

	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) { // main thread
		MultiDemo t1 = new MultiDemo(); //already a thread

		/*
		1st executed without any run() implementation,
		so nothing happens as
		*/

		t1.start(); //eligible to execute run() method - 
		// t1 has its own flow
		//run() is under the control of Thread schedular

		MultiDemo t2 = new MultiDemo(); //another thread
		t2.start();

//we can make it so that t1 will finish first, the t2 will finish
//main may finish last or not, we cant handle that
		try{
			t1.join();
			t2.join();
		}
		catch(Exception e) {}

		//main continues with its own flow of execution too
		for(int i = 101; i <= 110; i++) {
			System.out.println(i);
		}

	}
}