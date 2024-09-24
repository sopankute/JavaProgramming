import java.util.Scanner;

public class StringCompare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 1st string: ");
		String s1 = scanner.nextLine();
		System.out.print("Enter 2nd string: ");
		String s2 = scanner.nextLine();

		System.out.println();
		//System.out.println(s1.equals(s2) ? "They match!" : "They don't match.");
		if(s1.compareTo(s2) == 0)
			System.out.println("They match!");
		else if(s1.compareTo(s2) > 0)
			System.out.println(s1+" is greater than "+s2);
		else
			System.out.println(s1+" is smaller than "+s2);
	}
}