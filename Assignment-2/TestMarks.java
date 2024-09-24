import java.io.*;
import java.util.*;

// Question 28

abstract class Marks{
	int roll_no;
	String name;
		public Marks(int r, String n){
			this.roll_no = r;
			this.name = n;
		} 
	abstract double getPercentage();
}
class A extends Marks{
	double sub1, sub2, sub3;
	public A(int r, String n, double s1, double s2, double s3){
		super(r, n);
		this.sub1 = s1;
		this.sub2 = s2;
		this.sub3 = s3;
	}
	@Override
	public double getPercentage(){
		double total = 300.0;
		double sum = sub1+sub2+sub3;
		double per = (sum*100)/total;
		return per;
	}
}
class B extends Marks{
	int roll_no;
	String name;
	double sub1, sub2, sub3, sub4;
	public B(int r, String n, double s1, double s2, double s3, double s4){
		super(r, n);
		this.sub1 = s1;
		this.sub2 = s2;
		this.sub3 = s3;
		this.sub4 = s4;
	} 
	@Override
	public double getPercentage(){
		double total = 400.0;
		double sum = sub1+sub2+sub3+sub4;
		double per = (sum*100)/total;
		return per;
	}
}
public class TestMarks{
	public static void main(String[] args){
		A a = new A(123, "Sopan", 76, 82, 63);
		System.out.println("Sub1 : "+a.sub1+"\nSub2 : "+a.sub2+"\nSub3 : "+a.sub3);
		System.out.format("The Percentage of Marks : %.2f\n\n",a.getPercentage());

		B b = new B(234, "Somesh", 78,95,69,56);
		System.out.println("Sub1 : "+b.sub1+"\nSub2 : "+b.sub2+"\nSub3 : "+b.sub3+"\nSuub4 : "+b.sub4);
		System.out.format("The Percentage of Marks : %.2f",b.getPercentage());
	}	
}
/*
OUTPUT :
			The Percentage of Marks : 73.67
			The Percentage of Marks : 74.50
*/