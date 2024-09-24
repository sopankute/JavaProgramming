package pack2;
import pack.Person1;
import pack1.Employee;

// Question 41

public class Manager extends Employee{
	// private String org;
	// private String department;

	public Manager(String n, int a, String or, String dep, String ct, String nat){
		super(n, a, or, dep, ct, nat);
	}
	public void disp3(){
		super.draw2();
	}

	public static void main(String[] args){
		Person1 p = new Person1("Sopan", 24, "Pune", "Indian");
		p.disp();

		Employee e = new Employee("Ashish", 25, "Yewale Construction", "Civil", "Nashik", "Indian");
		e.disp2();

		Manager m = new Manager("Bhushan", 23, "Ryka Solution", "Details Engg", "Mumbai", "Indian");
		m.disp3();
	}

}