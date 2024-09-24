class MyThread extends Thread{
	
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("Child Thread");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){}
		}
	}
}
public class DeamonThread1{
	public static void main(String[] args) {

			MyThread t = new MyThread();
			t.setDaemon(true);			// main Thread is Daemon
			t.start();					// Child thread is Non-Daemon

			System.out.println("end of Main Thread");

			// after every Daemon thread terminates, Automatically child thread / non daemon threads are also terminates
	}
}

// output :
// end of Main Thread
// Child Thread