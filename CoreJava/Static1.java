import java.io.*;
import java.util.*;

public class Static1{
	int roll_no;
	String name;
	static String clg = "MIT-Coe";				// static variable

	static void change(){
		clg = "Mit-WPU,Pune";
	}

	static{
		System.out.println("hi, Good Night, i'm First");	// befor main method
	}

	public Static1(int r, String n){	// parameterized constructor
 	this.roll_no = r;
	this.name = n;
	}

	public void show(){								//  print method
	System.out.println(roll_no+"\t"+name+"\t"+clg);
	}
	public static void main(String[] args){

	Static1 s1 = new Static1(321, "Sopan ");		// obj creation
	Static1 s2 = new Static1(876, "Ayush ");

	s1.show();		// 321     Sopan   MIT-Coe
	s2.show();		// 876     Ayush   MIt-Coe

	s1.show();		// 321     Sopan   MIT-Coe
	s2.change();
	s2.show();		// 876     Ayush   Mit-WPU,Pune

	// System.out.println(name);	// can't referenced from static context
	// System.out.println(s1.name);	// Sopan

	System.out.println(clg);		// Mit-WPU,Pune

	clg = "COEP,Pune";
	System.out.println(clg);		// COEP,Pune
	
}

}