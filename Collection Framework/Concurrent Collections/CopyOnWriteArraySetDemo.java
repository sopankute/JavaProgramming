import java.util.concurrent.*;
import java.util.*;

class CopyOnWriteArraySetDemo  {

		public static void main(String[] args) {
			CopyOnWriteArraySet s = new CopyOnWriteArraySet();
			s.add("A");
			s.add("B");
			s.add("C");
			s.add("A");
			s.add(null);
			s.add(10);
			s.add("D");
			System.out.println(s);		// [A, B, C, null, 10, D]
		}
}	
