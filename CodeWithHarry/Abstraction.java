import java.io.*;
import java.util.*;

abstract class Base{
	public Base(){
		System.out.println("I'm in Base constructor.");
	}
	public static void sayHello(){
		System.out.println("Hello , Good Morning.");
	}	
	abstract public void greet();
}
class Child extends Base{

	@Override
	public void greet(){
		System.out.println("Hi, Good Afternoon!!!!");
	}
}
public class Abstraction{
	public static void main(String[] args){

		// Base b1 = new base();   // obj of Base not be created?

		Base b = new Child();
		b.sayHello();
		b.greet();
	}
}
