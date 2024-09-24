import java.util.concurrent.*;
import java.util.*;

class MyThreadDemo extends Thread{

	// static HashMap c = new HashMap(); // java.util.ConcurrentModificationException

	static ConcurrentHashMap c = new ConcurrentHashMap(); 
	public void run(){
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){}

			System.out.println("Child Thread Upadate a Map.");
			c.put(103, "C");
	}

	public static void main(String[] args) throws InterruptedException{
		
		c.put(101, "A");
		c.put(102, "B");

		MyThreadDemo t = new MyThreadDemo();
		t.start();

		Set s = c.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Integer I1 = (Integer)itr.next();
			System.out.println("Main Thread Iterating and Current Entry : "+I1+"----"+c.get(I1)); 
			Thread.sleep(2000);
		}
		System.out.println(c);
	}
}
// output :
// Main Thread Iterating and Current Entry : 101----A
// Child Thread Upadate a Map.
// Main Thread Iterating and Current Entry : 102----B
// Main Thread Iterating and Current Entry : 103----C
// {101=A, 102=B, 103=C}
