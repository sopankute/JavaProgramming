import java.util.concurrent.*;

public class ConcurrentHashMapDemo1{
	public static void main(String[] args) {
		ConcurrentHashMap c = new ConcurrentHashMap();

		c.put(101, "Sopan");
		c.put(102, "Anand");

		System.out.println(c.remove(101, "Ayush"));		// false - value must be matched with key
		System.out.println(c);		// {101=Sopan, 102=Anand}

		c.remove(101, "Sopan");		// value matched with key then removed
		System.out.println(c);		// {102=Anand}
	}
}