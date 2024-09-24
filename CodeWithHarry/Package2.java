package com;

public class Package{
	public int a = 11;
	protected int b = 22;
	int c = 33;
	private int d = 44;

	public void meth1(){
		System.out.println("Through Method....Base class");
		System.out.println("Public : "+a);
		System.out.println("Protected : "+b);
		System.out.println("Default : "+c);
		System.out.println("Private : "+d+"\n");	
	}

	
	// public static void main(String[] args){
	// 	System.out.println("I'm in Package2 ... main method");
	// }
}