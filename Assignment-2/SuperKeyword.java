import java.io.*;
import java.util.*;

// Question 20

class Keyword{
	int id;
	String name;
	String city;
	String college = "MIT-Coe";
	public Keyword(int i, String n, String c){
		id = i;
		name = n;
		city = c;
	}
	public void showDetails(){
		System.out.println("\nStudent id : "+id+"\nStudent name : "+name+"\nCity name : "+city+"");
	}

}
public class SuperKeyword extends Keyword{
	long adhar;
	long mob_no;
	String college = "Mit-WPU";

	public SuperKeyword(int i, String n, String c, long ad, long m_no){
		super(i, n, c);
		adhar = ad;
		mob_no = m_no;
	}

	@Override
	public void showDetails(){
		super.showDetails();
		System.out.println("Adhar no : "+adhar+"\nmob_no : "+mob_no);
	}

	public void print(){
		System.out.println("\n"+college);
		System.out.println(super.college);
	}
	public static void main(String[] args){
		Keyword sk1 = new Keyword(143, "Sopan", "Parbhani");
		sk1.showDetails();

		SuperKeyword sk2 = new SuperKeyword(372, "Shivraj", "Pune", 12345567, 76234753);
		sk2.showDetails();

		// SuperKeyword sk3 = new SuperKeyword();
		sk2.print();
	}
}
/*
OUTPUT :
						Student id : 143
						Student name : Sopan
						City name : Parbhani

						Student id : 372
						Student name : Shivraj
						City name : Pune
						Adhar no : 12345567
						mob_no : 76234753

						Mit-WPU
						MIT-Coe
*/
