package Java;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter the number : ");
		num=sc.nextInt();
		 System.out.println("Factorial of " + num + " is: " + Fact(num));
	}
	static int Fact(int num)
	{
		if(num<=2) {
			return num;
		}
		else {
		return num*Fact(num-1);
		}
	}
}
