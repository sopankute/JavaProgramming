public class Student {
    private int rollNo;
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;
    private String course; //newly added to explain this()
    private String gender; //newly added to explain this()
    private static String organization = "CDAC Hyderabad";

    Address addr; // instance variable    

/*
    public Student() {
        System.out.println("I'm a default constructor!");
    }
*/

/*
    //parameterized constructor
    public Student(int r, String n, int m1, int m2, int m3) {
        rollNo = r;
        name = n;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    //copy constructor in C++ simulation
    public Student(Student s) {
        rollNo = s.rollNo;
        name = s.name;
        marks1 = s.marks1;
        marks2 = s.marks2;
        marks3 = s.marks3;
    }
*/

    //local variables are assigned to themselves,
    //even if the names are same as instance variables
    //...called principle of locality preference
/*    public Student(int rollNo, String name, int marks1, int marks2, int marks3) {
        rollNo = rollNo;
        name = name;
        marks1 = marks1;
        marks2 = marks2;
        marks3 = marks3;
    }
*/

    //^ solved using this keyword
    public Student(int rollNo, String name, int marks1, int marks2, int marks3) {
        //this(); //refers to default constructor
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }  

    public Student(int rollNo, String name, int marks1, int marks2, int marks3, String course, String gender, Address addr) {
        // this(); <-- NO! this() must be the 1st line
        //i.e only one this() (any kind) must be there in a method, v already here
        this(rollNo, name, marks1, marks2, marks1); // refers to current class constructor ^
        this.course = course;
        this.gender = gender;
        this.addr = addr;        
    }

    public void disp() {
        System.out.println("Student Details:");
        System.out.println("Name: "+name+"\tRoll No: "+rollNo+"\tCourse: "+course);
        System.out.println("Gender: "+gender+"\t"+marks1+"\t"+marks2+"\t"+marks3);
        System.out.println("Organization: "+organization);
        addr.dispAddress(); // Address class
    }

    public void findAvg() {
        double avg = (marks1 + marks2 + marks3)/3;
        System.out.println("Average marks: "+avg+"\n");
    }

/*
//main()
    public static void main(String[] args) {

        Student s1 = new Student(123, "ASDF", 89, 90, 88); // old object
        s1.disp();
        s1.findAvg();

        Student s2 = new Student(111, "ABC", 89, 87, 79, "DAC", "Male");
        s2.disp();
        s2.findAvg();

    }
*/
}
