import java.io.*;
import java.util.*;
import java.io.*;

// Question 20 and 21

public class Bank{
	String acc_holder;
	String acc_type;
	long acc_number;
	float min_balance;
	float acc_balance = 10000;
	Scanner sc = new Scanner(System.in);

	public void getInput(){
		System.out.print("Enter your Account Holder Name : ");
		acc_holder = sc.nextLine();
		System.out.print("Enter your Account Type : ");
		acc_type = sc.nextLine();
		System.out.print("Enter your Account Number : ");
		acc_number = sc.nextLong();
	
	}
	public void accDatails(){
		System.out.println("Account Holder Name : "+acc_holder);
		System.out.println("Account Holder Name : "+acc_type);
		System.out.println("Account Holder Name : "+acc_number);
	}
	public void showBalance(){

	}
	// public deposit(){}
	public withdraw(){
		if()
	}

	public static void main(String[] args){
		Bank b = new Bank();
		b.getInput();
	}
}