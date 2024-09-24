import java.util.Scanner;

public class Student{
    private int rollno;
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;
    private static String org="C-DAC Hyderabad"; // class 
        // well-formed encapsulation - data is private
    public Student(){ // default cons
    //    
    Scanner input=new Scanner(System.in);
    System.out.println("Enter rollno, name and marks in 3 subjects of student:");
    rollno=input.nextInt();
    name=input.next(); // name is a single word
    marks1=input.nextInt();
    marks2=input.nextInt();
    marks3=input.nextInt();
    }
    public Student(int r,String n,int m1, int m2, int m3){  // parameterized
    rollno=r;
    name=n; // name is a single word
    marks1=m1;
    marks2=m2;
    marks3=m3;
    }

    // public Student(){
    //     System.out.println("I'm a default cons!!!");
    // }

    // public Student(int rollno,String name,int marks1, int marks2, int marks3){  // parameterized
    // this(); // refers to default cons
    // this.rollno=rollno;
    // this.name=name; 
    // this.marks1=marks1;
    // this.marks2=marks2;
    // this.marks3=marks3;
    // }

    //  public Student(int rollno,String name,int marks1, int marks2, int marks3,String course, String gender){
    //     this(rollno,name,marks1,marks2,marks3); // refers to current class cons
    //     this.course=course;
    //     this.gender=gender;
    // }
    
       // copy constructor in C++ - simulation
    // public Student(Student s){ // passing object referenec
    // rollno=s.rollno;
    // name=s.name; // name is a single word
    // marks1=s.marks1;
    // marks2=s.marks2;
    // marks3=s.marks3;
    // }

    public void disp(){
        System.out.println("Student Details:");
        System.out.println("Name: "+name+"\tRoll No: "+rollno);
        System.out.println(marks1+"\t"+marks2+"\t"
        System.out.println("Organization: "+org+"\n");
    }
    void findAvg(){
        double avg=(marks1+marks2+marks3)/3;
        System.out.println("Average Marks: "+avg);
    }
    public static void main(String[] args) { 
        
        // an array of student objects
        Student[] s=new Student[2]; // created an array of 5 Students 
        for(int i=0;i<s.length;i++){
            s[i]=new Student(); // default cons - 5 times
            s[i].disp();
            s[i].findAvg();
        }
       Student s3=new Student(123,"ASDF",89,88,78); // parameterized
       s3.disp();
       s3.findAvg();

       //  Student s4=new Student(s3);
       // s4.disp();
       // s4.findAvg();
    }
}