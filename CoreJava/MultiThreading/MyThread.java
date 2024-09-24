import java.io.*;
import java.util.*;

public class MyThread extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("Child Thread : "+i);
			try{
				Thread.sleep(400);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		try{
			t1.join();
		}catch(Exception e){}
		t2.start();

			for(int i=0; i<10; i++){
				System.out.println("Main Thread");
				try{
					Thread.sleep(400);
				}catch(Exception e){
					e.printStackTrace();
				}
			}

	}
}
