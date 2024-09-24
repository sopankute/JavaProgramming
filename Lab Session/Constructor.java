import java.io.*;
import java.util.*;

public class Constructor{
	int x;
	int y;
	public Constructor(int x, int y){
		// x = x;
		// y = y;
		this.x = x;
		this.y = y;
	}
	void disp(){
		System.out.println(x);
		System.out.println(y);
		// System.out.println(this.x);
		// System.out.println(this.y);
	}
	public static void main(String[] args){
		Constructor c = new Constructor(11,22);
		c.disp();
 	}
}