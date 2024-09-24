import java.io.*;
import java.util.*;

class Outer2{
	private int num = 30;

	class Inner{		// Inner or non static class
		void show(){
			System.out.println("the num is : "+num);
		}
	}
	public static void main(String[] args){
		Outer2 outObj = new Outer2();
		Outer2.Inner in = outObj.new Inner();
		in.show();
	}
}