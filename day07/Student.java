import java.util.Scanner; //only business class
public class Student {
    private int rollNo;
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;

    private static String organization = "CDAC Hyderabad";    
    //well formed encapsulation - iff the data is private

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rollno, name and marks in 3 subjects of a student:");
        rollNo = scanner.nextInt();
        name = scanner.next();
        marks1 = scanner.nextInt();
        marks2 = scanner.nextInt();
        marks3 = scanner.nextInt();
    }

    public void disp() {
        System.out.println("Student Details:");
        System.out.println("Name: "+name+"\tRoll No: "+rollNo);
        System.out.println(marks1+"\t"+marks2+"\t"+marks3);
        System.out.println("Organization: "+organization+"\n");
    }

    void findAvg() {
        double avg = (marks1 + marks2 + marks3)/3;
        System.out.println("Average marks: "+avg);
    }
}
