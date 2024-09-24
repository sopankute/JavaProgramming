import java.io.*;
import java.util.*;

public class Area{
	final double PI = 3.142; 
	double radius, areaOfCircle;

	public void setRadius(double r){
		radius = r;
	}
	public double getArea(){
		return areaOfCircle = PI * radius * radius;
	}
	public static void main(String[] args){

		Area a = new Area();
		a.setRadius(4.7);
		System.out.println(a.getArea());
	}

}