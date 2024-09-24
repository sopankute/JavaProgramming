class MyThread extends Thread{
	public void start(){
		super.start();
		System.out.println("Start Method");
	}
	public void run(){
		System.out.println("Run Method");
	} 
}
public class ThreadDemo4{
	public static void main(String [] args){
		MyThread t = new MyThread();
		t.start();							// execute start()
		System.out.println("Main Method");
	}
}

// output : 1
// Start Method
// Main Method
// Run Method

// output : 2
// Start Method
// Run Method
// Main Method
