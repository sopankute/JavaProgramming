import java.io.*;
import java.util.*;

class Square{
	int side;
	public int area(){
		return side * side;
	}
	public int perimeter(){
		return 4 * side;
	}
}
class Rectangle{
	int l,w;
	public int area(){
		return l * w;
	}
	public int perimeter(){
		return 2*(l + w);
	}

}
class Circle{
	double radius;
	final static double PI = 3.142;
	public double area(){
		return (double)(2 * PI * radius * radius);
	}
	public double perimeter(){
		return (double)(2 * PI * radius);
	}

}
public class Main{
	public static void main(String[] args){
		Square s = new Square();
		s.side = 7;
		System.out.println("The area of Square : "+s.area());
		System.out.println("The perimeter of Square : "+s.perimeter());

		Rectangle r = new Rectangle();
		r.l = 7;
		r.w = 5;
		System.out.println("The area of Rectangle : "+r.area());
		System.out.println("The Perimeter of Rectangle : "+r.perimeter());

		Circle c = new Circle();
		c.radius = 7.5;
		System.out.format("The area of Circle : %.2f\n",c.area());
		System.out.format("The Perimeter of Circle : %.2f",c.perimeter());
	}
}