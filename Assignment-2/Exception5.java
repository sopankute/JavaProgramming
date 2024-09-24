import java.io.*;
import java.util.*;

// Question 31.e

public class Exception5{
	public static void main(String[] args){

		try{
			Integer obj = Integer.parseInt("Sopan");
			System.out.println(obj);
		}
		catch(NumberFormatException e){
			System.out.println(e.getMessage()+"\n");
			System.out.println(e.toString()+"\n");
			e.printStackTrace();
		}
		System.out.println("Exception is Handeled.");
	}
}