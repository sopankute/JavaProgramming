class MyThread extends Thread{
	public void run(){
		System.out.println("No Argument run Method");
	}
	public void run(int n){
		System.out.println("Int type Argument overloded method : "+n);
	}
}
public class ThreadDemo2{
	public static void main(String args[]){
		MyThread t = new MyThread();
		t.start();					// call without arg run()
		t.run(5);					// overloaded method need to call explicitly	
	}
}

// OUTPUT:
// No Argument run Method
// Int type Argument overloded method : 5
