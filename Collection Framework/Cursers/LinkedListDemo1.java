import java.util.*;

public class LinkedListDemo1{
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("Akash");
		ll.add("Golu");
		ll.add("Sachin");
		ll.add("Sopan");
		System.out.println(ll);

		ListIterator itr = ll.listIterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			if(s.equals("Akash"))
				itr.remove();
			if(s.equals("Sachin"))
				itr.add("Somesh");
			if(s.equals("Sopan"))
				itr.add("Sandip");
		}
		System.out.println("  "+ll);
		System.out.println(itr.getClass().getName());	// java.util.LinkedList$ListItr
	}
}