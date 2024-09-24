import java.util.TreeMap;
class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap m = new TreeMap();
		m.put(100, "ZZZ");
		m.put(103, "YYY");
		m.put(101, "XXX");
		m.put(104, 106);
		m.put(107, null);
		// m.put("FFF", "XXX");		// ClassCastException
		// m.put(null, "XXX"); 		//RE : NullPointerException
		System.out.println(m); 		// {100=ZZZ, 101=XXX, 103=YYY, 104=106, 107=null}
	}
}
