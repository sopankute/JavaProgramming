import java.io.*;
import java.util.*;

// BUT By using thorws you can propogate checked exception

public class CheckPropogation{
	void m() throws IOException{
		throw new IOException("Device error");	//Checked exception
	}
	void n() throws IOException{
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
		CheckPropogation obj = new CheckPropogation(); 
		obj.p();
		System.out.println("Normla flow...");
	}
}

// exception handled ...
// Normla flow...