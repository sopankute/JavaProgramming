import java.io.*;
import java.util.*;

class Outer5{
	static int data = 10;


	static class Inner{
		void print(){
			System.out.println("Static Inner Class is here... : "+data);
		}
		static void show(){
			System.out.println("hi, Good Morning");
		}
	}
	public static void main(String[] args){
		// Outer5.Inner obj = new Outer5.Inner();
		// obj.print();
		// obj.show();

		Outer5.Inner.show();
	}
}