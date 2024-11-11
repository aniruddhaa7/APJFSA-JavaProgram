package APJSC9550;

//Define the Shape interface
interface Shape {
	double getArea();
}

//Rectangle class implementing Shape interface
class Rectangle implements Shape {
	private double length;
	private double width;

	// Constructor to initialize length and width
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}
}

//Circle class implementing Shape interface
class Circle implements Shape {
	private double radius;

	// Constructor to initialize radius
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
}

//Triangle class implementing Shape interface
class Triangle implements Shape {
	private double base;
	private double height;

	// Constructor to initialize base and height
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return 0.5 * base * height;
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		// Creating instances of Rectangle, Circle, and Triangle
		Shape rectangle = new Rectangle(5.0, 3.0);
		Shape circle = new Circle(4.0);
		Shape triangle = new Triangle(6.0, 2.5);

		// Displaying the area of each shape
		System.out.println("Area of Rectangle: " + rectangle.getArea());
		System.out.println("Area of Circle: " + circle.getArea());
		System.out.println("Area of Triangle: " + triangle.getArea());
	}
}

/*
 * OUTPUT: Area of Rectangle: 15.0 
 * Area of Circle: 50.26548245743669 Area of
 * Triangle: 7.5
 */
