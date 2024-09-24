import java.io.*;
import java.util.*;

// Annonymous object

public class Factorial{

	void fatc(int n){
		long f=1;
		for(int i=1; i<=n; i++)
			f = f*i;

		System.out.println(f);
	}
	public static void main(String[] args){

		new Factorial().fact(21); 
	// annonymous obj are garbage by default
	}
}