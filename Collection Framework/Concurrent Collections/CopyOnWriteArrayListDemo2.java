import java.util.concurrent.*;
import java.util.*;

public class CopyOnWriteArrayListDemo2{
	public static void main(String[] args) {

		ArrayList l = new ArrayList();

		l.add("A");
		l.add("B");

		CopyOnWriteArrayList l1 = new CopyOnWriteArrayList();

		l1.addIfAbsent("A");
		l1.addIfAbsent("C");

		l1.addAll(l);
		System.out.println(l1);		// [A, C, A, B]

		ArrayList l2 = new ArrayList();

		l2.add("A");
		l2.add("E");

		System.out.println(l1.addAllAbsent(l2));	// 1 - returns no of elements added
		System.out.println(l1);						// [A, C, A, B, E]
	}
}