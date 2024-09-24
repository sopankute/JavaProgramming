import java.io.*;
import java.util.*;

// Question 31.c

public class Exception3{
	public static void main(String[] args){

		try{
			Integer obj = Integer.parseInt("Sopan");
			System.out.println(obj);
		}
		finally{
			System.out.println("This Block of code must be Executed. Even an Exception is Occurred or not.");
		}
	}
}	