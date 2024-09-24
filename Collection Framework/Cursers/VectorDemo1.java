import java.util.*;

public class VectorDemo1{
	public static void main(String[] args) {
		Vector v = new Vector();

		for(int i=0; i<=10; i++){
			v.addElement(i);
		}
		System.out.println(v);

		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			Integer I = (Integer)e.nextElement();
			if(I % 2 == 0)
				System.out.print(" "+I);
		}
		System.out.println("\n"+v);
		System.out.println(e.getClass().getName());	// java.util.Vector$1

		ListIterator itr = v.listIterator();
		System.out.println(itr.getClass().getName());	// java.util.Vector$ListItr
		ListIterator litr = v.listIterator();		
		System.out.println(litr.getClass().getName());	// java.util.Vector$ListItr
	}
}

// output : 
// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//  0 2 4 6 8 10
// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
