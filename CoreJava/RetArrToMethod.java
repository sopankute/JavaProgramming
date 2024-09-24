import java.io.*;
import java.util.*;

public class RetArrToMethod{
	public static void main(String[] args)
	{
		int[] numArr = meth1();

		for(int e : numArr)
			System.out.print(e+" ");  // 3 4 5 6 7
	} 
	public static int[] meth1()
	{
		return new int[]{3,4,5,6,7};
	}
}