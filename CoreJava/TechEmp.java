
// Parent / Base / Super class

class Employee{
    private int eid;
    private String name;
    protected double basic;
    private static String org="C-DAC Hyd"; 
  
    public Employee(int eid, String name,double basic){
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

class TechEmp extends Employee{
    // all non private members are avaiable here
      int bonus; // child specific member
    public TechEmp(int eid, String name, double basic, int bonus){
      super(eid,name,basic);
      this.bonus=bonus;
}

@Override
    public void findSalary(){ // re-defining - signature must be same
      double salary=basic+basic*72/100+bonus; // own implementation
      System.out.println("Salary: "+salary);
    } 
 
@Override  
protected void getEmployee(){
     super.getEmployee(); // access parent's method
     System.out.println(bonus);
  }

public static void main(String[] args) {
   Employee e1=new TechEmp(1010,"ASDF",100000,15000); // upcasting
   e1.getEmployee(); // overriden - RTP - dynamic method dispatch
   e1.findSalary(); //  overriden - RTP - dmd

   // Employee e2=new Employee(1011,"xyz",100000);
   // e2.getEmployee(); // parent
   // e2.findSalary(); // parent

   // TechEmp te2=new TechEmp(1012,"abc",100000,25000);
   // te2.getEmployee(); // child - overriding
   // te2.findSalary(); // child - overriding
   // e2=te2; // upcasting
   // e2.getEmployee(); //child - RTP
   // e2.findSalary(); // child - RTP
  }
}