package Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class Assignment12 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		do {
			System.out.println("enter option :");
			System.out.println("1. continue with linked list");
			System.out.println("2. continue with stack");
			System.out.println("3. continue with vector");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
					do {
					int choice;
					LinkedList ll=new LinkedList();
					System.out.println("--------------------\nEnter your choice : ");
					System.out.println("1.add elements  ");
					System.out.println("2.show elements ");
					System.out.println("3.sort elements ");
					System.out.println("4.search element ");
					System.out.println("5.insert element at 1st position");
					System.out.println("6.insert element at 2nd position");
					System.out.println("7.insert element at perticular position");
					choice=sc.nextInt();
					switch(choice) {
					case 1: 
							System.out.println("enter no. of elements : ");
							int n=sc.nextInt();
							System.out.println("enter the "+n+" elements :");
							for(int i=0;i<n;i++)
							{
								int num=sc.nextInt();
								ll.add(num);
							}
							break;
					case 2: 
							System.out.println("linked list is :"+ll);
							break;
					case 3:
							ll.sort(null);
							System.out.println("after sorting :"+ll);
							break;
					case 4:
							System.out.println("enter element to search :");
							int num=sc.nextInt();
							System.out.println(" present : "+ll.contains(num));
							
							break;
					case 5:
							System.out.println("enter element to insert at 1st :");
							num=sc.nextInt();
							ll.add(0, num);
							System.out.println("after adding element at 1st :"+ll);
							break;
					case 6:
						System.out.println("enter element to insert at last :");
						num=sc.nextInt();
						n=ll.size();
						ll.add(n, num);
						System.out.println("after adding element at last :"+ll);
						break;
					case 7:
						System.out.println("enter position to insert at you want :");
						n=sc.nextInt();
						System.out.println("enter element to insert at "+n+" :");
						num=sc.nextInt();
						ll.add(n, num);
						System.out.println("after adding element at last :"+ll);
						break;
					}
					}while(true);
				
//			case 2:
//				
//			case 3:
//				vector();
//				break;
			}
			
		}while(true);
		
	}

}

