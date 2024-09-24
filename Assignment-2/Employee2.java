import java.io.*;
import java.util.*;

//Question 22

class Person{
	private int id;
	private String name;
	private String cityName;

	public Person(int id, String name, String cityName){
		this.id = id;
		this.name = name;
		this.cityName = cityName;
	}

	public void getData(){
		System.out.println("Employee Id :\t"+id+"\nEmployee Name : "+name+"\nCity Name :\t"+cityName);
	}

}
public class Employee2 extends Person{
	String field_type;
	private int salary;
	private int bonus;

	public Employee2(int id, String name, String cityName, String field_type){
		super(id, name,cityName);
		this.field_type = field_type;
	}

	public Employee2(int id, String name, String cityName, String field_type, int salary, int bonus){
		super(id, name,cityName);
		this.field_type = field_type;
		this.salary = salary;
		this.bonus = bonus;
	}

	public void getData(){
		super.getData();
		System.out.println("Working Field : "+field_type+"\nEmp Salary :   "+salary+"\nPaid Bonus :   "+bonus+"\n");
	}

	public static void main(String[] args){

		Person p = new Person(763, "Ashish", "Nagpur");
		p.getData();

		System.out.println();
		Employee2 e1 = new Employee2(321,"Rushabh", "Delhi", "Database Administrator");
		e1.getData();

		Employee2 e2 = new Employee2(863, "Balaji", "Mumbai", "Graphics Designer", 92500, 23500);
		e2.getData();

	}
}
/*
OUTPUT :
					Employee Id :   763
					Employee Name : Ashish
					City Name :     Nagpur

					Employee Id :   321
					Employee Name : Rushabh
					City Name :     Delhi
					Working Field : Database Administrator
					Emp Salary :   0
					Paid Bonus :   0

					Employee Id :   863
					Employee Name : Balaji
					City Name :     Mumbai
					Working Field : Graphics Designer
					Emp Salary :   92500
					Paid Bonus :   23500
*/