import java.io.*;
import java.util.*;

class Outer3{

	private int num = 15;
	final static String name = "Sopan";
	void display(){

		class Local{		// Local class inside method

			void print(){
				System.out.println("local class : "+num+"\t"+name);
			}
		}

		Local l = new Local();
		l.print();	
	}
	public static void main(String[] args){
		Outer3 obj = new Outer3();
		obj.display();
	}
}