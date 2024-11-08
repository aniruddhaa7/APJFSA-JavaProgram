package APJSC9550;

public class Perimeter {

    // Method to calculate the perimeter of a square
    public double calculatePerimeter(double side) {
        return 4 * side;
    }

    // Method to calculate the perimeter of a rectangle
    public double calculatePerimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }

    // Method to calculate the perimeter of a circle
    public double calculatePerimeter(int radius) {
        return 2 * (22.0 / 7.0) * radius;  // Approximate value of pi
    }

    public static void main(String[] args) {
        Perimeter perimeterCalculator = new Perimeter();

        double squarePerimeter = perimeterCalculator.calculatePerimeter(5.0);
        double rectanglePerimeter = perimeterCalculator.calculatePerimeter(6.0, 4.0);
        double circlePerimeter = perimeterCalculator.calculatePerimeter(7); // Radius as int

        System.out.println("Perimeter of Square: " + squarePerimeter);
        System.out.println("Perimeter of Rectangle: " + rectanglePerimeter);
        System.out.println("Perimeter of Circle: " + circlePerimeter);
    }
}

/*
 * OUTPUT:
 * Perimeter of Square: 20.0
 * Perimeter of Rectangle: 20.0
 * Perimeter of Circle: 44.0
 */
