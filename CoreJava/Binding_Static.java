import java.io.*;
import java.util.*;

public class Binding_Static{

	private void disp(){
		System.out.println("It's a Static binding....");
	}
	public static void main(String[] args){
		Binding_Static bs =new Binding_Static();
		bs.disp();
	}
}
// Type of Object determined by compiler at compiler time.
// if a class contains any private, final, static method ,it is static binding.