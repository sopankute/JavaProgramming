class Display{
	
	public synchronized void wish(String name){
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
public class SynchronizedDemo1{
	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();

		MyThread t1 = new MyThread(d1, "Rohit");	// d1 - differ obj 
		MyThread t2 = new MyThread(d2, "Dhoni");	// d2 - differ obj
		t1.start();
		t2.start();
	}
}

// output :

// synchronized but irregular
// Good Morning : Good Morning : Dhoni
// Good Morning : Rohit
// Good Morning : Dhoni
// Good Morning : Rohit
// Good Morning : Dhoni
// Good Morning : Rohit
// Good Morning : Rohit
// Good Morning : Dhoni
// Good Morning : Rohit
// Dhoni