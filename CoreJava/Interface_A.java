import java.io.*;
import java.util.*;

interface Printable{
	public static final int x = 15;
	void print();
}
interface Showable{
	void show();
}
public class Interface_A implements Printable,Showable{
	public void print(){
		System.out.println("Hi, Good Morning...");
	}
	public void show(){
		System.out.println("Hi, Good Afternoon...");
	}
	public static void main(String[] args){
		Interface_A obj = new Interface_A();
		obj.print(); 
		obj.show();
		System.out.println(obj.x);

		// obj.x = 35;					// can't change
		// System.out.println(obj.x);
	}
}