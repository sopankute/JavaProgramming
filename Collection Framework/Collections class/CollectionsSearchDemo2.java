
import java.util.*;

class CollectionsSearchDemo2 {
	public static void main(String args[]) {

		ArrayList al = new ArrayList();
		al.add(15);
		al.add(0);
		al.add(20);
		al.add(10);
		al.add(5);

		System.out.println("Before Sorting:"+al); 	//Before Sorting : [15, 0, 20, 10, 5]

		
		Collections.sort(al, new MyComparator1());	// Customized Sorting Order

		System.out.println("After Sorting:"+al); 	//After Sorting : [20, 15, 10, 5, 0]

		
		System.out.println(Collections.binarySearch(al, 10, new MyComparator1()));	// 2
		System.out.println(Collections.binarySearch(al, 13, new MyComparator1()));	// -3

		System.out.println(Collections.binarySearch(al, 17));	// -6 or unpredictable
		System.out.println(Collections.binarySearch(al, 17, new MyComparator1()));	//-2
	}
}

class MyComparator1 implements Comparator{
	public int compare(Object obj1, Object obj2){

		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		return i2.compareTo(i1);
	}
}