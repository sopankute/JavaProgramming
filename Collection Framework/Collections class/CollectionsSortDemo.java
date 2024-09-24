import java.util.*;

class CollectionsSortDemo {
	public static void main(String args[]) {

		// Default Natural Sorting Order

		ArrayList al = new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("K");
		al.add("N");
		// al.add(new Integer(10));		// ClassCastException
		// al.add(null); 				// RE: NullPointerException

		System.out.println("Before Sorting:"+al); 	//Before Sorting : [Z, A, K, N]
		Collections.sort(al);	// DNSO list should contain homogeous element
		System.out.println("After Sorting:"+al); 	//After Sorting : [A, K, N, Z]
	}
}

// output :
// Before Sorting:[Z, A, K, N]
// After Sorting:[A, K, N, Z]
