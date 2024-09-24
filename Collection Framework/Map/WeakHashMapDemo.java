import java.util.*;

public class WeakHashMapDemo{
	public static void main(String[] args) {
		HashMap m = new HashMap();
		Temp t = new Temp();
		m.put(t, "Durga");
		System.out.println(m);
		t = null;
		System.gc();
		System.out.println(m);
	}
}
class Temp{
	public String toString(){
		return "temp";
	}
	public void finalize(){
		System.out.println("Finalize method called");
	}
}

// {temp=Durga}
// {temp=Durga}