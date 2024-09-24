class MyThread extends Thread{

	public void run(){
		for(int i=0; i<10; i++)
			System.out.println("Child Thread");
	} 
}
public class ThreadPriority{
	public static void main(String [] args){
		MyThread t = new MyThread();
		t.setPriority(10);
		t.start();				

		for(int i=0; i<10; i++)		
			System.out.println("Main Thread");
	}
}

// OUTPUT: 
// Main Thread
// Main Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
