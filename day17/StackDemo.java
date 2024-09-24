import java.util.*;

public class StackDemo {
	public static void main(String[] args) {
		
		Stack s = new Stack(); // or List s = new Stack();
		s.push("Java"); //like adding to stack
		s.push("C");
		s.push("Python");
		s.add(10); //add() will work too coz ultimately it's a list
		s.add(90);
		s.add("Java");
		s.push(false);
		System.out.println(s+"\n");
		
		System.out.println(s.peek()+" TOS"); //gives Top of the stack element
		System.out.println(s.pop()+" removed"); //false-removed  like removing the topmost element
		System.out.println(s.pop()+" removed"); //Java-removed
		System.out.println(s.pop()+" removed"); //90-removed
		System.out.println(s.peek()+" TOS"); //10 is TOP
		s.push(100); //add new element

		System.out.println("\n"+s);
		System.out.println();

		Iterator itr = s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println();

//Cursor#3 - Enumeration - legacy cursor
		Enumeration e = s.elements(); // = s.iterator()
		while(e.hasMoreElements()) { // = hasNext()
			System.out.println(e.nextElement()); // = next()
		}

	}
}