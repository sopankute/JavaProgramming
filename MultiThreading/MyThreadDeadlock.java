class A{
	public synchronized void d1(B b){
		System.out.println("Thread1 started execution of d1() method");
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){

		}
		System.out.println("Thread1 trying to call B's last() method");
		b.last();
	}

	public void last(){
		System.out.println("Inside : A - last() method");
	}	
}
class B{
	public synchronized void d2(A a){
		System.out.println("Thread2 started execution of d2() method");
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){

		}
		System.out.println("Thread2 trying to call A's last() method");
		a.last();
	}

	public void last(){
		System.out.println("Inside : B - last() method");
	}	
}
public class MyThreadDeadlock extends Thread{

	A a = new A();
	B b = new B();


	public void m1(){
		// no need to create Thread class object
		// here only one thread and main thread comes here
		this.start();
		// after this.start - two threads are here 
		// main thread responsible to execute below code
		a.d1(b);	// Main Thread - execute d1() method then sleep
		// Main Thread hold the lock of A & waiting for B's lock
	}
	public void run(){
		b.d2(a);		// Child Thread - execute d2() method then sleep simulatenously
		// Child Thread hold the lock of B & waiting for A's lock

		// * DEADLOCK *
	}


	public static void main(String[] args) {
		MyThreadDeadlock t = new MyThreadDeadlock();			
		t.m1();		// m1() calling on myThread obj and main Thread responsible to execute m1()

	}
}


// ouput : 1 - all synchronized methods
// Thread1 started execution of d1() method
// Thread2 started execution of d2() method
// Thread1 trying to call B's last() method
// Thread2 trying to call A's last() method
// .
// .
// .
// no output 

// ouput : 2 - last() methods are non-synchronized - NO DEADLOCK
// Thread1 started execution of d1() method
// Thread2 started execution of d2() method
// Thread1 trying to call B's last() method
// Inside : B - last() method
// Thread2 trying to call A's last() method
// Inside : A - last() method