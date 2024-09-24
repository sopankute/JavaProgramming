import java.io.*;
import java.util.*;

public class Practice_3{

	static void tellJoke(){
		System.out.println("I invented new word !");
	}

	int logic(int x, int y){
		int z;
		if(x>y)
			z = x+y;
		else
			z = (x+y)*5;

		return z;
	}
	public static void main(String[] args){
		
		tellJoke();
		Practice_3 obj = new Practice_3();

		int a = 5, b = 7;
		int c = obj.logic(a, b);

		System.out.println(c);	// 60

		a = 7;
		b = 5;
		c = obj.logic(a, b);
		System.out.println(c);	// 12

		tellJoke();
	}
}