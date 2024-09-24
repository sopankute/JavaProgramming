import java.io.*;
import java.util.*;

// Question 18

class Phone{
	String name;
	String model;
	double price;
	int mobRam;

	public Phone(String n, String m, double p, int mr){
		this.name = n;
		this.model = m;
		this.price = p;
		this.mobRam = mr;
	}

	public void print(){
		System.out.println("I'm Normal Phone !!\n");
	}

	public void dispDetails(){
		System.out.println("Name :  \t"+name+"\nmodel : \t"+model+"\nPrice : \t"+price+"\nRam :  \t\t"+mobRam+" GB");
	}
	
}
public class SmartPhone extends Phone{
	int netWorkType;
	String simType;
	public SmartPhone(String n, String m, double p, int mr, int nWT, String sT){
		super(n,m,p,mr);
		this.netWorkType = nWT;
		this.simType = sT;
	}

	@Override
	public void print(){
		System.out.println("\nI'm a SmartPhone Phone !!\n");
	}

	@Override
	public void dispDetails(){
		super.dispDetails();
		System.out.println("netWork Type : \t"+netWorkType+"G\nsimType : \t"+simType);
	}

	public static void main(String[] args){
		Phone p = new Phone("Nokia","225 4G DS 2020",3499,1);
		p.print();
		p.dispDetails();

		SmartPhone sp = new SmartPhone("OppoF11","CPH1911",18000,4,6,"Daul Sim");
		sp.print();
		sp.dispDetails();

		Phone psp = new SmartPhone("VIVO T1","V2141",16990,8,6,"Hybrid Sim");
		psp.print();
		psp.dispDetails();
	}
} 

OUTPUT :
//						I'm Normal Phone !!
//
//						 Name :          Nokia
//						model :         225 4G DS 2020
//						Price :         3499.0
//						Ram :           1 GB
//
//						I'm a SmartPhone Phone !!
//
//						Name :          OppoF11
//						model :         CPH1911
//    					Price :         18000.0
//						Ram :           4 GB
//						netWork Type :  6G
//						simType :       Daul Sim
//
//						I'm a SmartPhone Phone !!
//
//						Name :          VIVO T1
//						model :         V2141
//						Price :         16990.0
//						Ram :           8 GB
//						netWork Type :  6G
//						simType :       Hybrid Sim