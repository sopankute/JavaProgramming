import java.util.*;

public class TreeSetDemo6{
	public static void main(String[] args) {
		Employee e1 = new Employee("Nag", 100);
		Employee e2 = new Employee("Bala", 200);
		Employee e3 = new Employee("Chiru", 50);
		Employee e4 = new Employee("Venki", 150);
		Employee e5 = new Employee("Nag", 100);

		TreeSet t = new TreeSet();	// DNSO
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);		// [Chiru--50, Nag--100, Venki--150, Bala--200]

		TreeSet t1 = new TreeSet(new MyComparator());	// CSO
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);		// [Bala--200, Chiru--50, Nag--100, Venki--150]
	}
}
class Employee implements Comparable{

	String name;
	int eid;

	Employee(String name, int eid){
		this.name = name;
		this.eid = eid;
	} 

	public String toString(){
		return name+"--"+eid;
	}

	public int compareTo(Object obj){	
		int eid1 = this.eid;
		Employee e = (Employee)obj;
		int eid2 = e.eid;

		if(eid1 < eid2) 
			return -1;
		else if(eid1 > eid2)
			return 1;
		else 
			return 0;	
	}
}

class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		Employee e1 = (Employee)obj1;
		Employee e2 = (Employee)obj2;

		String s1 = e1.name;
		String s2 = e2.name;		
		return s1.compareTo(s2);	// [Bala--200, Chiru--50, Nag--100, Venki--150]
	}
}