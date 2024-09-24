/*
Iterator (interface)
*/
import java.util.*;

public class ListDemo2 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(); //1st collection
		al.add(10); //Integer, not int
		al.add("Java");
		al.add(true); //Boolean, not boolean
		al.add(null);
		al.add(3.14); //Double, not double
		al.add(10); //duplicate
		System.out.println(al);

		for(Object obj: al)
			System.out.println(obj);
		System.out.println("--------------------------------");

		Iterator itr = al.iterator();
		//Iterator(interface) itr <----al.iterator()
		//.iterator() <- called a cursor aka Universal Cursor 
		//i.e applicable on any collection object

		while(itr.hasNext()) { //hasNext() <- as long as there exists an object in al
			System.out.println(itr.next());
		}
		System.out.println("--------------------------------");

	}
}
/*
Note: ListDemo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
^ because we are not using generics

*/