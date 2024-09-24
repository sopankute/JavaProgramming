import java.io.*;
import java.util.*;

class Parent{
	
	void message(){
		System.out.println("i am In Base Class.");
	}
	
}
public class Child extends Parent{

	void message(){
		System.out.println("i am In Deriveds Class.");
	}

	void disp(){
		message();
		super.message();
	}
	public static void main(String[] args){

		Child c = new Child();
		c.disp();
	}
}