package pack;

// Question 41

public class Person1{
	private String name;
	private int age;
	private String city;
	private String nationality;

	public Person1(String n, int a, String ct, String nat){
		this.name = n;
		this.age = a;
		this.city = ct;
		this.nationality = nat;
	}
	public void disp(){
		System.out.println("Name : \t"+name+"\nAge  : \t"+age+"\nCity : \t"+city+"\nNationality : "+nationality);
	}
}