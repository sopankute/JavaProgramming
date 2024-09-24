import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(); //1st collection
		al.add(10); //Integer, not int
		al.add("Java");
		al.add(true); //Boolean, not boolean
		al.add(null);
		al.add(3.14); //Double, not double
		al.add(10); //duplicate
		System.out.println(al);

		ArrayList al2 = new ArrayList(); //2nd collection
		al2.add(50);
		al2.add(60);
		al2.add(100);
		al.remove(5); //from element@index 5 from al
		al.addAll(al2); //add all elements from al2 to al
		System.out.println(al);
		System.out.println(al2);

		//printing using .get(index) method
		for(int i =0; i < al.size(); i++) {
			System.out.print(al.get(i)+" ");
		}

	}
}
/*
Note: ListDemo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
^ because we are not using generics

*/