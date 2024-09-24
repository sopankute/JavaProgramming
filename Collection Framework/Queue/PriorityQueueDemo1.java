import java.util.*;

public class PriorityQueueDemo1{
	public static void main(String[] args) {

		MyComparator1 m = new MyComparator1();
		
		PriorityQueue q = new PriorityQueue(15, m);
			q.offer("A");
			q.offer("Z");
			q.offer("L");
			q.offer("B");

		System.out.println(q);	// [Z, B, L, A]
	}
}
class MyComparator1 implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = (String)obj1;
		String s2 = (String)obj2;
		return s2.compareTo(s1);
	}
}