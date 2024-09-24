import java.io.*;
import java.util.*;

// Question 18

public class ThisKeyword{

	String book_name;
	String level;
	int edition;
	int pages;
	public ThisKeyword(){
		System.out.println("\nThe Default Constructor form ThisKeyword.");
	}
	public ThisKeyword(String book_name , String level, int edition){
		this();
		this.book_name = book_name;
		this.level = level;
		this.edition = edition;
	}
	public ThisKeyword(String book_name, String level, int edition, int pages){
		this(book_name, level, edition);
		this.pages = pages;
	}
	public void disp1(){
		System.out.println("Name of Book : "+book_name+"\nLevel of Book : "+level+"\nBook Edition : "+edition);
	}
	public void disp2(){
		this.disp1();
		System.out.println("No of Pages : "+pages);
	}

	// this keyword can be used to return current class instance
	ThisKeyword returnMeth(){
		return this;
	}
	void callMe(){
		System.out.println("I'm called by Object through return this keyword.");
	}

	public static void main(String args[]){
		ThisKeyword tk1 = new ThisKeyword("Core-Java","Standard",2018);
		tk1.disp1();
		ThisKeyword tk2 = new ThisKeyword("C-Programming","Basic-C",2021,576);	
		tk2.disp2();	

		new ThisKeyword().returnMeth().callMe();
	//	Class obj       class type method

	}
}
/*
OUTPUT :
					The Default Constructor form ThisKeyword.
					Name of Book : Core-Java
					Level of Book : Standard
					Book Edition : 2018

					The Default Constructor form ThisKeyword.
					Name of Book : C-Programming
					Level of Book : Basic-C
					Book Edition : 2021
					No of Pages : 576

					The Default Constructor form ThisKeyword.
					I'm called by Object through return this keyword.
*/