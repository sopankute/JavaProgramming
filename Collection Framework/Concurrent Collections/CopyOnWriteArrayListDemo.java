import java.util.concurrent.*;
import java.util.*;

public class CopyOnWriteArrayListDemo{
	public static void main(String[] args) {

		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		al.add("A");
		al.add("B");
		al.add("B");
		System.out.println(al);		// [A, B, B]

		al.addIfAbsent("A");		
		System.out.println(al.addIfAbsent("B"));	// false - if already present
		System.out.println(al.addIfAbsent("D"));	// true - add Successfuly

		System.out.println(al);		// [A, B, B, D]

	}
}