/*
Using Collections class
*/
import java.util.*;

public class ListDemo3 {
	public static void main(String[] args) {

		//Generics - type safety - know errors at compile time
		ArrayList<Integer> al = new ArrayList(); //1st collection
		al.add(10);
		al.add(15);
		al.add(5);
		al.add(25);
		al.add(39);
		al.add(10);
		al.add(20); 
		//al.add("Java"); //ClassCastException during sorting
		//this is because for comparison we need same type

		System.out.println(al);

		System.out.println("\nReversing....\n");
		Collections.reverse(al);

		for(Object obj: al)
			System.out.println(obj);
		System.out.println("--------------------------------");

		System.out.println("Sorting....\n");
		Collections.sort(al);

//Cursor#1 - Iterator - Universal cursor
		Iterator itr = al.iterator();
		//Iterator(interface) itr <----al.iterator()
		//.iterator() <- called a cursor aka Universal Cursor i.e applicable on any collection object

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