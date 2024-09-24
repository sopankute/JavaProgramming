/*
currentThread() 
- returns the current thread that is executing in the critical section

-we can use this current thread's name to make that thread do particular task
-we can get priority etc..
*/

public class CTDemo extends Thread{

	void even() {
		for(int i = 0; i <= 10 ; i+=2) {
			System.out.println("EVEN "+i);
		}
	}

	void odd() {
		for(int i = 1; i <= 10 ; i+=2) {
			System.out.println("ODD "+i);
		}
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		if(Thread.currentThread().getName().equals("Even")) {
			even(); 
		}
		else
			odd();
	}

	public static void main(String[] args) {
		CTDemo t1 = new CTDemo();
		CTDemo t2 = new CTDemo();

		t1.setName("Even");
		t2.setName("Odd");

		t1.start();
		t2.start();
	}
}