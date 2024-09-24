package mypack;
import pack.*;

public class Package_B{
	public static void main(String[] args){
		 Package_A obj = new  Package_A();
		 obj.msg();
	}
}
// 		javac -d . Package_A.java
// 		javac -d . Package_B.java
// 		java mypack.Package_B
// 		output : Hello, i'm in pack.