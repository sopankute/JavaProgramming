import java.util.*;

class CollectionsSortDemo1 {
	public static void main(String args[]) {

		// Customized Sorting Order

		ArrayList al = new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("K");
		al.add("N");
		// al.add(new Integer(10));		// ClassCastException
		// al.add(null); 				// RE: NullPointerException

		System.out.println("Before Sorting:"+al); 	//Before Sorting : [Z, A, K, N]

		Collections.sort(al, new MyComparator1());	// Customized Sorting Order

		System.out.println("After Sorting:"+al); 	//After Sorting : [Z, N, K, A]
	}
}
class MyComparator1 implements Comparator{
	public int compare(Object obj1, Object obj2){

		String s1 = (String)obj1;
		String s2 = (String)obj2;
		return s2.compareTo(s1);
	}
}

// output :
// Before Sorting:[Z, A, K, N]
// After Sorting:[Z, N, K, A]