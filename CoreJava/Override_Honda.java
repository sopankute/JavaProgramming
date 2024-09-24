import java.io.*;
import java.util.*;

class Bike{

	int speed_limit = 80;

	public void run(){
		System.out.println("Running Safely...");
	}
}
public class Override_Honda extends Bike{

	int speed_limit = 110;

	public void run(){
		System.out.println("Accelarate with 60kmph...");
	}
	public static void main(String[] args){
		Bike b = new Bike();
		b.run();

		// Dynamic Method Dispatch
		Bike obj = new Override_Honda();		// Upcasting
		obj.run();								// Accelarate with 60kmph...
		System.out.println(obj.speed_limit);	// 80
	}
}