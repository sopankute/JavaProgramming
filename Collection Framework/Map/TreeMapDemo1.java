import java.util.*;

class TreeMapDemo1 {
	public static void main(String[] args) {

		TreeMap t = new TreeMap(new MyComparator());
		t.put("XXX", 101);
		t.put("AAA", 103);
		t.put("ZZZ", 100);
		t.put("LLL", 105);
		// t.put(104, 106);
		// t.put(107, null);
		// t.put("FFF", "XXX");		// ClassCastException
		// t.put(null, "XXX"); 		//RE : NullPointerException
		System.out.println(t); 		// {ZZZ=100, XXX=101, LLL=105, AAA=103}
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){

		String s1 = obj1.toString();
		String s2 = obj2.toString();

		return s2.compareTo(s1);	
	}
}