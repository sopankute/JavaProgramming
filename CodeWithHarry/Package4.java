package com.user;

public class Package4{
	public int x = 11;
	protected int y = 22;
	int z = 33;
	private int n = 44;

	public void meth1(){
		System.out.println("Through Method....Base class");
		System.out.println("Public : "+x);
		System.out.println("Protected : "+y);
		System.out.println("Default : "+z);
		System.out.println("Private : "+n+"\n");	
	}

	
	// public static void main(String[] args){
	// 	System.out.println("I'm in Package4 Class and Subpackage(user)... main method");
	// }
}
/*
output : 
C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>javac -d . Package1.java

C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>javac -d . Package2.java

C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>javac -d . Package3.java

C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>javac -d . Package4.java

C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>java com.Package1
I'm in Package1 ... main method

C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>java com.Package2
I'm in Package2 ... main method

C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>java com.user.Package3
I'm in Package3 ... main method

C:\Users\Admin\Desktop\Java Programming\CodeWithHarry>java com.user.Package4
I'm in Package4 ... main method
*/