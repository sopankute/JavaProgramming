import java.io.*;
import java.util.*;

public class Exception4{
	public static void main(String[] args){
		try{
			try{
				System.out.println("going to divide.");
				int b = 39/0;
			}
			catch(ArithmeticException e){
				System.out.println(e);
			}
			try{
				int a[] = new int[5];
				a[6] = 4;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			System.out.println("Others statement.");
		}
		catch(Exception e){
			System.out.println("Exeption Handeled...");
		}
		System.out.println("Normal flow...");
	}
}