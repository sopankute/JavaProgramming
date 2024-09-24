import java.io.*;
import java.util.*;

abstract class Person{
	abstract void eat();
}
class Outer4{

	public static void main(String[] args){
		Person p = new Person(){
			void eat(){
				System.out.println("Annonymous class , with Nice fruits.");
			}
		};
		p.eat();
	}
}