import java.io.*;
import java.util.*;

public class Checked1{
	public static void validate(int age) throws IllegalAccessException{	// declare exception
		if(age<18){
			throw new IllegalAccessException("Invalid Age..."); 	// checked exception
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

// Wel-come to vote...
// java.lang.IllegalAccessException: Invalid Age...
// This code must be Executed
// Rest of code...
