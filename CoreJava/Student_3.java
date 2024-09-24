public class Student{
    private int rollno;
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;
    private String course; // newly added
    private String gender; // newly added
    private Address add; // reference - instance
    private static String org="C-DAC Hyderabad"; // class 
    // well-formed encapsulation - data is private
   
    public Student(int rollno,String name,int marks1, int marks2, int marks3){  // parameterized
    this.rollno=rollno;
    this.name=name; 
    this.marks1=marks1;
    this.marks2=marks2;
    this.marks3=marks3;
    }
    
    public Student(int rollno,String name,int marks1, int marks2, int marks3,String course, String gender, Address add){
        this(rollno,name,marks1,marks2,marks3); // refers to current class cons
        this.course=course;
        this.gender=gender;
        this.add=add;
    }
    public void disp(){
        System.out.println("Student Details:");
        System.out.println("Name: "+n);
System.out.println("Gender :"+gender+"\t"+marks1+"\t"+marks2+"\t"+marks3);//0 0 0
        System.out.println("Organization: "+org); //C-ADC Hyderabad
        add.dispAddress(); // Address class
    }
    void findAvg(){
        double avg=(marks1+marks2+marks3)/3;
        System.out.println("Average Marks: "+avg+"\n");
    }
}