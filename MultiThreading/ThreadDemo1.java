class MyThread extends Thread{
	
 }

public class ThreadDemo1{

	public static void main(String args[]){
		MyThread t = new MyThread();		// instantiation thread
		t.start();							// starting a thread
	}

}
// No Output :
// run() method is not override
// then we won't get any output coz empty implementation

// * it is highly recomended to override run() *