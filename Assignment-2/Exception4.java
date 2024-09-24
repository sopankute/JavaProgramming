import java.io.*;
import java.util.*;

// Question 31.d
// Exception propogation

public class Exception4{

		void meth1(){
			String name = "Sopan Kute";
			char ch = name.charAt(12);
			System.out.println(ch);
		}
		void meth2(){
			meth1();
		}
		void meth3(){
			try{
			meth2();
			}
			catch(StringIndexOutOfBoundsException e){
				System.out.println("StringIndexOutOfBoundsException Occurred");
				System.out.println(e);
				e.printStackTrace();
			}
		}
	public static void main(String[] args){
		Exception4 e4 = new Exception4();
		e4.meth3();
		System.out.println("Exception handeled Successfully.");
	}
}