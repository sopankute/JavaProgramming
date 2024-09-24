class MyThread extends Thread{
	public void start(){
		System.out.println("Start Method");
	}
	public void run(){
		System.out.println("Run Method");
	} 
}
public class ThreadDemo3{
	public static void main(String [] args){
		MyThread t = new MyThread();
		t.start();							// execute start()
		// t.run();							// need to call explicitly & No new thread is created
		System.out.println("Main Method");
	}
}

// output :
// Start Method
// Main Method

// * it is never recommended to override start() *