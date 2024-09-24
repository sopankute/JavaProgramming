import java.io.*;
import java.util.*;

// Question 32.b

class NegativeRadiusException extends Exception{
	public String toString(){
		return "Radius can't be Negative.";
	}

}
public class Exception8{
	public static double areaOfCircle(double r) throws NegativeRadiusException{
		double result;
		if(r<0)
			throw new NegativeRadiusException();	// must be caught or declared to be thrown

		result = Math.PI * r * r;
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius : ");
		double radius = sc.nextDouble();

		try{
			System.out.println(areaOfCircle(radius));
		}
		catch(Exception e){
			System.out.println("Please enter positive radius.");
			System.out.println(e.toString()+"\n");
			e.printStackTrace();
		}
		
	}
}