import java.util.*;

public class TreeSetDemo3{
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add("Roja");
		t.add("Shobha Rani");
		t.add("Raja Kumari");
		t.add("Ganga Bhavani");
		t.add("Ramulamma");
		System.out.println(t);
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = (String)obj1;					// 	if internal objects are string type then we go with typecast
		String s2 = (String)obj2;					// 	if internal objects are differ type then it convert into string
		// return -s1.compareTo(s2);
		return s2.compareTo(s1);
	}
}

// output : Descending order 
// [Shobha Rani, Roja, Ramulamma, Raja Kumari, Ganga Bhavani]