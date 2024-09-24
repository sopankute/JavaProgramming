import java.io.*;
import java.util.*;

// Question 6

public class Operator{
	// 1) Increment and decrement operators
	public void meth1(int x){	// 10
		x++;
		System.out.println(x);	// 11
		++x;
		System.out.println(x);	// 12
		x--;
		System.out.println(x);	// 11
		--x;
		System.out.println(x);	// 10
	}
	// 2) Bitwise Complement Operator.
	public void meth2(int x){	// 14  or -14
		System.out.println(~x);	// -15 or  13
	}
	// 3) Arithmetic operator. 
	public void meth3(int x, int y){

		System.out.println(x + y);	//18
		System.out.println(x - y);	// 8
		System.out.println(x * y);	// 65
		System.out.println(x % y);	// 3
		System.out.println(x / y);	// 2
	}
	// 4) Relational Operator
	public void meth4(int x, int y){
		System.out.println(x == y); 	// false  or  true
		System.out.println(x != y);		// true   or  false
		System.out.println(x <= y);		// true   or  true
		System.out.println(x >= y);		// false  or  true
	}
	// 5) Bitwise operator. 
	public void meth5(int x, int y){
		System.out.println(x & y);		// 9
		System.out.println(x | y);		// 15
		System.out.println(x ^ y);		// 6

	}
	// 6) Conditional Operator
	public void meth6(int x, int y){
		System.out.println(x<y && x>y);		// false
		System.out.println(x>y || x<y);		// true
		System.out.println(x = (y!=x) ? x : y);		// 27

	}

	public static void main(String[] args){
		Operator op = new Operator();
		// op.meth1(10);
		// op.meth2(14);
		// op.meth2(-14);
		// op.meth3(13, 5);
		// op.meth4(17,19);
		// op.meth4(3,3);
		op.meth5(11, 13);
		op.meth6(27, 16);

	}
}