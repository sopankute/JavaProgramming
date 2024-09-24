import java.io.*;

// this() can be passed as an argument in methods

public class This3{

	void passMe(This3 obj){
		System.out.println("hi, I'm Here, come !!");
		System.out.println(this == obj);				// true
	}
	void sendToPassMe(){
		passMe(this);		// used to pass a obj(t3) reference to method
	}
	public static void main(String[] args){
		This3 t3 = new This3();
		t3.sendToPassMe();
	}
}