import java.io.*;
import java.util.*;

// Question 27

class Member{
	private String name;
	private int age;
	private long phone_no;
	private double salary;
	Address add;
		public Member(String n, int a, long p_no, double sal, Address ad){
			this.name = n;
			this.age = a;
			this.phone_no = p_no;
			this.salary = sal;
			this.add = ad;
		}
		public void disp(){
			System.out.println("Name :\t\t"+name+"\nage :\t\t"+age+"\nContact No :\t"+phone_no+"\nSalary : \t"+salary);
			add.showAdd();
		}
}
class Employee extends Member{
	String specialization;
	String department;
		public Employee(String n, int a, long p_no, double sal,String sp, String dep, Address ad){
			super(n, a, p_no, sal, ad);
			this.specialization = sp;
			this.department = dep;
		} 
		public void disp1(){
			super.disp();
			System.out.println("specialization : "+specialization+"\nDepartment : \t"+department);
		}
}
class Manager extends Member{
	String specialization;
	String department;
		public Manager(String n, int a, long p_no, double sal,String sp, String dep, Address ad){
			super(n, a, p_no, sal, ad);
			this.specialization = sp;
			this.department = dep;
		} 
		public void disp2(){
			super.disp();
			System.out.println("Specialization : "+specialization+"\nDepartment :\t "+department);
		}
}
public class TestClass{
	public static void main(String[] args){
		Address adr1 = new Address(3432, "Karve road,Warje","Pune","MH","India",431509);
		Member m = new Member("Sopan Kute", 24, 763523, 15000, adr1);
		m.disp();

		System.out.println();
		Employee e1 = new Employee("Bhushan Tupkari", 23, 79376472, 16000, "Details Engg", "Instrumentation",adr1);
		e1.disp1();

		System.out.println();
		Address adr2 = new Address(5341, "Bapat road,Swargate","Pune","MH","India",431044);
		Manager m1 = new Manager("Ashish Jadhav", 26, 98335424, 22000, "Site Engg", "Construction",adr2);
		m1.disp2();
	}
}
/*
OUTPUT :
				Name :          Sopan Kute
				age :           24
				Contact No :    763523
				Address :       3432,Karve road,Warje,Pune,MH,India-431509

				Name :          Bhushan Tupkari
				age :           23
				Contact No :    79376472
				Address :       3432,Karve road,Warje,Pune,MH,India-431509
				specialization : Details Engg
				Department :    Instrumentation


				Name :          Ashish Jadhav
				age :           26
				Contact No :    98335424
				Address :       5341,Bapat road,Swargate,Pune,MH,India-431044
				Specialization : Site Engg
				Department :     Construction
*/