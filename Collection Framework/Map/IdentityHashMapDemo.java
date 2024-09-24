import java.util.*;

class IdentityHashMapDemo {
	public static void main(String[] args) {
			IdentityHashMap m = new IdentityHashMap();

			Integer i1 = new Integer(10);
			Integer i2 = new Integer(10);
			m.put(i1,"Pawan");
			m.put(i2,"Kalyan");
			System.out.println(m); // 2 entries - {10=Pawan, 10=Kalyan} - i1 == i2 - false
	}
}
