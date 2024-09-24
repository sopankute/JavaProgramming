import java.io.*;
import java.util.*;

// Question 31.f

public class Exception6{
	public static void main(String[] args){
		try{
			try{
				String[] arr = new String[5];
				arr[6] = "Angad";
			}
			catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Assign String value to valid index.");
			System.out.println(e);
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException Occurred.\n");
			}

			try{
				String str = null;
				System.out.println(str.charAt(0));
			}
			catch(NullPointerException e){
				System.out.println("You must have to assign any String value to str variable.");
				System.out.println(e);
				e.printStackTrace();
				System.out.println("NullPointerException Occurred.\n");
			}
		}
		catch(Exception e){
			System.out.println("Other type of Exception is handaled.\n");
			System.out.println(e);
		}
		finally{
			System.out.println("finally Block of code must be Executed. Even an Exception is Occurred or not.");
		}
	}
}