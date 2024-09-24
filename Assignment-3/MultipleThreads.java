import java.io.*;
import java.util.*;

// Question 7

class MultiThreadingDemo extends Thread{
	public void run(){
		for(int i=0; i<=7; i++){
			System.out.println("Good Morning-Child Thread.");
		}
	}
	public void disp(){
		for(int i=0; i<5; i++)
			System.out.println("hi, i'm MultipleThreadingDemo Class.");
	}
}
class MyInterface implements Runnable{
	public void run(){
		for(int i=0; i<=6; i++){
			System.out.println("Good Afternoon-Runnable Interface.");
		}
	}
}
public class MultipleThreads{
	public static void main(String[] args){
		MultiThreadingDemo m1 = new MultiThreadingDemo();
		m1.start();
		new Thread(){
			public void run(){
				m1.disp();
			}
		}.start();

		MyInterface m = new MyInterface();
		Thread t1 = new Thread(m);
		t1.start();

		for(int i=0; i<=9; i++){
			System.out.println("Good Night-Main Thread.");
		}

	}
}
