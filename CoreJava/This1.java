import java.io.*;

// this() used to refer and invoke a current class instance variable and constructor

public class This1{
	int id ;
	String name;
	int age;
	String city;
	public This1(){
		System.out.println("I'm default constructor.");
	}
	public This1(int id, String name){
		this();							// calling constructor
		this.id = id;
		this.name = name;
	}
	public This1(int id, String name, int age, String city){
		this(id, name);											// passing Arguments			
		this.age = age;
		this.city = city;
	}
	public void show(){
		System.out.println(id+"\t"+age+"\t"+name+"\t"+city);
	}
	public static void main(String[] args){

	This1 t1 = new This1(8634,"Anand Kute");
	This1 t2 = new This1(8634,"Sopan Kute", 24, "Parbhani");
	t1.show();
	t2.show();


	}
}