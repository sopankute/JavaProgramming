public class ReadCharDemo {
	public static void main(String[] args) {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("Enter a character");
		String str = scanner.next();
		char ch = str.charAt(0); // charAt - read characters, char-by-char
		System.out.println(ch);

		/*
		Another short way would be
		char ch = scanner.next().charAt(0);
		*/
	}
}