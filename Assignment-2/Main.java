import java.io.*;
import java.util.*;

// Question 13

class Shape{
	void draw(){
		System.out.println("Draw any type of shape ...");
	}
	void erase(){
		System.out.println("And Erase it immediately...");
	}
}
class Circle extends Shape{
	void draw(){
		System.out.println("Drawing Circle...");		
	}
	void erase(){
		System.out.println("Erase a Circle.");
	}
}
class Triangle extends Shape{
	void draw(){
		System.out.println("Drawing Triangle...");
	}
	void erase(){
		System.out.println("Erase a Triangle.");
	}
}
class Square extends Shape{
	void draw(){
		System.out.println("Drawing Square...");
	}
	void erase(){
		System.out.println("Erase a Sqaure.");
	}
}
public class Main{
	public static void main(String[] args){
		Shape sp = new Shape();
		sp.draw();
		sp.erase();
		System.out.println();
		Circle c =new Circle();
		c.draw();
		c.erase();
		System.out.println();
		Triangle t = new Triangle();
		t.draw();
		t.erase();
		System.out.println();
		Square s1 = new Square();
		s1.draw();
		s1.erase();
	}
}
/*
OUTPUT :
				Draw any type of shape ...
				And Erase it immediately...

				Drawing Circle...
				Erase a Circle.

				Drawing Triangle...
				Erase a Triangle.

				Drawing Square...
				Erase a Sqaure.
*/