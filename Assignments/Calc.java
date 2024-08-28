package Java;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		int num1,num2,option;
		Scanner sc =new Scanner(System.in);
		do{
		
		System.out.println("------------------------\nenter option : \n1.addition \n2.subtraction \n3.division \n4.multiplication");
		option=sc.nextInt();
		switch(option)
		{
		case 1:
			int result=0;
			
			System.out.println("enter first number : ");
			num1=sc.nextInt();
			System.out.println("enter second number : ");
			num2=sc.nextInt();
			result=num1+num2;
			System.out.println("addition of "+num1+" and "+num2+" is ="+result);break;
		case 2:
			result=0;
			System.out.println("enter first number : ");
			num1=sc.nextInt();
			System.out.println("enter second number : ");
			num2=sc.nextInt();
			result=num1-num2;
			System.out.println("subtraction of "+num1+" and "+num2+" is ="+result);break;
		case 3:
			result=0;
			System.out.println("enter first number : ");
			num1=sc.nextInt();
			System.out.println("enter second number : ");
			num2=sc.nextInt();
			result=num1/num2;
			System.out.println("division of "+num1+" and "+num2+" is = "+result);break;
		case 4:
			result=0;
			System.out.println("enter first number : ");
			num1=sc.nextInt();
			System.out.println("enter second number : ");
			num2=sc.nextInt();
			result=num1*num2;
			System.out.println("multiplication of "+num1+" and "+num2+" is = "+result);break;
		}
		}while(true);

	}

}
