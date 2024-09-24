import java.io.*;
import java.util.*;

// Question 33.a

public class Exception10{
	public static void main(String[] args) throws NullPointerException {
		
		try{
			String str = null;
			System.out.println(str.length());
		}
		catch(NullPointerException e){
			System.out.println("You must have to assign any String value to str.\n");
			System.out.println(e.getMessage()+"\n");
			System.out.println(e);
		}
		System.out.println("Rest of code.");
	}
}