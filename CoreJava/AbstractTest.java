import java.io.*;
import java.util.*;

abstract class Shape{
	abstract void draw();
}
class Circle extends Shape{
	void draw(){
		System.out.println("Drawing Circle....");
	}
}
class Rectangle extends Shape{
	void draw(){
		System.out.println("Drawing Rectangle....");
	}
}
public class AbstractTest{
	public static void main(String[] args){
		
		Shape at = new Circle(); 
		at.draw();

		Shape at1 = new Rectangle();
		at1.draw();
	}
}