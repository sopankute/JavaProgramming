import java.io.*;

// this() used to invoke current class methods

public class This2{
	void print(){
		System.out.println("Call me Now...");
	}
	void callMe(){
		this.print();		// calling current class method
	}
	void followMe(){
		callMe();			// callme(); -> this.callMe();
	}
	public static void main(String[] args){
		This2 t2 = new This2();
		t2.followMe();
	}
}