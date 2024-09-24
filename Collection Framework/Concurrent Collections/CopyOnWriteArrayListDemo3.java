import java.util.concurrent.*;
import java.util.*;

public class CopyOnWriteArrayListDemo3{
	public static void main(String[] args) {

		// ArrayList l= new ArrayList();		// [A, B, C, E]

		CopyOnWriteArrayList l = new CopyOnWriteArrayList(); 	// RE : UnsupportedOperationException
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		System.out.println(l);

		Iterator itr = l.iterator();
		while(itr.hasNext()){
			String s1 = (String)itr.next();
			if(s1.equals("D"))
				itr.remove();			// RE : UnsupportedOperationException
		}
		System.out.println(l);
	}
	
}
