public class Main {
	public static void main(String[] args) {

		// Employee emp1 = new Employee(100, "XYZ", 100000);
		// emp1.getEmployee();
		// emp1.findSalary();

		//emp1.getBonus(); //CE
		System.out.println("----------------------------------------");

		//TechEmp te1 = new TechEmp(); // compiler supplies contructor
		// supplied constructor will be: public TechEmployee(){ super(); }
		// super() will invoke the default constructor of parent class Employee
		// which means eid,name,basic are initialed to default 0,null,0.0 resp.

		//TechEmployee() constructor now(does some work!) sets bonus = 0

		//te1.setEmployee(111, "ABC", 100000); //using Employee's methods
		
		TechEmp te1 = new TechEmp(99, "ASDF", 100000, 15000);
		te1.getEmployee(); // the overridden method to print bonus
		te1.findSalary(); // the overridden method is going to get called
	}
}