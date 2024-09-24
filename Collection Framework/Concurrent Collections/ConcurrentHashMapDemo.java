import java.util.concurrent.*;

public class ConcurrentHashMapDemo{
	public static void main(String[] args) {
		ConcurrentHashMap c = new ConcurrentHashMap();
	
		c.put(102, "Anand");
		c.put(102, "Ayush");

		System.out.println(c);		// {102=Ayush}
		System.out.println(c.putIfAbsent(102, "Om"));	// Ayush
		System.out.println(c);		// {102=Ayush}

		System.out.println(c.putIfAbsent(103, "Sopan"));  // null (insertion successful)

		System.out.println(c);			// {102=Ayush, 103=Sopan}
	}
}