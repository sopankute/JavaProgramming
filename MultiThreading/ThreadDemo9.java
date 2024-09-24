class MyThread extends Thread{
	public void run(){
		System.out.println("Child Method");
	}
}
public class ThreadDemo9{
	public static void main(String[] args) {
		MyThread m = new MyThread();
		// m.start();					// valid
		Thread t1 = new Thread(m);
		t1.start();
		System.out.println("Main Method");
	}
}

// output :
// Main Method
// Child Method