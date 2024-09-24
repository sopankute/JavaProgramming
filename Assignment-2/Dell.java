import java.io.*;
import java.util.*;

// Question 36

class Computer{
	String device_name;
	String processor;
	double ram;
	String system_type;

	public Computer(String d_n, String pro, double r, String s_t){
		this.device_name = d_n;
		this.processor = pro;
		this.ram = r;
		this.system_type = s_t;
	}

	// public void setDetails(String d_n, String pro, double r, String s_t){
	// 	this.device_name = d_n;
	// 	this.processor = pro;
	// 	this.ram = r;
	// 	this.system_type = s_t;
	// }

	public void disp(){
		System.out.println("Device Name : \t"+device_name+"\nProcessor : \t"+processor+"\nComputer Ram : \t"+ram+"\nSystem type :  \t"+system_type);
	}
}
public class Dell extends Computer{
	String software_type;
	String version;

	public Dell(String d_n, String pro, double r, String s_t, String soft_t, String ver){
		super(d_n, pro, r, s_t);
		this.software_type = soft_t;
		this.version = ver;
	}

	public void disp(){
		super.disp();
		System.out.println("Software Details : "+software_type+"\nVersion : \t "+version);
	}
----------------------------------------------------------------
	// public void setData(String soft_t, String ver){
	// 	this.software_type = soft_t;
	// 	this.version = ver;
	// }
	// public void setDetails(String d_n, String pro, double r, String s_t){
	// 	super.setDetails(d_n, pro, r, s_t);
	// }

	// public void disp(){
	// 	super.disp();
	// }
	// public  void disp1(){
	// 	System.out.println("Software Details : "+software_type+"\nVersion : \t "+version);
	// }
--------------------------------------------------------
	public static void main(String[] args){

		Computer c = new Dell("DESKTOP -J3GJJKV", "Intel(R)", 8.00, "64-bit OS", "Windows 10", "21H1");
		c.disp();

--------------------------------------------------------------------------
		// Computer c = new Dell();
		// c.setDetails("DESKTOP -J3GJJKV", "Intel(R)", 8.00, "64-bit OS");
		// c.disp();
		// Dell d = new Dell();
		// d.setData("Windows 10", "21H1");
		// d.disp1();
	}
}