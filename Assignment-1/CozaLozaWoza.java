import java.util.*;
import java.io.*;

// Question 4

public class CozaLozaWoza{
	public static void main(String[] args)
	{
		int i, count=0;
				for(i=1; i<110; i++)
				{
				 	if( i%3 == 0 )
						System.out.print(" Coza ");
					else if( i%5 == 0)
						System.out.print(" Loza ");
					else if( i%7 == 0)
						System.out.print(" Woza ");
					else if( i%3 == 0 && i%5 == 0 )
						System.out.print(" CozaLoza ");
					else 
						System.out.print(" "+i+" ");
					count++;
					if(count % 11 ==0)
						System.out.println();
				}
	}
}

// OUTPUT :
 // 				1  2  Coza  4  Loza  Coza  Woza  8  Coza  Loza  11
 // 				Coza  13  Woza  Coza  16  17  Coza  19  Loza  Coza  22
 // 				23  Coza  Loza  26  Coza  Woza  29  Coza  31  32  Coza
 // 				34  Loza  Coza  37  38  Coza  Loza  41  Coza  43  44
 // 				Coza  46  47  Coza  Woza  Loza  Coza  52  53  Coza  Loza
 //				 	Woza  Coza  58  59  Coza  61  62  Coza  64  Loza  Coza
 // 				67  68  Coza  Loza  71  Coza  73  74  Coza  76  Woza
 // 				Coza  79  Loza  Coza  82  83  Coza  Loza  86  Coza  88
 // 				89  Coza  Woza  92  Coza  94  Loza  Coza  97  Woza  Coza
 // 				Loza  101  Coza  103  104  Coza  106  107  Coza  109

