import java.util.concurrent.*;
import java.util.*;

public class CopyOnWriteArrayListDemo4{
	public static void main(String[] args) {

		// ArrayList l= new ArrayList();		// ConcurrentModificationException

		CopyOnWriteArrayList l = new CopyOnWriteArrayList(); 	
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");

		Iterator itr = l.iterator();

		l.add("E");
		System.out.println(l);				 // [A, B, C, D, E]

		while(itr.hasNext()){
			String s1 = (String)itr.next();
			System.out.print(" "+s1);		 //  A B C D
			
		}
	}
	
}