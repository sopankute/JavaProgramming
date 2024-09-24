import java.io.*;
import java.util.*;

class Base{
	private int x;
	public void setX(int x){
		System.out.println("i am in Base and setting x.");
		this.x = x;
	}

	public int getX(){
		return x;
	}
}
class Derived extends Base{
	int y;
	public void setY(int y){
		System.out.println("i am in Derived and setting y.");		
		this.y = y;
	}
	public int getY(){
		return y;
	}
}
public class Practice_12{
	public static void main(String[] args){
		Base b = new Base();
		b.setX(13);
		System.out.println(b.getX());

		Derived d = new Derived();
		d.setX(36);
		System.out.println(d.getX());
		d.setY(19);
		System.out.println(d.getY());		
	}
}