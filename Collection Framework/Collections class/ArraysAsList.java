import java.util.*;

public class ArraysAsList{
	public static void main(String[] args) {
		
		String[] s = {"A", "Z", "B"};
		List l = Arrays.asList(s);
		System.out.println(l);			// [A, Z, B]

		s[0] = "K";
		System.out.println(l);			// [K, Z, B]

		l.set(1, "L");

		for (String s1 : s )
		System.out.print(s1+" "); 		// K L B

		l.add("Durga"); 				//RE : UnsupportedOperationException
		l.remove(2); 					//RE : UnsupportedOperationException
		l.set(1, new Integer[10]); 		//RE : ArrayStoreException
	}
}