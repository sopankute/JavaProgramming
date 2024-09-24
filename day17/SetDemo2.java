/*
LinkedHashSet
-No duplicates allowed
-Insertion order is preserved
*/
import java.util.*;

public class SetDemo2 {
	public static void main(String[] args) {
		
		Set hs = new LinkedHashSet();
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