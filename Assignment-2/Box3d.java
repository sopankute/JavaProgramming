import java.io.*;
import java.util.*;

// Question 16

class Box{
	int length;
	int breadth;
		public Box(int l, int b){
			this.length = l;
			this.breadth = b;
		}
		public void setData(int l, int b){
			length = l;
			breadth = b;
		}
		public int area(){
			return length * breadth;
		}

}
public class Box3d extends Box{
	int height;
	public Box3d(int l, int b, int h){
			super(l, b);
			this.height = h;
		}
		public void setData(int l, int b, int h){
			super.setData(l, b);
			height = h;
		}
		public int volume(){
			return super.area() * height;
		}

	public static void main(String[] args) {
		Box b1 = new Box(3, 4);
		System.out.println("The Area of Box : "+b1.area());

		b1.setData(3, 4);
		System.out.println("The Area of Box : "+b1.area());

		Box3d b2 = new Box3d(3, 4, 5);
		System.out.println("The Volume of Box3d : "+b2.volume());

		b2.setData(3, 4, 5);
		System.out.println("The Volume of Box3d : "+b2.volume());

	}
}