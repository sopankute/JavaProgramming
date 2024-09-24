import java.io.*;

public class Exception2 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers");
		int x = 0, y = 0; 		

		try { //in try block, the scope is local, so declare x,y outside
			x = Integer.parseInt(br.readLine());
			y = Integer.parseInt(br.readLine());

			int result1 = x/y; //implcitly, throw new java.lang.ArithmeticException();
			System.out.println("Result: "+result1);

			String s = null;
			System.out.println(s.length());
		} //try end

/*		//CE: IOException, NumberFormatException, ArithmeticException, NullPointerException are handled already
		//Thats why catch blocks must be ordered from specific to generic
		catch(Exception e) { // generic catch block
			System.out.println(e);
		}
*/

/*		//multiple catches
		catch(IOException e) { 
			System.out.println(e);
		}
		catch(NumberFormatException e) { 
			System.out.println(e);
		}
		catch(ArithmeticException e) { 
			System.out.println(e);
		}
		catch(NullPointerException e) { 
			System.out.println(e);
		}
*/

		//v1.7 onwards-> multi catch, don't use 'Exception e' here though
		catch(NumberFormatException | ArithmeticException | NullPointerException | IOException e) {
			System.out.println(e);
		}

		int result2 = x+y;
		System.out.println("Result: "+result2);

		System.out.println("rest of the code follows...");

	}
}