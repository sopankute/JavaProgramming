/*
TreeSet but descending order by implementing Comparator interface

compare():
descending order - 2nd object with 1st
ascending order - 1st object with 2nd
*/
import java.util.*;

public class SetDemo4 {
	public static void main(String[] args) {
										 //this is an anonymous object of MyClass
		TreeSet<String> hs = new TreeSet(new MyClass());
								//making TreeSet object as MyClass instance
		hs.add("C-DAC");
		hs.add("DAC");
		hs.add("DASSD");
		hs.add("March 2022");
		hs.add("C-DAC"); //Duplicate - IGNORED! No CE or RE
		hs.add("Java");	
		hs.add("Web programming");
		hs.add("DS");
		System.out.println("\n"+hs+"\n");

		Iterator itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

		TreeSet<Integer> ts = new TreeSet();
		ts.add(10);
		ts.add(1);
		ts.add(99);
		ts.add(20);
		ts.add(7);
		System.out.println("\n"+ts);
		//^ will be in ascending order as TreeSet here is NOT
		//an instance of MyClass

	}
}

class MyClass implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1); //descending order
	}
}
//java.lang.ClassCastException is thrown coz heterogenious collection cannot be sorted
