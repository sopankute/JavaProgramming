package cdac;
import pune.*;

public class Sample1{
	public void fun(){
		System.out.println("Hi, I'm from Cdac...");
	}
	
	public static void main(String[] args){
		Sample1 s1 = new Sample1();
		s1.fun();
	}
}
// 				javac -d . Sample.java
// 				javac -d . Sample1.java
// 				java cdac.Sample1
// 				output : Hi, I'm from Cdac...