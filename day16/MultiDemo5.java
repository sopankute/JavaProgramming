/*
setName() and getName()
setPriority(PRIORITY)
*/
public class MultiDemo5 extends Thread{

	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500); //make this thread sleep for 500 miliseconds after printing one value
				//which results in giving access to another thread to print
			}
			catch(Exception e) {}
		}
	}

	public static void main(String[] args) { // main thread - controller thread
		MultiDemo5 t1 = new MultiDemo5(); //thread 1
 		MultiDemo5 t2 = new MultiDemo5(); //thread 2
		MultiDemo5 t3 = new MultiDemo5(); //thread 3

		t1.setName("First");
		t3.setName("Third");

		t1.setPriority(MIN_PRIORITY); //1
		t3.setPriority(MAX_PRIORITY); //10
		//t2 -> NORM_PRIORITY

		t1.start();
		t2.start();
		t3.start();

		System.out.println(t1.getName()+" "+t2.getName()+" "+t3.getName());
		System.out.println(t1.getPriority()+" "+t2.getPriority()+" "+t3.getPriority());
	}
}