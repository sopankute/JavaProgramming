import java.io.*;
import java.util.*;

public class Modifiers{
	int roll_no;
	String name;
	private long adhar;
	static String acadamy = "C-DAC";

	public Modifiers(int r, String n, long ad){
		this.roll_no = r;
		this.name = n;
		this.adhar = ad;
	}

	public void setValue(int r, String n){
		this.roll_no = r;
		this.name = n;
	}
	public void getValue(){
		System.out.println(roll_no+"\t"+name);
	}

	public void show(){
		System.out.println(roll_no+"\t"+name+"\t"+adhar+"\t"+acadamy);
	}
	public static void main(String[] args){

		// System.out.println(name);		// Sopan Kute

		Modifiers m1 = new Modifiers();
		m1.setvalue(4234, "Ayush");
		m1.getValue();

		// Modifiers m = new Modifiers(4234, "Sopan", 46523612);
		// m.show();
	}
}