import java.util.*;

class TreeSetDemo2{
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);	// [20, 15, 10, 5, 0]
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;

		// default natural sorting order Ascending order

		// return I1.compareTo(I2);		// [0, 5, 10, 15, 20] Ascending order
		// return -I1.compareTo(I2);	// [20, 15, 10, 5, 0] Descending order
		// return I2.compareTo(I1);		// [20, 15, 10, 5, 0] Descending order
		// return -I2.compareTo(I1);	// [0, 5, 10, 15, 20] Ascending order
		// return I1.compareTo(-I2);    // [10, 0, 15, 5, 20, 20] Insertion order
		// return 1;					// [0, 5, 10, 15, 20]     Ascending order
		// return -1;					// [20, 20, 5, 15, 0, 10] reverse Insertion order
		// return 0;					// [10]	return 1st element
	}
}