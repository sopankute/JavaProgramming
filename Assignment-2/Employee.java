package pack1;

// Question 41

public class Employee extends Person1{
	private String org;
	private String department;

	public Employee(String n, int a, String or, String dep, String ct, String nat){
		super(n, a, ct, nat);
		this.org = or;
		this.department = dep;
	}
	public void disp2(){
		super.disp();
		System.out.println("Orgnization : "+org+"\nDepartment : "+department);
	}
}