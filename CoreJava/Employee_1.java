
// Parent / Base / Super class

class Employee_1{
    private int eid;
    private String name;
    protected double basic;
    private static String org="C-DAC Hyd"; 

//  public Employee_1(){}                       // super()

    protected void setEmployee(int eid, String name,double basic){
        this.eid=eid;
        this.name=name;
        this.basic=basic;
    }
    protected void getEmployee(){
        System.out.println(eid+ " "+ name+" "+basic+" "+org);
    }

    public void findSalary(){
        double salary=basic+basic*72/100;
        System.out.println("Salary: "+salary);
    } 
}

// child / derived / sub

class TechEmployee extends Employee_1{
//  all non private members are avaiable here
//  basic, setter, getter, findSalary

        int bonus=10000; // data 

@Override
public void findSalary(){                     // re-defining - signature must be same
   double salary=basic+basic*72/100+bonus;    // own implementation
   System.out.println("Salary: "+salary);
  } 
@Override  
protected void getEmployee(){
    super.getEmployee();                       // access
    System.out.println(bonus);
}