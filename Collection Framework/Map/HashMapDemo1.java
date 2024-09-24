import java.util.HashMap;

class HashMapDemo1 {
	public static void main(String[] args) {
			HashMap m = new HashMap();
			Integer I1 = new Integer(10);
			Integer I2 = new Integer(10);
			m.put(I1,"Pawan");
			m.put(I2,"Kalyan");
			System.out.println(m); // one entry - I1.equals(I2) - true
	}
}
// {10=Kalyan}