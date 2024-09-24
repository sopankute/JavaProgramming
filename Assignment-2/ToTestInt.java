import java.io.*;
import java.util.*;

// Question 14

interface Test{
	public int square(int x);
}
class Arithmetic implements Test{
	int s = 0;
	public int square(int y){
		s = y * y;
		return s;
	}
	public void disp(){
		System.out.println("square of Number : "+s);
	}
}
public class ToTestInt{
	public static void main(String[] args){
		Arithmetic t =new Arithmetic();
		t.square(9);
		t.disp();
	}
}
/*
OUTPUT :
square of Number : 25
square of Number : 81
*/