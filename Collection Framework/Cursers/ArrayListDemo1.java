import java.util.*;

public class ArrayListDemo1{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.print("Array List Elements : ");
		for(int i=0; i<=10; i++){
			al.add(i);
		}
		System.out.println(al);

		Iterator itr = al.iterator();
		System.out.print("Array List Even Elements : ");
		while(itr.hasNext())
		{
			Integer I = (Integer)itr.next();
			if(I % 2 == 0)
				System.out.print(" "+I);
			else
				itr.remove();
		}
		System.out.println("\n"+al+" ");
		System.out.println(itr.getClass().getName());	// java.util.ArrayList$Itr
	}
}
// output : 
// Array List Elements : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// Array List Even Elements :  0 2 4 6 8 10
// [0, 2, 4, 6, 8, 10]
