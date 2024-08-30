package Java;

import java.util.Scanner;

public class States {

	public static void main(String[] args) {
		String [][] state=new String [2][4];
	
		int i,j;
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<2;i++)
		{
			System.out.println("------row"+(i+1)+"----- ");
			for(j=0;j<4;j++)
			{
				if(j==0) 
				{	
					System.out.println("enter State name : ");
					state[i][j]=sc.nextLine();	
				}
				else
				{
					System.out.println("enter city name : "+j);
					state[i][j]=sc.nextLine();	
				}
			}
		}
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<4;j++)
			{
				if(j==0) 
				{	
					System.out.print(state[i][j]+" = ");
					
				}
				else
				{
					System.out.print(state[i][j]+" , ");
					
				}
			}
			System.out.println();
		}
		
	}

}
