//Parent / Base / Super class
class Employee {
	private int eid;
	private String name;
	protected double basic; //set to protected

	private static String org = "CDAC Hyd"; // static or class variable
	// Employee(){ } - super()
	protected void setEmployee(int eid, String name, double basic) {
		this.eid = eid;
		this.name = name;
		this.basic = basic;
	}

	protected void getEmployee() {
		System.out.println(eid+" "+name+" "+basic+" "+org);
	}

	public void findSalary() {
		double salary = basic + (basic * 72 / 100);
		System.out.println("Salary: "+ salary);
	}
}

// Sub / Child / Derived class
class TechEmployee extends Employee {
//[1] Re-usability
// all non-private members of Employee are available here
// such as basic, getters, setter

//[2] improve self
	int bonus = 10000; //data
	// void getBonus() { // method
	// 	System.out.println("Bonus: "+ bonus);
	// }

//[3] re-defining the parent methods
	//method overriding

	@Override // annotation, tells compiler that following method is an overrriden method
	public void findSalary() { //re-defining - signature must be same
		double salary = basic + (basic * 72 / 100) + bonus; // own implementation
		System.out.println("Salary: "+ salary);
	}

	@Override
	protected void getEmployee() {
		super.getEmployee(); // access parent's method
		System.out.println("Bonus: "+bonus);
	}
}