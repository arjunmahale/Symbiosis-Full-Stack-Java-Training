package Java;

import java.util.Scanner;

public class CircleCalculator {
	public static final double pi=3.14;
	public static void main(String[] args) {
		
		double radius;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle : ");
		radius=sc.nextDouble();
		System.out.println("output :");
		area(radius);
		circum(radius);
		
		
	}
	static void  area(double r)
	{
		System.out.println("area of a circle is : "+pi*r*r);
	}
static	void  circum(double r)
	{
		System.out.println("circumference of a circle is : "+2*pi*r);
	}
	

}
