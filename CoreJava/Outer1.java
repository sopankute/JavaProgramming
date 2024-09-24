import java.io.*;
import java.util.*;

class Outer1{
	private int data = 200;
	final static String name = "Sopan"; 

	class Inner{
		void msg(){
			System.out.println("The data is : "+data);
			System.out.println("The name is : "+name);
		}
	}
	void callInner(){
		Inner in = new Inner();
		in.msg();
	}
	public static void main(String[] args){

		Outer1 out = new Outer1();
		out.callInner();

	}
}