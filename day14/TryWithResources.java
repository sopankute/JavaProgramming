import java.io.*;

public class TryWithResources {
	public static void main(String[] args) throws IOException{
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); ) {
			System.out.println("Enter name: ");
			String name = br.readLine();
			System.out.println("Enter age: ");
			int age = Integer.parseInt(br.readLine());

			System.out.println(name+" "+age);
		}

		// catch(Exception e) {
		// 	System.out.println(e);
		// }

		//finally is not required
		//because we have used Autoclosable resources
		//which will get closed as soon as we come out of try block
	}
}