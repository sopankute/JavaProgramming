import java.io.*;
import java.util.*;

//Question 21

class Person{
	private int id;
	private String name;
	private String cityName;

	public void setData(int id, String name, String cityName){
		this.id = id;
		this.name = name;
		this.cityName = cityName;
	}

	public void getData(){
		System.out.println("Employee Id :\t"+id+"\nEmployee Name : "+name+"\nCity Name :\t"+cityName);
	}

}
public class Employee1 extends Person{
	String field_type;
	private int salary;
	private int bonus;

	public void setData(int id, String name, String cityName, String field_type){
		super.setData(id, name,cityName);
		this.field_type = field_type;
	}

	public void setData(int id, String name, String cityName, String field_type, int salary, int bonus){
		super.setData(id, name,cityName);
		this.field_type = field_type;
		this.salary = salary;
		this.bonus = bonus;
	}

	public void getData(){
		super.getData();
		System.out.println("Working Field : "+field_type+"\nEmp Salary :   "+salary+"\nPaid Bonus :   "+bonus+"\n");
	}

	public static void main(String[] args){

		Person p = new Person();
		p.setData(123, "Rohit", "Nagpur");
		p.getData();
		System.out.println();
		Employee1 e1 = new Employee1();
		e1.setData(234,"Virat", "Delhi", "Programmer");
		e1.getData();

		Employee1 e2 = new Employee1();
		e2.setData(341, "Ajinkya", "Mumbai", "Software", 125500, 39000);
		e2.getData();

	}
}
/*
OUTPUT :
					Employee Id :   123
					Employee Name : Rohit
					City Name :     Nagpur

					Employee Id :   234
					Employee Name : Virat
					City Name :     Delhi
					Working Field : Programmer
					Emp Salary :   0
					Paid Bonus :   0

					Employee Id :   341
					Employee Name : Ajinkya
					City Name :     Mumbai
					Working Field : Software
					Emp Salary :   125500
					Paid Bonus :   39000
*/