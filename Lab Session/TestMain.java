import java.io.*;
import java.util.*;

class Student implements Comparable<Student>{
	String name;
	int age;
	double cgpa;

	public int compareTo(Student s){
		return 1;
	}
		public Student(String n, int a, double cg){
			this.name = n;
			this.age = a;
			this.cgpa = cg;
		}
		public void getDetails(){
			System.out.println("name of Student : "+name+"\nAge of Student : "+age+"\nStudent cgpa : "+cgpa+"\n");
		}
}
public class TestMain{
	public static void main(String[] args) throws NullPointerException {
		// Student s = new Student();
		Set<Student> st = new TreeSet<Student>();
		Student s1 = new Student("Sopan", 24, 6.83);
		Student s2 = new Student("Nitin", 26, 7.23);
		Student s3 = new Student("Bhushan", 23, 7.81);
		Student s4 = new Student("Ashish", 27, 6.37);
		Student s5 = new Student("Shreyansh", 24, 8.43);

		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);

		Iterator it = st.iterator();
		// Student[] s = new Student[5];
		// int i=0;
		// try{
		while(it.hasNext()){
			it.next();
			// if(i<5){
			// 	s[i].getDetails();
			// }
			// it.next().getDetails();
			// i++;
		}	
		s1.getDetails();
		s2.getDetails();
		s3.getDetails();
		s4.getDetails();
		s5.getDetails();
		// }
		// catch(NullPointerException e){
		// 	System.out.println(e);
		// }
	}
}