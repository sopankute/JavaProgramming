import java.util.TreeMap;

class NavigableMapDemo {
	public static void main(String[] args) {

		TreeMap<String, String> t = new TreeMap<String, String>();
		t.put("b", "Banana");
		t.put("c", "Cat");
		t.put("a", "Apple");
		t.put("d", "Dog");
		t.put("g", "Gun");
		System.out.println(t);						// {a=Apple, b=Banana, c=Cat, d=Dog, g=Gun}

		System.out.println(t.ceilingKey("c"));		// c <= key(c)
		System.out.println(t.higherKey("e"));		// g < key(e)
		System.out.println(t.floorKey("e"));		// d >= key(e)
		System.out.println(t.lowerKey("e"));		// d > key(e)

		System.out.println(t.pollFirstEntry());		// a=Apple
		System.out.println(t.pollLastEntry());      // g=Gun

		System.out.println(t.descendingMap());		// {d=Dog, c=Cat, b=Banana}

		System.out.println(t);						// {b=Banana, c=Cat, d=Dog}
	}
}

// output :
// {a=Apple, b=Banana, c=Cat, d=Dog, g=Gun}
// c
// g
// d
// d
// a=Apple
// g=Gun
// {d=Dog, c=Cat, b=Banana}
// {b=Banana, c=Cat, d=Dog}
