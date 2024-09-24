package com.server;
// import com.user.Package3;

public class Package5{
	public static void main(String[] args){
		System.out.println("I'm in Package5 Class and Subpackage(server) ... main method");
		// Package3 p3 = new Package3();
	}
}
/* 
 output 1
C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>javac -d . Package5.java

C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>javac -d . Package3.java

C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>java com.server.Package5
I'm in Package5 Class and Subpackage(server) ... main method

 output 2
C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>javac -d . Package5.java

C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>javac -d . Package3.java

C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>java Package5
I'm in Package5 Class and Subpackage(server) ... main method
*/