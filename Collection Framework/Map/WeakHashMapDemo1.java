import java.util.*;

public class WeakHashMapDemo1{
	public static void main(String[] args) {
		WeakHashMap m = new WeakHashMap();
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
// {}
// Finalize method called
