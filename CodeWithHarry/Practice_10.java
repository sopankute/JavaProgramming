import java.io.*;
import java.util.*;


class Employee1{
	private int id;
	private String name;


	public Employee1(){
		id = 79;
		name = "Bhushan Tupkari";
	}

	public Employee1(int myId, String myName){
		id = myId;
		name = myName;
	}

	public void setName(String n){
		this.name = n;
	}
	public String getName(){
		return name;
	}
	public void setId(int i){
		this.id = i;
	}
	public int getId(){
		return id;
	}
}
public class Practice_10{
	public static void main(String[] args){

		Employee1 e1 =new Employee1();
		Employee1 e2 =new Employee1(15, "Sachin Kute");
		// e1.id = 43;			// error
		// e1.name = "Sopan";	// error

		// e1.setName("Sopan Kute");
		// e1.setId(45);
		System.out.println(e1.getId());
		System.out.println(e1.getName());

		System.out.println(e2.getId());
		System.out.println(e2.getName());
	}

}