/*
HashSet
-No duplicates allowed
-No insertion order - random order
*/
import java.util.*;

public class SetDemo {
	public static void main(String[] args) {
		
		Set hs = new HashSet();
		hs.add("C-DAC");
		hs.add(1998);
		hs.add("DAC");
		hs.add("DASSD");
		hs.add("March 2022");
		hs.add(0.5);
		hs.add("C-DAC"); //Duplicate - IGNORED! No CE or RE
		hs.add(true);
		hs.add(92.7);
		System.out.println(hs);

		Iterator itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}