import java.util.*;

// Question 5

public class IsPrime{
	public static void main(String[] args)
	{
		int n = (int)(2 + Math.random()*100);
		System.out.print("The number Entered : "+n);
		int count = 0;
		for(int i=1; i<=n; i++)
		{
			if(n%i == 0)
				count++;
		}
		if(count == 2)
			System.out.println(" is a Prime Number.");
		else
			System.out.println(" is Not a Prime Number.");	
	}
}

// OUTPUT :
//  The number Entered : 43 is a Prime Number.
//  The number Entered : 36 is Not a Prime Number.