/*
Using Collections class
*/
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		//Parent			   Child
		List<String> ll = new LinkedList();
		ll.add("Hyd");
		ll.add("Blr");
		ll.add("Del");
		ll.add("Pune");
		ll.add("Mum");
		// ll.add(111);

		System.out.println(ll);

		System.out.println("\nReversing....\n");
		Collections.reverse(ll);

		for(Object obj: ll)
			System.out.println(obj);
		System.out.println("--------------------------------");

		Iterator itr = ll.iterator();
		//Iterator(interface) itr <----al.iterator()
		//.iterator() <- called a cursor aka Universal Cursor i.e applicable on any collection object

		while(itr.hasNext()) { //hasNext() <- as long as there exists an object in al
			System.out.println(itr.next());
		}
		System.out.println("--------------------------------");

		System.out.println("Sorting....\n");
		Collections.sort(ll);

//Cursor#2 - ListIterator - only for Linked type
		//ListIterator can travel in both directions(next & previous) as compared to above Iterator
		//not universal, can only be applied on 'Linked' type
		ListIterator litr = ll.listIterator();		
		while(litr.hasNext())
			System.out.println(litr.next());

		System.out.println("\nLast element: "+litr.previous()); //last element
		//similar to hasNext(), hasPrevious() is available

	}
}
/*
Note: ListDemo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
^ because we are not using generics

*/