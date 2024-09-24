import java.io.*;
import java.util.*;

// Question 40

class Employee3{
	private int id;
	private String name;
	private int salary;
	private String city;

	public void setId(int i){
		this.id = i;
	}
	public void setName(String n){
		this.name = n;
	}
	public void setSalary(int sal){
		this.salary = sal;
	}
	public void setCity(String ct){
		this.city = ct;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getSalary(){
		return salary;
	}
	public String getCity(){
		return city;
	}
}
public class EmployeeDetails{
	public static void main(String[] args){
		Employee3 e3 = new Employee3();

		e3.setId(234);
		e3.setName("Sopan Kute");
		e3.setSalary(30000);
		e3.setCity("Pune");
		System.out.println("emp Id : \t"+e3.getId()+"\nEmp Name : \t"+e3.getName()+"\nEmp Salary : \t"+e3.getSalary()+"\nEmp Recident : \t"+e3.getCity());
	}
}
/*
OUTPUT : 
				emp Id :        234
				Emp Name :      Sopan Kute
				Emp Salary :    30000
				Emp Recident :  Pune
*/