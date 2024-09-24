import java.util.*;
import java.io.*;


class Base{
	public Base(){
		// this(7);
		System.out.println("I'm Default Constructor in Base Class.");
	}

	public Base(int x){
		System.out.println("I'm Overloaded Constructor in Base Class : "+x);
	}
}

class Derived extends Base{
	public Derived(){
		// super(1);
		System.out.println("I'm Default Constructor in Derived Class.");
	}

	public Derived(int x){
		// super(1);
		System.out.println("I'm Overloaded Constructor in Derived Class : "+x);
	}

	public Derived(int x, int y){
		super(7);
		System.out.println("I'm Overloaded Constructor in Derived Class : "+x+" & "+y);
	}
}

class GrandChild extends Derived{
	public GrandChild(){
		// super(2,3);
		System.out.println("I'm Default Constructor GrandChild Class.");
	}

	public GrandChild(int x, int y, int z){
		super(2,3);
		// super(2);
		System.out.println("I'm Default Constructor GrandChild Class. "+x+" & "+y+" & "+z);
	}
}
public class Constructor{
	public static void main(String[] args){

		// Base b = new Base(2);
		// Derived d = new Derived(2);

		// Derived d = new Derived(4,5);

		GrandChild gc = new GrandChild(4,5,6);
	}
}