import java.io.*;

// this() used to return a current class instance

public class This4{
	This4 print(){		// class type method
		return this;			// class to basicCall()
	}
	void basicCall(){
		System.out.println("hello Java this keyword is here...");
	}

	public static void main(String[] args){
		new This4().print().basicCall();		
	}
}