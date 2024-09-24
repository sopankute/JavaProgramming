import java.io.*;
import java.util.*;

class Base{
	int bonus = 500;
	int speed = 100;

	void run(){
		System.out.println("Base : To achieve your goal you have to run,");
	}
}
public class Derived extends Base{
	int salary = 1000;
	int speed = 150;

	void disp(){
		System.out.println(super.speed);	// 100
		System.out.println(speed);			// 150
	}
	void run(){
		System.out.println("Derived : along with taking care of your health.");
	}
	public static void main(String[] args){
		Derived d = new Derived();
		System.out.println(d.bonus);
		System.out.println(d.salary);
		d.run();

		d.disp();	// 100

	}
}