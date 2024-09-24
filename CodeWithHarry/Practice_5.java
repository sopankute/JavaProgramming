import java.io.*;
import java.util.*;

public class Practice_5{

	static void foo(){
		System.out.println("Good Morning bro !");
	}

	static void foo(int x){
		System.out.println("Good Afternoon bro :"+x);
	}

	static void foo(int x, int y){
		System.out.println("Good Night to all : "+x+" and "+y);
	}

	static int foo(int x, int y, int z){
		System.out.println("Good Night to all : "+x+" and "+y+" and "+z);
		return z;
	}
	public static void main(String[] args){

		foo();
		foo(500);
		foo(500, 800);
		int c = foo(1000, 2000, 3000);
		System.out.println(c);
	}
}