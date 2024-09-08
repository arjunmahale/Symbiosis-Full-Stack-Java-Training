package Java;
import java.util.Scanner;

public class RectangleCalculator {
	public static void main(String[] args) {
     
	Scanner sc=new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        double area = calculateArea(length, width);
        double perimeter = calculatePerimeter(length, width);

        System.out.println("Area of the rectangle is : " + area);
        System.out.println("Perimeter of the rectangle is : " + perimeter);
    }

  static double calculateArea(double length, double width) {
        return length*width;
    }

 static double calculatePerimeter(double length, double width) {
        return (2 * (length + width));
    }
}