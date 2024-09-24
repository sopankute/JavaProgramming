public class Main{
    
public static void main(String[] args) {

Employee emp1=new Employee(100,"XYZ",100000);
	emp1.getEmployee();
	emp1.findSalary();
	System.out.println("*********************************");

TechEmp e1=new TechEmp(99,"ASDF",100000,15000); //  
	e1.getEmployee(); // the overriden
	e1.findSalary(); // the overriden 
	System.out.println("*********************************");

TechEmp e2=new TechEmp(199,"QWERTY",100000,25000); //  
	e2.getEmployee(); // the overriden
	e2.findSalary(); // the overriden 
}
}