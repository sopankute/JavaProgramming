import java.util.*;
import java.lang.*;


public class Palindrome{
	
	private static int CountPalindrome(String input1, int input2) {
		
		for (int i=0;i<input2;i++ ) {

			char ch = input1.charAt(i);
			try{
				if(ch != input1.charAt(input2 -1))
					return 0;
					throw new UnsupportedOperationException("CountPalindrome(input1, input2)");
				}
			catch(Exception e){
				System.out.println(e+"\n");
			}
			input2--;
		}
		return 1;
	}
	public static void main(String[] args) {
			int result = 0;
			String str = "level";
			int size = str.length();
				try{
				 result =CountPalindrome(str, size);
				}
				catch(Exception e){
					System.out.println(e);
				}
				System.out.println(result);
				

		}	
}