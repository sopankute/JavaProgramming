import java.io.*;
import java.util.*;

class Cylinder{
	private int radius;
	private int height;

	public Cylinder(int radius, int height){
		this.radius = radius;
		this.height = height;
	}

	public void setRadius(int r){
		this.radius = r;
	}
	public int getRadius(){
		return radius;
	}
	public void setHeight(int h){
		this.height = h;
	}
	public int getHeight(){
		return height;
	}
	public double surfaceArea(){
		return 2*3.142*radius*radius+2*3.142*radius*height;
	}
	public double volume(){
		return 3.142*radius*radius*height;
	}
}
public class Practice_11{
	public static void main(String[] args){
		// Cylinder c = new Cylinder();
		// c.setRadius(7);
		// System.out.println(c.getRadius());
		// c.setHeight(8);
		// System.out.println(c.getHeight());
		// System.out.println("Surface Area of cylinder : "+c.surfaceArea());
		// System.out.println("Volume of cylinder : "+c.volume());

		Cylinder c1 = new Cylinder(5,7);

		System.out.println(c1.getRadius());
		System.out.println(c1.getHeight());

		System.out.println("Surface Area of cylinder : "+c1.surfaceArea());
		System.out.println("Volume of cylinder : "+c1.volume());
	}
}