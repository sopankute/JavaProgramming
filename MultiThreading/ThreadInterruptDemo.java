class MyThread extends Thread{

	public void run(){
		try{
			for(int i=0; i<6; i++){
				System.out.println("i am Lazy thread");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e){
			System.out.println("I got Interrupted");
		}
	}
}
class ThreadInterruptDemo{

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		System.out.println("Main Thread...");
	}
	
}

// output : 

// Main Thread...
// i am Lazy thread
// I got Interrupted



// t.interrupt(); -> commented

// Main Thread...
// i am Lazy thread
// i am Lazy thread
// i am Lazy thread
// i am Lazy thread
// i am Lazy thread
// i am Lazy thread

