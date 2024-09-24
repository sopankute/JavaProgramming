import com.Package2;
// import com.user.Package4;


// class Using extends Package4{
// 	void meth2(){
// 		// System.out.println("Public : "+x);
// 		// System.out.println("Protected : "+y);
// 		// System.out.println("Default : "+z);		// Error
// 		// System.out.println("Private : "+n);		// Error
// 	}
// }
public class Package6{
	public static void main(String[] args){

		Package2 p2 = new Package2();
		System.out.println("i'm from Package com....");
		System.out.println("Public : "+p2.a);
		// System.out.println("Protected : "+p2.b);	// Error
		// System.out.println("Default : "+p2.c);		// Error
		// System.out.println("Private : "+p2.d);		// Error

		p2.meth1();

		// Using u = new Using();
		// u.meth2();

		// Output :2
		// Public : 11
		// Protected : 22

		// Package4 p4 = new Package4();
		// System.out.println("i'm from Package com.User ....");
		// System.out.println("Public : "+p4.x);			// Only accessed
		// // System.out.println("Protected : "+p4.y);		// Error
		// // System.out.println("Default : "+p4.z);		// Error
		// // System.out.println("Private : "+p4.n);		// Error

		// p4.meth1();

	}
}
/*
output 1:
			C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>javac -d . Package2.java

			C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>java Package6
			i'm from Package com....
			Public : 11
			
			Through Method....Base class
			Public : 11
			Protected : 22
			Default : 33
			Private : 44

output 3:
			C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>javac -d . Package6.java

			C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>java Package6
			i'm from Package com.User ....
			Public : 11

			Through Method....Base class
			Public : 11
			Protected : 22
			Default : 33
			Private : 44
*/