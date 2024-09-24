import java.io.*;
import java.util.*;

public class ReThrow{
	static void demo(){
		try{
			throw new NullPointerException("demo...");
		}
		catch(NullPointerException e){
			System.out.println("Caught inside demo...");
			throw e;
		}
	}
	public static void main(String[] args){

		try{
			demo();
		}
		catch(NullPointerException e){
			System.out.println("Recatch here "+e);
		}
	}
}

// Caught inside demo...
// Recatch here java.lang.NullPointerException: demo...