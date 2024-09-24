//static import
//import java.lang.*; gets imported by default

// import all static methods in Math
import static java.lang.Math.*; 

public class StaticImportDemo {

	public static void main(String[] args) {
		
		int x = 625, y = 36;
		System.out.println(Math.random());
		System.out.println(Math.sqrt(x));
		System.out.println(Math.pow(y,2));
		System.out.println(Math.max(x,y));
		System.out.println(Math.min(x,y));

	}
}