
import java.util.*;

class CollectionsSearchDemo1 {
	public static void main(String args[]) {

		ArrayList al = new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("M");
		al.add("K");
		al.add("a");

		System.out.println("Before Sorting:"+al); 	//Before Sorting : [Z, A, M, K, a]

		System.out.println(Collections.binarySearch(al, "M", new MyComparator1()));	// 2
		System.out.println(Collections.binarySearch(al, "X", new MyComparator1()));	// -3

		Collections.sort(al, new MyComparator1());	// Customized Sorting Order

		System.out.println("After Sorting:"+al); 	//After Sorting : [a, Z, M, K, A]

		System.out.println(Collections.binarySearch(al, "Z"));	// -6
		System.out.println(Collections.binarySearch(al, "J"));	// -1
		System.out.println(Collections.binarySearch(al, "M", new MyComparator1()));	// 2
		System.out.println(Collections.binarySearch(al, "X", new MyComparator1()));	// -3
	}
}

class MyComparator1 implements Comparator{
	public int compare(Object obj1, Object obj2){

		String s1 = (String)obj1;
		String s2 = (String)obj2;
		return s2.compareTo(s1);
	}
}