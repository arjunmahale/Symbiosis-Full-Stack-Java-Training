package Collection;

import java.util.*;

public class SortingWithAndWithoutBuiltinMethod {
	 public static void m1() {
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("------1st method with simple array-----");
		System.out.println("enter no. of elements ");
		n=sc.nextInt();
		int arr[]= new int [n];
		System.out.println("enter elements "+n);
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		  
		for(int i :arr) {
			System.out.println(i);
		}
	}
	 public static void m2() {
		 int n;
		 Scanner sc =new Scanner(System.in);
		 System.out.println("------2nd method with wrapper array objects-----");
			System.out.println("enter no. of elements ");
			n=sc.nextInt();
			Integer array[]= new Integer [n];
			System.out.println("enter elements "+n);
			for(int i=0;i<n;i++)
			{
				array[i]=sc.nextInt();
			}
			Arrays.sort(array,Collections.reverseOrder());
			  
			System.out.println("elements in descending order"+Arrays.toString(array));
		
	 }
	 public static void m3() {
		int n,temp=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("------3rd method with array sort without builtin method-----");
		System.out.println("enter no. of elements ");
		n=sc.nextInt();
		int arr[]= new int [n];
		System.out.println("enter elements "+n);
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		  
		for(int i :arr) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
	
		m1();
		m2();
		m3();
	}

}
