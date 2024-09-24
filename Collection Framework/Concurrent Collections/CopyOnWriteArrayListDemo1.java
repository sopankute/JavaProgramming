import java.util.concurrent.*;
import java.util.*;

public class CopyOnWriteArrayListDemo1
{
	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();

		l1.add("A");
		l1.add("B");
		l1.add("C");
		System.out.println(l1);			// [A, B, C]

		CopyOnWriteArrayList l2 = new CopyOnWriteArrayList();

		l2.add("A");
		l2.add("B");
		l2.add("C");

		l2.addAll(l1);
		System.out.println(l2);			// [A, B, C, A, B, C]

		ArrayList l3 = new ArrayList();

		l3.add("B");
		l3.add("C");
		l3.add("D");
		l3.add("E");

		l2.addAllAbsent(l3);
		System.out.println(l2);			// [A, B, C, A, B, C, D, E]

	}
}