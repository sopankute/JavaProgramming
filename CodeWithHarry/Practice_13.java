import java.io.*;
import java.util.*;

class KeyWord{
	int a;

	// public KeyWord(int v){
	// 	System.out.println("Base constructor : "+v);
	// }

	public KeyWord(int v){
		this.a = v;
	}
	public int getA(){
		return a;
	}
	public int returnOne(){
		return 1;
	}
}
class Computer extends KeyWord{
	public Computer(int c){
		super(5);
		System.out.println("Derived Constructor : "+c);
	}
}
public class Practice_13{
	public static void main(String[] args){
		KeyWord k = new KeyWord(45);
		System.out.println(k.getA());
		Computer c = new Computer(13);
	}
}