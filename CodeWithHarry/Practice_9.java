import java.io.*;
import java.util.*;


class Employee{
	int salary;
	String name;

	public void setSalary(int s){
		salary = s;
	}
	public int getSalary(){
		return salary;
	}
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
}
class CellPhone{
	public void ring(){
		System.out.println("Ringing....");
	}
	public void vibrate(){
		System.out.println("Vibrating....");
	}
	public void callFriend(){
		System.out.println("calling....");
	}

}
public class Practice_9{
	public static void main(String[] args){
		
		// Employee e1 = new Employee();
		// e1.setName("Sopan Kute");
		// e1.setSalary(45000);
		// System.out.println(e1.getName());
		// System.out.println(e1.getSalary());

		// Employee e2 = new Employee();
		// e2.setName("Bhushan Tupkari");
		// e2.salary = 55000;
		// System.out.println(e2.getName());
		// System.out.println(e2.getSalary());

		CellPhone cp = new CellPhone();
		cp.callFriend();
		cp.vibrate();
		cp.ring();
	}
}