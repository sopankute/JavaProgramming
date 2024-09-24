import java.io.*;
import java.util.*;

// Question 12

class Base{
	public void sum(int x, int y){
		System.out.println(x + y);
	}
	private void callMe(){
		System.out.println("Base Class : Calling start...");
	}
	static void vibrate(){
		System.out.println("Base Class : Now Vibrating...static Method");
	}
	final void disp(){
		System.out.println("Base Class : This is special method can't Overridden.");
	}

}
public class Derived extends Base{
	public void sum(int x, int y){
		System.out.println(x * y);
	}
	public void callMe(){
		System.out.println("Derived Class : Calling stop...");
	}
	static void vibrate(){
		System.out.println("Derived Class : Vibrations stop...");
	}
	public static void main(String[] args){
		Base b = new Base();

		// b.callMe();		// can't call cause private
		b.sum(23, 34);		// 57
		b.vibrate();		// Base Class : Now Vibrating...static Method
		vibrate();			// Derived Class : Vibrations stop...
		b.disp();			// Base Class : This is special method can't Overridden
		System.out.println();

		Derived d = new Derived();

		d.sum(23, 34);		// 782
		d.callMe();			// Derived Class : Calling stop...	
		vibrate();			// Derived Class : Vibrations stop...
		d.disp();			// Base Class : This is special method can't Overridden.
		System.out.println();

		Base bd = new Derived();	// Dynamic method dispatch(overridden methods called)

		// bd.callMe();		// can't call cause private
		bd.sum(5, 7);		// 35
		bd.vibrate();		// Base Class : Now Vibrating...static Method
		bd.disp();			// Base Class : This is special method can't Overridden.
	}
}
/*
OUTPUT :
57
Base Class : Now Vibrating...static Method
Derived Class : Vibrations stop...
Base Class : This is special method can't Overridden.

782
Derived Class : Calling stop...
Derived Class : Vibrations stop...
Base Class : This is special method can't Overridden.

35
Base Class : Now Vibrating...static Method
Base Class : This is special method can't Overridden.
*/