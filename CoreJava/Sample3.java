package acts;
import cdac.*;
import pune.Sample;
// import pune.warje.*;

public class Sample3{
	public void disp(){
		System.out.println("hello, I'm from acts Package.");
	}
	public static void main(String[] args){

		Sample3 s3 =new Sample3();
		s3.disp();					// from current packge

		Sample1 s1 = new Sample1();
		s1.fun();					// from cdac package

		// Sample2 s2 = new Sample2();

		pune.warje.Sample2 s2 = new pune.warje.Sample2();	// FullyQaulified name
		s2.method();				// from subpackge

		Sample s = new Sample();
		s.msg();					// from pune package
	}
}
// 				javac -d . Sample2.java
// 				javac -d . Sample3.java
// 				javac -d . Sample1.java
// 				javac -d . Sample.java
// 				java acts.Sample3
// 				output : hello, I'm from acts Package.
// 						 Hi, I'm from Cdac...
// 						 hello, I'm in SubPackge.
// 						 Hello, I'm from Pune.
