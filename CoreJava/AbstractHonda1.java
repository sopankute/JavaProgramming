import java.io.*;
import java.util.*;

abstract class Bike{
	int price = 25500;
	abstract void run();
	public Bike(){
		System.out.println("Bike constructor is called.");
	}
	void getDetails(){
		System.out.println("it has Two Wheel.");
	}

}
class AbstractHonda1 extends Bike{
	void run(){
		System.out.println("Running safely.");
	}
	public static void main(String[] args){
		Bike b =new AbstractHonda1();
		b.run();
		b.getDetails();
		b.price = 32500;
		System.out.println(b.price);
	}
} 