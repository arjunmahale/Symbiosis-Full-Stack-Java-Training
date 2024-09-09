package abstractionpck;

import java.util.Scanner;

abstract class GeometricShapes{
	String nameofshape;
	//abstract methods
	abstract double calculatearea();
	public abstract String toString();
	public GeometricShapes(String nameofshape) {
		System.out.println("inside the constructor of Geometricshapes class");
		this.nameofshape=nameofshape;
	}
	//nonabstract method
	public String getnameofshape()
	{
		return nameofshape;
	}
}
class Circle extends GeometricShapes{
	double radius;

	public Circle(String nameofshape, double radius) {
		super(nameofshape);
		System.out.println("inside the constructor of Circle class");
		this.radius = radius;
	}
	//implementing the methods
	double calculatearea() {
		return Math.PI*Math.pow(radius, 2);
	}
	public String toString() {
		return "name of the shape is "+super.nameofshape+" and its area is : "+calculatearea();
	}
}
class Square extends GeometricShapes{
	double length;

	public Square(String nameofshape, double length) {
		super(nameofshape);
		System.out.println("inside the constructor of Square class");
		this.length = length;
	}
	double calculatearea() {
		return length*length;
	}
	public String toString() {
		return "name of the shape is "+super.nameofshape +" and its area is : "+calculatearea();
		
	}
	
}
public class abstractExample {

	public static void main(String[] args) {
		double radius;double length;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius for area of circle: ");
		radius=sc.nextDouble();
		System.out.println("enter length for area of circle: ");
		length=sc.nextDouble();
		System.out.println("\n-----------------------\n");
		
		Circle c=new Circle("circle",radius);
		
		
		System.out.println(c.toString());
		System.out.println("\n-----------------------\n");
		Square s =new Square("square",length);
		System.out.println(s.toString());

	}

}
