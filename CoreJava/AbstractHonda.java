import java.io.*;
import java.util.*;

abstract class Bike{

	abstract void run();
	void changeGear(){
		System.out.println("Gear changed...");
	}
}
public class AbstractHonda extends Bike{
	void run(){
		System.out.println("Running Safely...");
	}
	public static void main(String[] args){
		AbstractHonda h = new AbstractHonda();
		h.run();

		Bike b = new AbstractHonda();	// DMD(Upcasting)
		b.run();
		b.changeGear();
	}
}