import java.io.*;
import java.util.*;

interface Printable{
	void print();
	default void draw(){
		System.out.println("Drawing a sketch...");
	} 
}
interface Showable extends Printable{
	void show();
	static void disp1(){
		System.out.println("Hey, I'm Coming...");
	}
	private void disp2(){
		System.out.println("hi, I'm Private...");
	}
}
public class Interface_B implements Showable{
	public void print(){
		System.out.println("hi, Good Morning...");
	}

	public void show(){
		System.out.println("hi, Good Afternoon...");
	}
	public static void main(String[] args){
		Interface_B obj = new Interface_B();
		// obj.print();
		// obj.draw();
		// obj.show();
		// obj.disp1();		// Error
		// obj.disp2();		// Error

		Showable s = new Interface_B();
		s.print();
		s.draw();
		s.show();
		// disp1();			// Error
		// s.disp2();		// Error

	}
}