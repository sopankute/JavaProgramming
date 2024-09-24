import java.util.*;

public class LinkedHashMapDemo{
	public static void main(String[] args) {
		LinkedHashMap h = new LinkedHashMap();
		h.put("Sopan", 700);
		h.put("Vishal", 600);
		h.put("Shivraj", 900);
		h.put("Balaji", 400);
		h.put("Akashay", 800);
		System.out.println(h);	// {Sopan=700, Vishal=600, Shivraj=900, Balaji=400, Akashay=800}

		System.out.println(h.put("Sopan", 1000));	// 700

		Set s = h.keySet();
		System.out.println(s);	// [Sopan, Vishal, Shivraj, Balaji, Akashay]

		Collection c = h.values();
		System.out.println(c);		// [1000, 900, 400, 800, 600]

		Set s1 = h.entrySet();
		System.out.println(s1);		// [Sopan=1000, Vishal=600, Shivraj=900, Balaji=400, Akashay=800]

		Iterator itr = s1.iterator();

		while(itr.hasNext()){
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"--"+m1.getValue());

			if(m1.getKey().equals("Shivraj"))
				m1.setValue(1200);
		}
		System.out.println(h);		// {Sopan=1000, Vishal=600, Shivraj=1200, Balaji=400, Akashay=800}

	}
}