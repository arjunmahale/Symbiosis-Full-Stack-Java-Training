package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 integer elements");
		for(int i=0;i<5;i++)
		{
			num=sc.nextInt();
			al.add(num);
		}
		System.out.println(al);
		ListIterator li=al.listIterator(); 
		System.out.println("odd elements : ");
		while(li.hasNext()) {
			int num1=(int) li.next();
			if(num1 %2 != 0)
			{
				System.out.println(num1);
			}
		}
	}

}
