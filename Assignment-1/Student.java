import java.io.*;
import java.util.*;

// Question 19

public class Student{
	String name;
	int regNumber;
	double marks1;
	double marks2;
	double marks3;
	int course;
	float avg;
	Scanner sc = new Scanner(System.in);

	public void getInput(){
		System.out.print("Enter your Name : ");
		name = sc.nextLine();
		System.out.print("Enter your valid Registered Number : ");
		regNumber = sc.nextInt();
		System.out.println("Enter your Three Subjects Marks : ");
		marks1 = sc.nextDouble();
		marks2 = sc.nextDouble();
		marks3 = sc.nextDouble();
		System.out.println("Your marks are : Sub1 = "+marks1+", Sub2 = "+marks2+", Sub3 = "+marks3);
		// this.resultCalculate();
	} 

	public void courseType(){
		System.out.println("Choice of your Course :\n0. Exit \n1. EnTC \n2. CSE \n3. Mechanical");
		// enum course {EXIT, ENTC, CSE, MECHANICAL}
		// Scanner sc1 = new Scanner(System.in);
		course = sc.nextInt(); 

		switch(course){
		case 0: 
			break;
		case 1: 	System.out.println("your course is Electronics and Communication Eng ");
					this.getInput();
			break;
		case 2: 	System.out.println("your course is Computer Science Eng ");
					this.getInput();
			break;
		case 3: 	System.out.println("your course is Mechanical Eng ");
					this.getInput();
			break;
		default : 
				System.out.println("You entered wrong course, Please enter correct one!!");				
		}
	}

	// public void resultCalculate()
	public int resultCalculate()
		{
			avg = (float)(marks1 + marks2 + marks3)/3;
			System.out.println("The average marks of all three Subjects : "+avg);

			// if((marks1 < 49) || (marks2 < 49) || (marks3 < 49))
			// 	System.out.println("Your result is FAIL");
			// else
			// 	System.out.println("Your result is PASS");

			if((marks1 < 49) || (marks2 < 49) || (marks3 < 49))
				return 0;
			else
				return 1;
		}
	public static void main(String[] args){
		int result;
		Student s = new Student();
		s.courseType();
		result = s.resultCalculate();
		if(result==1)
			System.out.println("Result : PASS");
		else
			System.out.println("Result : FAIL");
		
		// Student[] s1 = new Student[3];
		// for(int i=0; i<s1.lenght; i++)
		// {
		// 	s1[i] = new Student();
		// 	s1[i].courseType();
		// 	result = s1[i].resultCalculate();
		// if(result==1)
		// 	System.out.println("Result : PASS");
		// else
		// 	System.out.println("Result : FAIL");
		// }

	}
}

// OUTPUT :
//						Choice of your Course :
//						0. Exit
//						1. EnTC
//						2. CSE
//						3. Mechanical
//						3
//						your course is Mechanical Eng
//						Enter your Name : Kute sopan Digambar
//						Enter your valid Registered Number : 98732487
//						Enter your Three Subjects Marks :
//						75.63
//						69.87
//						85.62
//						Your marks are : Sub1 = 75.63, Sub2 = 69.87, Sub3 = 85.62
//						The average marks of all three Subjects : 77.04
//						PASS