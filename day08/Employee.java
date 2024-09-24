public class Employee {
	private int eid;
	private String name;
	double basic;

	private static String org = "CDAC Hyd"; // static or class variable
	private static String country; // not initialized

	static{ // static block
		//used to initialize static members
		System.out.println("This is the static block!");
		country = "India";
		org = "MHA";
	}

	public Employee(int eid, String name, double basic) {
		this.eid = eid;
		this.name = name;
		this.basic = basic;
	}

	public static void changeOrg() {
		org = "CDAC"; //static org can be accessed here
	}

	void getEmployee() {
		System.out.println(eid+" "+name+" "+basic+" "+org+" "+country);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(111, "ABC", 82000);
		e1.getEmployee();

		changeOrg(); //calling static method (alt. Employee.changeOrg();)

		Employee e2 = new Employee(221, "SDF", 77000);
		e2.getEmployee();
	}
}