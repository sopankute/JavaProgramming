class MyThread extends Thread{

	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("Sita Thread");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
		}
	}

}
public class ThreadJionDemo{
	public static void main(String[] args) throws InterruptedException{
		MyThread t = new MyThread();
		t.start();
		// t.join();		// main thread will entered into waiting state until completing child thread
		t.join(10000);		// main thread waited until 10 sec until then child thread complete

		for(int i=0; i<10; i++){
			System.out.println("Rama Thread");
		}
	}
}
// output :
// Sita Thread
// Sita Thread
// Sita Thread
// Sita Thread
// Sita Thread
// Sita Thread
// Sita Thread
// Sita Thread
// Sita Thread
// Sita Thread
// Rama Thread
// Rama Thread
// Rama Thread
// Rama Thread
// Rama Thread
// Rama Thread
// Rama Thread
// Rama Thread
// Rama Thread
// Rama Thread