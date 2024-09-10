package Exceptionhandeling;

import java.lang.reflect.Array;

public class Exception2 {
	public static void method1() {
		
		try {
			
		}
		catch(Exception e) {
			
		}
	}
	public static void method2() {
		//multi catch example 
		try {
		int a=0;
		int b=10/a;
		System.out.println("B : "+b);
		int c[]= {1,2,3,4,5};
		c[12]=15;
		System.out.println("c[12] : "+c[12]);
		}
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException e)//multi exception in 1 catch
		{
			System.out.println(e.getMessage());
		}
//		catch(ArithmeticException e) 
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(ArrayIndexOutOfBoundsException e1)
//		{
//			System.out.println(e1.getMessage());
//		}
//		catch(Exception e2)
//		{
//			System.out.println(e2.getMessage());
//		}
	}
public static void method3() {
		//finally block example
		try {
			int a=0,b=10;
			int c=a/b;
			System.out.println("c: "+c);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("this is a finally block ");//it is compulsory executes exception present or not ie. independent
		}
	}
	public static void main(String[] args) {
		method1();
		//method2();
		method3();

	}

}
