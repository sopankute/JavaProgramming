import java.io.*;
import java.util.*;

public class Unchecked{
	public static void validate(int age){
		if(age<18){
			throw new ArithmeticException("Invalid Age..."); 	// unchecked exception
		}
		else
		{
			System.out.println("Wel-come to vote...");
		}
	}
	public static void main(String[] args){

		try{
		validate(19);
		validate(17);	// AE
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("This code must be Executed ");
		}

		System.out.println("Rest of code...");
	}
}