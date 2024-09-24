class Display{
	
	public void wish(String name){
		;;;;;;;;;;;;;;;;

		// synchronized(this){

		synchronized(Display.class){
			for(int i=0; i<5; i++){
				System.out.print("Good Morning : ");
				try{
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
				}
					System.out.println(name);
			}
		}
		;;;;;;;;;;;;;;;;
	}
}

class MyThread extends Thread{
	Display d;
	String name;

	public MyThread(Display d, String name){
		this.d = d;
		this.name = name;
	}

	public void run(){
		d.wish(name);
	}
}
public class SynchronizedBlockDemo{
	public static void main(String[] args) {

	// Regular output
		// Display d1 = new Display();

		// MyThread t1 = new MyThread(d1, "Rohit");	// d1 - same obj
		// MyThread t2 = new MyThread(d1, "Dhoni");	// d1 - same obj - has both threads
		// t1.start();
		// t2.start();

	// Irregular output	
		Display d1 = new Display();
		Display d2 = new Display();

		MyThread t1 = new MyThread(d1, "Rohit");	// d1 - same obj
		MyThread t2 = new MyThread(d2, "Dhoni");	// d1 - same obj - has both threads
		t1.start();
		t2.start();
	}
}