import java.io.*;
import java.util.*;

// Question 11

class Specifiers{
	int id = 61;
	static String name = "Sopan";
	static long mob_no;
	static String city = "Parbhani";

	static{
		System.out.println("Static block execute before the main() method.");
		mob_no = 28372387;
		city = "Pune";
	}
	static void show(){
		// System.out.println(id);	 // non-static variable can't be referenced
		System.out.println(name+"\t"+mob_no+"\t"+city);
	}
}	
public class StaticVar extends Specifiers{
	public static void main(String[] args){
		// Specifiers sp = new Specifiers();  

		show();		// mo meed to create obj
	}
}
/*
OUTPUT :
Static block execute before the main() method.
Sopan   28372387        Pune
*/