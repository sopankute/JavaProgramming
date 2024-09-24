import java.io.*;
import java.util.*;

// Question 8

public class MyMultiThreads{
	public void drawPattern(int n){
		System.out.println("The increasing Star Pattern :");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print("  *");
			}
			System.out.println("");
		}
		System.out.println();
	}
	public int fact(int n){
		int fact = 1;
		for(int i=1; i<=n; i++){
			if(n==0 && n==1)
				fact = i;
			else{
				fact *= i;
			}
		}
			return fact;
	}
	public static void main(String[] args){
		MyMultiThreads m = new MyMultiThreads();

		new Thread(){
			public void run(){
				m.drawPattern(6);
			}
		}.start();

		new Thread(){
			public void run(){
				System.out.println("The Factorial is : "+m.fact(7));
			}
		}.start();

		new Thread(){
			public void run(){
				System.out.println("The Factorial is : "+m.fact(9));
			}
		}.start();
	}
}