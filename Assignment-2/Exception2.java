import java.io.*;
import java.util.*;

// Question 31.b

public class Exception2{
	public static void main(String[] args){

		try{
			String str = null;
			System.out.println(str.length());
		}
		catch(NullPointerException e){
			System.out.println("You must have to assign any String value to str variable.");
			System.out.println(e);
		}
		finally{
			System.out.println("This Block of code must be Executed. Even an Exception is Occurred or not.");
		}
	}
}
/*
OUTPUT : 
		You must have to assign any String value to str variable.
		java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
		This Block of code must be Executed. Even an Exception is Occurred or not.
*/