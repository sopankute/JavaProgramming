import java.util.TreeSet;

class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		// t.add(new Integer(10));		// ClassCastException
		// t.add(null);				//RE: Exception in thread "main" java.lang.NullPointerException
		System.out.println(t);		//[A, B, L, Z, a]
	}
}