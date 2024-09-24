import java.util.*;

public class LinkedListDemo{
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();

		ll.add("Sopan");
		ll.add(25);
		ll.add("Durga");
		ll.add("Software");
		ll.add(4, "Solution");
		ll.add(1, "Sachin");
		System.out.println(ll);	// [Sopan, Sachin, 25, Durga, Software, Solution]
		ll.remove(1);
		ll.addFirst("Java");
		ll.addLast("Hydrabad");
		System.out.println(ll);	// [Java, Sopan, 25, Durga, Software, Solution, Hydrabad]
	}
	
}