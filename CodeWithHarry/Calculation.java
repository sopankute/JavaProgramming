import java.io.*;
import java.util.*;

class Circle{
	double radius;
	double PI = 3.142;
	public Circle(double r){
		this.radius = r;
	}
	double areaOfCircle(){
		return (2 * PI * radius * radius);
	}
	double perimeterOfCircle(){
		return (2 * PI * radius);
	}
}
class Cylinder extends Circle{
	double height;
	double PI = 3.142;
	public Cylinder(double r, double h){
		super(r);
		this.height = h;
	}
	double areaOfCylinder(){
		return 2 * PI * this.radius *(height + this.radius);
	}
	double volumeOfCylinder(){
		return PI * this.radius * this.radius * height;
	}
}
public class Calculation{
	public static void main(String args[]){
		Circle c = new Circle(6.7);
		System.out.println("The Area of Circle : "+c.areaOfCircle());
		System.out.format("The Perimeter of Circle : %.2d",c.perimeterOfCircle());

		// Cylinder c1 = new Cylinder(4.3, 6.5);
		// System.out.println("The Area of Cylinder : "+c1.areaOfCylinder());
		// System.out.format("The Perimeter of Circle : %.2dl",c1.volumeOfCylinder());

	}
}