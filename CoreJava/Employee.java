import java.io.*;
import java.util.*;

// Staic keyword

public class Employee{
	
	private int eId;
	private String name;
	double basic;

	// 1. static member
	private static String org = "C-DAC Hyd";
	private static String country;

	// 2. static block
	static{ 
	// used initialise static members
	// executed during the classloading
	// executed before the main method	
		System.out.println("This is static block");
		country = "India";
		org = "C-DAC";
	}

	public Employee(int eId,String name,double basic){
		this.eId = eId;
		this.name = name;
		this.basic = basic;
	}

	// 3. static method
	public static void changeOrg(){
	// non static members not used in static context
	// this and super keyword is not used in static context
	// static org can be accessed here	
		org = "C-DAC Pune";
	}

	void getEmployee(){
		System.out.println(eId+" "+name+" "+basic+" "+org+" "+country);
	}	

	public static void main(String[] args){
		Employee e1=new Employee(111,"ABC",82000);
		e1.getEmployee();   
		// 111 ABC 82000.0 C-DAC Hyd
		// 111 ABC 82000.0 C-DAC Hyd


		changeOrg(); // calling static method-(Employee.changeOrg())

		Employee e2=new Employee(222,"XYZ",72000);
		e2.getEmployee();
		// 222 XYZ 72000.0 C-DAC Hyd

		// after changeOrg()
		// 111 ABC 82000.0 C-DAC Hyd
		// 222 XYZ 72000.0 C-DAC Pune  

		// after static bolck
		// 111 ABC 82000.0 C-DAC India
		// 222 XYZ 72000.0 C-DAC Pune India

		Employee.org = "MIT-Coe"; // can be change using class name
		Employee e3=new Employee(333,"XYZ",92000);
		e3.getEmployee();

		// This is static block
		// 111 ABC 82000.0 C-DAC India
		// 222 XYZ 72000.0 C-DAC Pune India
		// 333 XYZ 92000.0 MIT-Coe India

	}

}