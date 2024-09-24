import java.util.*;

public class ArrayListDemo{
	public static void main(String[] args) {
		
	ArrayList l = new ArrayList();

	l.add("A");
	l.add(23);
	l.add("A");
	l.add(null);
	System.out.println(l);
	l.remove(2);
	System.out.println(l);
	l.add(2, "M");
	l.add("N");
	System.out.println(l);
	}
}

// output : 
// [A, 23, A, null] for collection [] bracket
// [A, 23, null]
// [A, 23, M, null, N]