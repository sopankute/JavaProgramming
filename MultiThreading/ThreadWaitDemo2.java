class ThreadB extends Thread{
	int total = 0;
	public void run(){
		synchronized(this){		// cuurrent class obj reference

			System.out.println("Child Thread start caalculations");		// step-2
			for(int i=1; i<=100; i++){
				total += i;
			}
			System.out.println("Child Thread giving the notification call");	// step-3
		this.notify();
		}
	}
}
public class ThreadWaitDemo2{
	public static void main(String[] args) throws InterruptedException {

		ThreadB b = new ThreadB();
		b.start();

		Thread.sleep(1000);		// not recommended
		// b.join();				// not recommended
		
		
		synchronized(b){
			System.out.println("main Thread calling wait() method");	// step-1
			b.wait(1000);
			System.out.println("main Thread got the notification");		// step-4
			System.out.println(b.total);
		}
		
	}
}

// output : for - b.wait();
// Child Thread start caalculations
// Child Thread giving the notification call
// main Thread calling wait() method
// ....
// no expected output


// output : for - b.wait(1000);
// Child Thread start caalculations
// Child Thread giving the notification call
// main Thread calling wait() method
// main Thread got the notification
// 5050










