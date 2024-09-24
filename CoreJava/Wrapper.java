import java.io.*;
import java.util.*;

public class Wrapper{

	// final int x;				// variable x not initialized
	// final static int y;		// variable x not initialized

	public void disp(){
		final int y;			// applicable for local variable 
		System.out.println("hello");
	}
	
	// public static final strictfp synchronized void main(String... args)		// valid
 	public static void main(String[] args)
 	{

		Wrapper q = new Wrapper();
		q.disp();					// hello

		// Integer i = new Integer(4);
		// float f = i.floatValue();
		// System.out.println(f);		// 4.0

		// Double d = new Double(7.6);
		// int i = d.intValue();
		// System.out.println(i);		// 7

		// Character ch = new Character('S');
		// int i = ch.intValue();
		// System.out.println(i);

		// Boolean isDone = new Boolean(true);
		// int n = isDone.intValue();
		// System.out.println(n);


		// AutoBoxing

		// int a = 25;							// Primitive type
		// Integer a1 = new Integer(a);		// Wrapper type
		// Integer a2 = 35;
		// System.out.println(a1+"  "+a2);		// 25  35

		// UnBoxing

		// Integer i = new Integer(15);	// Primitive type
		// int x = i;						// Wrapper type
		// System.out.println(x);			// 15
	}
}