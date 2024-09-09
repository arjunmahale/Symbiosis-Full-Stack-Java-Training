package Java;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		int s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of elements : ");
		s=sc.nextInt();
		int[] array=new int[s];
		for(int i=0;i<array.length;i++)
		{
			System.out.println("enter element "+i+":");
			array[i]=sc.nextInt();
		}
		sc.close();
	/**	int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
						
		}
		System.out.println("array is :");
		for(int a : array)
		{
			System.out.println(a);
		}
		System.out.println("array sum is :"+sum);**/
		System.out.println("reverse order of array : ");
		for(int i=s-1;i>=0;i--)
		{
			System.out.print(array[i]+" ");
			
		}
		
	}

}
