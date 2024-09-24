import java.io.*;
import java.util.*;

// Question 11

public class AnonymousInnerClass{
	static final double PI = 3.142; 

	public double areaOfCircle(double radius){
		double area = PI * radius * radius;
		// System.out.println("Area Of Circle : "+area);
		try{
			Thread.sleep(400);
		}catch(Exception e){}
		return area;
	}

	public double areaCylinder(double height, double radius){
		double area = 2 * this.areaOfCircle(radius) * (height + radius);
		return area;
		// System.out.println("Area Of Cylinder : "+area);
	}

	public double areaOfCone(double height, double radius){
		double x = Math.pow(height,2) + Math.pow(radius,2);
		double area = PI * radius * (radius + Math.sqrt(x));
		return area;
	}

	public static void main(String[] args){
		AnonymousInnerClass a = new AnonymousInnerClass();
		new Thread(){
			public void run(){
				System.out.println("Area Of Circle : "+a.areaOfCircle(6.3));
			}
		}.start();

		new Thread(){
			public void run(){
				System.out.println("Area Of Cylinder : "+a.areaCylinder(7.5, 4.8));
			}
		}.start();

		new Thread(){
			public void run(){
				System.out.println("Area Of Cone : "+a.areaOfCone(6.5, 3.7));
			}
		}.start();

	}
}