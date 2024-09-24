abstract class Shape {
	public abstract void draw();
}

abstract class Rectangle extends Shape {
	// public void draw() {
	// 	System.out.println("Drawing rectangle!");
	// }
}

class Square extends Rectangle {
	public void draw() {
		System.out.println("Drawing square!");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Drawing circle!");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("Drawing triangle!");
	}
}

public class Test {
	public static void main(String[] args) {
		//Shape s1 = new Rectangle();
		Shape s1 = new Square(); // Shape <- Rectangle <- Square
		//OR Rectangle s1 = new Square();
		s1.draw();
		Shape s2 = new Circle();
		s2.draw();
		Shape s3 = new Triangle();
		s3.draw();
	}
}