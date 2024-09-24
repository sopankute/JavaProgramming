import java.io.*;
import java.util.*;

class Student{
	public int roll_no;
	public String name;

	Student(int roll_no, String name){
		this.roll_no = roll_no;
		this.name = name;
	}
}
public class ArrObj{
	public static void main(String[] args)
	{
		// Student[] array = new Student[10];

		Student[] array;
		array = new Student[4];   // Array of Objects

		array[0] = new Student(45, "Sopan Kute");
		array[1] = new Student(35, "Bhushan Tupkari");
		array[2] = new Student(25, "Ashish Jadhav");
		array[3] = new Student(15, "Angad Raut");

		for(int i=0; i<array.length; i++)
			System.out.println(array[i].roll_no+" : "+array[i].name);
	}
}