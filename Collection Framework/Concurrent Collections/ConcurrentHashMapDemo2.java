import java.util.concurrent.*;

public class ConcurrentHashMapDemo2{
	public static void main(String[] args) {
		ConcurrentHashMap c = new ConcurrentHashMap();

		c.put(101, "Sopan");
		c.put(102, "Anand");

		System.out.println(c.replace(101, "Ayush"));		// Sopan
		System.out.println(c);								// {101=Ayush, 102=Anand}

		c.replace(101, "Ayush", "Sopan");
		System.out.println(c);								// {101=Sopan, 102=Anand}

		System.out.println(c.replace(101, "Om", "Sopan"));  // false
		System.out.println(c);								// {101=Sopan, 102=Anand}


	}
}