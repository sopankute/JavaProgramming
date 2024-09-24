import java.io.*;
import java.util.*;

// Question 34

interface Phone{
	int x = 35;
	void call();
	private void greet(){
		System.out.println("Gooood Morning...");
	}
	default void record(){
		greet();
		System.out.println("Start recording now...\n");
	}
}
interface Radio{
	int y = 45;
	void playRadio();
}
public class SmartPhone implements Phone, Radio{
	public void call(){
		System.out.println("Start Calling Now....");
	}
	public void playRadio(){
		System.out.println("This is RadioCity 91.1 Channel, Pune");
	}
	public static void main(String[] args){
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.playRadio();
		sp.record();

		System.out.println("x : "+sp.x+"\ty :"+sp.y);
		// sp.x = 25;	// cannot assign
		// sp.y = 55;	// cannot assign
		// System.out.println(sp.x+"\t"+sp.y);


		Phone p = new SmartPhone();	
		p.call();

		Radio r = new SmartPhone();
		r.playRadio();

	}
}
/*
OUTPUT :
				Start Calling Now....
				This is RadioCity 91.1 Channel, Pune
				Gooood Morning...
				Start recording now...

				35      45
				Start Calling Now....
				This is RadioCity 91.1 Channel, Pune
*/