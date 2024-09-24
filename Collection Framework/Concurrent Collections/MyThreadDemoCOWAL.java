import java.util.concurrent.*;
import java.util.*;

class MyThreadDemoCOWAL  extends Thread{

	// static ArrayList l= new ArrayList(); // java.util.ConcurrentModificationException

	static CopyOnWriteArrayList l = new CopyOnWriteArrayList(); 

	public void run(){
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){}

			System.out.println("Child Thread Upadate a List.");
			l.add("C");
	}

	public static void main(String[] args) throws InterruptedException{
		
		l.add("A");
		l.add("B");

		MyThreadDemoCOWAL t = new MyThreadDemoCOWAL();
		t.start();

		Iterator itr = l.iterator();
		while(itr.hasNext()){
			String s1 = (String)itr.next();
			System.out.println("Main Thread Iterating and Current Entry : "+s1); 
			Thread.sleep(2000);
		}
		System.out.println(l);
	}
}

// output :
// Main Thread Iterating and Current Entry : A
// Child Thread Upadate a List.
// Main Thread Iterating and Current Entry : B
// [A, B, C]
