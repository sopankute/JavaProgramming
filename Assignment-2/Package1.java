package com;

// Question 8

public class Package1{
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
}