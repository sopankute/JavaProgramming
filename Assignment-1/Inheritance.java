
class Parent{
	private int x = 10;
	protected int a = 11;

	public Parent(){
		System.out.println("I'm a Parent constructor");
	}
	public Parent(int x){
		System.out.println("I'm a Parent Overloaded constructor : "+x);
	}
	public void printX(){
		System.out.println(x+"  "+a);
	}
}

class Child extends Parent{
	private int y = 20;
	protected int b = 22;

	public Child(){
		System.out.println("I'm a Child constructor");
	}
	public Child(int x,int y){
		super(x);
		System.out.println("I'm a Child Overloaded constructor : "+y);
	}
	public void printY(){
		System.out.println(y+"  "+b);
	}
}

public class Inheritance extends Child{
	private int z = 30;
	protected int c = 33;

	public Inheritance(){
		System.out.println("I'm a Inheritance constructor");
	}
	public Inheritance(int x, int y, int z){
		super(x, y);
		System.out.println("I'm a Inheritance Overloaded constructor : "+z);
	}
	public void printZ(){
		System.out.println(z+"  "+c);
	}

	public static void main(String[] args){

		// Parent p = new Parent(7);
		  // p.printX();
		  // p.printY();	// Error
		  // p.printZ();	// Error

		// Child c = new Child(7,8);
		  // c.printX();
		  // c.printY();	
		  // c.printZ();	// Error

		Inheritance it = new Inheritance(7,8,9);
		  it.printX();
		  it.printY();	
		  it.printZ();

	}
}