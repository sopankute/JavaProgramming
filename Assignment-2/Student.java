package home;

import com.*;

// Question 42

public class Student extends Person{
	public void disp(){
		System.out.println("Name : "+name);
		System.out.println("Age  : "+age);
	}
	
	public static void main(String[] args){
		com.Person p = new com.Person();
		System.out.println("Through Protected Method.");
		p.show();

		Student s = new Student();
		s.disp();

	}
}

/*
C:\Users\Admin\Desktop\Java Programming\Assingnment-2>javac -d . Person.java

C:\Users\Admin\Desktop\Java Programming\Assingnment-2>javac -d . Student.java

C:\Users\Admin\Desktop\Java Programming\Assingnment-2>java home.Student

		OUTPUT :
		Through Protected Method.
		Name : Sopan Kute
		Age  : 24

		Name : Sopan Kute
		Age  : 24
*/
