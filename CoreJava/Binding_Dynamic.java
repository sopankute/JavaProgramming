import java.io.*;
import java.util.*;

class Animal{
	void eat(){
		System.out.println("Animals are Eating...");
	}
}
public class Binding_Dynamic extends Animal{
		void eat(){
		System.out.println("Dog is Eating...");
	}

	public static void main(String[] args){
		Animal a = new Binding_Dynamic();
		a.eat();
	}
}

// Type of Object determined at Run-Time, it is Dynamic Binding.