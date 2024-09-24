/*
TreeSet
-Duplicates are ignored
-Natural SORTED order is applied - ascending order
-That is the set is sorted in ascending order
-Objects are compared every time a new object is added, so we must use homogenious
-Use Generics here in TreeSet
*/
import java.util.*;

public class SetDemo3 {
	public static void main(String[] args) {
		
		// Set<String> hs = new TreeSet(); <-
		TreeSet<String> hs = new TreeSet();

		hs.add("C-DAC");
		// hs.add(1998);
		hs.add("DAC");
		hs.add("DASSD");
		hs.add("March 2022");
		// hs.add(0.5);
		hs.add("C-DAC"); //Duplicate - IGNORED! No CE or RE
		// hs.add(true);
		// hs.add(92.7);
		hs.add("Java");	
		hs.add("Web programming");
		hs.add("DS");
		System.out.println("\n"+hs+"\n");

		Iterator itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

		//some methods....
		System.out.println("first(): "+hs.first()); //first object: C-DAC
		System.out.println("last(): "+hs.last()); //last object: Web programming
		System.out.println("headSet(\"Java\"): "+hs.headSet("Java")); //everything before Java(exclusive)
		System.out.println("tailSet(\"Java\"): "+hs.tailSet("DAC")); //everything after DAC(inclusive)

	}
}
//java.lang.ClassCastException is thrown coz heterogenious collection cannot be sorted
