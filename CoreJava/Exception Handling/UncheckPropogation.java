import java.io.*;
import java.util.*;

// By default UnChecked exceptions forwarded in calling chain
// BY default Checked exception are not propogated even by using thorw 
// BUT By using thorws you can propogate checked exception
public class UncheckPropogation{
	 void m(){
		int result = 15/0;	// unchecked exception
		// throw new IOException("Device error");	//Checked exception
	}
	 void n(){
		m();
	}
	 void p(){
		try{
			n();
		}
		catch(Exception e){
			System.out.println("exception handled ...");
		}
	}
	public static void main(String[] args){
		UncheckPropogation obj = new UncheckPropogation(); 
		obj.p();
		System.out.println("Normla flow...");
	}
}
// exception handled ...
// Normla flow...
