import java.io.*;
import java.util.*;

// Question 29

abstract class Shape{
	abstract int rectangleArea(int l, int b);
	abstract int squareArea(int side);
	abstract double circleArea(double r);
}
public class Area extends Shape{
	public int rectangleArea(int lenght, int breadth){
		return (lenght * breadth);
	}
	public int squareArea(int side){
		return (side * side);
	}
	public double circleArea(double radius){
		double PI = 3.142;
		return (2 * PI * radius * radius);
	}
	public static void main(String[] args){
		Area a = new Area();
		System.out.println("The Area of Rectangle : "+a.rectangleArea(5,7));
		System.out.println("The Area if Square : "+a.squareArea(9));
		System.out.format("The Area of Circle : %.2f",a.circleArea(4.9));
	}
}
/*
OUTPUT :
				The Area of Rectangle : 35
				The Area if Square : 81
				The Area of Circle : 150.88
*/