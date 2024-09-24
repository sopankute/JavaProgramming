import java.io.*;
import java.util.*;

// Question 23

public class Distance{
	private int feet;
	private int inches;

	public void getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter feet : ");
		feet = sc.nextInt();
		System.out.print("Ente inches : ");
		inches = sc.nextInt();
	}
	public void showDist(){
		System.out.println("Feet : "+feet+" Inches : "+inches);
	}
	public void addDist(Distance d1, Distance d2){
		inches = d1.inches + d2.inches;
		feet = d1.feet + d2.feet + (inches/12);
		inches = (inches % 12);
	}
	public static void main(String args[])
	{
		Distance d1 = new Distance();
		Distance d2 = new Distance();
		Distance d = new Distance();

		System.out.println("Enter first Distance : ");
		d1.getInput();
		System.out.println("Enter second Distance : ");
		d2.getInput();

		d.addDist(d1, d2);

		System.out.print("Total Distance : ");
		d.showDist();

	}
}
/*
OUTPUT :
				Enter first Distance :
				Enter feet : 23
				Ente inches : 8
				Enter second Distance :
				Enter feet : 14
				Ente inches : 7
				Total Distance : Feet : 38Inches : 3
*/