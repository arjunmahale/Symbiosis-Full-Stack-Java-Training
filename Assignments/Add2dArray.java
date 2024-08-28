package Java;

import java.util.Scanner;

public class Add2dArray {

	public static void main(String[] args) {
		int [][] array1=new int [2][2];
		int [][] array2=new int [2][2];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element for 1st array : ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				
				array1[i][j]=sc.nextInt();
			}
		}
		System.out.println("1st array");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(array1[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		System.out.println("enter element for 2nd array : ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				
				array2[i][j]=sc.nextInt();
			}
		}
		System.out.println("2nd array");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(array2[i][j]);
			}
			System.out.println();
		}
		//addition
		System.out.println("---------------\narray addition is ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(array1[i][j]+array2[i][j]);
			}
			System.out.println();
		}
		
	}

}
