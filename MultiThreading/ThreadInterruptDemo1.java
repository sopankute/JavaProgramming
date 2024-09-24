class MyThread extends Thread{

	public void run(){

		for(int i=0; i<10; i++){
			System.out.println("i am Lazy thread - "+i);
		}
			System.out.println("I want to sleep");

		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			System.out.println("I got Interrupted");
		}
	}
}
class ThreadInterruptDemo1{

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		System.out.println("Main Thread...");
	}	
}

// ouput : 
// Main Thread...
// i am Lazy thread - 0
// i am Lazy thread - 1
// i am Lazy thread - 2
// i am Lazy thread - 3
// i am Lazy thread - 4
// i am Lazy thread - 5
// i am Lazy thread - 6
// i am Lazy thread - 7
// i am Lazy thread - 8
// i am Lazy thread - 9
// I want to sleep
// I got Interrupted
