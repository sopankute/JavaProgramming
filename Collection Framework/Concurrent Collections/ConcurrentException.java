import java.util.*;

public class ConcurrentException{
	
	public static void main(String[] args){

		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");
		l.add("C");

		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			System.out.println("Main Thread Iterating & Current Object : "+s);
			l.add("D");
		}
		System.out.println(l);
	}
}

// output :
// Main Thread Iterating & Current Object : A
// Exception in thread "main" java.util.ConcurrentModificationException
//         at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
//         at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
//         at ConcurrentException.main(ConcurrentException.java:15)