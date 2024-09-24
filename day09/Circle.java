import java.util.Scanner;

public class Circle {
	private double radius;
	//no PI here because a circle only has radius
	//because its the only data a circle has. PI is a mathematical constant

	Circle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter radius:");
		radius = scanner.nextDouble();
	}

	void findArea() {
		final double PI = 3.14;
		double area = PI * radius * radius;
		System.out.println("Area: "+ area);
	}

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.findArea();
	}

}