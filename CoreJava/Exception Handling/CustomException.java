import java.io.*;
import java.util.*;

class MyException extends Exception{
	public MyException(String errMsg){
		super(errMsg);
	}
}
public class CustomException{
		void vote(int age) throws MyException{
			if(age < 18)
				throw new MyException("Invalid age");
			else
				System.out.println("Wel-Come to voting");
		}
	public static void main(String[] args){
		CustomException obj = new CustomException();
		try{
		obj.vote(19);
		obj.vote(17);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

// Wel-Come to voting
// MyException: Invalid age
//         at CustomException.vote(CustomException.java:12)
//         at CustomException.main(CustomException.java:20)
