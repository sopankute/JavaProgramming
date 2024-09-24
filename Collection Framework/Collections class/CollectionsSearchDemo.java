import java.util.*;

class CollectionsSearchDemo {
	public static void main(String args[]) {

		ArrayList al = new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("M");
		al.add("K");
		al.add("a");

		System.out.println("Before Sorting:"+al); 	//Before Sorting : [Z, A, M, K, a]

		System.out.println(Collections.binarySearch(al, "Z"));	// -5 - sorting must be required
		System.out.println(Collections.binarySearch(al, "J"));	// -1

		Collections.sort(al);	

		System.out.println("After Sorting:"+al); 	//After Sorting : [A, K, M, Z, a]

		System.out.println(Collections.binarySearch(al, "Z"));	// 3
		System.out.println(Collections.binarySearch(al, "J"));	// -2
	}
}