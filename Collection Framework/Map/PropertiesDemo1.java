import java.util.*;
import java.io.*;
class PropertiesDemo1{
	public static void main(String[] args) throws Exception {

		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("xyz.properties");
		p.load(fis);
		String url = p.getProperty("url");
		String user = p.getProperty("user");
		String pwd = p.getProperty("pwd");
		
		Connection con = DriverManager.getConnection(url,user,pwd);
		;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
}
}
