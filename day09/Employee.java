//Parent / Base / Super class
class Employee {
	private int eid;
	private String name;
	protected double basic; //set to protected

	private static String org = "CDAC Hyd"; // static or class variable
	private static String country; // not initialized

	protected void setEmployee(int eid, String name, double basic) {
		this.eid = eid;
		this.name = name;
		this.basic = basic;
	}

	protected void getEmployee() {
		System.out.println(eid+" "+name+" "+basic+" "+org);
	}
}

public class TechEmployee extends Employee {
	
}