import java.io.*;
import java.util.*;

class Employee{
	int id;
	int salary;
	String name;

	// public Employee(int i, String n){
	// 	this.id = i;
	// 	this.name = n;
	// }

	public void printDetails(){
		System.out.println("My id is : "+id);
		System.out.println("my name is : "+name);
	}

	public void printDetails(int id, int salary, String name){
		System.out.println("My id is : "+id);
		System.out.println("my salary is : "+salary);
		System.out.println("my name is : "+name);
	}

	public int getSalary(){
		return salary;
	}
}
public class Practice_8{
	public static void main(String[] args){

		// Employee e1 = new Employee(444,"Virat Kohali");
		// e1.printDetails();

		Employee e = new Employee();
		e.id = 111;
		e.salary = 1000;
		e.name = "Sopan kute";
		System.out.println(e.id);
		System.out.println(e.salary);
		System.out.println(e.name+"\n");

		e.id = 222;
		e.salary = 2000;		
		e.name = "Rohit Sharma";
		e.printDetails();
		int salary = e.getSalary();
		System.out.println("my salary is : "+salary+"\n");

		e.printDetails(333,3000, "Ajinkya Rahane");
	}
}