import java.io.*;
import java.util.*;

class Customer{
	private int id;
	private String name;
	private String cityName;
	// private double balance;
	protected double balance;
	private static String bank = "State Bank of India";

	public Customer(int id,String name, double balance, String cityName){
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.cityName = cityName;
	}

	// public double getBalance(){
	// 	return balance;
	// }

	public void getDetails(){
	 System.out.println("Customer Details : ");
	 System.out.println("Id : \t\t"+id+"\nName : \t\t"+name+"\nBankBalance :   "+balance+"\nCityName : \t"+cityName+"\nbank : \t\t"+bank);
	}

	public void calculateSI(double r){
		double SI = (double)(balance*r*5)/100;
		System.out.println("Simple Interest : "+SI);
	}
}
class ClassicCustomer extends Customer{

	int withdrawLimit;
	public ClassicCustomer(int id, String name, double balance, String cityName, int withdrawLimit){
		super(id,name,balance,cityName);
		this.withdrawLimit = withdrawLimit;
	}

	// @override
	public void getDetails(){
		super.getDetails();
		System.out.println("withdrawLimit : "+withdrawLimit);
	}

	// @override
	public void calculateSI(double r){
		double SI = (double)(balance*r*5)/100;
		System.out.println("Simple Interest_2 : "+SI);
	}
}
public class Main_1{
	public static void main(String[] args){
		Customer c1 = new ClassicCustomer(45,"Sopan Kute", 175000, "Pune",100000);
		c1.getDetails();
		c1.calculateSI(8.85);

		System.out.println();
		Customer c2 = new Customer(65,"Sachin Kute", 134000, "Mumbai");		
		c2.getDetails();
		c2.calculateSI(9.7);


	}
}

OUTPUT :
//					 Customer Details :
//					 Id :            45
//					 Name :          Sopan Kute
//					 BankBalance :   175000.0
//					 CityName :      Pune
//					 bank :          State Bank of India
//					 withdrawLimit : 100000
//					 Simple Interest_2 : 59937.5

//					 Customer Details :
//					 Id :            65
//					 Name :          Sachin Kute
//					 BankBalance :   134000.0
//					 CityName :      Mumbai
//					 bank :          State Bank of India					
//					 Simple Interest : 38190.0