import java.util.*;

public class StackDemo{
	public static void main(String[] args) {
		Stack s = new Stack();

		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		System.out.println(s);	            // [A, B, C, D]
		System.out.println(s.search("B"));	// 3
		System.out.println(s.pop());		// D
	}
}