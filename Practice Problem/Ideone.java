
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception{

	int num01 = 1;
	int sum =0;
	int cnt = 2;
	int temp = 0;
	int sel = 0;
	int cal = 0;
	int num = 400;

	for(int i = 1; num01<=num; i++){
		cal = 0;
		temp = num01;
		while(temp!=0){
			sel = num01%10;
			temp = temp/10;
			if(sel == 4){
			cal++;
			}
		}
		if(cal == 0){
		sum = sum+num01;
		}
		num01+=(cnt*cnt);
		cnt++;
	}
	System.out.print(sum);
}
}

