import java.io.*;
import java.util.*;

public class Exception5{
	public static void main(String[] args){
		int a=5, b=0, c;
		try{
			c = a/b;
		}
		catch(Exception e){			// error: incompatible types: Exception cannot be converted to Throwable
			System.out.println(e);
		}
		System.out.println("Exception handled.");
	}
}