import java.util.*;

public class HashTableDemo{
	public static void main(String[] args) {

		// Hashtable h = new Hashtable(25);	// {23 =E, 16 =F, 15 =D, 6 =C, 5 =A, 2 =B}

		Hashtable h = new Hashtable();
		h.put(new Temp(5), "A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "C");
		h.put(new Temp(15), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(16), "F");
		// h.put("Durga", null);	// NPE
		System.out.println(h);		// {6 =C, 16 =F, 5 =A, 15 =D, 2 =B, 23 =E}
	}
}
class Temp{
	int i;
	Temp(int i){
		this.i = i;
	}
	public int hashCode(){
		return i;
		// return i%9;				// {16 =F, 15 =D, 6 =C, 23 =E, 5 =A, 2 =B}
	}
	public String toString(){
		return i+" ";
	}
}